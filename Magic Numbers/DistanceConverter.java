public class DistanceConverter
{
   public static void main(String[] args)
   {
      final static double inft = 12;
      final static double ftyd = 3;
      double yards = 3.5;
      double feet = yards * ftyd;
      double inches = feet * inft;
      
      System.out.println(yards + "yards are" + feet + "feet");
      System.out.println(yards + "yards are" + inches + "inches");
   }
}