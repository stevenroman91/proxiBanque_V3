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
		ModelAndView mav = new ModelAndView("comptes");
		mav.addObject("client",clientService.read(id));
		return mav;
	}
	
	
	@PostMapping("/authentification")
	public ModelAndView authentificationpost(@RequestParam("id") Integer id, @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate dateDeNaissance) {
		ModelAndView mav ;
		//String reponse;
		Client c = clientService.searchByBirthDate(dateDeNaissance, id); 
		if (c != null) {
			mav= new ModelAndView("redirect:/comptes.html?id="+c.getId());
			//LOGGER.info(c.getNom());
			//mav.addObject("comptes",c.getComptes());
		} else {
			mav= new ModelAndView("redirect:/erroraccueil.html");
		}
			
		return mav; 
	}
	
	@PostMapping({"/index","/accueil","/erroraccueil"})
	public String search (@RequestParam("keywords") String recherche) {
		//ModelAndView mav ;
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

//	@RequestMapping("/index")
//	public ModelAndView vueIndex() {
//		ModelAndView mav = new ModelAndView("index");
//		mav.addObject("listeClient", clientService.getList());
//		return mav;
//	}

//	@PostMapping("/index")
//	public String essai(@RequestParam("idClient") Integer id) {
//		ModelAndView mav = new ModelAndView("modifier");
//		mav.addObject("client", clientService.read(id));
//		return "redirect:/modifier.html?id="+id;
//	}

//	@RequestMapping("/modifier")
//	public ModelAndView vueModifier(@RequestParam("id") Integer id) {
//		final ModelAndView mav = new ModelAndView("modifier");
//		mav.getModel().put("modelClient", clientService.read(id));
//		return mav;
//	}
//
//	 @PostMapping("/modifier")
//	 public String modifier(@ModelAttribute Client modelClient) {
//	 LOGGER.info("Je suis rentré par le post");
//	 clientService.edit(modelClient);
//	 return "redirect:/index.html";
//	 }

}
