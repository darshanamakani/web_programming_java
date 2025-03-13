import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String n = request.getParameter("userName");
			String p=request.getParameter("uPass");
			out.print("Welcome " + n);
			out.print("<br/>");
			out.print("password= "+p);

			Cookie ck = new Cookie("userName", n);
			Cookie ck1 = new Cookie("uPass", p);// creating cookie object
			response.addCookie(ck);// creating cookie object
			response.addCookie(ck1);// adding cookie in the response

			// creating submit button
			out.print("<br><a href='welcome'>View Details</a>");
			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}