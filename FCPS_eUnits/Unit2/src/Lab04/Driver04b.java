   import javax.swing.*;
   import edu.fcps.Bucket;
   public class Driver04b
   {  
      public static void main(String args[])
      {
         JFrame frame = new JFrame("Buckets");
         frame.setSize(600, 400);
         frame.setLocation(100, 100);   
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new BucketPanel());
         frame.setVisible(true);
         Bucket.setSpeed(10);
         Bucket.useTotal(false);
         Bucket five = new Bucket(5);
          Bucket four = new Bucket(4);
          Bucket three = new Bucket(3);
      
         three.fill();//3
         
         three.pourInto(five);
         three.fill();//6
         
         four.fill();//10
         
         three.pourInto(five);
         five.spill();//5
         
         four.spill();//1
         
         four.fill();
         three.pourInto(five);
         three.fill();//8
         
         three.pourInto(five);
         three.fill();//11
         
         five.fill();//12
         
         three.spill();//9
         
         five.pourInto(three);
         four.spill();
         three.spill();//2
         
         five.spill();
         three.fill();
         four.fill();//7
         
         three.spill();//4      
      }}