package package3;

import java.io.FileReader;
import java.io.IOException;

public class Edemo4 {
	public void readData() throws IOException {
		FileReader fr = new FileReader("emp.txt");
		int i = fr.read();
		System.out.println("hi" + i);

	}

	public void tk2() throws IOException {
		readData();
	}

	public static void main(String[] args) {
		Edemo4 demo4 = new Edemo4();
		try {
			demo4.tk2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of main");
	}

}





