import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

public class KarelandCarl {

    public static void main(String[] args) {

        City ssfs = new City();

        Robot karel = new Robot(ssfs,0, 0, Direction.SOUTH, 1);
        Robot carl = new Robot(ssfs,0, 3, Direction.EAST, 0);

        Thing thing1 = new Thing(ssfs, 0, 0);

        // Your code goes below these lines.
        karel.turnLeft();
        karel.pickThing();
        karel.move();
        karel.move();
        karel.move();
        karel.putThing();
        carl.turnLeft();
        carl.turnLeft();
        carl.turnLeft();
        carl.pickThing();
        carl.move();
        carl.move();
        carl.putThing();
        carl.turnLeft();
        carl.turnLeft();
        carl.move();
        carl.move();
        carl.turnLeft();
        carl.turnLeft();
        carl.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();




    }
}
