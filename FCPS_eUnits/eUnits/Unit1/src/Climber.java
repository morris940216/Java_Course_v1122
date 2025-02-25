   import edu.fcps.karel2.Display;
   public class Climber extends Athlete
   {
      public Climber()
      {
         super();
      }
      public Climber(int x) 
      {
         super(x, 1, Display.NORTH,1);
      }
      public void climbUpRight()
      {
         move();
         move();
         turnRight();
         move();
         turnLeft();
      }
      public void climbUpLeft()
      {
         move();
         move();
         turnLeft();
         move();
         turnLeft();

      }
      public void climbDownLeft()
      {
         turnLeft();
         move();
         turnRight();
         move();
         move();
         
      }
      public void climbDownRight()
      {
      turnLeft();
      move();
     move();
      turnRight();
     move();
         
      }

}