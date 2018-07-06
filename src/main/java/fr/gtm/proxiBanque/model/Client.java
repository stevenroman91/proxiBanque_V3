package fr.gtm.proxibanque.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * CLASSE REPRESENTANT UN CLIENT
 * @author Boutra Nadir && Steven Roman
 * @version 3.0 
 */

public class Client implements Entity,Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer id ; 
	private int numClient;
	private String nom;
	private String prenom;
	private LocalDate dateDeNaissance;
	private Adresse adresse;
	private List<Compte> comptes = new ArrayList<>();
	
	
	
	/**
	 * CONSTRUCTEUR PAR DEFAUT PERMETTANT DE CREER UN OBJECT VIDE DE TYPE Client 
	 */
	public Client() {
		super();
	}
	/**
	 * CONSTRUCTEUR PERMETTANT DE CREER UN OBJECT DE TYPE Client
	 * @param numClient
	 * @param nom
	 * @param prenom
	 * @param dateDeNaissance
	 */
	public Client(int numClient, String nom, String prenom, LocalDate dateDeNaissance) {
		super();
		this.numClient = numClient;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
	}
	
	/**
	 * @return RETOURNE L'ID DU CLIENT
	 */
	@Override
	public Integer getId() {
		return this.id;
	}
	/**
	 * EDITE L'ID DU Client
	 * @param Integer id 
	 */
	@Override
	public void setId(Integer id) {
		this.id=id;
	}
	
	/**
	 * @return RETOURNE LE NUMERO DU CLIENT
	 */
	public int getNumClient() {
		return numClient;
	}
	/**
	 * EDITE LE NUMERO DU CLIENT
	 * @param int numClient 
	 */
	public void setNumClient(int numClient) {
		this.numClient = numClient;
	}
	/**
	 * @return RETOURNE LE NOM DU CLIENT
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * EDITE LE NOM DU CLIENT
	 * @param String nom  
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return RETOURNE LE PRENOM DU CLIENT
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * EDITE LE PRENOM DU CLIENT
	 * @param String prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return RETOURNE LA DATE DE NAISSANCE DU CLIENT
	 */
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	/**
	 * EDITE LE DATE DE NAISSANCE DU CLIENT
	 * @param LocalDate dateDeNaissance 
	 */
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	/**
	 * @return RETOURNE LADRESSE DU CLIENT
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 * EDITE LADRESSE DU CLIENT
	 * @param Adresse adresse
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	/**
	 * @return RETOURNE LA LISTE DES COMPTES DU CLIENT
	 */
	public List<Compte> getComptes() {
		return comptes;
	}
	/**
	 * EDITE LA LISTE DES COMPTES DU CLIENT
	 * @param List<Compte> comptes 
	 */
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

}

