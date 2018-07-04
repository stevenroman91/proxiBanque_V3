package presentation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	
	@PostMapping("/login")
	public String loggin (@RequestParam("login") String username, @RequestParam("pwd") String password ) {
		
		//conseillerService.
		LOGGER.info(username) ;
		LOGGER.info(password) ;
		return "redirect:/index.html" ; 
	}
	
	@RequestMapping("/index")
	public ModelAndView vueIndex() {
		ModelAndView mav = new ModelAndView ("index") ;
		return mav ; 
		
	}
	
	

}
