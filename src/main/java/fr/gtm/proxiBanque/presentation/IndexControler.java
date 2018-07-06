package fr.gtm.proxibanque.presentation;

import java.time.LocalDate;

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

/**C'est dans cette methode que le dispatcher vient piocher
 * quand il recoit un url. 
 * Le controlleur nous evide d'avoir a ecrire des servlet pour gerer les actions des jsp
 * @author Steven Roman & Nadir Boutra
 * @version 3.0
 */
@Controller
public class IndexControler {
	/**
	 * Attributs de la classe IndexController
	 */
	@Autowired
	private ClientService clientService;
	private final static String CHEMIN_COMPTE = "comptes";
	private final static String CHEMIN_ACCUEIL = "accueil";
	private final static String CHEMIN_CLIENT = "client";
	private final static String TYPE_ACTION = "tydeAction";
	private final static String MESSAGE = "message";
	@Autowired
	private CompteService compteService;
	
	/**
	 * Get de accueil
	 * On peut aussi rentrer par index
	 * @return chemin
	 */
	@GetMapping({ "/index", "/accueil" })
	public String accueil() {

		return CHEMIN_ACCUEIL;
	}

	/**
	 * On gere le cas ou le nom et ou prenom nest pas reconnu
	 * @return chemin
	 */
	@GetMapping("/erroraccueil")
	public String erroraccueil() {

		return "erroraccueil";
	}

	/**
	 * on gere le cas ou le nom et ou prenom ont donne quelque
	 * chose et on passe au mdp
	 * @param id identifiant du component
	 * @return mav
	 */
	@GetMapping("/authentification")
	public ModelAndView authentification(@RequestParam("id") Integer id) {
		ModelAndView mav = new ModelAndView(CHEMIN_ACCUEIL);
		mav.addObject("idSearch", id);
		return mav;
	}

	/**
	 * On rendre avec un get dans la methode la vue compte
	 * @param id identifiant du client
	 * @return mav
	 */
	@GetMapping("/"+CHEMIN_COMPTE)
	public ModelAndView vuecomptes(@RequestParam("id") Integer id) {

		ModelAndView mav = new ModelAndView(CHEMIN_COMPTE);
		mav.addObject(CHEMIN_CLIENT, clientService.read(id));
		mav.addObject(TYPE_ACTION, 0);
		return mav;
	}

	/**
	 * On rendre avec un get dans virement qui 
	 * la partie de la vue compte qui gere les virements
	 * @param id identifiant du client
	 * @return mav
	 */
	@GetMapping("/virement")
	public ModelAndView vuevirement(@RequestParam("id") Integer id) {
		ModelAndView mav = new ModelAndView(CHEMIN_COMPTE);
		mav.addObject(CHEMIN_CLIENT, clientService.read(id));
		mav.addObject(TYPE_ACTION, 1);
		return mav;
	}

	/**
	 * On rendre avec un get dans virement qui 
	 * la partie de la vue compte qui gere les retraits
	 * @param id identifiant du client
	 * @return mav
	 */
	@GetMapping("/retrait")
	public ModelAndView vueretrait(@RequestParam("id") Integer id) {
		ModelAndView mav = new ModelAndView(CHEMIN_COMPTE);
		mav.addObject(CHEMIN_CLIENT, clientService.read(id));
		mav.addObject(TYPE_ACTION, -1);
		return mav;
	}

	/**
	 * 
	 * @param id identifiant du compte
	 * @param mt montant à retirer
	 * @return mav
	 */
	@PostMapping("/especes")
	public ModelAndView postespeces(@RequestParam("id") Integer id, @RequestParam("montantVirement") double mt) {
		ModelAndView mav = new ModelAndView(CHEMIN_COMPTE);
		String re = compteService.retraitEspeces(id, mt);
		mav.addObject("TT", 0);
		mav.addObject(MESSAGE, re);
		mav.addObject(CHEMIN_CLIENT, compteService.read(id).getClient());
		return mav;
	}

