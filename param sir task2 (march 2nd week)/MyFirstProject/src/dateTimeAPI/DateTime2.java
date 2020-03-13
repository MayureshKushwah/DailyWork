package dateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime2 {

	public static void main(String[] args) {
		LocalDate local = LocalDate.now();
		System.out.println(local);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);

	}

}
