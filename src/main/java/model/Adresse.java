package model;

import java.io.Serializable;

public class Adresse implements Entity,Serializable{
	
	//Attributs de la classe Adresse
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String adressePrincipale;
	private String adresseSecondaire;
	private String codePostal;
	private String ville;
	private String pays;
	
	@Override
	public Integer getId() {
		return this.id;
	}
	@Override
	public void setId(Integer id) {
		this.id=id;
	}
	/**
	 * @return the adressePrincipale which is the address of the client
	 */
	public String getAdressePrincipale() {
		return adressePrincipale;
	}
	/**
	 * @param adressePrincipale the adressePrincipale to set the principal address of the client
	 */
	public void setAdressePrincipale(String adressePrincipale) {
		this.adressePrincipale = adressePrincipale;
	}
	/**
	 * @return the adresseSecondaire which is the secondary address of the client
	 */
	public String getAdresseSecondaire() {
		return adresseSecondaire;
	}
	/**
	 * @param adresseSecondaire the adresseSecondaire to set the secondary address of the client
	 */
	public void setAdresseSecondaire(String adresseSecondaire) {
		this.adresseSecondaire = adresseSecondaire;
	}
	/**
	 * @return the codePostal which is the post code of the client
	 */
	public String getCodePostal() {
		return codePostal;
	}
	/**
	 * @param codePostal the codePostal to set the post code of the client
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	/**
	 * @return the ville which is the city of the client
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * @param ville the ville to set the city of the client
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	/**
	 * @return the pays which is the country of the client
	 */
	public String getPays() {
		return pays;
	}
	/**
	 * @param pays the pays to set the country of the client
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}
	
}
