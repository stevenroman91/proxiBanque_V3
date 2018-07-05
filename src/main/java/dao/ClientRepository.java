/**
 * 
 */
package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Client;

/**
 * @author Steven Roman & Nadir Boutra
 *
 */
@Repository
public interface ClientRepository extends JpaRepository <Client, Integer> {

}
