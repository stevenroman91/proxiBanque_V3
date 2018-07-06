package fr.gtm.proxibanque.service;

import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.proxibanque.dao.CompteRepository;
import fr.gtm.proxibanque.model.Compte;
import fr.gtm.proxibanque.model.MontantNegatifException;
import fr.gtm.proxibanque.model.SoldeInsuffisantException;

public class CompteService extends CrudService<Compte> {
	
	@Autowired
	private VirementCompteComponent vc;
	
	@Autowired
	private RetraitComponent retraitcomponent;

	public CompteRepository getRepo() {
		return (CompteRepository)this.repo ;	
	}
	
	public void virement(Integer idD, Integer idC, double mt) {
		try {
			vc.virement(this.read(idD), this.read(idC), mt);
		} catch (SoldeInsuffisantException | MontantNegatifException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
