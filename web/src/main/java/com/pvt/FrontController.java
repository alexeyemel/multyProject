package com.pvt;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/front")
public class FrontController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String stringForDefinition = req.getParameter("stringForDefinition");
        String response=App.getTypeLine(stringForDefinition);
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter out = resp.getWriter();
        out.println("<h3>" + response + "</h3>");
        return;


    }
}