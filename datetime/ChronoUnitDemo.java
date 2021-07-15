package datetime;
	import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;


public class ChronoUnitDemo {
	   public static void main(String args[]){
	   	
		
		   
		   
		   LocalDateTime oldDate = LocalDateTime.of(2016, Month.AUGUST, 31, 10, 20, 55);
	        LocalDateTime newDate = LocalDateTime.of(2016, Month.NOVEMBER, 9, 10, 21, 56);

	        System.out.println(oldDate);
	        System.out.println(newDate);

	        //count seconds between dates
	        Duration duration = Duration.between(oldDate, newDate);

	       
	        
	        LocalDate oldDate1 = LocalDate.of(1982, Month.AUGUST, 31);
	        LocalDate newDate2 = LocalDate.of(2020, Month.OCTOBER, 19);

	        System.out.println(oldDate);
	        System.out.println(newDate);

	        // check period between dates
	        Period period = Period.between(oldDate1, newDate2);

	        System.out.print(period.getYears() + " years,");
	        System.out.print(period.getMonths() + " months,");
	        System.out.print(period.getDays() + " days");
	        
	        System.out.println("Duration :"+ duration.getNano() +"  "+duration.getSeconds() + " seconds");
		   
		   
	      //Get the current date
	      LocalDate today = LocalDate.now();
	      System.out.println("Current date: " + today);
			
	      //add 1 week to the current date
	      LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
	      System.out.println("Next week: " + nextWeek);
			
	      //add 1 month to the current date
	      LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
	      System.out.println("Next month: " + nextMonth);
			
	      //add 1 year to the current date
	      LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
	      System.out.println("Next year: " + nextYear);
			
	      //add 10 years to the current date
	      LocalDate nextDecade = today.plus(2, ChronoUnit.DECADES);
	      System.out.println("Date after ten year: " + nextDecade);
	   }
	}
