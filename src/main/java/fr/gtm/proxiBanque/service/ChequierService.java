package fr.gtm.proxiBanque.service;

import fr.gtm.proxiBanque.dao.ChequierRepository;
import fr.gtm.proxiBanque.model.Chequier;

public class ChequierService extends CrudService<Chequier>{
	public ChequierRepository getRepo() {
		return (ChequierRepository)this.repo ;	
	}
}
