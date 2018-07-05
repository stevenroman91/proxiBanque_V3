package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.CarteBleu;

/**
 * @author Steven Roman & Nadir Boutra
 *
 */
@Repository
public interface CarteBleuRepository extends JpaRepository <CarteBleu, Integer>{

}
