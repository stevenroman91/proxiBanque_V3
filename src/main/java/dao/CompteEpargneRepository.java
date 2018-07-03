/**
 * 
 */
package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.CompteEpargne;

/**
 * @author Nadir
 *
 */
@Repository
public interface CompteEpargneRepository extends JpaRepository <CompteEpargne, Integer> {

}
