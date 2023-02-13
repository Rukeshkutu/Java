package Controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest req )
    @Override
    public void init() throws ServletException{
        System.out.println("hello init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("get method called");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(("Views/home.jsp"));
        requestDispatcher.forward(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("i am destroyed.");
    }
}
