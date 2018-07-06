package fr.gtm.proxibanque.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.gtm.proxibanque.model.CarteBleu;

/**
 * INTERFACE PERMETTANT DUTILISER LES METHODES JPA POUR LA PERSISTANCE
 * @author Steven Roman & Nadir Boutra
 * @version 3.0
 */
@Repository
public interface CarteBleuRepository extends JpaRepository <CarteBleu, Integer>{

}
