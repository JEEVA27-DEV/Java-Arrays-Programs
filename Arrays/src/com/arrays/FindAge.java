package com.arrays;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class FindAge {

	public static void main(String[] args) {
		
		LocalDate age = LocalDate.of(2003, 11, 27);
		
		LocalDate currentDate = LocalDate.now();
		
		Period age1 = Period.between(age, currentDate);
		System.out.println(age1.getYears()+" Years "+age1.getMonths()
		+" Months "+age1.getDays()+" Days ");
		
//		long date1 =  ChronoUnit.YEARS.between(age, currentDate);
//		long date2 =  ChronoUnit.MONTHS.between(age, currentDate);
//		long date3 = ChronoUnit.WEEKS.between(age, currentDate);
//	    long date4 = ChronoUnit.DAYS.between(age, currentDate);
////	    long date5 = ChronoUnit.HOURS.between(age, currentDate);
////	    long date6 = ChronoUnit.MINUTES.between(age, currentDate);
////	    long date7 = ChronoUnit.SECONDS.between(age, currentDate);
//	    
//	    System.out.println(date1+" YEARS "+date2+" MONTHS "+date3+" WEEKS "+date4+" DAYS "
//	    		);
//	   // System.out.println(date1+" MONTHS "+date2+" WEEKS "+date3+" DAYS "
//	    //		+date4+" HOURS "+date5+" MINUTES "+date6+ " SECONDS ");
	}
}
