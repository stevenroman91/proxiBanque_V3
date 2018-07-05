package fr.gtm.proxiBanque.model;

public enum TypeCarteBleu {

	VP("VISA PREMIUM"), VE("VISA ELECTRON");

    private String typeCarte;
 
    private TypeCarteBleu(String typeCarte) {
        this.typeCarte = typeCarte;
    }
 
    public String getTypeCompte() {
        return this.typeCarte ;
    }
}
