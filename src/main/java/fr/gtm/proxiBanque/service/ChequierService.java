package fr.gtm.proxibanque.service;

import fr.gtm.proxibanque.dao.ChequierRepository;
import fr.gtm.proxibanque.model.Chequier;
/**
 * @author Steven Roman & Nadir Boutra
 * @version 3.0
 */
public class ChequierService extends CrudService<Chequier>{
	public ChequierRepository getRepo() {
		return (ChequierRepository)this.repo ;	
	}
}
