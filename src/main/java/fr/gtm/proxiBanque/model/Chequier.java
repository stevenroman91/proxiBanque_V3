package fr.gtm.proxibanque.model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * CLASSE REPRESENTANT UN CHEQUIER
 * @author Boutra Nadir && Steven Roman
 * @version 3.0 
 */

public class Chequier implements Entity,Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private LocalDate dateEnvoi;
	private LocalDate dateReception;
	private Compte compte;
	
	

	/**
	 * CONSTRUCTEUR PAR DEFAUT PERMETTANT DE CREER UN OBJECT VIDE DE TYPE Chequier 
	 */
	public Chequier() {
		super();
	}
	
	

	/**
	 * CONSTRUCTEUR PERMETTANT DE CREER UN OBJECT DE TYPE Chequier
	 * @param dateEnvoi DATE DENVOI DU CHEQUIER
	 * @param dateReception DATE DE RECEPTION DU CHEQUIER
	 */
	public Chequier(LocalDate dateEnvoi, LocalDate dateReception) {
		super();
		this.dateEnvoi = dateEnvoi;
		this.dateReception = dateReception;
	}



	/**
	 * @return RETOURNE L'ID DU CHEQUIER
	 */
	
	@Override
	public Integer getId() {
		return this.id;
	}
	
	/**
	 * EDITE L'ID DU CHEQUIER
	 * @param Integer id 
	 */
	@Override
	public void setId(Integer id) {
		this.id=id;
	}
	/**
	 * @return RETOURNE LA DATE DENVOI DU CHEQUIER
	 */
	public LocalDate getDateEnvoi() {
		return dateEnvoi;
	}
	/**
	 * EDITE LA DATE DENVOI DU CHEQUIER
	 * @param LocalDate dateEnvoi 
	 */
	public void setDateEnvoi(LocalDate dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}
	
	/**
	 * @return RETOURNE LA DATE DE RECEPTION DU CHEQUIER
	 */
	public LocalDate getDateReception() {
		return dateReception;
	}
	/**
	 * EDITE LA DATE DE RECEPTION DU CHEQUIER
	 * @param LocalDate dateReception 
	 */
	public void setDateReception(LocalDate dateReception) {
		this.dateReception = dateReception;
	}
	/**
	 * @return RETOURNE LE COMPTE ASSOCIE AU CHEQUIER
	 */
	public Compte getCompte() {
		return compte;
	}
	/**
	 * EDITE LE COMPTE ASSOCIE AU CHEQUIER
	 * @param Compte compte 
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}	
}

