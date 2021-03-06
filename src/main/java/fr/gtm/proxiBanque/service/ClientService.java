package fr.gtm.proxibanque.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.proxibanque.dao.ClientRepository;
import fr.gtm.proxibanque.model.Client;
/**
 * @author Steven Roman & Nadir Boutra
 * @version 3.0
 */
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
		if (component.searchByNameOrFirstName()) {
			this.listIntances.put(component.getId(), component) ;
			return component.getId();
		} else {
			return null;
		}

	}
	
	public Client searchByBirthDate(LocalDate dateDeNaissance, Integer id) {
		SearchClientComponent component = listIntances.get(id);
		Client c=component.searchByBirthDate(dateDeNaissance);
		return c;
	}

}
