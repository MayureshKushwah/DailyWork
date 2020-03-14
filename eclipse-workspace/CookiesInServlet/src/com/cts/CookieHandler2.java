package com.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieHandler2")
public class CookieHandler2 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Cookie cookie[] = request.getCookies();
		if (cookie != null) {
			for (Cookie cookie2 : cookie) {
				out.write("<h2>" + cookie2.getName() + "&nbsp;&nbsp;&nbsp;" + cookie2.getValue());
			}
		} else {
			out.write("<h1> NO cookies are associated with the current session</h1>");
		}
	}

}
