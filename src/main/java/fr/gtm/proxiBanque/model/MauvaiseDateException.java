package fr.gtm.proxibanque.model;

public class MauvaiseDateException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * constructeur
	 * @param message prends le msg en param
	 */
	public MauvaiseDateException(String message) {

		super(message);
		
	}
}
