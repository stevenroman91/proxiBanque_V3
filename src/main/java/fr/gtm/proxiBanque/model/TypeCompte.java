package fr.gtm.proxiBanque.model;

public enum TypeCompte
{
    CC("COMPTE COURANT"), CE("COMPTE EPARGNE");

    private String typeCompte;
 
    private TypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }
 
    public String getTypeCompte() {
        return this.typeCompte ;
    }
}