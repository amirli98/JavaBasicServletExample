package org.fz.servletexample;

import org.fz.applayer.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "/login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        if(user.isValid(req.getParameter("login-name"),req.getParameter("password")))
        {
            req.getRequestDispatcher("/welcome.jsp").forward(req, resp);
        }
        else
        {
            req.setAttribute("errorMessage","Invalid username or password.Try again later.");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
        PrintWriter out = resp.getWriter();
        out.print("login-name"+req.getParameter("login-name")+"\n"+"password"
                +req.getParameter("password"));
        req.setAttribute("username",req.getParameter("login-name"));
        req.setAttribute("password",req.getParameter("password"));

    }
}
