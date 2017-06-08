/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/
package praveen.service;

import praveen.base.IBase;
import praveen.common.Constants;
import praveen.model.Turtle;

/**
 * The Class TurtleMovementManager used to predict the movement of turtle.
 *
 * @author Praveen,Sankarasubramanian
 * @version 1.0
 * @since 1.0
 */
public class TurtleMovementManager implements IBase{
	public TurtleMovementManager(){
		super();
	}

	/**
	 * Gets the final position.
	 * 
	 * If current direction and turtle object are specified in the request, the
	 * method returns the final position of the turtle
	 *
	 * If direction string is null or length of direction string is empty then
	 * the system does not proceed further.
	 * 
	 * @param dir
	 *            the dir object containing list of movements. L,F and R are the
	 *            valid movement representations. The direction string would be
	 *            a combination of these representations. ex: FFLLRL
	 * @param turtle
	 *            the turtle {@link praveen.model.Turtle}
	 * @return the final position
	 */
	public Turtle getFinalPosition(String dir, Turtle turtle) {
		if(dir!=null&&!"".equalsIgnoreCase(dir)&&!dir.isEmpty()){
			for (int i = 0; i < dir.length(); i++) {
				moveTurtle(dir.charAt(i),turtle);
			}
		}		
		return turtle;
	}
	
	
	/**
	 * Move turtle.
	 *
	 * If current direction and turtle object are specified in the request,
	 * the method moves the turtle to the given direction
	 * 
	 * @param turtle the turtle
	 */
	public void moveTurtle(char dir, Turtle turtle){
		if (dir== Constants.FORWARD)
			turtle.moveForward();
		else if (dir == Constants.LEFT)
			turtle.moveLeft();
		else if (dir == Constants.RIGHT)
			turtle.moveRight();
		
	}


}
