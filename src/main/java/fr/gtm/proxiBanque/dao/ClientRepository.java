/**
 * 
 */
package fr.gtm.proxiBanque.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fr.gtm.proxiBanque.model.Client;

/**
 * @author Steven Roman & Nadir Boutra
 *
 */
@Repository
public interface ClientRepository extends JpaRepository <Client, Integer> {

	
	@Query(value = "SELECT * FROM clients WHERE nom=?1 OR prenom =?1", nativeQuery = true)
	public List<Client> findClientByPrenomOrNom(String str);
	

	public List<Client> findClientByNomAndPrenom(String nom, String prenom);
	
	
		
	
}
