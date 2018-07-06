package fr.gtm.proxibanque.presentation;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.gtm.proxibanque.model.Client;
import fr.gtm.proxibanque.service.ClientService;
import fr.gtm.proxibanque.service.CompteService;

@Controller
public class IndexControler {

	private static final Logger LOGGER = LoggerFactory.getLogger(IndexControler.class);

	 
	
	@Autowired
	private ClientService clientService;

	@Autowired
	private CompteService compteService;
	
	@GetMapping({"/index","/accueil"})
	public String accueil() {
		
		return "accueil" ;
	}
	
	@GetMapping("/erroraccueil")
	public String erroraccueil() {
		
		return "erroraccueil" ;
	}
	
	@GetMapping("/authentification")
	public ModelAndView authentification(@RequestParam("id") Integer id) {
		ModelAndView mav =new ModelAndView("accueil");
		mav.addObject("idSearch", id); 
		return mav;
	}
	
	@GetMapping("/comptes")
	public ModelAndView vuecomptes(@RequestParam("id") Integer id) {
		
		LOGGER.info("---------------------JE SUIS PASSE DANS COMPTES\n");
		ModelAndView mav = new ModelAndView("comptes");
		mav.addObject("client",clientService.read(id));
		mav.addObject("tydeAction",0);
		return mav;
	}
	
	@GetMapping("/virement")
	public ModelAndView vuevirement(@RequestParam("id") Integer id) {
		ModelAndView mav = new ModelAndView("comptes");
		mav.addObject("client",clientService.read(id));
		mav.addObject("tydeAction",1);
		return mav;
	}
	
	@GetMapping("/retrait")
	public ModelAndView vueretrait(@RequestParam("id") Integer id) {
		ModelAndView mav = new ModelAndView("comptes");
		mav.addObject("client",clientService.read(id));
		mav.addObject("tydeAction",-1);
		return mav;
	}
	
	@PostMapping("/especes")
	public ModelAndView postespeces(@RequestParam("id") Integer id, @RequestParam("montantVirement") double mt) {
		ModelAndView mav = new ModelAndView("comptes");
		compteService.retraitespeces(id,mt);
		//mav.addObject("client",compteService.read(D).getClient());		
		return mav;
	}
	
//	@PostMapping("/chequier")
//	public ModelAndView postchequier(@RequestParam("idCompteD") Integer D, @RequestParam("idCompteC") Integer C, @RequestParam("montantVirement") double mt) {
//		ModelAndView mav = new ModelAndView("comptes");
//		compteService.virement(D,C,mt);
//		mav.addObject("client",compteService.read(D).getClient());		
//		return mav;
//	}
//	
//	@PostMapping("/carteblue")
//	public ModelAndView postcarteblue(@RequestParam("idCompteD") Integer D, @RequestParam("idCompteC") Integer C, @RequestParam("montantVirement") double mt) {
//		ModelAndView mav = new ModelAndView("comptes");
//		compteService.virement(D,C,mt);
//		mav.addObject("client",compteService.read(D).getClient());		
//		return mav;
//	}
	
	@PostMapping("/virement")
	public ModelAndView postvirement(@RequestParam("idCompteD") Integer D, @RequestParam("idCompteC") Integer C, @RequestParam("montantVirement") double mt) {
		ModelAndView mav = new ModelAndView("comptes");
//		mav.addObject("client",clientService.read(id));
//		mav.addObject("tydeAction",1);
		compteService.virement(D,C,mt);
		mav.addObject("client",compteService.read(D).getClient());		
		return mav;
	}
	
	@PostMapping("/retrait")
	public ModelAndView postretrait(@RequestParam("id") Integer id, @RequestParam("type") String type) {
		ModelAndView mav = new ModelAndView("comptes");
		mav.addObject("client",clientService.read(id));
		LOGGER.info("Le type est " +type);
		switch (type) {
		case "valeur1":
			mav.addObject("TT",0);
			break;
		case "valeur2":
			mav.addObject("TT",1);
			break;	
		case "valeur3":
			mav.addObject("TT",-1);
			break;
		}
		
		//compteService.virement(D,C,mt);
		//mav.addObject("client",compteService.read(D).getClient());		
		return mav;
	}
	
	@PostMapping({"/comptes"})
	public ModelAndView comptes(@RequestParam("id") Integer id) {
		ModelAndView mav = new ModelAndView("comptes");
		mav.addObject("client",clientService.read(id));
		return mav;
	}
	
	
	@PostMapping("/authentification")
	public ModelAndView authentificationpost(@RequestParam("id") Integer id, @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate dateDeNaissance) {
		ModelAndView mav ;
		Client c = clientService.searchByBirthDate(dateDeNaissance, id); 
		if (c != null) {
			mav= new ModelAndView("redirect:/comptes.html?id="+c.getId());
		} else {
			mav= new ModelAndView("redirect:/erroraccueil.html");
		}
			
		return mav; 
	}
	
	@PostMapping({"/index","/accueil","/erroraccueil"})
	public String search (@RequestParam("keywords") String recherche) {
		String reponse;
		Integer id = clientService.searchByNameOrFirstName(recherche); 
		if (id != null) {
			 reponse="redirect:/authentification.html?id="+id;
		} else {
			reponse="redirect:/erroraccueil.html";
		}
			
		return reponse; 
	}
	
	
	@GetMapping("/test")
	public String date (@RequestParam ("id") Integer id) {
		LOGGER.info(id.toString());
		return "/test" ;
	}


}
