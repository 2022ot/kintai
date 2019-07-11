package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mod.Hantei;
import mod.Hanteilogic;

/**
 * Servlet implementation class HanteiServlet
 */
@WebServlet("/HanteiServlet")
public class HanteiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		RequestDispatcher dispatcher = request.getRequestDispatcher
				("/WEB-INF/jsp/loginOK.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String userId = request.getParameter("userId");
		String syussya=request.getParameter("syu");//出勤
		String kitaku=request.getParameter("ki");//帰宅

//		System.out.println(hantei);


		Hantei hantei = new Hantei(userId,hantei);
		Hanteilogic bo = new Hanteilogic();
		boolean result = bo.execute(hantei);

		if(result) {
			HttpSession session=request.getSession();
			session.setAttribute("userId",userId);



		RequestDispatcher dispatcher = request.getRequestDispatcher
				("/WEB-INF/jsp/loginOK.jsp");
		dispatcher.forward(request, response);
	}else {
		response.sendRedirect("/kinkadai/HanteiServlet");
	}
  }
}
