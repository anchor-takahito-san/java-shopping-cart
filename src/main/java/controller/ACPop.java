package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/ACPop")
public class ACPop extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 起動 → doGet → 1_pop.jsp
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// forward
		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/1_pop.jsp");
		d.forward(request, response);
	}
	
	// 1_pop.jsp → doPost → 2_login.jsp
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// forward
		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/2_login.jsp");
		d.forward(request, response);
	}
}
