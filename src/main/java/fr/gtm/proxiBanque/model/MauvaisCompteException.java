package fr.gtm.proxibanque.model;

/**
 * Exception qui nous permet de remarque quand on a voulu manipuler la carte blue
 * dans un compte epargne, qui donc n'est pas sensé avoir de carte
 * @author Nadir Boutra et Steven Roman
 *
 */

public class MauvaisCompteException extends Exception{
	/**
	 *
	 * cnst necesaire pour que la Classe soit Serializable
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

