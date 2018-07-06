package fr.gtm.proxibanque.service;

import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.proxibanque.model.MauvaisCompteException;
import fr.gtm.proxibanque.model.MauvaisMontantException;
import fr.gtm.proxibanque.model.MauvaiseDateException;
import fr.gtm.proxibanque.model.SoldeInsuffisantException;
/**
 * @author Steven Roman & Nadir Boutra
 * @version 3.0
 */
public class MethodeTest {
	
	@Autowired
	private RetraitComponent retraitcomponent;
	@Autowired
	private VirementCompteComponent vc;
	@Autowired
	private ClientService clientService;
	@Autowired
	private CompteService compteService;
	
	
	/**
	 * 
	 * @param id identifiant du compte
	 * @param mt montant du retrait
	 * @return str
	 */
	public String retraitEspeces(Integer id, double mt) {

		String rep = "";

		try {
			retraitcomponent.retraitEspeces(compteService.read(id), mt);
		} catch (MauvaisCompteException e) {
			rep = e.getMessage();
		} catch (MauvaisMontantException e) {
			rep = e.getMessage();
		} catch (SoldeInsuffisantException e) {
			rep = e.getMessage();
		}

		return rep;

	}
	
	/**
	 * 
	 * @param id identifiant du compte
	 * @param carte type de carte
	 * @return str
	 */
	public String retraitCarte(Integer id, String carte) {
		String rep =null;
		try {
			retraitcomponent.retraitCarte(compteService.read(id), carte);
		} catch (MauvaisCompteException e) {
			rep = e.getMessage();
		} catch (MauvaiseDateException e) {
			rep = e.getMessage();
		}
		return rep;
	}
	
	/**
	 * 
	 * @param id identifiant du compte
	 * @return str
	 */
	public String retraitChequier(Integer id) {
		String rep =null;
		try {
			retraitcomponent.retraitChequier(compteService.read(id));
		} catch (MauvaiseDateException e) {
			rep = e.getMessage();
		}
		return rep;
	}
}
