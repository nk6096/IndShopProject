<%@page import="db.DbConnect"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.sql.*"%>
<%  
    HashMap ud=(HashMap)session.getAttribute("userdata");
    if(ud!=null){   
    DbConnect db=(DbConnect)application.getAttribute("db");
    if(db==null){
    db=new DbConnect();
    application.setAttribute("db",db);
    }
    PreparedStatement delcart=db.getdelcart();
    delcart.setString(1, String.valueOf(ud.get("email")));
    ResultSet rst=delcart.executeQuery();
    if(rst.next()){
     rst.close();
     response.sendRedirect("confirmation.jsp");
    }
    }else{
        session.setAttribute("msg", "Please Login First");
        response.sendRedirect("loginpage.jsp");
    }
%>
