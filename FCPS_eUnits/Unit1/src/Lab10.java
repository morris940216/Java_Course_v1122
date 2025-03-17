import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;


 public class Lab10 {

	public static void main(String[] args) {
	
      
      Display.openWorld("../maps/maze3.map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      
      Athlete karel = new Athlete( 1, 1, Display.NORTH, Display.INFINITY);
      while(!karel.nextToABeeper()){
      if(karel.rightIsClear()){
         karel.turnRight();
      }
      if(karel.frontIsClear()){
         karel.move();
         }
      if(!karel.frontIsClear() &&  !karel.rightIsClear()){
         karel.turnLeft();
         }
         
         
         }
     }
}