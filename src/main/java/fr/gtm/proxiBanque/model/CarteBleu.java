package fr.gtm.proxibanque.model;

import java.io.Serializable;
import java.time.LocalDate;


/**
 * CLASSE REPRESENTANT UNE CARTE BLEU ASSOCIEE A UN COMPTE COURANT
 * @author Boutra Nadir and Steven Roman
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
	 *  CONSTRUCTEUR PERMETTANT DE CREER UN OBJECT DE TYPE Adresse
	 * @param numCarte 	NUMERO DE LA CARTE BLEU SUR 16 CHIFFRES
	 * @param dateExpiration DATE DEXPIRATION DE LA CARTE BANCAIRE
	 * @param type VISA PREMIER OU VISA ELECTRON
	 */
	public CarteBleu(long numCarte, LocalDate dateExpiration, String type) {
		super();
		this.numCarte = numCarte;
		this.dateExpiration = dateExpiration;
		this.type = type;
	}


	/**
	 * @return RETOURNE L'ID DE LA CARTE BLEU
	 */
	@Override
	public Integer getId() {
		return this.id;
	}
	
	/**
	 * EDITE L'ID DE LA CARTE BLEU
	 * @param Integer id 
	 */
	@Override
	public void setId(Integer id) {
		this.id=id;
	}
	/**
	 * @return RETOURNE LE NUMERO DE LA CARTE BLEU
	 */
	public long getNumCarte() {
		return numCarte;
	}
	/**
	 * EDITE LE NUMERO DE LA CARTE BLEU
	 * @param numCarte the numCarte to set
	 */
	public void setNumCarte(long numCarte) {
		this.numCarte = numCarte;
	}
	/**
	 * @return RETOURNE LA DATE DEXPIRATION DE LA CARTE BLEU
	 */
	public LocalDate getDateExpiration() {
		return dateExpiration;
	}
	/**
	 * EDITE LA DATE DEXPIRATION DE LA CARTE BANCAIRE
	 * @param LocalDate dateExpiration
	 */
	public void setDateExpiration(LocalDate dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	/**
	 * @return RETOURNE LE TYPE DE LA CARTE BLEU
	 */
	public String getType() {
		return type;
	}
	/**
	 * EDITE LE TYPE DE LA CARTE BLEU 
	 * @param String type 
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return RETOURNE LE COMPTE ASSOCIE A LA CARTE BLEU
	 */
	public Compte getCompte() {
		return compte;
	}
	/**
	 * EDITE LE COMPTE ASSOCIE A LA CARTE BLEU
	 * @param Compte compte 
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	

}
