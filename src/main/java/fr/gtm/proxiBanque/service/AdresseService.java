package fr.gtm.proxiBanque.service;

import fr.gtm.proxiBanque.dao.AdresseRepository;
import fr.gtm.proxiBanque.model.Adresse;

public class AdresseService  extends CrudService<Adresse> {

	public AdresseRepository getRepo() {
		return (AdresseRepository)this.repo ;	
	}
}
