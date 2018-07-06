/**
 * 
 */
package fr.gtm.proxibanque.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.gtm.proxibanque.model.Client;

/**
 * INTERFACE PERMETTANT DUTILISER LES METHODES JPA POUR LA PERSISTANCE
 * @author Steven Roman & Nadir Boutra
 * @version 3.0
 */
@Repository
public interface ClientRepository extends JpaRepository <Client, Integer> {

	/**
	 * METHODE PERMETTANT DEFFECTUER UNE REQUETTE DANS LE
	 * BUT DE RETOURNER LES CLIENTS CORRESPONDANTS AU NOM 
	 * OU PRENOM SAISIES DANS LA RECHERCHE
	 * @param str
	 * @return RETOURNE LA LISTE DES CLIENTS CIBLES PAR LA REQUETTE
	 */
	@Transactional
	@Query(value = "SELECT * FROM clients WHERE nom=?1 OR prenom =?1", nativeQuery = true)
	List<Client> findClientByPrenomOrNom(String str);
	
	/**
	 * METHODE PERMETTANT DEFFECTUER UNE REQUETTE DANS LE 
	 * BUT DE RETOURNER LES CLIENTS CORRESPONDANTS AU NOM 
	 * ET PRENOM SAISIES DANS LA RECHERCHE
	 * @param String nom - String prenom 
	 * @return RETOURNE LA LISTE DES CLIENTS CIBLES PAR LA REQUETTE
	 */
	@Transactional
	@Query(value = "SELECT * FROM clients WHERE nom=?1 AND prenom =?2", nativeQuery = true)
	List<Client> findClientByNomAndPrenom(String nom, String prenom);

	
		
	
}
