package dateTimeAPITask;

import java.time.Instant;

public class GetCurrentTimestamp {

	public static void main(String[] args) {
		Instant instant=Instant.now();
		System.out.println("The Current timestamp is :"+instant);
	}

}
