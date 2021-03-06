package dateTimeAPITask;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class HowManyDaysMonthBetweenTwoDates {

	public static void main(String[] args) {
		LocalDate myMarriage = LocalDate.of(2016, Month.FEBRUARY, 03);

		LocalDate today = LocalDate.now();

		Period months = Period.between(myMarriage, today);
		System.out.println("Months between My Marriage and today : " + months.getMonths()+"\n Days: "+months.getDays()+"\n Years "+months.getYears());
	}

}
