package presentation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.Client;
import service.ClientService;
import service.CompteCourantService;
import service.CompteEpargneService;

@Controller
public class IndexControler {

	private static final Logger LOGGER = LoggerFactory.getLogger(IndexControler.class);

	@Autowired
	private ClientService clientService;

	@Autowired
	private CompteCourantService compteCourantService;

	@Autowired
	private CompteEpargneService compteEpargneService;

	@RequestMapping("/index")
	public ModelAndView vueIndex() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("listeClient", clientService.getList());
		return mav;
	}

	@PostMapping("/index")
	public String essai(@RequestParam("idClient") Integer id) {
		ModelAndView mav = new ModelAndView("modifier");
		mav.addObject("client", clientService.read(id));
		return "redirect:/modifier.html";
	}

	@RequestMapping("/modifier")
	public String vueModifier() {
		
		return "/modifier";
	}

	// @PostMapping("/modifier")
	// public String modifier() {
	// LOGGER.info("Je suis rentré par le post");
	// return "redirect:/index.html";
	// }

}
