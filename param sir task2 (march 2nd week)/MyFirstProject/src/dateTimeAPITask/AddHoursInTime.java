package dateTimeAPITask;

import java.time.LocalTime;

public class AddHoursInTime {

	public static void main(String[] args) {
		LocalTime current = LocalTime.now();
		System.out.println("Current time is :" + current);
		LocalTime newTime = current.plusHours(2);
		System.out.println("New  time is :" + newTime);
	}

}
