package fr.gtm.proxibanque.service;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.proxibanque.dao.CompteRepository;
import fr.gtm.proxibanque.model.Compte;
import fr.gtm.proxibanque.model.MauvaisCompteException;
import fr.gtm.proxibanque.model.MauvaisMontantException;
import fr.gtm.proxibanque.model.MauvaiseDateException;
import fr.gtm.proxibanque.model.SoldeInsuffisantException;

public class RetraitComponent {
	@Autowired
	private CompteRepository cr;
	private static final Logger LOGGER = LoggerFactory.getLogger(VirementCompteComponent.class);
	
	public void retraitespeces(Compte c, double mt) throws MauvaisCompteException, MauvaisMontantException,SoldeInsuffisantException {
		if(!c.getTypeCompte().name().equals("COMPTE_COURANT")) throw new MauvaisCompteException("Vous ne pouvez pas retirer d'espèces sur un compte epargne");
		if(mt>300) throw new MauvaisMontantException("Vous ne pouvez pas retirer un montant supérieur à 300");
		if(mt>c.getSolde())  throw new SoldeInsuffisantException("solde insuffisant");
		c.setSolde(c.getSolde()-mt);
		cr.save(c);

	}
	
	public void retraitchequier(Compte c) throws MauvaiseDateException {
		LocalDate date = LocalDate.now();
		if(date.minusMonths(3).isBefore(c.getChequier().getDateReception())) throw new MauvaiseDateException("vous avez reçu votre chequier il y a moins de 3 mois, vous ne pouvez pas en retirer un nouveau");
		c.getChequier().setDateEnvoi(date);
		c.getChequier().setDateReception(date.plusDays(15));
		cr.save(c);
	}
	
	public void retraitcarte(Compte c, String carte) throws MauvaisCompteException {
		LocalDate date = LocalDate.now();
		if(!c.getTypeCompte().name().equals("COMPTE_COURANT")) throw new MauvaisCompteException("Les comptes epargnes n'ont pas de carte bleu");
		if(date.isBefore(c.getCarteBleu().getDateExpiration()))
		c.getCarteBleu().setType(carte);
		c.getCarteBleu().se
	}
	
}
