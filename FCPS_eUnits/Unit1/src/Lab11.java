import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;


 public class Lab11 {

	public static void main(String[] args) {
	
   
         
      Display.openDefaultWorld();
      Display.setSize(36, 32);
      Display.setSpeed(10);
      
      new Zero(1,18).display();
      
      new One(7,18).display();
      new Two(13,18).display();
      new Three(19,18).display();
      new Four(25,18).display();
      new Five(31,18).display();
      new Six(1,9).display();
      new Seven(7,9).display();
      new Eight(13,9).display();
      new Nine(18,9).display();
      
         }
}