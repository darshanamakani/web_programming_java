import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        String name = "";

        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            out.println(
                    "<h1> You are a new user, kindly login. </h1>");
            request.getRequestDispatcher("login.html")
                    .include(request, response);

        } else {
            for (Cookie c : cookies) {
                String tempName = c.getName();

                if (tempName.equals("username"))

                {
                    name = c.getValue(); // value
                    out.println(
                            "<a href='LogoutServlet' style='font-size:25px;'>Logout </a>");
                    out.println("<h1>Welcome to your profile," + name);
                }
            }
        }
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}