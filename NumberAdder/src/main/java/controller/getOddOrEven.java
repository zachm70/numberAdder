package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.OddOrEven;

/**
 * 
 */
@WebServlet("/getOddOrEven")
public class getOddOrEven extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getOddOrEven() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userNum = request.getParameter("userNum");
		
		OddOrEven oddEven = new OddOrEven(Integer.parseInt(userNum));
		
		request.setAttribute("userNumber", oddEven);
		
		getServletContext().getRequestDispatcher("/results2.jsp").forward(request,response);
		
	}

}
