<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" type="image/png" href="images/icons/I.png"/>
        <title>Admin | IndShop provides, Best Indian Product</title>
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
        HashMap hm = (HashMap)session.getAttribute("admindata");
        if(hm!=null){
        %>
	<!-- Header -->
	<header class="header1">
		<!-- Header desktop -->
		<div class="container-menu-header">
			<div class="topbar">
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
				<a href="#" class="logo">
                                    <h2><b>IndShop</h2>
				</a>

				<!-- Menu -->
				<div class="wrap_menu">
					Welcome Admin You Can Add,Modify And Delete Products From Here
				</div>

				<!-- Header Icon -->
				<div class="header-icons">
					<a href="#" class="header-wrapicon1 dis-block">
						Nitish Chauhan
					</a>

                                    <span class="linedivide1"></span>
                                    <a href="logout.jsp" class="header-wrapicon1 dis-block">
						Logout
					</a>
				</div>
			</div>
		</div>
	</header>
        <div class="container-fluid" style="background-color: #ffccff;">
            <div class="row">
            <div class="col-sm-6">
                <%
                String m=(String)session.getAttribute("msg");
                if(m!=null){
                 %>
                <b> <%=m%> </b><hr>
                 <%   
                 session.setAttribute("msg",null);
                    }
                 %>
                 <h2 id="logcol">Upload Your Product</h2><br>
                <form action="Upload" method="post" enctype="multipart/form-data">
                <input type="text" class="form-control" placeholder="Enter Product Name" name="product_name" id="name" required><br>
                <input type="text" class="form-control" placeholder="Product Price in Rupees" name="price" id="price" required><br>
                <input type="text"  class="form-control" placeholder="Product Information" name="information" id="info" required><br>
                <input type="text"  class="form-control" placeholder="Category" name="category" id="category" required><br>
                <input type="text"  class="form-control" placeholder="Area" name="area" id="area" required><br>
                Image1 : <input type="file" class="form-control" name="image1" placeholder="Image1" required /> 
                Image2 : <input type="file" class="form-control" name="image2" placeholder="Image2" required /> 
                Image3 : <input type="file" class="form-control" name="image3" placeholder="Image3" required /> <br>
                <input type="submit" class="btn btn-secondary" value="Upload">
                </form><br>
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
				</div>
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
               response.sendRedirect("myadmin.jsp");
         }
        %>
    </body>
</html>
