/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/
package praveen.model;


/**
 * Turtle model contains direction of turtle movement.
 *
 * @author Praveen,Sankarasubramanian
 * @version 1.0
 * @since 1.0
 */
public class Turtle {

	/*
	 * Variable declarations -- start
	 */
	/** The direction. */
	// direction of the turtle like N,E,W,S
	private char direction;
	
	/** The x coordinate value.*/
	// coordinates of x. it could be 1.0, 1.1
	private double x;
	
	/** The y coordinate value. */
	// coordinate y // it could be 1.0,1.1
	private double y;

	/*
	 * Variable declarations -- end
	 */
	/**
	 * Gets the direction of turtle.
	 *
	 * @return the direction
	 */
	public final char getDirection() {
		return direction;
	}

	/**
	 * Gets the x .
	 *
	 * @return the x coordinate of turtle.
	 */
	public final double getX() {
		return x;
	}

	/**
	 * Gets the y.
	 *
	 * @return the y coordinate of turtle.
	 */
	public final double getY() {
		return y;
	}

	/**
	 * Sets the direction of the turtle
	 *
	 * @param direction            the direction to set
	 */
	public final void setDirection(char direction) {
		this.direction = direction;
	}

	/**
	 * Sets the x coordinate of the turtle.
	 *
	 * @param x            the x to set
	 */
	public final void setX(double x) {
		this.x = x;
	}

	/**
	 * Sets the y coordinate of the turtle
	 *
	 * @param y            the y to set
	 */
	public final void setY(double y) {
		this.y = y;
	}

}
