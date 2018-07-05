package service;

import dao.CompteCourantRepository;
import model.Compte;

public class CompteCourantService extends CrudService<Compte> {

	public CompteCourantRepository getRepo() {
		return (CompteCourantRepository)this.repo ;	
	}
}
