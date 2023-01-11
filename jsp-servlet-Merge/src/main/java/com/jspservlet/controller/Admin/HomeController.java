package com.jspservlet.controller.Admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/admin-home" })
public class HomeController extends HttpServlet{
    
    protected void doGet(HttpServletRequest rq, HttpServletResponse rp) throws ServletException, IOException {
        RequestDispatcher rd = rq.getRequestDispatcher("/view/admin/home.jsp");
        rd.forward(rq, rp);
    }

    protected void doPost(HttpServletRequest rq, HttpServletResponse rp) throws ServletException, IOException {

    }
}
