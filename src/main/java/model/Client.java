package model;

import java.io.Serializable;

public class Client implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer id ; 
	private String nom;
	private String prenom;
	private String adresse;
	private String codePostal;
	private String ville;
	private String telephone;
	private String typeClient ; 
	private CompteCourant cc;
	private CompteEpargne ce;
	private Conseiller conseiller ;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}
	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the typeClient
	 */
	public String getTypeClient() {
		return typeClient;
	}
	/**
	 * @param typeClient the typeClient to set
	 */
	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}
	/**
	 * @return the cc
	 */
	public CompteCourant getCc() {
		return cc;
	}
	/**
	 * @param cc the cc to set
	 */
	public void setCc(CompteCourant cc) {
		this.cc = cc;
	}
	/**
	 * @return the ce
	 */
	public CompteEpargne getCe() {
		return ce;
	}
	/**
	 * @param ce the ce to set
	 */
	public void setCe(CompteEpargne ce) {
		this.ce = ce;
	}
	/**
	 * @return the conseiller
	 */
	public Conseiller getConseiller() {
		return conseiller;
	}
	/**
	 * @param conseiller the conseiller to set
	 */
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}
	
	
	
	

}
