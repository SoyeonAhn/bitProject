package com.codechobo;

import java.io.IOException;
import java.io.PrintWriter; //ctrl + shift +o

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.RequestDispatcher;

/**
 * Servlet implementation class HelloServlet2
 */
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
      // int count = 0;
    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public LoginAction() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.setContentType(arg0);
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
//		PrintWriter out = response.getWriter();
//		out.println("<!DOCTYPE html>");
//		out.println("<head>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h1>Hello, : "+id+".<h1>");
//		out.println("<h1>Your password is : "+pwd+".</h1>");
//		out.println("<h1>before stop</h1>");
//		//out.println("<h1>Count = "+ ++count +".</h1>");
//		out.println("<h1>after stop</h1>");	
//		out.println("</body>");
//		out.println("</html>");
		if(id.equals("asdf")&&pwd.equals("1234")) {
			response.sendRedirect("/");
		}else {
			request.setAttribute("msg", "id 또는 비밀번호가 틀립니다.");
			RequestDispatcher reqDis = request.getRequestDispatcher("/LoginForm.jsp");
			//RequestDispatcher reqDis = request.getRequestDispatcher();
					//request.getRequestDispatcher("/LoginForm.jsp");
			reqDis.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
