/*******************************************************
* Copyright (C) Pipecandy Technologies Private Limited - All Rights Reserved
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* Written by Praveen,Sankarasubramanian <praveen@pipecandy.com>
*******************************************************/
package test.praveen.service;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import praveen.model.Turtle;
import praveen.service.TurtleMovementManager;

/**
 * @author Praveen,Sankarasubramanian
 *
 */
public class TestTurtleMovementMannager extends TestCase {

	/** The log. */
	static Logger log=Logger.getLogger(TestTurtleMovementMannager.class);
	TurtleMovementManager turtleMovementManager;
	@Before
	public void setUp(){
		turtleMovementManager= new TurtleMovementManager();
	}
	/**
	 * Test method for {@link praveen.service.TurtleMovementManager#getFinalPosition(java.lang.String, praveen.model.Turtle)}.
	 */
	@Test
	public void testGetFinalPosition() {
		assertNull(turtleMovementManager.getFinalPosition(null, null));
		assertNotNull(turtleMovementManager.getFinalPosition(null, new Turtle()));

		
		/*
		 * 		N	
		 *    W   E
		 *    	S
		 */
		
		/*
		 * 6
		 * 5
		 * 4
		 * 3
		 * 2
		 * 1 $
		 * 0 1 2 3 4 5 6
		 * 
		 *  $ denotes current position
		 */
		
		// if F then next position 1,2,N
		Turtle mockTurtle=new Turtle();
		String direction="F";
		Turtle result=turtleMovementManager.getFinalPosition(direction, mockTurtle);
		log.info(result.getX() + " " + result.getY() + " " + result.getDirection());
		assertTrue((result.getX()==1&&result.getY()==2&&result.getDirection()=='N'));
		direction="F0F";
		mockTurtle=new Turtle();
		result=turtleMovementManager.getFinalPosition(direction, mockTurtle);
		log.info(result.getX() + " " + result.getY() + " " + result.getDirection());
		assertTrue((result.getX()==1&&result.getY()==3&&result.getDirection()=='N'));
		
		direction="FFFRRFLF";
		mockTurtle=new Turtle();
		result=turtleMovementManager.getFinalPosition(direction, mockTurtle);
		log.info(result.getX() + " " + result.getY() + " " + result.getDirection());
		assertTrue((result.getX()==2&&result.getY()==3&&result.getDirection()=='E'));
		
		direction="FFFRRFLFFFFRRFLF";
		mockTurtle=new Turtle();
		result=turtleMovementManager.getFinalPosition(direction, mockTurtle);
		log.info(result.getX() + " " + result.getY() + " " + result.getDirection());
		assertTrue((result.getX()==4&&result.getY()==2&&result.getDirection()=='S'));
		
		direction="RRRRRF";
		mockTurtle=new Turtle();
		result=turtleMovementManager.getFinalPosition(direction, mockTurtle);
		log.info(result.getX() + " " + result.getY() + " " + result.getDirection());
		assertTrue((result.getX()==2&&result.getY()==1&&result.getDirection()=='E'));
		
	}
	
	

}
