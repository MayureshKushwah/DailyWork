package dateTimeAPITask;

import java.time.LocalDate;

public class GetCurrentDayMonthAndYear {

	public static void main(String[] args) {

		// Example 2 - How to get current day, month and year in Java 8
		LocalDate date1 = LocalDate.now();
		int day = date1.getDayOfMonth();
		int month = date1.getMonthValue();
		int year = date1.getYear();

		System.out.printf("Year : %d , Month : %d , Day : %d \t %n", year, month, day);

	}

}
