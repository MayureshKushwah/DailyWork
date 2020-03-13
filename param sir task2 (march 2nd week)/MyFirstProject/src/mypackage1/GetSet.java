package mypackage1;

public class GetSet {
	private int age;
	private double salary;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {

		GetSet ob = new GetSet();
		ob.setAge(22);
		ob.setSalary(50000.5);

		System.out.println(ob.getAge());

		System.out.println(ob.getSalary());
	}

}
