import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String n = request.getParameter("userName");
            out.print("Welcome " + n);
            out.print("<br/>");
            HttpSession session = request.getSession();
            session.setAttribute("uname", n);

            String id = session.getId();
            out.println("Session Id is : " + id);

            out.print("<a href='servlet2'>visit</a>");

            out.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}