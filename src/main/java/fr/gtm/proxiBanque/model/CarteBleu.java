package fr.gtm.proxiBanque.model;

import java.io.Serializable;
import java.time.LocalDate;

public class CarteBleu implements Entity,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private long numCarte;
	private LocalDate dateExpiration;
	private String type;
	private Compte compte;
	
	@Override
	public Integer getId() {
		return this.id;
	}
	@Override
	public void setId(Integer id) {
		this.id=id;
	}
	/**
	 * @return the numCarte
	 */
	public long getNumCarte() {
		return numCarte;
	}
	/**
	 * @param numCarte the numCarte to set
	 */
	public void setNumCarte(long numCarte) {
		this.numCarte = numCarte;
	}
	/**
	 * @return the dateExpiration
	 */
	public LocalDate getDateExpiration() {
		return dateExpiration;
	}
	/**
	 * @param dateExpiration the dateExpiration to set
	 */
	public void setDateExpiration(LocalDate dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the compte
	 */
	public Compte getCompte() {
		return compte;
	}
	/**
	 * @param compte the compte to set
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	

}
