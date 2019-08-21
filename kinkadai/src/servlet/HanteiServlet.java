package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginDAO;
import mod.Hantei;
import mod.Hanteilogic;
import mod.Login;

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

		Hanteilogic hanteiLogic = new Hanteilogic();

		request.setCharacterEncoding("UTF-8");
     //	int userId = request.getParameter("userId");
		String hantei = request.getParameter("hantei");

		//userId = userId.IntegerparseInt();

		LoginDAO d = new LoginDAO();

		int userId = d.findByLogin(Login.getInstance()).getUserId();


		Hantei hantei1 = new Hantei(userId,hantei, null);
		hanteiLogic.execute(hantei1);


			HttpSession session=request.getSession();
			session.setAttribute("userId",userId);
			session.setAttribute("hantei",hantei);


		RequestDispatcher dispatcher = request.getRequestDispatcher
				("/WEB-INF/jsp/LoginResult.jsp");
		dispatcher.forward(request, response);

  }
}

