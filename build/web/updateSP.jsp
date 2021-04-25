<%-- 
    Document   : insertSP
    Created on : May 30, 2019, 8:05:10 AM
    Author     : home
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="entities.SanPham"%>
<%@page import="model.DanhMucModel"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="js/jquery-3.3.1.slim.min.js" ></script>
        <script src="js/popper.min.js" ></script>
        <script src="js/bootstrap.min.js" ></script>
    </head>
    <body>
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
                    <a class="navbar-brand" href="#">Welcome</a>
                    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                        <li class="nav-item active">
                            <a class="nav-link" href="index_1.jsp">Home<span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="showSanPham.jsp">Product</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link disabled" href="insertSP.jsp" tabindex="-1" aria-disabled="true">Insert</a>
                        </li>
                    </ul>
                    <form class="form-inline my-2 my-lg-0">
                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                    </form>
                </div>
            </nav>

            <div class="row mt-3">
                <div class="col-md-3">
                    <div class="list-group">
                        <a href="index_1.jsp" class="list-group-item list-group-item-action">Home</a>


                        <a href="showSanPham.jsp" class="list-group-item list-group-item-action list-group-item-primary">Product</a>
                        <a href="insertSP.jsp" class="list-group-item list-group-item-action list-group-item-secondary">Insert Product</a>
                        <a href="View.jsp" class="list-group-item list-group-item-action list-group-item-success">Account</a>
                        <a href="#" class="list-group-item list-group-item-action list-group-item-danger">Not Avaliable</a>
                        <a href="#" class="list-group-item list-group-item-action list-group-item-warning">Not Avaliable</a>
                        <a href="#" class="list-group-item list-group-item-action list-group-item-info">Not Avaliable</a>
                        <a href="#" class="list-group-item list-group-item-action list-group-item-light">Not Avaliable</a>
                        <a href="#" class="list-group-item list-group-item-action list-group-item-dark">Not Avaliable</a>
                    </div>
                </div>
                <div class="col-md-9">
                    <h2>Cập Nhật sản phẩm</h2>
                    <% ArrayList list = new DanhMucModel().getList();
                        SanPham sanpham = (SanPham) request.getAttribute("sanpham");
                    %>
                    <form enctype="multipart/form-data" action="UpdateSPServlet" method="post" style="width: 50%">
                        <div class="form-group">
                            <label for="uname">ID Product:</label>
                            <input type="text" class="form-control" name="txtmasp" value="${sanpham.getMaSP()}" readonly required>
                            <div class="valid-feedback">Valid.</div>
                            <div class="invalid-feedback">Please fill out this field.</div>
                        </div>
                        <div class="form-group">
                            <label for="pwd">Name of product:</label>
                            <input type="text" class="form-control" name="txttensp" value="${sanpham.getTenSP()}" required>
                            <div class="valid-feedback">Valid.</div>
                            <div class="invalid-feedback">Please fill out this field.</div>
                        </div>
                        <div class="form-group">
                            <label for="pwd">Price:</label>
                            <input type="text" class="form-control" name="txtdongia" value="${sanpham.getDonGia()}" required>
                            <div class="valid-feedback">Valid.</div>
                            <div class="invalid-feedback">Please fill out this field.</div>
                        </div>
                        <div class="form-group">
                            <label for="pwd">Amount:</label>
                            <input type="text" class="form-control" name="txtsoluong" value="${sanpham.getSoLuong()}" required>
                            <div class="valid-feedback">Valid.</div>
                            <div class="invalid-feedback">Please fill out this field.</div>
                        </div>
                        <div class="form-group">
                            <label for="pwd">Picture:</label>
                            <img src="images/${sanpham.getHinh()}" height="100px" width="100px;" />
                            <input type="hidden" name="txthinh_old" value="${sanpham.getHinh()}" />
                            <input type="file" name="txthinh" value="" />
                        </div>
                        <div class="form-group">
                            <label for="pwd">ID:</label>
                            <select name="ddlDanhMuc">
                                <c:forEach var="danhmuc" items="<%=list%>">
                                    <option value="${danhmuc.getMaDM()}" ${danhmuc.getMaDM()==sanpham.getMaDM()?"selected":""}> ${danhmuc.getTenDM()} </option>
                                </c:forEach>
                            </select>
                        </div>
                        <button type="submit" name="yeucau" class="btn btn-primary">Submit</button>
                    </form>
                </div>
                                                      <footer class="page-footer font-small stylish-color-dark pt-4">

        <!-- Footer Links -->
        <div class="container text-center text-md-left">

            <!-- Grid row -->
            <div class="row">

                <!-- Grid column -->
                <div class="col-md-4 mx-auto">

                    <!-- Content -->
                    <h5 class="font-weight-bold text-uppercase mt-3 mb-4">The </h5>
                    <p><b><i>Come and chill with us, we give you the best vibes
                                You are only live one why should not try it yourself ?</i></b></p>

                </div>
                <!-- Grid column -->

                <hr class="clearfix w-100 d-md-none">

                <!-- Grid column -->
                <div class="col-md-2 mx-auto">

                    <!-- Links -->
                    <h5 class="font-weight-bold text-uppercase mt-3 mb-4">Links</h5>

                    <ul class="list-unstyled">
                        <li>
                            <a style="color: black" href="#"><b><i>Best</a>
                        </li>
                        <li>
                            <a style="color: black" href="#">Bar</a>
                        </li>
                        <li>
                            <a style="color: black" href="#">In</a>
                        </li>
                        <li>
                            <a style="color: black" href="#">Town</a></b></i>
                        </li>
                    </ul>

                </div>
                <!-- Grid column -->

                <hr class="clearfix w-100 d-md-none">

                <!-- Grid column -->
                <div class="col-md-2 mx-auto">

                    <!-- Links -->
                    <h5 class="font-weight-bold text-uppercase mt-3 mb-4">Links</h5>

                    <ul class="list-unstyled">
                        <li>
                            <a style="color: black" href="#"><b><i>We</a>
                        </li>
                        <li>
                            <a style="color: black" href="#">Serve</a>
                        </li>
                        <li>
                            <a style="color: black" href="#">Best</a>
                        </li>
                        <li>
                            <a style="color: black" href="#">Quality</a></b></i>
                        </li>
                    </ul>

                </div>
                <!-- Grid column -->

                <hr class="clearfix w-100 d-md-none">

                <!-- Grid column -->
                <div class="col-md-2 mx-auto">

                    <!-- Links -->
                    <h5 class="font-weight-bold text-uppercase mt-3 mb-4">Links</h5>

                    <ul class="list-unstyled" >
                        <li>
                            <a style="color: black" href="#"><b><i>Welcome</a>
                        </li>
                        <li>
                            <a style="color: black" href="#">You</a>
                        </li>
                        <li>
                            <a style="color: black" href="#">To</a>
                        </li>
                        <li>
                            <a style="color: black" href="#">Come</a></b></i>
                        </li>
                    </ul>

                </div>
                <!-- Grid column -->

            </div>
            <!-- Grid row -->

        </div>
        <!-- Footer Links -->

        <hr>

        <!-- Call to action -->
        <ul class="list-unstyled list-inline text-center py-2">
            <li class="list-inline-item">
                <h5 class="mb-1">Register for free</h5>
            </li>
            <li class="list-inline-item">
                <a href="insert.jsp" class="btn btn-warning btn-rounded">Sign up!</a>
            </li>
        </ul>
        <!-- Call to action -->


       

        <!-- Copyright -->
        <div class="footer-copyright text-center py-3"><b>© 2020 Design
                <a style="color: black" href="#"><i>Tran Tuan Kiet</i></b></a>
        </div>
        <!-- Copyright -->

    </footer>
                </body>
                </html>
