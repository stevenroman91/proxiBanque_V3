package service;

import dao.ChequierRepository;
import model.Chequier;

public class ChequierService extends CrudService<Chequier>{
	public ChequierRepository getRepo() {
		return (ChequierRepository)this.repo ;	
	}
}
