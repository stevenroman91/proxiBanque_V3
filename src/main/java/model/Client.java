package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Client implements Entity,Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer id ; 
	private int numClient;
	private String nom;
	private String prenom;
	LocalDate dateDeNaissance;
	Adresse adresse;
	CompteCourant compteCourant;
	CompteEpargne compteEpargne;

	

}
