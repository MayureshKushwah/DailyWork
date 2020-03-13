package com.cts;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FilterDemo
 */
@WebFilter("/RequestHandlerServlet")
public class FilterDemo implements Filter {

    /**
     * Default constructor. 
     */
    public FilterDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
			}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		if(request.getParameter("un").equals("Kiran")) {
			chain.doFilter(request, response);
		}
		else {
			response.getWriter().write("<h1> Invalid User</h1>");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("from init of firstFilter");
	}

}