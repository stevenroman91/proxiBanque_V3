package fr.gtm.proxibanque.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.proxibanque.dao.ClientRepository;
import fr.gtm.proxibanque.model.Client;
/**
 * Cette methode fait le lien entre le service et la dao
 * @author Steven Roman & Nadir Boutra
 * @version 3.0
 */
public class SearchClientComponent {

	static int count = 0;

	@Autowired
	private ClientRepository rp;

	private Integer id;
	private String recherche;
	private List<Client> listeRecherche = new ArrayList<>();

	/**
	 * constructeur
	 */
	public SearchClientComponent() {
		this.id = count++;
	}
	
	/**
	 * Methode qui nous permet de faire une recherche
	 * si l'ultilisateur a rentré un nom ou un prenom
	 * @return un booleen
	 */
	public boolean searchByNameOrFirstName() {
		String[] parts = this.recherche.split(" ");
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

	/**
	 * Methode qui nous permet de faire une recherche
	 * si l'ultilisateur a rentré un nom ou un prenom
	 * puis sa date de naissance
	 * @param date date de naissance de l'utilisateur
	 * @return le client
	 */
	public Client searchByBirthDate(LocalDate date) {
		
		for (Client client : listeRecherche) {
			if(client.getDateDeNaissance().equals(date))
			{
				return client;
			}
		}
		
		return null;
	}

	/**
	 * 
	 * @return identifiant
	 */
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 
	 * @return identifiant
	 */
	public String getRecherche() {
		return recherche;
	}

	public void setRecherche(String recherche) {
		this.recherche = recherche;
	}

}
