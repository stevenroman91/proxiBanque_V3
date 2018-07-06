package fr.gtm.proxibanque.model;

/**
 * 
 * @author Nadir Boutra et Steven Roman
 *
 */
public class MontantNegatifException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * constructeur
	 * @param message prends le msg en param
	 */

	public MontantNegatifException(String message) {

		super(message);
		
	}
}