	/**
	 * On rendre avec un get dans chequier qui 
	 * la partie de la vue compte qui gere les retraits de chequiers
	 * @return mav
	 */
	@PostMapping("/chequier")
	public ModelAndView postchequier(@RequestParam("id") Integer id,@RequestParam("LL") Integer LL) {
		ModelAndView mav = new ModelAndView(CHEMIN_COMPTE);
		String re = compteService.retraitChequier(LL);
		mav.addObject("TT", 1);
		mav.addObject(MESSAGE, re);
		mav.addObject(CHEMIN_CLIENT, clientService.read(id));
		return mav;
	}

	/**
	 * 
	 * @param id identifiant client
	 * @param type genre de carte qu'on veut
	 * @param LL identifiant compte
	 * @return mav
	 */
	@PostMapping("/carteblue")
	public ModelAndView postcarteblue(@RequestParam("id") Integer id, @RequestParam("carte") String type,@RequestParam("LL") Integer LL) {
		ModelAndView mav = new ModelAndView(CHEMIN_COMPTE);
		String carte = (type == "valeur1") ? "Visa electron" : "Visa premier";
		String re = compteService.retraitCarte(LL, carte);
		mav.addObject(CHEMIN_CLIENT, clientService.read(id));
		mav.addObject("TT", -1);
		mav.addObject(MESSAGE, re);
		return mav;
	}

	/**
	 * 
	 * @param D compte a debiter
	 * @param C compte a crediter
	 * @param mt montant du virement
	 * @return mav
	 */
	@PostMapping("/virement")
	public ModelAndView postvirement(@RequestParam("idCompteD") Integer D, @RequestParam("idCompteC") Integer C,
			@RequestParam("montantVirement") double mt) {
		ModelAndView mav = new ModelAndView(CHEMIN_COMPTE);
		mav.addObject(TYPE_ACTION,0);
		String re = compteService.virement(D, C, mt);
		mav.addObject(MESSAGE, re);
		mav.addObject(CHEMIN_CLIENT, compteService.read(D).getClient());
		return mav;
	}

	/**
	 * 
	 * @param id identifiant client
	 * @param type genre de retrait qu'on veut faire : espece, chequier, carte blue
	 * @return
	 */
	@PostMapping("/retrait")
	public ModelAndView postretrait(@RequestParam("id") Integer id, @RequestParam("type") String type) {
		ModelAndView mav = new ModelAndView(CHEMIN_COMPTE);
		mav.addObject(CHEMIN_CLIENT, clientService.read(id));
		switch (type) {
		case "valeur1":
			mav.addObject("TT", 0);
			break;
		case "valeur2":
			mav.addObject("TT", 1);
			break;
		case "valeur3":
			mav.addObject("TT", -1);
			break;
		}
		return mav;
	}

	/**
	 * 
	 * @param id identifiant client
	 * @return mav
	 */
	@PostMapping({ "/comptes" })
	public ModelAndView comptes(@RequestParam("id") Integer id) {
		ModelAndView mav = new ModelAndView(CHEMIN_COMPTE);
		mav.addObject(CHEMIN_CLIENT, clientService.read(id));
		return mav;
	}

	/**
	 * 
	 * @param id identifiant du component
	 * @param dateDeNaissance du client
	 * @return mav
	 */
	@PostMapping("/authentification")
	public ModelAndView authentificationpost(@RequestParam("id") Integer id,
			@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dateDeNaissance) {
		ModelAndView mav;
		Client c = clientService.searchByBirthDate(dateDeNaissance, id);
		if (c != null) {
			mav = new ModelAndView("redirect:/comptes.html?id=" + c.getId());
		} else {
			mav = new ModelAndView("redirect:/erroraccueil.html");
		}

		return mav;
	}

	/**
	 * 
	 * @param recherche mots pour la recherche
	 * @return mav
	 */
	@PostMapping({ "/index", "/accueil", "/erroraccueil" })
	public String search(@RequestParam("keywords") String recherche) {
		String reponse;
		Integer id = clientService.searchByNameOrFirstName(recherche);
		if (id != null) {
			reponse = "redirect:/authentification.html?id=" + id;
		} else {
			reponse = "redirect:/erroraccueil.html";
		}

		return reponse;
	}

}
