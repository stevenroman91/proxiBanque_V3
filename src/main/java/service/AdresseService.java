package service;

import dao.AdresseRepository;
import model.Adresse;

public class AdresseService  extends CrudService<Adresse> {

	public AdresseRepository getRepo() {
		return (AdresseRepository)this.repo ;	
	}
}
