package fr.gtm.proxiBanque.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Client implements Entity,Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer id ; 
	private int numClient;
	private String nom;
	private String prenom;
	private LocalDate dateDeNaissance;
	private Adresse adresse;
	private List<Compte> comptes;
	
	//Méthodes de l'interface Entity implémentée pour la classe Client
	
	@Override
	public Integer getId() {
		return this.id;
	}
	@Override
	public void setId(Integer id) {
		this.id=id;
	}
	
	/**
	 * @return the numClient
	 */
	public int getNumClient() {
		return numClient;
	}
	/**
	 * @param numClient the numClient to set
	 */
	public void setNumClient(int numClient) {
		this.numClient = numClient;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the dateDeNaissance
	 */
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	/**
	 * @param dateDeNaissance the dateDeNaissance to set
	 */
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	/**
	 * @return the comptes
	 */
	public List<Compte> getComptes() {
		return comptes;
	}
	/**
	 * @param comptes the comptes to set
	 */
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	
	
	

	

}
