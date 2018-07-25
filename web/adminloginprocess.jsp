<%@page import="java.util.HashMap"%>
<%@page import="db.DbConnect"%>
<%@page import="java.sql.*"%>
<% 
    try{
    String e=request.getParameter("email");
    String p=request.getParameter("password");
    DbConnect db=(DbConnect)application.getAttribute("db");
    if(db==null){
    db=new DbConnect();
    application.setAttribute("db",db);
    }
    PreparedStatement checkadmin=db.getcheckadmin();
    checkadmin.setString(1, e);
    checkadmin.setString(2, p);
    ResultSet rs=checkadmin.executeQuery();
    if(rs.next()){
        HashMap hm = new HashMap();
        hm.put("adminId", e);
        hm.put("adminPass", p);
        session.setAttribute("admindata", hm);
        rs.close();
        response.sendRedirect("admin.jsp");
    }else{
        if(e==null || p==null){
        session.setAttribute("msg","Unauthorised URL Entry Please Login First!!");  
        }else{
        session.setAttribute("msg","Invalid UserID or Password!!");
        }
        response.sendRedirect("myadmin.jsp");
    }
    }catch(Exception ex){
        session.setAttribute("msg", "Please Login First !!");
        response.sendRedirect("myadmin.jsp");
    }
%>
