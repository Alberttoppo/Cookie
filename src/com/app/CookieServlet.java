package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//read inputs 
		String username=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		
		//create cookies
		Cookie c1=new Cookie("Login",username);
		Cookie c2=new Cookie("Password", pwd);
		
		//set life
		c2.setMaxAge(600);
		
		//add to response
		response.addCookie(c1);
		response.addCookie(c2);
		
		//print msg
		PrintWriter out=response.getWriter();
		out.print("COOKIE CREATED");
	}

}
