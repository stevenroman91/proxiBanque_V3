package fr.gtm.proxibanque.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import fr.gtm.proxibanque.dao.CompteRepository;
import fr.gtm.proxibanque.model.Compte;
import fr.gtm.proxibanque.model.MauvaisCompteException;
import fr.gtm.proxibanque.model.MauvaisMontantException;
import fr.gtm.proxibanque.model.MauvaiseDateException;
import fr.gtm.proxibanque.model.SoldeInsuffisantException;

public class CompteService extends CrudService<Compte> {

	@Autowired
	private VirementCompteComponent vc;

	@Autowired
	private RetraitComponent retraitcomponent;

	public CompteRepository getRepo() {
		return (CompteRepository) this.repo;
	}

	public void virement(Integer idD, Integer idC, double mt) {
		try {
			vc.virement(this.read(idD), this.read(idC), mt);
		} catch (SoldeInsuffisantException | MauvaisMontantException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String retraitespeces(Integer id, double mt) {
		
		String rep ="";
		
		try {
			retraitcomponent.retraitespeces(this.read(id), mt);
		} catch (MauvaisCompteException e) {
			// TODO Auto-generated catch block
			//rep="Vous ne pouvez pas retirer d'espèces sur un compte epargne";
			e.printStackTrace();
			e.getMessage();
		} catch (MauvaisMontantException e) {
			// TODO Auto-generated catch block
			//rep="Vous ne pouvez pas retirer un montant supérieur à 300";
			e.printStackTrace();
			e.getMessage();
		} catch (SoldeInsuffisantException e) {
			// TODO Auto-generated catch block
			//rep="solde insuffisant";
			e.printStackTrace();
			e.getMessage();
		}
		
		return rep;

	}
	
	
	public String retraitchequier(Integer id) {
		String rep ="";
		try {
			retraitcomponent.retraitchequier(this.read(id));
		} catch (MauvaiseDateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			rep = e.getMessage();
		}
		return rep;
	}
	
	public String retraitcarte(Integer id, String carte) {
		retraitcomponent.retraitcarte(this.read(id), carte);
	}
}
