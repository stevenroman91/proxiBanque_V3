/**
 * 
 */
package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Compte;

/**
 * @author Steven Roman & Nadir Boutra
 *
 */
@Repository
public interface CompteRepository extends JpaRepository <Compte, Integer> {

}
