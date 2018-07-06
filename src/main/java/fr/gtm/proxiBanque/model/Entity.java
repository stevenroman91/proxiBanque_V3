package fr.gtm.proxibanque.model;

/**
 * CLASSE PERMETTANT DE FORCER LAJOUT DE ID DANS LES ENTITES SENSES ETRE PERSISTES
 * @author Boutra Nadir && Steven Roman
 * @version 3.0 
 */
public interface Entity {
	
	Integer getId() ;

	void setId(Integer id);

}
