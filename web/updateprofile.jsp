<%@page import="db.DbConnect"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.sql.*"%>
<%  
    HashMap ud=(HashMap)session.getAttribute("userdata");
    if(ud!=null){
        String name = request.getParameter("name");
        String number = request.getParameter("number");
        String address = request.getParameter("address");
        String password = request.getParameter("password");
    DbConnect db=(DbConnect)application.getAttribute("db");
    if(db==null){
    db=new DbConnect();
    application.setAttribute("db",db);
    }
    PreparedStatement checkUser=db.getCheckUser();
    checkUser.setString(1, (String)ud.get("email"));
    checkUser.setString(2, password);
    ResultSet rs=checkUser.executeQuery();
    if(rs.next()){
    PreparedStatement updateprofile=db.getupdateprofile();
    //updateprofile.setString(1, (String)ud.get("email"));
    updateprofile.setString(1, name);
    updateprofile.setString(2, number);
    updateprofile.setString(3, address);
     updateprofile.setString(4, (String)ud.get("email"));
    updateprofile.executeUpdate();
    response.sendRedirect("logout.jsp");
    }else{
        rs.close();
        session.setAttribute("msg", "Enter Correct Password");
        response.sendRedirect("profile.jsp");
    }
    }else{
        session.setAttribute("msg", "Please Login First");
        response.sendRedirect("loginpage.jsp");
    }
%>
