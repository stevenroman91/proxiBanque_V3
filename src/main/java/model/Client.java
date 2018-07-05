package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Client implements Entity,Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer id ; 
	private int numClient;
	private String nom;
	private String prenom;
	private LocalDate dateDeNaissance;
	private Adresse adresse;
	private CompteCourant compteCourant;
	private CompteEpargne compteEpargne;
	
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
	 * @return the compteCourant
	 */
	public CompteCourant getCompteCourant() {
		return compteCourant;
	}
	/**
	 * @param compteCourant the compteCourant to set
	 */
	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}
	/**
	 * @return the compteEpargne
	 */
	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}
	/**
	 * @param compteEpargne the compteEpargne to set
	 */
	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}
	
	

	

}
