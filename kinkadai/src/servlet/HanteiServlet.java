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
		String hantei = request.getParameter("hantei");


		Hantei hantei1 = new Hantei(userId,hantei);
		hantei1.saveToDatabase();


			HttpSession session=request.getSession();
			session.setAttribute("userId",userId);
			session.setAttribute("hantei",hantei);


		RequestDispatcher dispatcher = request.getRequestDispatcher
				("/WEB-INF/jsp/loginOK.jsp");
		dispatcher.forward(request, response);
	 {
		response.sendRedirect("/kinkadai/HanteiServlet");
	}
  }
}
