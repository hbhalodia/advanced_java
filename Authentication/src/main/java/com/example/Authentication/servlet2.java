package com.example.Authentication;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet(name = "servlet2", value = "/servlet2")
public class servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session=request.getSession(false);
        String n2=(String)session.getAttribute("uname");
       // String n=request.getParameter("username");
        out.print("Welcome "+n2);
        out.println("<html><body>");
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java?serverTimezone=UTC","root","");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from registeruser");
            out.println("<table border=1 width=50% height=50%>");
            out.println("<tr><th>Name</th><th>Email</th><th>Country</th><tr>");
            while (rs.next())
            {
                String n1 = rs.getString("NAME");
                String nm = rs.getString("EMAIL");
                String s = rs.getString("COUNTRY");
                out.println("<tr><td>" + n1 + "</td><td>" + nm + "</td><td>" + s + "</td></tr>");
            }
            out.println("</table>");
            out.println("</html></body>");
            con.close();
        }
        catch (Exception e)
        {
            out.println("error");
        }
        out.close();


    }
}
