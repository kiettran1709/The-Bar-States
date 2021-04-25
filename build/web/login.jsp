<%-- 
    Document   : login
    Created on : May 21, 2020, 8:51:18 AM
    Author     : home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="js/jquery-3.3.1.slim.min.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </head>
    <body style="background-image: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)),url('images/Pixel bar.gif'); height: 100vh; background-size: 
          cover; background-position: center" >
        <h1 style="text-align: center; color: whitesmoke">ĐĂNG NHẬP</h1>
        <form action="LoginServlet" method="POST" style="width: 30%; transform: translate(550px, 0px)">
            <div class="form-group">
                <label for="exampleInputEmail1" style="color: whitesmoke">Username</label>
                <input type="text" name="txtUserName" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                <small id="emailHelp" class="form-text text-muted">We'll never share your information with anyone else.</small>
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1" style="color: whitesmoke">Password</label>
                <input type="password" name="txtPassWord" class="form-control" id="exampleInputPassword1">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form> 
    </body>
</html>
