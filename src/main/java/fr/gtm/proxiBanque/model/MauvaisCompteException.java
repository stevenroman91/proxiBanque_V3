package fr.gtm.proxibanque.model;

/**
 * 
 * @author Nadir Boutra et Steven Roman
 *
 */

public class MauvaisCompteException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * constructeur
	 * @param message prends le msg en param
	 */

	public MauvaisCompteException(String message) {

		super(message);
		
	}
}

