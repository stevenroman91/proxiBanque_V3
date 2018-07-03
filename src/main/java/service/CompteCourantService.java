package service;

import dao.CompteCourantRepository;
import model.CompteCourant;

public class CompteCourantService extends CrudService<CompteCourant> {

	public CompteCourantRepository getRepo() {
		return (CompteCourantRepository)this.repo ;	
	}
}
