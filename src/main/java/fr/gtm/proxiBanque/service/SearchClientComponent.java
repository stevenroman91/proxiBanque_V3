package fr.gtm.proxiBanque.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.proxiBanque.dao.ClientRepository;
import fr.gtm.proxiBanque.model.Client;

public class SearchClientComponent {

	static int count = 0;

	@Autowired
	private ClientRepository rp;

	private Integer id;
	private String recherche;
	//private LocalDate date;
	private List<Client> listeRecherche = new ArrayList<>();

	public SearchClientComponent() {
		this.id = count++;
	}
	
	public boolean searchByNameOrFirstName() {
		// String part1 = this.recherche.split(" ")[0] ;
		// String part2 = this.recherche.split(" ")[1] ;
		String[] parts = this.recherche.split(" ");
		// String part2 = null ;
		boolean retour = false;
		if (parts.length == 1) {
			listeRecherche.addAll(rp.findClientByPrenomOrNom(parts[0]));
			retour = listeRecherche.size() > 0 ? true : false;
		} else {

			listeRecherche.addAll(rp.findClientByNomAndPrenom(parts[0], parts[1]));
			if (listeRecherche.size() > 0) {
				retour = true;

			} else {
				listeRecherche.addAll(rp.findClientByNomAndPrenom(parts[1], parts[0]));
				retour = listeRecherche.size() > 0 ? true : false;
			}

		}

		return retour;
	}

	public Client searchByBirthDate(LocalDate date) {
		
		for (Client client : listeRecherche) {
			if(client.getDateDeNaissance().equals(date))
			{
				return client;
			}
		}
		
		return null;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRecherche() {
		return recherche;
	}

	public void setRecherche(String recherche) {
		this.recherche = recherche;
	}

}
