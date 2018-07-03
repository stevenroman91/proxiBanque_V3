package service;

import dao.ClientRepository;
import model.Client;

public class ClientService extends CrudService<Client> {
	
	public ClientRepository getRepo() {
		return (ClientRepository)this.repo ;	
	}

}
