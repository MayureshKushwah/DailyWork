package dateTimeAPITask;

import java.time.LocalDate;

public class TodaysDate {

	public static void main(String[] args) {
		// Example 1 - How to get today's date in Java 8
				LocalDate date = LocalDate.now();
				System.out.println("today's date is :" + date);

	}

}