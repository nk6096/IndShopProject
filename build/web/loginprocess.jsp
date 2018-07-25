<%@page import="db.DbConnect"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.sql.*"%>
<% 
    try{
    String email=request.getParameter("email");
    String password=request.getParameter("password");
    DbConnect db=(DbConnect)application.getAttribute("db");
    if(db==null){
    db=new DbConnect();
    application.setAttribute("db",db);
    }
    PreparedStatement checkUser=db.getCheckUser();
    checkUser.setString(1, email);
    checkUser.setString(2, password);
    ResultSet rs=checkUser.executeQuery();
    if(rs.next()){
        HashMap ud=new HashMap();
        ud.put("email",rs.getString(1));
        ud.put("name",rs.getString(2));
        ud.put("address",rs.getString(5));
        ud.put("number",rs.getString(4));
        session.setAttribute("userdata", ud);
        rs.close();
        response.sendRedirect("index1.jsp");
    }else{
        if(email==null || password==null){
        session.setAttribute("msg","Unauthorised URL Entry User Please Login First!!");  
        }else{
        session.setAttribute("msg","Invalid UserID or Password!!");
        }
        response.sendRedirect("loginpage.jsp");
    }
    }catch(Exception ex){
        session.setAttribute("msg", "Unauthorised Entry URL !!");
        response.sendRedirect("logout.jsp");
    }
%>
