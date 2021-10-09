package com.example.UserAuthenticate;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginCTL", value = "/LoginCTL")
public class LoginCTL extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserBeans user = new UserBeans();
        String login=request.getParameter("login");
        String pwd=request.getParameter("password");

        user = UserModel.UserLogin(login,pwd);
        if(user != null) {
            ServletUtility.setSuccessMessage(request.getParameter("login")+ " is login successfully", request);
            ServletUtility.redirect("welcome.jsp", request, response);
        }else {
            ServletUtility.setErrorMessage("Invalid User", request);
            ServletUtility.forward("login.jsp", request, response);
        }
    }
}
