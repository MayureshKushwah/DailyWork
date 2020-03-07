import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SourceServlet")
public class SourceServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("form doGet of SourceServlet");	
	String custName = req.getParameter("customerName");
	int term= Integer.parseInt(req.getParameter("term"));
	int premiumamount= Integer.parseInt(req.getParameter("premium"));
	
	req.setAttribute("customerName", custName);
	req.setAttribute("noOfYears", term);
	req.setAttribute("amount", premiumamount);
	System.out.println("yout paid Amount = "+(premiumamount*term));
	PrintWriter pw = resp.getWriter();

	pw.write("<h1>Your paid Amount &nbsp;&nbsp;"+(premiumamount*term)+"</h1>");
	
	RequestDispatcher dispatcher= req.getRequestDispatcher("/TargetServlet");
	//this is used to get the target servlet, and we used include method below to include target sevlet data
	
	//RequestDispatcher dispatcher= req.getRequestDispatcher("/http://localhost:8080/WebApp2/NewFile.html");
	//we are trying to get the another file which is on another project so dispatcher is unable to get it so we use sendRedirect for it
	
	resp.sendRedirect("https://www.javatpoint.com/");
	
	
	dispatcher.include(req, resp);
	 
	 
	}

}
