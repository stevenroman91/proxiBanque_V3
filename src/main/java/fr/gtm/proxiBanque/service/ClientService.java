package fr.gtm.proxiBanque.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.proxiBanque.dao.ClientRepository;
import fr.gtm.proxiBanque.model.Client;

public class ClientService extends CrudService<Client> {

	@Autowired
	private ObjectFactory<SearchClientComponent> sc;
	private Map<Integer, SearchClientComponent> listIntances = new HashMap<>();

	public ClientRepository getRepo() {
		return (ClientRepository) this.repo;
	}

	public Integer searchByNameOrFirstName(String recherche) {
		SearchClientComponent component = sc.getObject();
		component.setRecherche(recherche);
		if (component.seachByNameOrFirstName()) {
			this.listIntances.put(component.getId(), component) ;
			return component.getId();
		} else {
			return null;
		}

	}

}
