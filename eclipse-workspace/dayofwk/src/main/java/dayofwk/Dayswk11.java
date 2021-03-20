package dayofwk;

public class Dayswk11 {
	   enum Days {
	      Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
	   }
	   
	   public static void main(String[] args) {
		   
	      Days today = Days.Saturday;
	      Days dayoff = Days.Monday;
	      
	      System.out.println("Today = " + today);
	      
	      System.out.println(dayoff + " is  my dayoff");
	      
	   }
	   
}