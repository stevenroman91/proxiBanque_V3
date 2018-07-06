package fr.gtm.proxibanque.service;

import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.proxibanque.dao.CompteRepository;
import fr.gtm.proxibanque.model.Compte;
import fr.gtm.proxibanque.model.MauvaisMontantException;
import fr.gtm.proxibanque.model.SoldeInsuffisantException;
/**
 * Cette methode fait le lien entre le service et la dao
 * @author Steven Roman & Nadir Boutra
 * @version 3.0
 */
public class VirementCompteComponent {

	@Autowired
	private CompteRepository cr;

	public void virement(Compte c1, Compte c2, double mt) throws SoldeInsuffisantException, MauvaisMontantException {
		if (mt < 0) {
			throw new MauvaisMontantException("le montant que vous avez saisi est negatif");
		}
		if (mt > 900) {
			throw new SoldeInsuffisantException("le montant que vous avez saisi est superieur à 900 euros");
		}
		if (mt > c1.getSolde()) {
			throw new SoldeInsuffisantException("solde insuffisant");
		}
		c1.setSolde(c1.getSolde() - mt);
		c2.setSolde(c2.getSolde() + mt);
		cr.save(c1);
		cr.save(c2);
	}

}
