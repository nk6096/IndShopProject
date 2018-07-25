import db.DbConnect;
import java.io.IOException;
import java.sql.*;
import java.util.HashMap;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Register extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
try {
    String email=request.getParameter("email");
    ServletContext application=getServletContext();
    DbConnect db=(DbConnect)application.getAttribute("db");
    if(db==null){
    db=new DbConnect();
    application.setAttribute("db",db);
    }
    PreparedStatement userDetails=db.getUserDetails();
    userDetails.setString(1, email);
    ResultSet rs=userDetails.executeQuery();
    if(rs.next()){
session.setAttribute("msg", "Email ID Already Registered");
response.sendRedirect("loginpage.jsp");
    }
    else{
String name=request.getParameter("name");
String number=request.getParameter("number");
String password=request.getParameter("password");
String gender=request.getParameter("inlineRadioOptions");
String address = request.getParameter("address");
PreparedStatement insertUser=db.getInsertUser();
insertUser.setString(1, email);
insertUser.setString(2, name);
insertUser.setString(3, gender);
insertUser.setString(4, number);
insertUser.setString(5, address);
insertUser.setString(6, password);
insertUser.executeUpdate();
HashMap ud=new HashMap();
ud.put("email",email);
ud.put("name",name);
ud.put("address",address);
ud.put("number",number);
session.setAttribute("userdata", ud);
//session.setAttribute("msg", "Registration Successful ");
response.sendRedirect("index1.jsp");
    }
} catch (Exception ex) {
    session.setAttribute("msg", 
            "Registration Failed "+ex.getMessage());
    ex.printStackTrace();
    response.sendRedirect("loginpage.jsp");
           } 
    }
}
