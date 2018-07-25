package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;
import db.DbConnect;
import java.sql.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/icons/I.png\"/>\n");
      out.write("        <title>IndShop | IndShop provides, Best Indian Product</title>\n");
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
      out.write("<body class=\"animsition\">\n");
      out.write("       ");

            HashMap ud=(HashMap)session.getAttribute("userdata");
 
    DbConnect db=(DbConnect)application.getAttribute("db");
    if(db==null){
    db=new DbConnect();
    application.setAttribute("db",db);
    }
    PreparedStatement getProduct=db.getgetProduct();
    ResultSet rs=getProduct.executeQuery();
    if(rs.next()){
        
      out.write("\n");
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
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"wrap_header\">\n");
      out.write("\t\t\t\t<!-- Logo -->\n");
      out.write("\t\t\t\t<a href=\"index.jsp\" class=\"logo\">\n");
      out.write("\t\t\t\t\t<h2><b>IndShop</h2>\n");
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
      out.write("\t\t\t\t\t<a href=\"loginpage.jsp\" class=\"header-wrapicon1 dis-block\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/icons/icon-header-01.png\" class=\"header-icon1\" alt=\"ICON\">\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<span class=\"linedivide1\"></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\t<!-- Title Page -->\n");
      out.write("\t<section class=\"bg-title-page p-t-50 p-b-40 flex-col-c-m\" style=\"background-image: url(images/heading-pages-03.png);\">\n");
      out.write("\t\t<h2 class=\"l-text2 t-center\">\n");
      out.write("\t\t\tIndian\n");
      out.write("\t\t</h2>\n");
      out.write("\t\t<p class=\"m-text13 t-center\">\n");
      out.write("\t\t\tNew Arrivals Indian Collection 2018\n");
      out.write("\t\t</p>\n");
      out.write("\t</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Content page -->\n");
      out.write("\t<section class=\"bgwhite p-t-55 p-b-65\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\n");
      out.write("\t\t\t\t\t<div class=\"leftbar p-r-20 p-r-0-sm\">\n");
      out.write("\t\t\t\t\t\t<!--  -->\n");
      out.write("\t\t\t\t\t\t<h4 class=\"m-text14 p-b-7\">\n");
      out.write("\t\t\t\t\t\t\tCategories\n");
      out.write("\t\t\t\t\t\t</h4>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<ul class=\"p-b-54\">\n");
      out.write("\t\t\t\t\t\t\t<li class=\"p-t-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"s-text13 active1\">\n");
      out.write("\t\t\t\t\t\t\t\t\tAll\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li class=\"p-t-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"s-text13\">\n");
      out.write("\t\t\t\t\t\t\t\t\tHandicraft\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li class=\"p-t-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"s-text13\">\n");
      out.write("\t\t\t\t\t\t\t\t\tBags\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li class=\"p-t-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"s-text13\">\n");
      out.write("\t\t\t\t\t\t\t\t\tHandlooms\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li class=\"p-t-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"s-text13\">\n");
      out.write("\t\t\t\t\t\t\t\t\tBedsheets\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<div class=\"search-product pos-relative bo4 of-hidden\">\n");
      out.write("\t\t\t\t\t\t\t<input class=\"s-text7 size6 p-l-23 p-r-50\" type=\"text\" name=\"search-product\" placeholder=\"Search Products...\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<button class=\"flex-c-m size5 ab-r-m color2 color0-hov trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fs-12 fa fa-search\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-sm-6 col-md-8 col-lg-9 p-b-50\">\n");
      out.write("\t\t\t\t\t<!--  -->\n");
      out.write("\t\t\t\t\t<div class=\"flex-sb-m flex-w p-b-35\">\n");
      out.write("\t\t\t\t\t\t<div class=\"flex-w\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"rs2-select2 bo4 of-hidden w-size12 m-t-5 m-b-5 m-r-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<select class=\"selection-2\" name=\"sorting\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Default Sorting</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Popularity</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Price: low to high</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Price: high to low</option>\n");
      out.write("\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"rs2-select2 bo4 of-hidden w-size12 m-t-5 m-b-5 m-r-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<select class=\"selection-2\" name=\"sorting\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Price</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Rs0.00 - Rs500.00</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>RS500.00 - Rs1000.00</option>\n");
      out.write("\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<span class=\"s-text8 p-t-5 p-b-5\">\n");
      out.write("\t\t\t\t\t\t\tShowing 1–12 of 16 results\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Product -->\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("                                            ");

                                            do{
                                            
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-12 col-md-6 col-lg-4 p-b-50\">\n");
      out.write("\t\t\t\t\t\t\t<!-- Block2 -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"block2\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"block2-img wrap-pic-w of-hidden pos-relative block2-labelnew\">\n");
      out.write("\t\t\t\t\t\t\t\t<!--\t<img src=\"images/item-01.png\" alt=\"IMG-PRODUCT\"> -->\n");
      out.write("                                                                        <img src=\"GetPhoto?pid=");
      out.print(rs.getInt(1));
      out.write("\"><br>\n");
      out.write("                                                                        \n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"block2-overlay trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"cart.jsp\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\" name=\"");
      out.print(rs.getInt(1));
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\n");
      out.write("                                                                                        <input type=\"hidden\" value=\"");
      out.print(rs.getInt(1));
      out.write("\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"block2-btn-addcart w-size1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- Button -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tAdd to Cart\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"block2-txt p-t-20\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"block2-name dis-block s-text3 p-b-5\">\n");
      out.write("                                                                            ");
      out.print(rs.getString(2));
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"block2-price m-text6 p-r-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\tRS . ");
      out.print(rs.getString(3));
      out.write(".00\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                ");

                                                   }while(rs.next());
                                                
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Pagination -->\n");
      out.write("\t\t\t\t\t<div class=\"pagination flex-m flex-w p-t-26\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"item-pagination flex-c-m trans-0-4 active-pagination\">1</a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"item-pagination flex-c-m trans-0-4\">2</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");

             rs.close();
    }else{
        session.setAttribute("msg","Invalid Product !!");
        response.sendRedirect("index.jsp");
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Footer -->\n");
      out.write("\t<footer class=\"bg6 p-t-45 p-b-43 p-l-45 p-r-45\">\n");
      out.write("\t\t<div class=\"flex-w p-b-90\">\n");
      out.write("\t\t\t<div class=\"w-size6 p-t-30 p-l-15 p-r-15 respon3\">\n");
      out.write("\t\t\t\t<h4 class=\"s-text12 p-b-30\">\n");
      out.write("\t\t\t\t\tWELCOME INDSHOP\n");
      out.write("\t\t\t\t</h4>\n");
      out.write("\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<p class=\"s-text7 w-size27\">\n");
      out.write("\t\t\t\t\t\tWe are the Best indian product provider from all over the india. We provide indian products at very low cost.\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"flex-m p-t-30\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"fs-18 color1 p-r-20 fa fa-facebook\"></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"fs-18 color1 p-r-20 fa fa-instagram\"></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"fs-18 color1 p-r-20 fa fa-twitter\"></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"fs-18 color1 p-r-20 fa fa-youtube-play\"></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"w-size7 p-t-30 p-l-15 p-r-15 respon4\">\n");
      out.write("\t\t\t\t<h4 class=\"s-text12 p-b-30\">\n");
      out.write("\t\t\t\t\tCategories\n");
      out.write("\t\t\t\t</h4>\n");
      out.write("\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tBedSheets\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tBags\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tDresses\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tHandmade\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"w-size7 p-t-30 p-l-15 p-r-15 respon4\">\n");
      out.write("\t\t\t\t<h4 class=\"s-text12 p-b-30\">\n");
      out.write("\t\t\t\t\tLinks\n");
      out.write("\t\t\t\t</h4>\n");
      out.write("\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tSearch\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tAbout Us\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tContact Us\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tReturns\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"w-size7 p-t-30 p-l-15 p-r-15 respon4\">\n");
      out.write("\t\t\t\t<h4 class=\"s-text12 p-b-30\">\n");
      out.write("\t\t\t\t\tHelp\n");
      out.write("\t\t\t\t</h4>\n");
      out.write("\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tTrack Order\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tReturns\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tShipping\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tFAQs\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"w-size8 p-t-30 p-l-15 p-r-15 respon3\">\n");
      out.write("\t\t\t\t<h4 class=\"s-text12 p-b-30\">\n");
      out.write("\t\t\t\t\tNewsletter\n");
      out.write("\t\t\t\t</h4>\n");
      out.write("\n");
      out.write("\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t<div class=\"effect1 w-size9\">\n");
      out.write("\t\t\t\t\t\t<input class=\"s-text7 bg6 w-full p-b-5\" type=\"text\" name=\"email\" placeholder=\"email@example.com\">\n");
      out.write("\t\t\t\t\t\t<span class=\"effect1-line\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"w-size2 p-t-20\">\n");
      out.write("\t\t\t\t\t\t<!-- Button -->\n");
      out.write("\t\t\t\t\t\t<button class=\"flex-c-m size2 bg4 bo-rad-23 hov1 m-text3 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\tSubscribe\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"t-center p-l-15 p-r-15\">\n");
      out.write("\t\t\t<div class=\"t-center s-text8 p-t-20\">\n");
      out.write("\t\t\t\tCopyright © 2018 All rights reserved.\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Back to top -->\n");
      out.write("\t<div class=\"btn-back-to-top bg0-hov\" id=\"myBtn\">\n");
      out.write("\t\t<span class=\"symbol-btn-back-to-top\">\n");
      out.write("\t\t\t<i class=\"fa fa-angle-double-up\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t</span>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- Container Selection -->\n");
      out.write("\t<div id=\"dropDownSelect1\"></div>\n");
      out.write("\t<div id=\"dropDownSelect2\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script type=\"text/javascript\" src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script type=\"text/javascript\" src=\"vendor/animsition/js/animsition.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script type=\"text/javascript\" src=\"vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script type=\"text/javascript\" src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(\".selection-1\").select2({\n");
      out.write("\t\t\tminimumResultsForSearch: 20,\n");
      out.write("\t\t\tdropdownParent: $('#dropDownSelect1')\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$(\".selection-2\").select2({\n");
      out.write("\t\t\tminimumResultsForSearch: 20,\n");
      out.write("\t\t\tdropdownParent: $('#dropDownSelect2')\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script type=\"text/javascript\" src=\"vendor/daterangepicker/moment.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"vendor/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script type=\"text/javascript\" src=\"vendor/slick/slick.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/slick-custom.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script type=\"text/javascript\" src=\"vendor/sweetalert/sweetalert.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$('.block2-btn-addcart').each(function(){\n");
      out.write("\t\t\tvar nameProduct = $(this).parent().parent().parent().find('.block2-name').html();\n");
      out.write("\t\t\t$(this).on('click', function(){\n");
      out.write("\t\t\t\tswal(nameProduct, \"is added to cart !\", \"success\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$('.block2-btn-addwishlist').each(function(){\n");
      out.write("\t\t\tvar nameProduct = $(this).parent().parent().parent().find('.block2-name').html();\n");
      out.write("\t\t\t$(this).on('click', function(){\n");
      out.write("\t\t\t\tswal(nameProduct, \"is added to wishlist !\", \"success\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script type=\"text/javascript\" src=\"vendor/noui/nouislider.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t/*[ No ui ]\n");
      out.write("\t    ===========================================================*/\n");
      out.write("\t    var filterBar = document.getElementById('filter-bar');\n");
      out.write("\n");
      out.write("\t    noUiSlider.create(filterBar, {\n");
      out.write("\t        start: [ 50, 200 ],\n");
      out.write("\t        connect: true,\n");
      out.write("\t        range: {\n");
      out.write("\t            'min': 50,\n");
      out.write("\t            'max': 200\n");
      out.write("\t        }\n");
      out.write("\t    });\n");
      out.write("\n");
      out.write("\t    var skipValues = [\n");
      out.write("\t    document.getElementById('value-lower'),\n");
      out.write("\t    document.getElementById('value-upper')\n");
      out.write("\t    ];\n");
      out.write("\n");
      out.write("\t    filterBar.noUiSlider.on('update', function( values, handle ) {\n");
      out.write("\t        skipValues[handle].innerHTML = Math.round(values[handle]) ;\n");
      out.write("\t    });\n");
      out.write("\t</script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
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
