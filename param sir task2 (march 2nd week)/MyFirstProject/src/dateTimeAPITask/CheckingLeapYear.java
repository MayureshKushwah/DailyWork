package dateTimeAPITask;

import java.time.LocalDate;

public class CheckingLeapYear {

	public static void main(String[] args) {
LocalDate today=LocalDate.now();
		
		if(today.isLeapYear())
		{
			System.out.printf("The Year %s is a Leap Year %n",today);
		}
		else
		{
			System.out.printf("The Year %s is not a Leap year %n",today);
		}

	}

}
