<%-- 
    Document   : insert
    Created on : May 22, 2019, 8:59:38 PM
    Author     : home
--%>

<%@page import="entities.Account"%>
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
                    <h1>Update Account!</h1>
                    <form action="AccountServlet2?yeucau=Update" method="post" style="width: 30%">

                        <%
                            Account account = (Account) session.getAttribute("acc");
                        %>

                        <div class="form-group">
                            <label for="uname">Username:</label>
                            <input type="text" class="form-control"  value="<%= account.getUsername()%>" placeholder="Enter username" name="txtname" readonly  required>
                            <div class="valid-feedback">Valid.</div>
                            <div class="invalid-feedback">Please fill out this field.</div>
                        </div>
                        <div class="form-group">
                            <label for="pwd">Password:</label>
                            <input type="password" class="form-control" value="<%= account.getPassword()%>" placeholder="Enter password" name="txtpass" required>
                            <div class="valid-feedback">Valid.</div>
                            <div class="invalid-feedback">Please fill out this field.</div>
                        </div>
                        <button type="submit" value="Update" name="yeucau" class="btn btn-primary">Submit</button>
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
