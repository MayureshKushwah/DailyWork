package dateTimeAPITask;

import java.time.LocalDate;
import java.time.MonthDay;

public class CheckingForRecurringEvents {

	public static void main(String[] args) {
		LocalDate today5=LocalDate.now();
		LocalDate birthday5=LocalDate.of(1985, 8, 18);
		MonthDay birth5= MonthDay.of(birthday5.getMonthValue(), birthday5.getDayOfMonth());
		MonthDay current=MonthDay.from(today5);
		if(birth5.equals(current))
		{
			System.out.printf("Today %s and birthday %s are same dates %n",today5,birthday5);
		}
		else
		{
			System.out.println("Dates are not Equal");
		}

	}

}
