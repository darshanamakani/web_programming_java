import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class helloworld extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        PrintWriter pw = res.getWriter();// get the stream to write the data

        pw.println("Welcome to servlet");

    }
}
