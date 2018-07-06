package fr.gtm.proxibanque.model;

/**
 * Cette exception nous permet de gerer les problemes de solde insuffisant
 * @author Adminl  Nadir Boutra et Steven Roman
 *
 */
public class SoldeInsuffisantException extends Exception {

	/**
	 * 
	 *  cnst necesaire pour que la Classe soit Serializable
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * constructeur
	 * @param message prends le msg en param
	 */
	public SoldeInsuffisantException(String message) {
		
		super(message);
		
	}
	
	

}
