import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            Cookie ck[] = request.getCookies();
            out.print("Hello " + ck[0].getValue());
            out.print("<br/>");
            out.print("password is="+ck[1].getValue());

            out.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}