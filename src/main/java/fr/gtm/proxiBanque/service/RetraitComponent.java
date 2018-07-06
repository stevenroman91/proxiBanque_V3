package fr.gtm.proxibanque.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.proxibanque.dao.CompteRepository;
import fr.gtm.proxibanque.model.Compte;
import fr.gtm.proxibanque.model.MauvaisCompteException;
import fr.gtm.proxibanque.model.MauvaisMontantException;
import fr.gtm.proxibanque.model.MauvaiseDateException;
import fr.gtm.proxibanque.model.SoldeInsuffisantException;
/**
 * Cette methode fait le lien entre le service et la dao
 * @author Steven Roman & Nadir Boutra
 * @version 3.0
 */
public class RetraitComponent {
	@Autowired
	private CompteRepository cr;

	/**
	 * 
	 * @param c compte ou il faut retirer des especes
	 * @param mt montant a retirer
	 * @throws MauvaisCompteException Vous ne pouvez pas retirer d'espèces sur un compte epargne
	 * @throws MauvaisMontantException Vous ne pouvez pas retirer un montant supérieur à 300
	 * @throws SoldeInsuffisantException solde insuffisant
	 */
	public void retraitEspeces(Compte c, double mt)
			throws MauvaisCompteException, MauvaisMontantException, SoldeInsuffisantException {
		if (!c.getTypeCompte().name().equals("COMPTE_COURANT")) {
			throw new MauvaisCompteException("Vous ne pouvez pas retirer d'espèces sur un compte epargne");
		}
		if (mt > 300) {
			throw new MauvaisMontantException("Vous ne pouvez pas retirer un montant supérieur à 300");
		}
		if (mt > c.getSolde()) {
			throw new SoldeInsuffisantException("solde insuffisant");
		}
		c.setSolde(c.getSolde() - mt);
		cr.save(c);

	}

	/**
	 * 
	 * @param c compte qui veut un chequier
	 * @throws MauvaiseDateException Impossible d’effectuer le retrait d’un nouveau chéquier pour ce compte avant
	 */
	public void retraitChequier(Compte c) throws MauvaiseDateException {
		LocalDate date = LocalDate.now();
		if (c.getChequier() != null) {
			if (date.minusMonths(3).isBefore(c.getChequier().getDateReception())) {
				throw new MauvaiseDateException(
						"Impossible d’effectuer le retrait d’un nouveau chéquier pour ce compte avant le "
								+ c.getChequier().getDateReception().plusMonths(3));
			}
		}
		c.getChequier().setDateEnvoi(date);
		c.getChequier().setDateReception(date.plusDays(15));
		cr.save(c);

	}

	/**
	 * 
	 * @param c compte qui veut une carte
	 * @param carte type de carte
	 * @throws MauvaisCompteException Les comptes epargnes n'ont pas de carte bleu
	 * @throws MauvaiseDateException Impossible d’effectuer le retrait, votre ancienne carte est encore valide
	 */
	public void retraitCarte(Compte c, String carte) throws MauvaisCompteException, MauvaiseDateException {
		LocalDate date = LocalDate.now();
		if (c.getCarteBleu() == null) {
			if (!c.getTypeCompte().name().equals("COMPTE_COURANT")) {
				throw new MauvaisCompteException("Les comptes epargnes n'ont pas de carte bleu");
			}
		} else {
			if (date.isBefore(c.getCarteBleu().getDateExpiration())) {
				throw new MauvaiseDateException(
						"Impossible d’effectuer le retrait, votre ancienne carte est encore valide");
			}
			c.getCarteBleu().setType(carte);
			c.getCarteBleu().setDateExpiration(date.plusYears(5));
		}
	}

}
