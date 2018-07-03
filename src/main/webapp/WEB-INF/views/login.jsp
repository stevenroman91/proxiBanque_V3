<%-- Configuration d'une page JSP avec la syntaxe "<%@ ... %>" --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" session="true" %>
<%-- Import de la librairie de tags JSTL core. --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" href="css/login.css">
<title>LOGIN</title>
</head>
<body>
<div class="container">
<img alt="error" src="https://upload.wikimedia.org/wikipedia/commons/c/ca/Crystal_Clear_app_Login_Manager.png">
  <fm:form class="form-horizontal" action="login">

    <div class="form-group">
      <label class="control-label col-sm-2" for="username"><span class="glyphicon glyphicon-user"></span></label>
      <div class="col-sm-7">
        <input type="text" class="form-control" id="username" placeholder="Enter Username" name="username" >
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="password"><span class="glyphicon glyphicon-briefcase"></span></label>
      <div class="col-sm-7">          
        <input type="password" class="form-control" id="password" placeholder="Enter password" name="password" >
      </div>
    </div>

    <div class="form-group">        
      <div class="col-sm-offset-4 col-sm-4">
        <button type="submit" class="btn btn-default">Login</button>
      </div>
    </div>
    
    <div class="form-group">
    <div class="col-sm-offset-4 col-sm-5">
    <a href="#">Forget Password?</a>
    </div>
    </div>
  
  
  </fm:form>
  </div>

</body>
</html>