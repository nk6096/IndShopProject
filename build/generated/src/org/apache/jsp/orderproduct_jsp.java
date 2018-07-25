package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.DbConnect;
import java.util.HashMap;
import java.sql.*;

public final class orderproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
  
    HashMap ud=(HashMap)session.getAttribute("userdata");
    if(ud!=null){
        int oid = 0;
        int pid = 2;
        int price = 3;
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
    
      out.write('\n');
      out.print(oid);
      out.write('\n');

//    PreparedStatement orderproduct=db.getorderproduct();
//    orderproduct.setInt(1, oid);
//    orderproduct.setInt(2, pid);
//    orderproduct.setInt(3, price);
//    orderproduct.setInt(4, qty);
//    ResultSet rs=orderproduct.executeQuery();
//    if(rs.next()){
//        rs.close();
//        response.sendRedirect("order.jsp");
//    }else{
//        session.setAttribute("msg","Invalid Order Processed!!");
//        response.sendRedirect("cart.jsp");
//    }
    }else{
        session.setAttribute("msg", "Please Login First");
        response.sendRedirect("loginpage.jsp");
    }

      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
