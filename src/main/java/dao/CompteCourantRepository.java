/**
 * 
 */
package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Compte;

/**
 * @author Nadir
 *
 */
@Repository
public interface CompteCourantRepository extends JpaRepository <Compte, Integer> {

}
