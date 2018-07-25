<%@page import="java.util.HashMap"%>
<%@page import="java.sql.*"%>
<%@page import="db.DbConnect"%>
<%
            HashMap ud=(HashMap)session.getAttribute("userdata");
             if(ud!=null){
            String email=(String)ud.get("email");
            int pid = Integer.parseInt(request.getParameter("pname"));
            int product_qty = 1;
    DbConnect db=(DbConnect)application.getAttribute("db");
    if(db==null){
    db=new DbConnect();
    application.setAttribute("db",db);
    }
    PreparedStatement cart=db.getcart();
    cart.setString(1, email);
    cart.setInt(2, pid);
    cart.setInt(3, product_qty);
    cart.executeUpdate();
    response.sendRedirect("cart.jsp");
    }else{
session.setAttribute("msg", "Please Login First");
response.sendRedirect("loginpage.jsp");
}
        %>