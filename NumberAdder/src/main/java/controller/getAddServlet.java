package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AddNumber;

/**
 * Servlet implementation class getAddServlet
 */
@WebServlet("/getAddServlet")
public class getAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userNumber1 = request.getParameter("userNumber1");
		String userNumber2 = request.getParameter("userNumber2");
		
		AddNumber add = new AddNumber(Integer.parseInt(userNumber1), Integer.parseInt(userNumber2));
		
		request.setAttribute("userNumbers", add);
		
		getServletContext().getRequestDispatcher("/results.jsp").forward(request,response);
	}

}
