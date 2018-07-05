package fr.gtm.proxiBanque.service;

import fr.gtm.proxiBanque.dao.CarteBleuRepository;
import fr.gtm.proxiBanque.model.CarteBleu;

public class CarteBleuService extends CrudService<CarteBleu>{
	
	public CarteBleuRepository getRepo() {
		return (CarteBleuRepository)this.repo ;	
	}
}
