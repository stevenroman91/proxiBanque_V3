<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ProxyBanque</title>
<link rel="stylesheet" href="<c:url value = "/css/bootstrap.min.css"></c:url>">
<link rel="stylesheet" href="<c:url value = "/css/style.css"></c:url>">
<script src="<c:url value = "/js/bootstrap.min.js"></c:url>"></script>
</head>
<body>

<!-- Banner -->
	<section id="banner">
		<h2>Application ProxiBanque</h2>
		<p>Bienvenue sur l'application ProxiBanque, votre outil de
			gestion clientèle</p>
		<div class="alert alert-danger" role="alert">Erreur ! Login/Mot de passe incorrect</div>
		<br>
		<form class="form-inline" method="Post">
		
			<label for="login"> Login </label>
			<div class="form-group has-error has-feedback">
				<input type="text" class="form-control" id="login" name="login" placeholder="Login">
				<span class="glyphicon glyphicon-remove form-control-feedback" aria-hidden="true"></span>
				<span id="inputError2Status" class="sr-only">(error)</span>
			</div>
			
			<label for="pwd"> Mot de passe </label>
			<div class="form-group has-error has-feedback">
				<input type="password" class="form-control" id="pwd" name="pwd" placeholder="Mot de passe">
				<span class="glyphicon glyphicon-remove form-control-feedback" aria-hidden="true"></span>
			 	<span id="inputError2Status" class="sr-only">(error)</span>
			</div>
			
			<div class="form-group">
				<button type="submit" class="btn btn-success btn-lg">Espace Conseiller</button>
			</div>
			
		</form>
	</section>

	<!-- Section 1  -->
	<section id="one" class="container-fluid">
		<div class="center">
			<h2>Gestion clientèle</h2>
			<p>L'application ProxiBanque vous offre un outil de gestion
				pour répondre aux besoins de vos clients.</p>
			<br>
		</div>
		<div id="div1" class="center col-xs-4">
			<span class="glyphicon glyphicon-refresh"></span>
			<p>Vous permet de mettre à jour les
				informations clients.</p>
		</div>
		<div id="div1" class="center col-xs-4">
			<span class="glyphicon glyphicon-folder-open"></span>
			<p>Vous permet de consulter les comptes
				Courants et Epargnes de vos clients.</p>
		</div>
		<div id="div1" class="center col-xs-4">
			<span class="glyphicon glyphicon-euro"></span>
			<p>Vous permet d'effectuer pour vos
				clients des virements entre comptes.</p>
		</div>
	</section>
</body>

</html>