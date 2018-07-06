package fr.gtm.proxibanque.model;

import java.io.Serializable;
import java.time.LocalDate;


/**
 * CLASSE REPRESENTANT UNE CARTE BLEU ASSOCIEE A UNE COMPTE COURANT
 * @author Boutra Nadir && Steven Roman
 * @version 3.0 
 */
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
	
	
	
	/**
	 * CONSTRUCTEUR PAR DEFAUT PERMETTANT DE CREER UN OBJECT VIDE DE TYPE CarteBleu 
	 */
	public CarteBleu() {
		super();
		
	}
	
	
	/**
	 * @param numCarte
	 * @param dateExpiration
	 * @param type
	 */
	public CarteBleu(long numCarte, LocalDate dateExpiration, String type) {
		super();
		this.numCarte = numCarte;
		this.dateExpiration = dateExpiration;
		this.type = type;
	}


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
