/**
 * 
 */
package fr.gtm.proxiBanque.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.gtm.proxiBanque.model.Client;

/**
 * @author Steven Roman & Nadir Boutra
 *
 */
@Repository
public interface ClientRepository extends JpaRepository <Client, Integer> {

	@Transactional
	@Query(value = "SELECT * FROM clients WHERE nom=?1 OR prenom =?1", nativeQuery = true)
	public List<Client> findClientByPrenomOrNom(String str);
	@Transactional
	@Query(value = "SELECT * FROM clients WHERE nom=?1 AND prenom =?2", nativeQuery = true)
	public List<Client> findClientByNomAndPrenom(String nom, String prenom);
	
		
	
}
