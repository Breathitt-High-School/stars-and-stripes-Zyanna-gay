import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes")
      printTwoBlankLines()
   }

   public void printTwentyStars()
   {
     System.out.println("***********************");
   }

   public void printTwentyDashes()
   {
     System.out.println("--------------------")
   }

   public void printTwoBlankLines()
   {
     printTwentyStars()
     printTwentyStars()
   }
   
   public void printASmallBox()
   {	
     printTwentyStars()
     printTwentyDashes()
     printTwentyStars()
   }
 
   public void printABigBox()
   { 
     printTwentyStars()
     printTwentyDashes()
     printTwentyStars()
     printTwentyStars()
     printTwentyDashes()
     printTwentyStars()
     printTwentyStars()
     printTwentyDashes()
     printTwentyStars()	
   }   
}
