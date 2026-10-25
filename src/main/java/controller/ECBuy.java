package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/ECBuy")
public class ECBuy extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 5_check.jsp → doPost → 6_buy.jsp
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// forward
		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/6_buy.jsp");
		d.forward(request, response);
	}
}
