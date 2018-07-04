package presentation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.Conseiller;
import service.ClientService;
import service.CompteCourantService;
import service.CompteEpargneService;
import service.ConseillerService;

@Controller
public class IndexControler {
	
	private static final Logger LOGGER = LoggerFactory
			.getLogger(IndexControler.class);
	
	@Autowired
	private ClientService clientService ; 
	
	@Autowired
	private ConseillerService conseillerService ;
	
	@Autowired
	private CompteCourantService compteCourantService ;
	
	@Autowired
	private CompteEpargneService compteEpargneService ;
	
	@RequestMapping("/login")
	public String vueLogin() {
		return "login" ;
	}
	
	@PostMapping({"/login", "/loginIncorrect"})
	public ModelAndView loggin (@RequestParam("login") String username, @RequestParam("pwd") String password ) {
		ModelAndView path = null;
		List <Conseiller> conseillers = conseillerService.getList() ;
		
		for (Conseiller conseiller : conseillers) {
			if  ( (conseiller.getLogin().equals(username)) && (conseiller.getPassword().equals(password)) ) {
				path = new ModelAndView("index");
				path.addObject("listeClient", conseiller.getClients());
				
			}
		}
		if (path == null)
			path = new ModelAndView("loginIncorrect") ; 
		return path ; 
	}
	
	@RequestMapping("/index")
	public ModelAndView vueIndex() {
		ModelAndView mav = new ModelAndView ("index") ;
		return mav ; 
		
	}
	
	@RequestMapping("/loginIncorrect")
	public String vuLoginIncorrect() {
		return "/loginIncorrect" ;
	}
	
	

}
