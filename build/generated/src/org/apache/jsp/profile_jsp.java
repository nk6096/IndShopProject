package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import db.DbConnect;
import java.util.HashMap;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Cart | IndShop provides, Best Indian Product</title>\n");
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
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"animsition\">\n");
      out.write("         ");

            HashMap ud=(HashMap)session.getAttribute("userdata");
           int total = 0;
            if(ud!=null){
                
      out.write("\n");
      out.write("                \t<!-- Header -->\n");
      out.write("\t<header class=\"header1\">\n");
      out.write("\t\t<!-- Header desktop -->\n");
      out.write("\t\t<div class=\"container-menu-header\">\n");
      out.write("\t\t\t<div class=\"topbar\">\n");
      out.write("\t\t\t\t<div class=\"topbar-social\">\n");
      out.write("\t\t\t\t\t<a href=\"https://www.facebook.com/IndShop-556287268088660/?modal=admin_todo_tour\" class=\"topbar-social-item fa fa-facebook\"></a>\n");
      out.write("\t\t\t\t\t<a href=\"https://www.instagram.com/indshopindia/\" class=\"topbar-social-item fa fa-instagram\"></a>\n");
      out.write("\t\t\t\t\t<a href=\"https://twitter.com/IndShopIndia\" class=\"topbar-social-item fa fa-twitter\"></a>\n");
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
      out.write("                                    <h2><b>IndShop</b></h2>\n");
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
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"handicraft.jsp\">Handicrafts</a></li>\n");
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
      out.write("\t\t\t\t\t\t\t\t<a href=\"cart.jsp\">Cart</a>\n");
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
      out.write("                                            ");
      out.print(ud.get("name"));
      out.write("\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<span class=\"linedivide1\"></span>\n");
      out.write("                                        <a href=\"logout.jsp\" class=\"header-wrapicon1 dis-block\">\n");
      out.write("                                            Logout\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("                ");

    DbConnect db=(DbConnect)application.getAttribute("db");
    if(db==null){
    db=new DbConnect();
    application.setAttribute("db",db);
    }
    PreparedStatement getcart=db.getgetcart();
    getcart.setString(1, String.valueOf(ud.get("email")));
    ResultSet rs=getcart.executeQuery();
    if(rs.next()){
    
      out.write("\n");
      out.write("\t<!-- Title Page -->\n");
      out.write("\t<section class=\"bg-title-page p-t-40 p-b-50 flex-col-c-m\" style=\"background-image: url(images/heading-pages-01.png);\">\n");
      out.write("\t\t<h2 class=\"l-text2 t-center\">\n");
      out.write("\t\t\tWelcome \n");
      out.write("\t\t</h2>\n");
      out.write("\t</section>\n");
      out.write("\n");
      out.write("\t<!-- Cart -->\n");
      out.write("\t<section class=\"cart bgwhite p-t-70 p-b-100\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<!-- Cart item -->\n");
      out.write("\t\t\t<div class=\"container-table-cart pos-relative\">\n");
      out.write("\t\t\t\t<div class=\"wrap-table-shopping-cart bgwhite\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Total -->\n");
      out.write("\t\t\t<div class=\"bo9 w-size18 p-l-40 p-r-40 p-t-30 p-b-38 m-t-30 m-r-0 m-l-auto p-lr-15-sm\">   \n");
      out.write("                                        <form action=\"updateprofile.jsp\" method=\"post\">\n");
      out.write("\t\t\t\t<div class=\"size15 trans-0-4\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                        <button type=\"submit\" class=\"flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\tUpdate Profile\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                                        </form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("   ");

    }
     
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
      out.write("\t\t\t\t\t\t<a href=\"https://www.facebook.com/IndShop-556287268088660/?modal=admin_todo_tour\" class=\"fs-18 color1 p-r-20 fa fa-facebook\"></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"https://www.instagram.com/indshopindia/\" class=\"fs-18 color1 p-r-20 fa fa-instagram\"></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"https://twitter.com/IndShopIndia\" class=\"fs-18 color1 p-r-20 fa fa-twitter\"></a>\n");
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
      out.write("\t\t\t\t\t\t<a href=\"bedsheet.jsp\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tBedSheets\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"bags.jsp\" class=\"s-text7\">\n");
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
      out.write("\t\t\t\t\t\t<a href=\"handmade.jsp\" class=\"s-text7\">\n");
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
      out.write("\t\t\t\t\t\t<a href=\"about.jsp\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tAbout Us\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"contact.jsp\" class=\"s-text7\">\n");
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
      out.write("\t<script src=\"js/main.js\"></script>\n");

}else{
session.setAttribute("msg", "Please Login First");
response.sendRedirect("loginpage.jsp");
}

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
