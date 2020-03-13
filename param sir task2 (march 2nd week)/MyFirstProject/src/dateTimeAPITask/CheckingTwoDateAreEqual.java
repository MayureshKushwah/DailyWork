package dateTimeAPITask;

import java.time.LocalDate;

public class CheckingTwoDateAreEqual {

	public static void main(String[] args) {
		//Example 4 - How to check if two dates are equal in Java 8
				LocalDate today=LocalDate.now();
				LocalDate birthday2=LocalDate.of(1985, 01, 10);
				
				if(birthday2.equals(today))
				{
					System.out.printf("Today %s and birthday %s are same dates %n",today,birthday2);
				}
				else
				{
					System.out.println("Dates are not Equal");
				}
	}

}
