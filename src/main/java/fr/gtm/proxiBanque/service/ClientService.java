package fr.gtm.proxiBanque.service;

import fr.gtm.proxiBanque.dao.ClientRepository;
import fr.gtm.proxiBanque.model.Client;

public class ClientService extends CrudService<Client> {
	
	public ClientRepository getRepo() {
		return (ClientRepository)this.repo ;	
	}

}
