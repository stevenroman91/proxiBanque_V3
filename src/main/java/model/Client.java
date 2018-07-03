package model;

import java.util.List;

public class Client extends Personne {
	
	
	private static final long serialVersionUID = 1L;
	
	private String typeClient ; 
	private CompteCourant cc;
	private CompteEpargne ce;
	private Conseiller conseiller ;
	
	public String getTypeClient() {
		return typeClient;
	}
	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}
	public CompteCourant getCc() {
		return cc;
	}
	public void setCc(CompteCourant cc) {
		this.cc = cc;
	}
	public CompteEpargne getCe() {
		return ce;
	}
	public void setCe(CompteEpargne ce) {
		this.ce = ce;
	}
	public Conseiller getConseiller() {
		return conseiller;
	}
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	} 
	
	

}
