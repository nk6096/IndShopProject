<%@page import="java.sql.*"%>
<%@page import="java.util.HashMap"%>
<%@page import="db.DbConnect"%>
<%
            HashMap ud=(HashMap)session.getAttribute("userdata");     
            if(ud!=null){
                int pid = Integer.parseInt(request.getParameter("cartid"));
    DbConnect db=(DbConnect)application.getAttribute("db");
    if(db==null){
    db=new DbConnect();
    application.setAttribute("db",db);
    }
    PreparedStatement removecart=db.getremovecart();
    removecart.setString(1, String.valueOf(ud.get("email")));
    removecart.setInt(2, pid);
    ResultSet rs=removecart.executeQuery();
    if(rs.next()){
        response.sendRedirect("cart.jsp");
    }
    }else{
            session.setAttribute("msg", "Please Login First");
            response.sendRedirect("loginpage.jsp");
            }
    %>