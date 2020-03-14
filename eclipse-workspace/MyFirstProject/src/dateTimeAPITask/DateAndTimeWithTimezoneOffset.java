package dateTimeAPITask;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class DateAndTimeWithTimezoneOffset {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.of(2016, Month.JANUARY, 10, 11, 30);

		ZoneOffset zoneOffset = ZoneOffset.of("+05:30");
		OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, zoneOffset);
		System.out.println("Local DateTime Zone :" + offsetDateTime);

	}

}
