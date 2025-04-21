
import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.*;
public class Driver07
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Polygon Turtles");
      frame.setSize(400, 400);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new TurtlePanel());
      frame.setVisible(true);
      
      PolygonTurtle smidge = new PolygonTurtle(100.0, 3);
            smidge.setColor(Color.BLUE);
      smidge.setThickness(6);
      smidge.drawShape(); 
      smidge = new PolygonTurtle();
      smidge.setColor(Color.YELLOW);
      smidge.setThickness(3);
      smidge.drawShape();
      smidge = new PolygonTurtle(100, 100, 0.0, 50.0, 5);
      smidge.setColor(Color.RED);
      smidge.setThickness(3);
      smidge.drawShape();
      smidge = new PolygonTurtle(200.0, 200.0, 0.0, 50.0, 8);
      smidge.setColor(Color.BLACK);
      smidge.setThickness(3);
      smidge.drawShape();
      smidge = new PolygonTurtle(400, 400, 0.0, 50.0, 10);
      smidge.setColor(Color.BLUE);
      smidge.setThickness(2);
      smidge.drawShape();
      smidge = new PolygonTurtle(200.0, 200.0, 0.0, 40.0, 4);
      smidge.setColor(Color.WHITE);
      smidge.setThickness(2);
      smidge.drawShape();
   }
}