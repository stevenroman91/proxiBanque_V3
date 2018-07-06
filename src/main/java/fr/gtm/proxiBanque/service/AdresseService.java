package fr.gtm.proxibanque.service;

import fr.gtm.proxibanque.dao.AdresseRepository;
import fr.gtm.proxibanque.model.Adresse;
/**
 * @author Steven Roman & Nadir Boutra
 * @version 3.0
 */
public class AdresseService  extends CrudService<Adresse> {

	public AdresseRepository getRepo() {
		return (AdresseRepository)this.repo ;	
	}
}
