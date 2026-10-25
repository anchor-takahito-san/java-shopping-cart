package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/CCCart")
public class CCCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 3_cart.jsp → doPost → 4_shop.jsp
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// リクエストパラメタ取得
		request.setCharacterEncoding("UTF-8");
//		String strScope = request.getParameter("scope");
//		String strScopeOption = request.getParameter("scopeOption");
		
		// TODO スコープドッグの値で変化する予定（工事中）
		
		// forward
		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/4_shop.jsp");
		d.forward(request, response);
	}
}
