package model;

import java.io.Serializable;

public abstract class Compte implements Entity, Serializable {
	
	private Integer id ; 
	private double solde ; 
	private String dateOuverture ;
	
	
	public Compte()  {
		super();
	}

	public Compte(Integer id, double solde, String dateOuverture) {
		super();
		this.id = id;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer idCompte) {
		this.id = idCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	
	
	
	

}
