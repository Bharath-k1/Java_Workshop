package com.xworkx.playoapplication;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/register")
public class PlayoServlet extends HttpServlet {
    //const
    public PlayoServlet(){
        System.out.println("Playo app will be run");
    }
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)  {
        System.out.println("doget method invoked");
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        System.out.println("doPost method invoked");
        String username = req.getParameter("username");
        System.out.println("username is:"+username);
        String email = req.getParameter("email");
        System.out.println("email is:"+email);
        String contactnumber = req.getParameter("contactnumber");
        System.out.println("contact number is:"+contactnumber);
        String numberofplayers = req.getParameter("numberofplayers");
        System.out.println("number of player is:"+numberofplayers);

        String costperplayer = req.getParameter("costperplayer");
        System.out.println("cost per player is:"+costperplayer);
       int totalamount =Integer.parseInt(costperplayer)*Integer.parseInt(numberofplayers);
        PrintWriter write=res.getWriter();
        res.setContentType("text/html");
        write.print("<head>");
        write.print("<title>"+"Playo app");
        write.print("</title>");
        write.print("</head>");
        write.print("<body>");
        write.print("<h1>"+"Entered details are:"+"</h1>");
        write.print("<h2>"+username+"</h2>");
        write.print("<h2>"+email+"</h2>");
        write.print("<h2>"+contactnumber+"</h2>");
        write.print("<h2>"+numberofplayers+"</h2>");
        write.print("<h2>"+costperplayer+"</h2>");
        write.print("<h2>"+totalamount+"</h2>");


        write.print("</body>");
        write.print("</html>");



    }




}














