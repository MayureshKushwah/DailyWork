package dateTimeAPITask;

import java.time.LocalTime;

public class GetCurrentTime {

	public static void main(String[] args) {
		LocalTime current=LocalTime.now();
		System.out.println("Current time is :"+current);

	}

}
