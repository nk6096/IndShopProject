<%@page import="db.DbConnect"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.sql.*"%>
<%  
    HashMap ud=(HashMap)session.getAttribute("userdata");
    if(ud!=null){
        String email = (String)ud.get("email");
        String name = (String)ud.get("name");
        String phone = (String)ud.get("number");
        String address = (String)ud.get("address");
        int total_amount = Integer.parseInt(request.getParameter("total"));
    DbConnect db=(DbConnect)application.getAttribute("db");
    if(db==null){
    db=new DbConnect();
    application.setAttribute("db",db);
    }
    PreparedStatement orderinfo=db.getorderinfo();
    orderinfo.setString(1, email);
    orderinfo.setString(2, name);
    orderinfo.setString(3, phone);
    orderinfo.setString(4, address);
    orderinfo.setInt(5, total_amount);
    ResultSet rs=orderinfo.executeQuery();
    if(rs.next()){
        rs.close();
        response.sendRedirect("orderproduct.jsp");
    }else{
        session.setAttribute("msg","Invalid Order Processed!!");
        response.sendRedirect("cart.jsp");
    }
    }else{
        session.setAttribute("msg", "Please Login First");
        response.sendRedirect("loginpage.jsp");
    }
%>
