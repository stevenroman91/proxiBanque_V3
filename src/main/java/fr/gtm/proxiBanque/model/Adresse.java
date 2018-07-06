package fr.gtm.proxibanque.model;

import java.io.Serializable;



/**
 * CLASSE REPRESENTANT UNE ADRESSE GEOGRAPHIQUE
 * @author Boutra Nadir && Steven Roman
 * @version 3.0 
 */
public class Adresse implements Entity,Serializable{
	
	//Attributs de la classe Adresse
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String adressePrincipale;
	private String adresseSecondaire;
	private String codePostal;
	private String ville;
	private String pays;
	private Client client ; 
	
	
	
	/**
	 * CONSTRUCTEUR PAR DEFAUT PERMETTANT DE CREER UN OBJECT VIDE DE TYPE Adresse 
	 */
	public Adresse() {
		super();
	}
	
	
	/**
	 * CONSTRUCTEUR PERMETTANT DE CREER UN OBJECT DE TYPE Adresse
	 * @param adressePrincipale Adresse principale (N°, rue)
	 * @param adresseSecondaire adresse secondaire (Batiment, ..)
	 * @param codePostal code Postale
	 * @param ville Ville
	 * @param pays Pays 
	 */
	public Adresse(String adressePrincipale, String adresseSecondaire, String codePostal, String ville, String pays) {
		super();
		this.adressePrincipale = adressePrincipale;
		this.adresseSecondaire = adresseSecondaire;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}


	/**
	 * @return RETOURNE L'ID DE L'ADRESSE
	 */
	
	@Override
	public Integer getId() {
		return this.id;
	}
	
	/**
	 * EDITE L'ID DU CLIENT
	 * @param Integer id 
	 */
	@Override
	public void setId(Integer id) {
		this.id=id;
	}
	/**
	 * @return RETOURNE L'ADRESSE PRINCIPALE DU CLIENT 
	 */
	public String getAdressePrincipale() {
		return adressePrincipale;
	}
	/**
	 * EDITE L'ADRESSE PRINCIPALE DU CLIENT 
	 * @param String adressePrincipale 
	 */
	public void setAdressePrincipale(String adressePrincipale) {
		this.adressePrincipale = adressePrincipale;
	}
	/**
	 * @return RETOURNE L'ADRESSE SECONDAIRE CU CLIENT 
	 */
	public String getAdresseSecondaire() {
		return adresseSecondaire;
	}
	/**
	 * adresseSecondaire EDITE L'ADRESSE SECONDAIRE DU CLIENT
	 * @param String adresseSecondaire 
	 */
	public void setAdresseSecondaire(String adresseSecondaire) {
		this.adresseSecondaire = adresseSecondaire;
	}
	/**
	 * @return RETROURNE LE CODE POSTAL DU CLIENT 
	 */
	public String getCodePostal() {
		return codePostal;
	}
	/**
	 * EDITE LE CODE POSTAL DU CLIENT
	 * @param String codePostal 
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	/**
	 * @return RRETOURNE LA VILLE DU CLIENT
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * EDITE LA VILLE DU CLIENT
	 * @param String ville 
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	/**
	 * @return RETOURNE LE PAYS DU CLIENT
	 */
	public String getPays() {
		return pays;
	}
	/**
	 * EDITE LE PAYS DU CLIENT
	 * @param String pays 
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	/**
	 * 
	 * @return  
	 * RETOURNE LE CLIENT ASSOCIE A L'ADRESSE
	 */
	public Client getClient() {
		return client;
	}
	
	/**
	 * 
	 * EDITE LE CLIENT ASSOCIE A L'ADRESSE
	 * @param fr.gtm.proxibanque.model.Client client  
	 */
	public void setClient(Client client) {
		this.client = client;
	}	
}

