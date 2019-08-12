package com.carts.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
     * method for setting variable values from query params
     */
    private String buildVars(String param) {
    	
    	if(param == null) {
    		return "Unknown";
    	} else {
    		return param;
    	}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		
		String firstName = buildVars(request.getParameter("firstName"));
		String lastName = buildVars(request.getParameter("lastName"));
		String favLang = buildVars(request.getParameter("favLang"));
		String homeTown = buildVars(request.getParameter("homeTown"));
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h1>Welcome, " + firstName + " " + lastName + "<h1><br /> <h3>Your favorite language is: " + favLang + "</h3><br /> <h3>Your hometown is: " + homeTown);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
