package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Chequier;

/**
 * @author Steven Roman & Nadir Boutra
 *
 */
@Repository
public interface ChequierRepository extends JpaRepository <Chequier, Integer> {

}
