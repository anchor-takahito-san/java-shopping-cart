package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import beans.UserJavaB;

import java.io.IOException;

@WebServlet("/BCLogin")
public class BCLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 2_login.jsp → doPost → 3_cart.jsp
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// リクエストパラメタ取得
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// ユーザ情報設定
		UserJavaB u;
		if(id == null || id.isEmpty()) {
			u = new UserJavaB("user : カオナシ「ア、ア……」", "");
		}
		else {
			id = "user : " + id + " 様";
			u = new UserJavaB(id, pw);
		}
		
		// ユーザ情報をsessionへ保存
		HttpSession s = request.getSession();
		s.setAttribute("loginUser", u);
		
		// forward
		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/3_cart.jsp");
		d.forward(request, response);
	}
}
