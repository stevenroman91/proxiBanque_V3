package fr.gtm.proxibanque.model;

/**
 * 
 * @author Nadir Boutra et Steven Roman
 *
 */
public class MauvaisMontantException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * constructeur
	 * @param message prends le msg en param
	 */

	public MauvaisMontantException(String message) {

		super(message);
		
	}
}