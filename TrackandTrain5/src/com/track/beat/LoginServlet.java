package com.track.beat;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.track.beat.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String userId, password;
		
		
		userId = request.getParameter("userId");
		password = request.getParameter("password");
		
		HttpSession session =  request.getSession();
		
		
		LoginService loginservice = new LoginService();
		boolean result = loginservice.authenticate(userId, password);
		
		if (result)
		{
			session.setAttribute(userId, password);
			response.sendRedirect("loginsuccess.jsp");
			return;
		}
		else
		{
			response.sendRedirect("login.jsp");
			return;
		}
		
	}

}
