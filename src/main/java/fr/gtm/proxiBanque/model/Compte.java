package fr.gtm.proxibanque.model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * CLASSE REPRESENTANT UN COMPTE
 * @author Boutra Nadir and Steven Roman
 * @version 3.0 
 */

public class Compte implements Entity, Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id ; 
	private long numCompte ; 
	private String libelle ;
	private LocalDate dateOuverture ;
	private double solde ;
	private Client client;
	private Chequier chequier;
	private CarteBleu carteBleu;
	private String typeCompte;
	
	
	
	/**
	 * CONSTRUCTEUR PAR DEFAUT PERMETTANT DE CREER UN OBJECT VIDE DE TYPE Client 
	 */
	public Compte() {
		super();
		
	}
	
	
	/**
	 * CONSTRUCTEUR PERMETTANT DE CREER UN OBJECT DE TYPE Compte
	 * @param numCompte numero de compte
	 * @param libelle au choix
	 * @param dateOuverture la date d'ouverture du compte
	 * @param solde solde du compte
	 * @param typeCompte epargne ou courant
	 */
	public Compte(long numCompte, String libelle, LocalDate dateOuverture, double solde, String typeCompte) {
		super();
		this.numCompte = numCompte;
		this.libelle = libelle;
		this.dateOuverture = dateOuverture;
		this.solde = solde;
		this.typeCompte = typeCompte;
	}


	/**
	 * @return RETOURNE L'ID DU COMPTE
	 */
	@Override
	public Integer getId() {
		return this.id;
	}
	/**
	 * EDITE L'ID DU Client
	 * @param id de type Integer 
	 */
	@Override
	public void setId(Integer id) {
		this.id=id;
	}
	/**
	 * @return RETOURNE LE NUMERO DU COMPTE SUR 13 CHIFFRES
	 */
	public long getNumCompte() {
		return numCompte;
	}
	/**
	 * EDITE LE NUMERO DU COMPTE SUR 13 CHIFFRES
	 * @param numCompte de type Long 
	 */
	public void setNumCompte(long numCompte) {
		this.numCompte = numCompte;
	}
	/**
	 * @return RETOURNE LE LIBELLE DU COMPTE
	 */
	public String getLibelle() {
		return libelle;
	}
	/**
	 * EDITE LE LIBBELE DU COMPTE
	 * @param libelle de type String 
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/**
	 * @return RETOURNE LA DATE DOUVERTURE DU COMPTE
	 */
	public LocalDate getDateOuverture() {
		return dateOuverture;
	}
	/**
	 * EDITE LA DATE DOUVERTURE DU COMPTE
	 * @param dateOuverture de type LocalDate 
	 */
	public void setDateOuverture(LocalDate dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	/**
	 * @return RETOURNE LE SOLDE DU COMPTE
	 */
	public double getSolde() {
		return solde;
	}
	/**
	 * EDITE LE SOLDE DU COMPTE
	 * @param solde de type double  
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/**
	 * @return RETOURNE LE CLIENT ASSOCIE AU COMPTE
	 */
	public Client getClient() {
		return client;
	}
	/**
	 * EDITE LE CLIENT ASSOCIE AU COMPTE
	 * @param client  de type Client 
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	/**
	 * @return RETOURNE LE CHEQUIER ASSOCIE AU COMPTE
	 */
	public Chequier getChequier() {
		return chequier;
	}
	/**
	 * EDITE LE CHEQUIER ASSOCIE AU COMPTE
	 * @param chequier de type Chequier 
	 */
	public void setChequier(Chequier chequier) {
		this.chequier = chequier;
	}
	/**
	 * @return RETOURNE LA CARTE BLEU ASSOCIEE AU COMPTE
	 */
	public CarteBleu getCarteBleu() {
		return carteBleu;
	}
	/**
	 * EDITE LA CARTE BLEU ASSOCIEE AU COMPTE
	 * @param carteBleu de type CarteBleu 
	 */
	public void setCarteBleu(CarteBleu carteBleu) {
		this.carteBleu = carteBleu;
	}
	/**
	 * @return RETOURNE LE TYPE DE COMPTE ("COMPTE_COURANT" - "COMPTE_EPARGNE")
	 */
	public TypeCompte getTypeCompte() {
		return TypeCompte.valueOf(this.typeCompte);
	}
	/**
	 * EDITE LE TYPE DE COMPTE ("COMPTE_COURANT" - "COMPTE_EPARGNE")
	 * @param typeCompte de type TypeCompte 
	 */
	public void setTypeCompte(TypeCompte typeCompte) {
		this.typeCompte = typeCompte.name();
	}
	

}
