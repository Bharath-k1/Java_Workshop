package com.xworkz.aadhar.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/validate")
public class AadharServlet extends HttpServlet {
    //constructor
    public AadharServlet() {
        System.out.println("Aadhar servlet created not its handle the" + " request and response");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        System.out.println("doget method invoked");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("doPost method invoked");
        String username = req.getParameter("username");
        System.out.println("username is:" + username);

        //display aadhar number
        String aadharnumber = req.getParameter("aadharnumber");
        System.out.println("aadhar number is:" + aadharnumber);

        //send a response back to the browser
        PrintWriter write = res.getWriter();
        res.setContentType("text/html");
        write.print("<html>");
        write.print("<head>");
        write.print("<title>" + "Aadhar card");
        write.print("</title>");
        write.print("</head>");
        write.print("<body>");
        write.print("<h1>" + "Entered details are:" + "</h1>");
        write.print("<h2>" + username + "</h2>");
        write.print("<h2>" + aadharnumber + "</h2>");
        write.print("</body>");
        write.print("</html>");


    }
}

