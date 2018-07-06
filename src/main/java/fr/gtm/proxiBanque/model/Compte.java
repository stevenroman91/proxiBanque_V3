package fr.gtm.proxibanque.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Compte implements Entity, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id ; 
	private long numCompte ; 
	private String libelle ;
	private LocalDate dateOuverture ;
	private double solde ;
	private Client client;
	private Chequier chequier;
	private CarteBleu carteBleu;
	
	@Override
	public Integer getId() {
		return this.id;
	}
	@Override
	public void setId(Integer id) {
		this.id=id;
	}
	/**
	 * @return the numCompte
	 */
	public long getNumCompte() {
		return numCompte;
	}
	/**
	 * @param numCompte the numCompte to set
	 */
	public void setNumCompte(long numCompte) {
		this.numCompte = numCompte;
	}
	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/**
	 * @return the dateOuverture
	 */
	public LocalDate getDateOuverture() {
		return dateOuverture;
	}
	/**
	 * @param dateOuverture the dateOuverture to set
	 */
	public void setDateOuverture(LocalDate dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}
	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	/**
	 * @return the chequier
	 */
	public Chequier getChequier() {
		return chequier;
	}
	/**
	 * @param chequier the chequier to set
	 */
	public void setChequier(Chequier chequier) {
		this.chequier = chequier;
	}
	/**
	 * @return the carteBleu
	 */
	public CarteBleu getCarteBleu() {
		return carteBleu;
	}
	/**
	 * @param carteBleu the carteBleu to set
	 */
	public void setCarteBleu(CarteBleu carteBleu) {
		this.carteBleu = carteBleu;
	}
	
	
	

	
	

}
