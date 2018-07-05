package service;

import dao.CompteRepository;
import model.Compte;

public class CompteService extends CrudService<Compte> {

	public CompteRepository getRepo() {
		return (CompteRepository)this.repo ;	
	}
}
