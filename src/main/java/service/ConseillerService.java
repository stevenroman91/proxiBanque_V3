package service;

import dao.ConseillerRepository;
import model.Conseiller;

public class ConseillerService extends CrudService<Conseiller>{
	
	public ConseillerRepository getRepo() {
		return (ConseillerRepository)this.repo ;	
	}
}
