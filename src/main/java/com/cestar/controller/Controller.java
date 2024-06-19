package com.cestar.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cestar.dao.UserDao;
import com.cestar.model.User;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    UserDao dao = new UserDao();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String url = request.getServletPath();
		
		switch(url) {
		case "/login":
			loginPage(request,response);
			break;
			
		case "/register":
			registerUser(request,response);
			break;
			
		case "/validate":
			validate(request, response);
			break;

		default:
			out.print("Not a valid URL");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		;
	}
	
	protected void loginPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		
		rd.forward(request, response);
	}
	
	protected void registerUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("user-name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String city = request.getParameter("city");
		
		User userFromForm = new User(userName, password, email, contact, city);

		if(dao.setUser(userFromForm)) {
	        request.getRequestDispatcher("index.jsp").forward(request, response);

	        
		}
		else {
			//out.print("Not valid User. Try Again");
			request.getRequestDispatcher("register.jsp").forward(request, response);
			
		}
		
		
	}
	
	protected void validate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("user");
		String password = request.getParameter("password");
		if(dao.validatePassword(userName, password)) {
			out.print("welcome, " + userName);
			
	        request.getRequestDispatcher("userPortal.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
	}
	
}

