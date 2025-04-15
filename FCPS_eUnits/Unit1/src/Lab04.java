import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Lab04 {
   public static void takeTheField(Athlete arg)
   {
	   arg.move();
	   arg.move();
	   arg.move();
	   arg.move();
	   arg.turnRight();
	   arg.move();
	   arg.move();     
      
     
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/arena.map");
      Display.setSize(10,10);
      Display.setSpeed(10);
      Robot coach = new Robot(2,7,0,1);
		Athlete steve = new Athlete();
      takeTheField(steve);
      steve.move();
      steve.move();
      steve.move();
      steve.turnLeft();
      steve.move();
      steve.move();
      steve.turnAround();
      Athlete xincancam = new Athlete();
      takeTheField(xincancam);
      xincancam.move();
      xincancam.move();
      xincancam.move();
      xincancam.move();
      xincancam.move();
      xincancam.turnLeft();
      xincancam.move();
      xincancam.turnAround();
      Athlete Ian = new Athlete();
      takeTheField(Ian);
      Ian.move();
      Ian.turnLeft();
      Ian.move();
      Ian.turnAround();
      Athlete Tony = new Athlete();
      takeTheField(Tony);
      Tony.move();
      Tony.move();
      Tony.move();
      Tony.move();
      Tony.turnRight();
      Athlete XiaoFeng = new Athlete();
      takeTheField(XiaoFeng);
      XiaoFeng.move();
      XiaoFeng.move();
      XiaoFeng.move();
      XiaoFeng.turnRight();
      Athlete Morris = new Athlete();
      takeTheField(Morris);
      Morris.move();
      Morris.move();
      Morris.turnRight();
      


      
	}

}
