<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" type="image/png" href="images/icons/I.png"/>
        <title>Loginpage | IndShop provides, Best Indian Product</title>
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
    <body>
        <%
            HashMap ud=(HashMap)session.getAttribute("userdata");
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
                                    <h2><b>IndShop</h2>
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
        <div class="container-fluid" style="background-color: #999900;">
            <div class="row">
            <div class="col-sm-4">

                <h2 id="logcol">Update your details!!</h2>
                <form action="updateprofile.jsp" method="post">
          Name : <input type="text" class="form-control" value="<%=ud.get("name")%>" name="name" id="name" required><br>
          Number : <input type="text" class="form-control" value="<%=ud.get("number")%>" name="number" id="number" required><br>
          Address : <input type="text" class="form-control" value="<%=ud.get("address")%>" name="address" id="address"><br>
          Password : <input type="password" class="form-control" placeholder="Enter Your Password" name="password" id="password" required>
               <%
                String m=(String)session.getAttribute("msg");
                if(m!=null){
                 %>
                <b> <%=m%> </b><hr>
                 <%   
                 session.setAttribute("msg",null);
                    }
                 %>
               <!-- <small id="passwordHelpInline" class="text-muted">Must be 8-20 characters long.</small>
                <input type="password" class="form-control" placeholder="Confirm Password" name="repassword" id="repassword"><br> -->
                <input type="submit" style="margin: 20px;" class="btn btn-secondary" value="Update">
                </form>
            </div>
            </div>
        </div>
        
	<!-- Footer -->
	<footer class="bg6 p-t-45 p-b-43 p-l-45 p-r-45">
		<div class="flex-w p-b-90">
			<div class="w-size6 p-t-30 p-l-15 p-r-15 respon3">
				<h4 class="s-text12 p-b-30">
					Welcome IndShop
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
				Copyright @ 2018 All rights reserved.
			</div>
		</div>
	</footer>



	<!-- Back to top -->
	<div class="btn-back-to-top bg0-hov" id="myBtn">
		<span class="symbol-btn-back-to-top">
			<i class="fa fa-angle-double-up" aria-hidden="true"></i>
		</span>
	</div>

	<!-- Container Selection1 -->
	<div id="dropDownSelect1"></div>



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
	</script>
<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/slick/slick.min.js"></script>
	<script type="text/javascript" src="js/slick-custom.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/lightbox2/js/lightbox.min.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/sweetalert/sweetalert.min.js"></script>
	<script type="text/javascript">
		$('.block2-btn-addcart').each(function(){
			var nameProduct = $(this).parent().parent().parent().find('.block2-name').html();
			$(this).on('click', function(){
				swal(nameProduct, "is added to cart !", "success");
			});
		});

		$('.block2-btn-addwishlist').each(function(){
			var nameProduct = $(this).parent().parent().parent().find('.block2-name').html();
			$(this).on('click', function(){
				swal(nameProduct, "is added to wishlist !", "success");
			});
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
