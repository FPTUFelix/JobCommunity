<%-- 
    Document   : Post
    Created on : Feb 13, 2025, 10:50:43 PM
    Author     : sontu
--%>
<!DOCTYPE html>
<html lang="en">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <head>
        <%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <title>Post - Job Community</title>
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

    <body class="blog-page">
        <%@include file="Header.jsp" %>
        <main class="main">

            <!-- Page Title -->
            <div class="page-title accent-background">
                <div class="container d-lg-flex justify-content-between align-items-center">
                    <h1 class="mb-2 mb-lg-0">Bài Đăng</h1>
                    <nav class="breadcrumbs">
                        <ol>
                            <li><a href="home">Trang chủ</a></li>
                            <li class="current">Bài Đăng</li>
                            <li>
                                <a href="CreatePost.jsp" class="btn-create-post">Tạo Bài Đăng</a>
                            </li>
                        </ol>
                    </nav>
                </div>
            </div>
            <style>
                .breadcrumbs ol {
                    display: flex;
                    align-items: center;
                    gap: 10px;
                }

                .breadcrumbs ol li {
                    list-style: none;
                }

                .breadcrumbs ol li a.btn-create-post {
                    background-color: #007bff;
                    color: white;
                    padding: 6px 15px;
                    border-radius: 6px;
                    font-weight: bold;
                    text-decoration: none;
                    transition: background 0.3s ease;
                }

                .breadcrumbs ol li a.btn-create-post:hover {
                    background-color: #0056b3;
                }

            </style>
            <!-- End Page Title -->

            <!-- Blog Posts Section -->
            <section id="blog-filters" class="blog-filters section">
                <div class="container">
                    <form action="blog" method="get" class="row g-3">
                        <div class="col-md-3">
                            <label for="category" class="form-label">Danh mục</label>
                            <select name="category" id="category" class="form-select">
                                <option value="">Tất cả</option>
                                <c:forEach items="${listCategories}" var="cat">
                                    <option value="${cat.id}">${cat.name}</option>
                                </c:forEach>
                            </select>
                        </div>

                        <div class="col-md-3">
                            <label for="date" class="form-label">Ngày đăng</label>
                            <input type="date" name="date" id="date" class="form-control">
                        </div>

                        <div class="col-md-3">
                            <label for="duration" class="form-label">Thời gian</label>
                            <select name="duration" id="duration" class="form-select">
                                <option value="">Tất cả</option>
                                <option value="short">Dưới 30 phút</option>
                                <option value="medium">30 phút - 1 giờ</option>
                                <option value="long">Trên 1 giờ</option>
                            </select>
                        </div>

                        <div class="col-md-3 d-flex align-items-end">
                            <button type="submit" class="btn btn-primary w-100">Lọc</button>
                        </div>
                    </form>
                </div>
            </section>

            <!-- Danh sách bài viết -->
            <section id="blog-posts" class="blog-posts section">
                <div class="container">
                    <div class="row gy-4">
                        <c:forEach items="${listAllActivePost}" var="lp">
                            <div class="col-lg-4">
                                <article class="position-relative h-100">
                                    <div class="post-img position-relative overflow-hidden">
                                        <img src="${lp.img}" class="img-fluid" alt="Image Job">
                                    </div>

                                    <div class="post-content d-flex flex-column">
                                        <h3 class="post-title">${lp.title}</h3>

                                        <div class="meta d-flex align-items-center">
                                            <div class="d-flex align-items-center">
                                                <i class="bi bi-arrow-bar-right"></i> <span class="ps-2">${lp.dateStarted}</span>
                                            </div>
                                            <span class="px-3 text-black-50">/</span>
                                            <div class="d-flex align-items-center">
                                                <i class="bi bi-clock"></i> <span class="ps-2">${lp.timeDuration}</span>
                                            </div>
                                        </div>
                                        <p>${lp.description}</p>
                                        <hr>
                                        <a href="post_detail?id=${lp.postID}" class="readmore stretched-link">
                                            <span>Read More</span><i class="bi bi-arrow-right"></i>
                                        </a>
                                    </div>
                                </article>
                            </div><!-- End post list item -->
                        </c:forEach>
                    </div>
                </div>
            </section>
            <!-- Blog Pagination Section -->
        </main>
        <%@include file="Footer.jsp" %>
    </body>

</html>
