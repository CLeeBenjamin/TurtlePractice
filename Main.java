import java.util.*;
import java.awt.*;

public class TurtleDrawShapes
{
  public static void main(String[] args)
  {
      World world = new World(400,400);
      Turtle yertle = new Turtle(world);
      yertle.penUp();  // move a little to the left
      yertle.moveTo(100,200);
      yertle.penDown();
      yertle.setColor(Color.blue);

      // Add your loop here!
      yertle.forward(100);
      yertle.turn(90);
      world.show(true);
  }
}
