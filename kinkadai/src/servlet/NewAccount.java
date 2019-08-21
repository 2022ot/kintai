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
import mod.Accountlogic;
import mod.Login;
import mod.User;

/**
 * Servlet implementation class NewAccount
 */
@WebServlet("/NewAccount")
public class NewAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {

			RequestDispatcher dispatcher=request.getRequestDispatcher
					("/WEB-INF/jsp/new.jsp");
			dispatcher.forward(request, response);
	}



	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {

			Accountlogic accountlogi = new Accountlogic();

			request.setCharacterEncoding("UTF-8");
			String name = request.getParameter("name");
			String pass = request.getParameter("pass");

			LoginDAO d = new LoginDAO();

			int userId = d.findByLogin(Login.getInstance()).getUserId();

			User user1 = new User(userId,name,pass);
			Accountlogic.execute(user1);

			HttpSession session = request.getSession();
			session.setAttribute("name",name);
			session.setAttribute("pass",pass);


			RequestDispatcher dispatcher = request.getRequestDispatcher
					("/WEB-INF/jsp/new.jsp");
			dispatcher.forward(request, response);

	}
}
