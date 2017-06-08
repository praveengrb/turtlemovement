/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/
package praveen.dev;

import praveen.model.Turtle;
import praveen.service.TurtleMovementManager;

/**
 *
 * @author Praveen,Sankarasubramanian
 * @version 1.0
 * @since 1.0
 */
public class Dev {

	/**
	 * 
	 */
	private Dev() {
		super();
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		String dir = "FFFRRFLF";
		Turtle turtle = new Turtle();
		new TurtleMovementManager().getFinalPosition(dir, turtle);
		System.out.println(turtle.getX() + " " + turtle.getY() + " " + turtle.getDirection());
	}

}
