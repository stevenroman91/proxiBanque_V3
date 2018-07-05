package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Chequier implements Entity,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private LocalDate dateEnvoi;
	private LocalDate dateReception;
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
	 * @return the dateEnvoi
	 */
	public LocalDate getDateEnvoi() {
		return dateEnvoi;
	}
	/**
	 * @param dateEnvoi the dateEnvoi to set
	 */
	public void setDateEnvoi(LocalDate dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}
	/**
	 * @return the dateReception
	 */
	public LocalDate getDateReception() {
		return dateReception;
	}
	/**
	 * @param dateReception the dateReception to set
	 */
	public void setDateReception(LocalDate dateReception) {
		this.dateReception = dateReception;
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
