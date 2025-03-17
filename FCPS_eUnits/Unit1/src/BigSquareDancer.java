
    public class BigSquareDancer extends Dancer
   {
       public BigSquareDancer(int x, int y, int dir, int beep)
      {
         super(x, y, dir, beep);
      }
       public BigSquareDancer()
      {
               }
      public void danceStep(){
         for(int i=0;i<4;i++){
         move();
         move();
         if (nextToABeeper()){
            pickBeeper();
            }
         if (!nextToABeeper()){
            putBeeper();
            }
         move();
         move();
         turnLeft();}
      }
   
   }