package fr.gtm.proxibanque.service;

import fr.gtm.proxibanque.dao.CompteRepository;
import fr.gtm.proxibanque.model.Compte;

public class CompteService extends CrudService<Compte> {

	public CompteRepository getRepo() {
		return (CompteRepository)this.repo ;	
	}
}
