package com.appu.javalearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("This is the GET method from XMLServlet");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//PrintWriter writer = response.getWriter();
		//writer.println("<h3> Hiya </h3>");
	}
}
