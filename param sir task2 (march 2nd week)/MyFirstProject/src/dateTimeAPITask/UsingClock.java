package dateTimeAPITask;

import java.time.Clock;

public class UsingClock {

	public static void main(String[] args) {
//		Java 8 comes with a Clock, which can be used to get current instant, date and time using time zone. You can use Clock in place of System.currentTimeInMillis() and TimeZone.getDefault().

		Clock clock = Clock.systemUTC();
		System.out.println("Clock :" + clock);// Clock :SystemClock[Z]

		Clock defaultClock = Clock.systemDefaultZone();
		System.out.println("Clock :" + defaultClock);// Clock :SystemClock[Asia/Calcutta]

	}

}
