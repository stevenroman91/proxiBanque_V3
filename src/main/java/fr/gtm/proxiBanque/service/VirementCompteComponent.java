package fr.gtm.proxibanque.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.proxibanque.dao.CompteRepository;
import fr.gtm.proxibanque.model.Compte;
import fr.gtm.proxibanque.model.MauvaisMontantException;
import fr.gtm.proxibanque.model.SoldeInsuffisantException;

public class VirementCompteComponent {

	@Autowired
	private CompteRepository cr;
	private static final Logger LOGGER = LoggerFactory.getLogger(VirementCompteComponent.class);
	
	public void virement(Compte c1, Compte c2, double mt) throws SoldeInsuffisantException, MauvaisMontantException{
		//LOGGER.info("le solde est égale à = {}",cr.getSolde(idD));
		if(mt<0) throw new MauvaisMontantException("le montant que vous avez saisi est negatif");
		if(mt>900)  throw new SoldeInsuffisantException("le montant que vous avez saisi est superieur à 900 euros");
		if(mt>c1.getSolde())  throw new SoldeInsuffisantException("solde insuffisant");
		//LOGGER.info("j'ai passé les excp");
		c1.setSolde(c1.getSolde()-mt);
		c2.setSolde(c2.getSolde()+mt);
		cr.save(c1);
		cr.save(c2);
	}
	
}
