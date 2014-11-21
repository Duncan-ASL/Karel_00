
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab02 {

     public static void main(String[] args) {
             Display.openWorld("maps/maze.map");
   Display.setSize(8, 8);
   Display.setSpeed(3);
   Athelete a = new Athelete();
   a.putBeeper();
   a.move();
   a.putBeeper();
   a.turnRight();
   a.move();
   a.putBeeper();
   a.turnRight();
   a.move();
   a.putBeeper();
   a.turnLeft();
   a.move();
   a.putBeeper();
   a.turnLeft();
   a.move();
   a.putBeeper();
   a.turnRight();
   a.move();a.putBeeper();
   a.move();
   a.putBeeper();
   a.turnRight();
   a.move();
   a.putBeeper();
   a.turnLeft();
   a.move();
   a.putBeeper();
   a.turnLeft();
   a.move();
   a.putBeeper();
   a.move();
   a.putBeeper();
   a.move();
   a.putBeeper();
   a.move();
   a.putBeeper();
   a.turnRight();
   a.move();a.putBeeper();
   a.move();
     }
}
