import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cal4")
//@WebServlet("/cal3")
public class myforward extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));

		int result = num1+num2;
		
		RequestDispatcher rd = req.getRequestDispatcher("myjspexample5.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("myjspexample3.jsp");
		req.setAttribute("result", result);
		rd.forward(req, resp);

	}
}