<%@page import="db.DbConnect"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.sql.*"%>
<%  
    HashMap ud=(HashMap)session.getAttribute("userdata");
    if(ud!=null){
        int oid = 0;
        int qty = 1;      
    DbConnect db=(DbConnect)application.getAttribute("db");
    if(db==null){
    db=new DbConnect();
    application.setAttribute("db",db);
    }
    PreparedStatement getoid=db.getgetoid();
    getoid.setString(1, String.valueOf(ud.get("email")));
    ResultSet rst=getoid.executeQuery();
    if(rst.next()){
     oid = rst.getInt(1);
     rst.close();
    }
    PreparedStatement getpid=db.getgetpid();
    getpid.setString(1, String.valueOf(ud.get("email")));
    ResultSet rsc=getpid.executeQuery();
    if(rsc.next()){
        do{
    PreparedStatement orderproduct=db.getorderproduct();
    orderproduct.setInt(1, oid);
    orderproduct.setInt(2, rsc.getInt(2));
    orderproduct.setInt(3, qty);
    ResultSet rs=orderproduct.executeQuery();
        }while(rsc.next());
    }else{
     session.setAttribute("msg", "Order Falied");
     response.sendRedirect("cart.jsp");
    }
    response.sendRedirect("cartorder.jsp");
    }else{
        session.setAttribute("msg", "Please Login First");
        response.sendRedirect("loginpage.jsp");
    }
%>
