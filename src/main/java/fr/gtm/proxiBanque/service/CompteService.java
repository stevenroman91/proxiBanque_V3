package fr.gtm.proxibanque.service;

import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.proxibanque.dao.CompteRepository;
import fr.gtm.proxibanque.model.Compte;
import fr.gtm.proxibanque.model.MauvaisCompteException;
import fr.gtm.proxibanque.model.MauvaisMontantException;
import fr.gtm.proxibanque.model.MauvaiseDateException;
import fr.gtm.proxibanque.model.SoldeInsuffisantException;
/**
 * @author Steven Roman & Nadir Boutra
 * @version 3.0
 */
public class CompteService extends CrudService<Compte> {

	@Autowired
	private VirementCompteComponent vc;

	@Autowired
	private RetraitComponent retraitcomponent;

	/**
	 * 
	 * @return repository de comptes
	 */
	public CompteRepository getRepo() {
		return (CompteRepository) this.repo;
	}

	/**
	 * 
	 * @param idD compte a debiter
	 * @param idC compte a crediter
	 * @param mt montant a transferer
	 * @return str
	 */
	public String virement(Integer idD, Integer idC, double mt) {
		String rep ="";
		try {
			vc.virement(this.read(idD), this.read(idC), mt);
		} catch (SoldeInsuffisantException | MauvaisMontantException e) {
			rep = e.getMessage();
		}
		return rep;
	}

	/**
	 * 
	 * @param id identifiant du compte
	 * @param mt montant a transferer
	 * @return str
	 */
	public String retraitEspeces(Integer id, double mt) {
		
		String rep ="";
		
		try {
			retraitcomponent.retraitEspeces(this.read(id), mt);
		} catch (MauvaisCompteException e) {
			rep=e.getMessage();
		} catch (MauvaisMontantException e) {
			rep=e.getMessage();
		} catch (SoldeInsuffisantException e) {
			rep=e.getMessage();
		}
		
		return rep;

	}
	
	/**
	 * 
	 * @param id identifiant du chequier
	 * @return str
	 */
	public String retraitChequier(Integer id) {
		String rep =null;
		try {
			retraitcomponent.retraitChequier(this.read(id));
		} catch (MauvaiseDateException e) {
			rep = e.getMessage();
		}
		return rep;
	}
	
	/**
	 * 
	 * @param id identifiant de la carte
	 * @param carte type de carte
	 * @return str
	 */
	public String retraitCarte(Integer id, String carte) {
		String rep =null;
		try {
			retraitcomponent.retraitCarte(this.read(id), carte);
		} catch (MauvaisCompteException e) {
			rep = e.getMessage();
		} catch (MauvaiseDateException e) {
			rep = e.getMessage();
		}
		return rep;
	}
}
