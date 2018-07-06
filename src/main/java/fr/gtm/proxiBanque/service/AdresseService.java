package fr.gtm.proxibanque.service;

import fr.gtm.proxibanque.dao.AdresseRepository;
import fr.gtm.proxibanque.model.Adresse;

public class AdresseService  extends CrudService<Adresse> {

	public AdresseRepository getRepo() {
		return (AdresseRepository)this.repo ;	
	}
}
