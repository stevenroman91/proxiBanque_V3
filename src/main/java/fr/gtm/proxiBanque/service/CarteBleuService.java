package fr.gtm.proxibanque.service;

import fr.gtm.proxibanque.dao.CarteBleuRepository;
import fr.gtm.proxibanque.model.CarteBleu;
/**
 * @author Steven Roman & Nadir Boutra
 * @version 3.0
 */
public class CarteBleuService extends CrudService<CarteBleu>{
	
	public CarteBleuRepository getRepo() {
		return (CarteBleuRepository)this.repo ;	
	}
}
