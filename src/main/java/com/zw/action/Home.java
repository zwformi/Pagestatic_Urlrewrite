package com.zw.action;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2017/6/12.
 */
@WebServlet("/home.html")
public class Home extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

                 response.setContentType("text/html");
                 PrintWriter out = response.getWriter();
                 out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
                 out.println("<HTML>");
                 out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
                 out.println("  <BODY>");
                 out.print("    This is ");
                 out.print(this.getClass());
                 out.println(", using the GET method");
                 out.println("  </BODY>");
                 out.println("</HTML>");
                 out.flush();
                 out.close();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doGet(request, response);
    }
}
