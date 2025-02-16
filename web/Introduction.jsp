<%-- 
    Document   : Introduction
    Created on : Feb 13, 2025, 10:50:52 PM
    Author     : sontu
--%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <title>About - Company Bootstrap Template</title>
        <meta name="description" content="">
        <meta name="keywords" content="">

        <!-- Favicons -->
        <link href="assets/img/favicon.png" rel="icon">
        <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

        <!-- Fonts -->
        <link href="https://fonts.googleapis.com" rel="preconnect">
        <link href="https://fonts.gstatic.com" rel="preconnect" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&family=Raleway:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Nunito:ital,wght@0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">

        <!-- Vendor CSS Files -->
        <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="assets/vendor/aos/aos.css" rel="stylesheet">
        <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
        <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

        <!-- Main CSS File -->
        <link href="assets/css/main.css" rel="stylesheet">

        <!-- =======================================================
        * Template Name: Company
        * Template URL: https://bootstrapmade.com/company-free-html-bootstrap-template/
        * Updated: Aug 07 2024 with Bootstrap v5.3.3
        * Author: BootstrapMade.com
        * License: https://bootstrapmade.com/license/
        ======================================================== -->
    </head>

    <body class="about-page">
            <%@include file="Header.jsp" %>

        <main class="main">

            <!-- Page Title -->
            <div class="page-title accent-background">
                <div class="container d-lg-flex justify-content-between align-items-center">
                    <h1 class="mb-2 mb-lg-0">About</h1>
                    <nav class="breadcrumbs">
                        <ol>
                            <li><a href="index.html">Home</a></li>
                            <li class="current">About</li>
                        </ol>
                    </nav>
                </div>
            </div><!-- End Page Title -->

            <!-- About Section -->
            <section id="about" class="about section">

                <div class="container">

                    <div class="row position-relative">

                        <div class="col-lg-7 about-img" data-aos="zoom-out" data-aos-delay="200"><img src="assets/img/about.jpg"></div>

                        <div class="col-lg-7" data-aos="fade-up" data-aos-delay="100">
                            <h2 class="inner-title">Consequatur eius et magnam</h2>
                            <div class="our-story">
                                <h4>Est 1988</h4>
                                <h3>Our Story</h3>
                                <p>Inventore aliquam beatae at et id alias. Ipsa dolores amet consequuntur minima quia maxime autem. Quidem id sed ratione. Tenetur provident autem in reiciendis rerum at dolor. Aliquam consectetur laudantium temporibus dicta minus dolor.</p>
                                <ul>
                                    <li><i class="bi bi-check-circle"></i> <span>Ullamco laboris nisi ut aliquip ex ea commo</span></li>
                                    <li><i class="bi bi-check-circle"></i> <span>Duis aute irure dolor in reprehenderit in</span></li>
                                    <li><i class="bi bi-check-circle"></i> <span>Ullamco laboris nisi ut aliquip ex ea</span></li>
                                </ul>
                                <p>Vitae autem velit excepturi fugit. Animi ad non. Eligendi et non nesciunt suscipit repellendus porro in quo eveniet. Molestias in maxime doloremque.</p>

                                <div class="watch-video d-flex align-items-center position-relative">
                                    <i class="bi bi-play-circle"></i>
                                    <a href="https://www.youtube.com/watch?v=Y7f98aduVJ8" class="glightbox stretched-link">Watch Video</a>
                                </div>
                            </div>
                        </div>

                    </div>

                </div>

            </section><!-- /About Section -->
        </main>
            <%@include file="Footer.jsp" %>
    </body>

</html>
