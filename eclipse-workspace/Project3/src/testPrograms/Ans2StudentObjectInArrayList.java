package testPrograms;

import java.util.ArrayList;

public class Ans2StudentObjectInArrayList {

	public static void main(String[] args) {

		ArrayList<Double> obj = new ArrayList<>();
		obj.add(90.7);
		obj.add(70.8);
		obj.add(55.5);
		obj.add(40.6);

		int i = 0;
		for (Double object : obj) {
			System.out.print("Marks of student: " + obj.get(i) + ", Result: ");
			if (obj.get(i) >= 80) {
				System.out.println("Distinction");

			} else if (obj.get(i) >= 60 && obj.get(i) <= 79) {
				System.out.println("First class");

			} else if (obj.get(i) >= 50 && obj.get(i) < 60) {
				System.out.println("Second class");
			} else {
				System.out.println("Fail");
			}

			i++;
		}

	}

}
