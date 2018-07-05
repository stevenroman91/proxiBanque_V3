package fr.gtm.proxiBanque.presentation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.gtm.proxiBanque.service.ClientService;
import fr.gtm.proxiBanque.service.CompteService;
import fr.gtm.proxiBanque.service.SearchClientComponent;

@Controller
public class IndexControler {

	private static final Logger LOGGER = LoggerFactory.getLogger(IndexControler.class);

	 
	
	@Autowired
	private ClientService clientService;

	@Autowired
	private CompteService compteCourantService;
	
	@GetMapping("/accueil")
	public String accueil() {
		
		return "/accueil" ;
	}
	
	@PostMapping("/accueil")
	public ModelAndView search (@RequestParam("keywords") String recherche) {
		ModelAndView mav ;
		Integer id = clientService.searchByNameOrFirstName(recherche); 
		if (id != null) {
			mav = new ModelAndView("/test") ;
			mav.addObject("id", id); 
		} else {
			mav = new ModelAndView("/accueil") ;
		}
			
		return mav ; 
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
