package fr.gtm.proxiBanque.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.proxiBanque.dao.ClientRepository;
import fr.gtm.proxiBanque.model.Client;

public class SearchClientComponent {
	
	static int count = 0 ; 
	 
	@Autowired
	private ClientRepository rp ;
		
	private Integer id ; 
	private String recherche ; 
	private List<Client> listeRecherche = new ArrayList<>() ; 
	
	public SearchClientComponent() {
	   this.id = count ++ ; 	
	}
	
	public boolean seachByNameOrFirstName() {
		String part1 = this.recherche.split(" ")[0] ;
		//String part2 = this.recherche.split(" ")[1] ;
		String part2 = null ;
		boolean retour = false ; 
		if (part2 == null) {
			listeRecherche.addAll( rp.findClientByPrenomOrNom(part1) ) ;
			retour = listeRecherche.size() > 0 ? true : false ;
		}
//		} else {
//			
//			listeRecherche.addAll( rp.findClientByNomAndPrenom(part1, part2)) ;
//			if(listeRecherche.size()>0) {
//				retour = true;
//				
//			}else{
//				listeRecherche.addAll( rp.findClientByNomAndPrenom(part2, part1));
//				retour = listeRecherche.size() > 0 ? true : false ;
//			}
//			
//		}
		
		return retour ; 
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRecherche() {
		return recherche;
	}

	public void setRecherche(String recherche) {
		this.recherche = recherche;
	}
	
	
	
	
	
	
	
	
	

}
