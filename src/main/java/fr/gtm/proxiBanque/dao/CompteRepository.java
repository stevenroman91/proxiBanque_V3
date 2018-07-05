/**
 * 
 */
package fr.gtm.proxiBanque.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.gtm.proxiBanque.model.Compte;

/**
 * @author Steven Roman & Nadir Boutra
 *
 */
@Repository
public interface CompteRepository extends JpaRepository <Compte, Integer> {

}
