<%@page import="java.sql.*"%>
<%@page import="db.DbConnect"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" type="image/png" href="images/icons/I.png"/>
        <title>Order Product | IndShop provides, Best Indian Product</title>
        <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="fonts/themify/themify-icons.css">
        <link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
        <link rel="stylesheet" type="text/css" href="fonts/elegant-font/html-css/style.css">
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
	<link rel="stylesheet" type="text/css" href="vendor/slick/slick.css">
	<link rel="stylesheet" type="text/css" href="vendor/lightbox2/css/lightbox.min.css">
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
    </head>
    <body class="animsition">
    <%
            HashMap ud=(HashMap)session.getAttribute("userdata");
           int total = 0;
            if(ud!=null){
                %>
    	<!-- Header -->
	<header class="header1">
		<!-- Header desktop -->
		<div class="container-menu-header">
			<div class="topbar">
				<div class="topbar-social">
					<a href="https://www.facebook.com/IndShop-556287268088660/?modal=admin_todo_tour" class="topbar-social-item fa fa-facebook"></a>
					<a href="https://www.instagram.com/indshopindia/" class="topbar-social-item fa fa-instagram"></a>
					<a href="https://twitter.com/IndShopIndia" class="topbar-social-item fa fa-twitter"></a>
					<a href="#" class="topbar-social-item fa fa-youtube-play"></a>
				</div>

				<span class="topbar-child1">
					Free shipping for standard order over Rs.500
				</span>

				<div class="topbar-child2">
					<span class="topbar-email">
						<li class="nav-item"><i class="fa fa-envelope"></i> support@Indshop.com</li>
					</span>
				</div>
			</div>

			<div class="wrap_header">
				<!-- Logo -->
				<a href="index.jsp" class="logo">
                                    <h2><b>IndShop</b></h2>
				</a>

				<!-- Menu -->
				<div class="wrap_menu">
					<nav class="menu">
						<ul class="main_menu">
							<li>
								<a href="index.jsp">Home</a>
								<ul class="sub_menu">
									<li><a href="index.jsp">Hondlooms</a></li>
									<li><a href="handicraft.jsp">Handicrafts</a></li>
									<li><a href="index.jsp">Speciality</a></li>
								</ul>
							</li>

							<li>
								<a href="product.jsp">Shop</a>
							</li>

							<li class="sale-noti">
								<a href="product.jsp">Sale</a>
							</li>

							<li>
								<a href="cart.jsp">Cart</a>
							</li>

							<li>
								<a href="blog.jsp">Blog</a>
							</li>

							<li>
								<a href="about.jsp">About</a>
							</li>

							<li>
								<a href="contact.jsp">Contact</a>
							</li>
						</ul>
					</nav>
				</div>

				<!-- Header Icon -->
				<div class="header-icons">
					<a href="profile.jsp" class="header-wrapicon1 dis-block">
                                            <%=ud.get("name")%>
					</a>
					<span class="linedivide1"></span>
                                        <a href="logout.jsp" class="header-wrapicon1 dis-block">
                                            Logout
					</a>
				</div>
			</div>
		</div>
	</header>
        
        <%
            int oid = 0;
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
    PreparedStatement getorder=db.getgetorder();
    getorder.setInt(1, oid);
    ResultSet rs=getorder.executeQuery();
    if(rs.next()){
    %>
	<!-- Title Page -->
	<section class="bg-title-page p-t-40 p-b-50 flex-col-c-m" style="background-image: url(images/heading-pages-01.png);">
            <h6 class="l-text2 t-center" style="color: #006666;">
                    Dear <%=ud.get("name")%> Your order placed Successfully
		</h6>
	</section>

	<!-- Cart -->
	<section class="cart bgwhite p-t-70 p-b-100">
		<div class="container">
			<!-- Cart item -->
			<div class="container-table-cart pos-relative">
				<div class="wrap-table-shopping-cart bgwhite">
					<table class="table-shopping-cart">
						<tr class="table-head">
							<th class="column-1"></th>
							<th class="column-2">Product</th>
							<th class="column-3">Price</th>
							<th class="column-4 p-l-70">Quantity</th>
							<th class="column-5">Total</th>
						</tr>
                                                   <%
                                                       do{    
                                                    %>
						<tr class="table-row">
							<td class="column-1">
								<div class="cart-img-product b-rad-4 o-f-hidden">
								<!--	<img src="images/item-10.png" alt="IMG-PRODUCT"> -->
								</div>
							</td>
                                                        <td class="column-2"><%=rs.getString(2)%></td>
							<td class="column-3">Rs.<%=rs.getString(3)%>.00</td>
							<td class="column-4" style="text-align: center";>
                                                            <%
                                                            total = total + Integer.parseInt(rs.getString(3));
                                                          %>
                                                          <b>1</b>	
								</div>
							</td>
							<td class="column-5">Rs.<%=rs.getString(3)%>.00</td>
						</tr>
                                                <%
                                                  }while(rs.next());   
                                                %>
					</table>
				</div>
			</div>

			<!-- Total -->
			<div class="bo9 w-size18 p-l-40 p-r-40 p-t-30 p-b-38 m-t-30 m-r-0 m-l-auto p-lr-15-sm">
				<h5 class="m-text20 p-b-24">
					Delivery Address
				</h5>

				<!--  -->
                                <div class="flex-w flex-sb-m p-b-12">
					<span class="s-text18 w-size19 w-full-sm">
						Name :
					</span>

					<span class="m-text21 w-size20 w-full-sm">
                                            <%=ud.get("name")%>
					</span>
				</div>
                                        <div class="flex-w flex-sb-m p-b-12">
					<span class="s-text18 w-size19 w-full-sm">
						Mobile No.:
					</span>

					<span class="m-text21 w-size20 w-full-sm">
                                            +91<%=ud.get("number")%>
					</span>
				</div>
				<div class="flex-w flex-sb-m p-b-12">
					<span class="s-text18 w-size19 w-full-sm">
						Subtotal:
					</span>

					<span class="m-text21 w-size20 w-full-sm">
                                            Rs.<%=total%>.00
					</span>
				</div>

				<!--  -->
				<div class="flex-w flex-sb bo10 p-t-15 p-b-20">
					<span class="s-text18 w-size19 w-full-sm">
						Shipping:
					</span>

					<div class="w-size20 w-full-sm">
						<p class="s-text8 p-b-23">
                                                    <%=ud.get("address")%>
						</p>
                                                <p>Your order will be delivered within 3 working days from now</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
   <%
    }
       %>
	<!-- Footer -->
	<footer class="bg6 p-t-45 p-b-43 p-l-45 p-r-45">
		<div class="flex-w p-b-90">
			<div class="w-size6 p-t-30 p-l-15 p-r-15 respon3">
				<h4 class="s-text12 p-b-30">
					WELCOME INDSHOP
				</h4>

				<div>
					<p class="s-text7 w-size27">
						We are the Best indian product provider from all over the india. We provide indian products at very low cost.
					</p>

					<div class="flex-m p-t-30">
						<a href="https://www.facebook.com/IndShop-556287268088660/?modal=admin_todo_tour" class="fs-18 color1 p-r-20 fa fa-facebook"></a>
						<a href="https://www.instagram.com/indshopindia/" class="fs-18 color1 p-r-20 fa fa-instagram"></a>
						<a href="https://twitter.com/IndShopIndia" class="fs-18 color1 p-r-20 fa fa-twitter"></a>
						<a href="#" class="fs-18 color1 p-r-20 fa fa-youtube-play"></a>
					</div>
				</div>
			</div>

			<div class="w-size7 p-t-30 p-l-15 p-r-15 respon4">
				<h4 class="s-text12 p-b-30">
					Categories
				</h4>

				<ul>
					<li class="p-b-9">
						<a href="bedsheet.jsp" class="s-text7">
							BedSheets
						</a>
					</li>

					<li class="p-b-9">
						<a href="bags.jsp" class="s-text7">
							Bags
						</a>
					</li>

					<li class="p-b-9">
						<a href="#" class="s-text7">
							Dresses
						</a>
					</li>

					<li class="p-b-9">
						<a href="handmade.jsp" class="s-text7">
							Handmade
						</a>
					</li>
				</ul>
			</div>

			<div class="w-size7 p-t-30 p-l-15 p-r-15 respon4">
				<h4 class="s-text12 p-b-30">
					Links
				</h4>

				<ul>
					<li class="p-b-9">
						<a href="#" class="s-text7">
							Search
						</a>
					</li>

					<li class="p-b-9">
						<a href="about.jsp" class="s-text7">
							About Us
						</a>
					</li>

					<li class="p-b-9">
						<a href="contact.jsp" class="s-text7">
							Contact Us
						</a>
					</li>

					<li class="p-b-9">
						<a href="#" class="s-text7">
							Returns
						</a>
					</li>
				</ul>
			</div>

			<div class="w-size7 p-t-30 p-l-15 p-r-15 respon4">
				<h4 class="s-text12 p-b-30">
					Help
				</h4>

				<ul>
					<li class="p-b-9">
						<a href="#" class="s-text7">
							Track Order
						</a>
					</li>

					<li class="p-b-9">
						<a href="#" class="s-text7">
							Returns
						</a>
					</li>

					<li class="p-b-9">
						<a href="#" class="s-text7">
							Shipping
						</a>
					</li>

					<li class="p-b-9">
						<a href="#" class="s-text7">
							FAQs
						</a>
					</li>
				</ul>
			</div>

			<div class="w-size8 p-t-30 p-l-15 p-r-15 respon3">
				<h4 class="s-text12 p-b-30">
					Newsletter
				</h4>

				<form>
					<div class="effect1 w-size9">
						<input class="s-text7 bg6 w-full p-b-5" type="text" name="email" placeholder="email@example.com">
						<span class="effect1-line"></span>
					</div>

					<div class="w-size2 p-t-20">
						<!-- Button -->
						<button class="flex-c-m size2 bg4 bo-rad-23 hov1 m-text3 trans-0-4">
							Subscribe
						</button>
					</div>

				</form>
			</div>
		</div>

		<div class="t-center p-l-15 p-r-15">
			<div class="t-center s-text8 p-t-20">
				Copyright © 2018 All rights reserved.
			</div>
		</div>
	</footer>



	<!-- Back to top -->
	<div class="btn-back-to-top bg0-hov" id="myBtn">
		<span class="symbol-btn-back-to-top">
			<i class="fa fa-angle-double-up" aria-hidden="true"></i>
		</span>
	</div>

	<!-- Container Selection -->
	<div id="dropDownSelect1"></div>
	<div id="dropDownSelect2"></div>



<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/bootstrap/js/popper.js"></script>
	<script type="text/javascript" src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/select2/select2.min.js"></script>
	<script type="text/javascript">
		$(".selection-1").select2({
			minimumResultsForSearch: 20,
			dropdownParent: $('#dropDownSelect1')
		});

		$(".selection-2").select2({
			minimumResultsForSearch: 20,
			dropdownParent: $('#dropDownSelect2')
		});
	</script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>
<%
}else{
session.setAttribute("msg", "Please Login First");
response.sendRedirect("loginpage.jsp");
}
%>
</body>
</html>
