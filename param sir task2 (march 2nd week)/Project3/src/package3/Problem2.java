package package3;


class A{
	private A() {
		
	}
	public void task2() {
		System.out.println("from task 2 if class A");
	}
}

public class Problem2 {

	public static void main(String[] args) {
		 A a = new A();
		 a.task2();

	}

}