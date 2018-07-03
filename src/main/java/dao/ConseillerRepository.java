/**
 * 
 */
package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Conseiller;

/**
 * @author Nadir
 *
 */
@Repository
public interface ConseillerRepository extends JpaRepository <Conseiller, Integer> {

}
