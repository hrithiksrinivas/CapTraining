package lab3;
import java.time.*;

public class Lab_3_Exercise_9 {
	  public static void main(String[] args)
	    {
	        LocalDate pdate = LocalDate.of(2012, 12, 12);
	        LocalDate now = LocalDate.now();
	 
	        Period diff = Period.between(pdate, now);
	 
	     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
	                    diff.getYears(), diff.getMonths(), diff.getDays());
	  }

}
