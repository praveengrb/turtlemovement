package praveen;

import praveen.model.Turtle;

/**
 * Hello world!
 *
 */
public class App {
	public static Turtle getFinalPosition(String dir, Turtle turtle) {
		if (dir.length() == 0) {
			return turtle;
		}

		for (int i = 0; i < dir.length(); i++) {
			if (dir.charAt(i) == 'F')
				turtle.moveForward();
			else if (dir.charAt(i) == 'L')
				turtle.moveLeft();
			else
				turtle.moveRight();
		}
		return turtle;
	}

	public static void main(String[] args) {
		String dir = "FFFRRFLF";
		Turtle temp = new Turtle();
		getFinalPosition(dir, temp);
		System.out.println(temp.getX() + " " + temp.getY() + " " + temp.getDirection());
	}
}
