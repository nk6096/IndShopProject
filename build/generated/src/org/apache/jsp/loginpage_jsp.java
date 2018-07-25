package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/icons/I.png\"/>\n");
      out.write("        <title>Loginpage | IndShop provides, Best Indian Product</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/themify/themify-icons.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/Linearicons-Free-v1.0.0/icon-font.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/elegant-font/html-css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/daterangepicker/daterangepicker.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/slick/slick.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/lightbox2/css/lightbox.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\t<!-- Header -->\n");
      out.write("\t<header class=\"header1\">\n");
      out.write("\t\t<!-- Header desktop -->\n");
      out.write("\t\t<div class=\"container-menu-header\">\n");
      out.write("\t\t\t<div class=\"topbar\">\n");
      out.write("\t\t\t\t<div class=\"topbar-social\">\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"topbar-social-item fa fa-facebook\"></a>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"topbar-social-item fa fa-instagram\"></a>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"topbar-social-item fa fa-twitter\"></a>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"topbar-social-item fa fa-youtube-play\"></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<span class=\"topbar-child1\">\n");
      out.write("\t\t\t\t\tFree shipping for standard order over Rs.500\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"topbar-child2\">\n");
      out.write("\t\t\t\t\t<span class=\"topbar-email\">\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><i class=\"fa fa-envelope\"></i> support@Indshop.com</li>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"wrap_header\">\n");
      out.write("\t\t\t\t<!-- Logo -->\n");
      out.write("\t\t\t\t<a href=\"index.jsp\" class=\"logo\">\n");
      out.write("                                    <h2><b>IndShop</h2>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Menu -->\n");
      out.write("\t\t\t\t<div class=\"wrap_menu\">\n");
      out.write("\t\t\t\t\t<nav class=\"menu\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"main_menu\">\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"index.jsp\">Home</a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"sub_menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"index.jsp\">Hondlooms</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"index.jsp\">Handicrafts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"index.jsp\">Speciality</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"product.jsp\">Shop</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li class=\"sale-noti\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"product.jsp\">Sale</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"cart.jsp\">Features</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"blog.jsp\">Blog</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"about.jsp\">About</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"contact.jsp\">Contact</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Header Icon -->\n");
      out.write("\t\t\t\t<div class=\"header-icons\">\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"header-wrapicon1 dis-block\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/icons/icon-header-01.png\" class=\"header-icon1\" alt=\"ICON\">\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<span class=\"linedivide1\"></span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"header-wrapicon2\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/icons/icon-header-02.png\" class=\"header-icon1 js-show-header-dropdown\" alt=\"ICON\">\n");
      out.write("\t\t\t\t\t\t<span class=\"header-icons-noti\">0</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- Header cart noti -->\n");
      out.write("\t\t\t\t\t\t<div class=\"header-cart header-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"header-cart-wrapitem\">\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"header-cart-item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"header-cart-item-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/item-cart-01.png\" alt=\"IMG\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"header-cart-item-txt\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"header-cart-item-name\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thand made product\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"header-cart-item-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t1 x Rs 100.00\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"header-cart-item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"header-cart-item-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/item-cart-02.png\" alt=\"IMG\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"header-cart-item-txt\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"header-cart-item-name\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tConverse All Star Hi Black Canvas\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"header-cart-item-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t1 x Rs 400.00\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"header-cart-item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"header-cart-item-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/item-cart-03.png\" alt=\"IMG\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"header-cart-item-txt\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"header-cart-item-name\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tRajasthanin Handmade\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"header-cart-item-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t1 x Rs 117.00\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"header-cart-total\">\n");
      out.write("\t\t\t\t\t\t\t\tTotal: Rs 617.00\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"header-cart-buttons\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"header-cart-wrapbtn\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- Button -->\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"cart.jsp\" class=\"flex-c-m size1 bg1 bo-rad-20 hov1 s-text1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\tView Cart\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"header-cart-wrapbtn\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- Button -->\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"flex-c-m size1 bg1 bo-rad-20 hov1 s-text1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\tCheck Out\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
