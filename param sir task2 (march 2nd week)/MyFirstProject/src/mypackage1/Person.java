package mypackage1;

public class Person {

	void Person() {
		System.out.println("Person class says : Mayuresh kushwah");
	}

	public static void main(String[] args) {

		Test t1 = new Test();
		t1.Person();

	}

}

class Emp extends Person {
	void Emp() {
		System.out.println("Employee Class says : Emp NO-101");
	}
}

class Manager extends Emp {
	void Mgr() {
		System.out.println("Employee Class says :Mgr NO- M101");
	}

}

class HR extends Emp {
	void hr1() {
		System.out.println("HR Class says :Hr NO- H101");
	}

}

class D extends Manager {
	void d1() {
		System.out.println("D Class says : Hy");
	}

}

class Test extends Manager {
	void tst() {
		System.out.println("Test Class says : Hy");
	}

}