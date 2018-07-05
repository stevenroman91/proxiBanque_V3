package service;

import dao.CarteBleuRepository;
import model.CarteBleu;

public class CarteBleuService extends CrudService<CarteBleu>{
	
	public CarteBleuRepository getRepo() {
		return (CarteBleuRepository)this.repo ;	
	}
}
