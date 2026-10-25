package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import beans.CartJavaB;
import beans.ItemJavaB;
import beans.NameJavaB;
import beans.PriceJavaB;

import java.io.IOException;

@WebServlet("/DCShop")
public class DCShop extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 4_shop.jsp → doPost → 5_check.jsp
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//
		CartJavaB cart = new CartJavaB();
		NameJavaB name = new NameJavaB();
		PriceJavaB price = new PriceJavaB();

		// リクエストパラメタ　取得
		request.setCharacterEncoding("UTF-8");
		String[] strCartNo = request.getParameterValues("cartNo");
		
		// 購入品のチェック→豆リストへ格納まで
		for (int i = 0; i < 9; i++) {

		    // strCartNoにチェックが入っていたら、該当Noのcntを1にする
		    int cnt = 0;
		    if (strCartNo != null) {
		        for (int j = 0; j < strCartNo.length; j++) {
		            if (i == Integer.parseInt(strCartNo[j])) {
		                cnt = 1;
		            }
		        }
		    }

		    // 
		    ItemJavaB item = new ItemJavaB(name.getName(i), price.getPrice(i), cnt);
		    cart.addItem(item);
		}

		// cartをJSPへ
		request.setAttribute("cart", cart);
		
		// forward
		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/5_check.jsp");
		d.forward(request, response);
	}
}
