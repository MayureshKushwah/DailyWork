import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {

	public void task2() { // we can have user defined methods in servlet
		System.out.println("from task2 method");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("From init method");
	}
	public MyServlet() {//we can write constructor in servlet 
		System.out.println("from constructor......");
		
	}

	@Override //we can write main method  on servlet
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("From service mehtod");
		task2();
	}

	@Override
	public void destroy() {
		System.out.println("From Destroy method");
	}

	public static void main(String[] args) {
		System.out.println("From main method");
	}
}