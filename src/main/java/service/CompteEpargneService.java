package service;

import model.CompteEpargne;

public class CompteEpargneService extends CrudService<CompteEpargne> {
	
	public CompteEpargneService getRepo() {
		return (CompteEpargneService)this.repo ;	
	}

}
