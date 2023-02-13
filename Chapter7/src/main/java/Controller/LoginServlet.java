package Controller;

import Model.User;
import Service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

public class LoginServlet extends HttpServlet {
    private UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getSession().getAttribute("loggedInUserId") != null){
            resp.sendRedirect("/dashboard");
        }else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("Views/login.jsp");
            requestDispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.setEmail(req.getParameter("email"));
        user.setPassword(req.getParameter("password"));
        try{
            User loggedInuser = userService.login(user);
            if(loggedInuser == null){
                req.getSession().setAttribute("message", "Check your email and password");
                resp.sendRedirect("/login");
            }
            else{
                req.getSession().setAttribute("loggedInUserId", loggedInuser.getId());
                req.getSession().setAttribute("loggedInUserName", loggedInuser.getName());
                req.getSession().setAttribute("loggedInUserEmail", loggedInuser.getEmail());
                resp.sendRedirect("/dashboard");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

}
