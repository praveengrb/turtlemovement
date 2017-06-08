/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/
package praveen.model;

import praveen.base.IBase;
import praveen.common.Constants;


/**
 * Turtle model contains direction of turtle movement.
 *
 * @author Praveen,Sankarasubramanian
 * @version 1.0
 * @since 1.0
 */
public class Turtle implements IBase{

	/*
	 * Variable declarations -- start
	 */
	/** The direction. */
	// direction of the turtle like N,E,W,S
	private char direction;
	
	/** The x coordinate value.*/
	// coordinates of x. it could be 1.0, 1.1
	private int x;
	
	/** The y coordinate value. */
	// coordinate y // it could be 1.0,1.1
	private int y;

	/*
	 * Variable declarations -- end
	 */
	
	
	/**
	 * Instantiates a new turtle.
	 */
	public Turtle(){
		super();
		direction=Constants.NORTH;
		x=Constants.X;
		y=Constants.Y;
		
	}
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
	public final int getX() {
		return x;
	}

	/**
	 * Gets the y.
	 *
	 * @return the y coordinate of turtle.
	 */
	public final int getY() {
		return y;
	}

	/**
	 * Sets the direction of the turtle.
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
	public final void setX(int x) {
		this.x = x;
	}

	/**
	 * Sets the y coordinate of the turtle.
	 *
	 * @param y            the y to set
	 */
	public final void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Move left.
	 */
	public void moveLeft(){
        if(direction==Constants.NORTH)
            direction= Constants.WEST;
       else if(direction==Constants.WEST)
            direction=Constants.SOUTH;
       else if(direction==Constants.SOUTH)
            direction=Constants.EAST;
        else direction=Constants.NORTH;
        log().info(direction);
    }
    
    /**
     * Move right.
     */
    public void moveRight(){
        if(direction==Constants.NORTH)
            direction= Constants.EAST;
        else if(direction==Constants.EAST)
            direction=Constants.SOUTH;
        else if(direction==Constants.SOUTH)
            direction=Constants.WEST;
        else direction=Constants.NORTH;
        log().info(direction);
    }
    
    /**
     * Move forward.
     */
    public void moveForward(){
        if(direction==Constants.NORTH)
            y++;
        else if(direction==Constants.SOUTH)
            y--;
        else if(direction==Constants.EAST)
            x++;
        else x--;
    }
	
}
