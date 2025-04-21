
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver08
   {
      public static void main(String[] args)
      {
      
      	JFrame frame = new JFrame("Flower Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         Turtle.clear(Color.WHITE);
         
         FlowerTurtle smidge = new FlowerTurtle();
         smidge.setThickness(3);
         smidge.drawShape();
         
         smidge = new FlowerTurtle(100, 40, Color.BLUE);
         smidge.setThickness(4);
         smidge.drawShape();
      }
   }