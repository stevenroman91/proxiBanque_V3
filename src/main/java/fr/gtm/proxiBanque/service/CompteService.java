package fr.gtm.proxiBanque.service;

import fr.gtm.proxiBanque.dao.CompteRepository;
import fr.gtm.proxiBanque.model.Compte;

public class CompteService extends CrudService<Compte> {

	public CompteRepository getRepo() {
		return (CompteRepository)this.repo ;	
	}
}
