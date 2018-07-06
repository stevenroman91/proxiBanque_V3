<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ProxyBanque</title>
<link rel="stylesheet"
	href="<c:url value = "/css/bootstrap.min.css"></c:url>">
<link rel="stylesheet" href="<c:url value = "/css/style.css"></c:url>">
<script src="<c:url value = "/js/bootstrap.min.js"></c:url>"></script>
</head>
<body>



	<nav class="navbar navbar-inverse navbar-static-top">

		<div class="container-fluid">

			<ul class="nav navbar-left">

				<li role="presentation"><a href="clientsoperations.jsp"><span
						class="glyphicon glyphicon-home" aria-hidden="true"></span>
						Accueil ProxyBanque</a></li>

			</ul>

			<ul class="nav navbar-right">

				<li role="presentation"><a href="LogOutServlet"><span
						class="glyphicon glyphicon-log-out" aria-hidden="true"></span>

						Deconnexion</a></li>

			</ul>

		</div>

	</nav>

	<!-- Banner -->

	<div id="banner">

		<h2>Application ProxyBanque</h2>

		<p>Bienvenue dans votre espace ProxyBanque</p>





		<!-- Liste des comptes du client -->

		<div class="panel panel-default">

			<div class="panel-heading">

				Liste des comptes de:

				<c:out value="${client.prenom}" />

				<c:out value="${client.nom}" />

			</div>

			<div class="panel-body">

				<table class="table">

					<thead>

						<tr>

							<td>ID</td>

							<td>Numero de compte</td>

							<td>Type de compte</td>

							<td>Libellé</td>

							<td>Date d'ouveture</td>

							<td>Solde</td>

							<td>Chequier</td>

							<td>CarteBleu</td>

						</tr>

					</thead>

					<tbody>

						<c:forEach var="compte" items="${client.comptes}">

							<tr>

								<td><c:out value="${compte.id}" /></td>

								<td><c:out value="${compte.numCompte}" /></td>

								<td><c:out value="${compte.typeCompte}" /></td>

								<td><c:out value="${compte.libelle}" /></td>

								<td><c:out value="${compte.dateOuverture}" /></td>

								<td><c:out value="${compte.solde} Euro" /></td>

								<td><c:out value="${compte.chequier.id}" /></td>

								<td><c:out value="${compte.carteBleu.type}" /></td>

							</tr>

						</c:forEach>


					</tbody>

				</table>

			</div>

		</div>
		<c:choose>
			<c:when test="${tydeAction==0}">
				<div class="container">
					<c:url value="/virement.html?id=" var="chemin1" />
					<form action="${chemin1}${client.id}" method="get"
						class="form-inline">
						<div class="form-group">
							<button name="id" value="${client.id}" type="submit"
								class="btn btn-success">Effectuer un virement</button>
						</div>

					</form>
				</div>

				<div class="container">
					<c:url value="/retrait.html?id=" var="chemin2" />
					<form action="${chemin2}${client.id}" method="get"
						class="form-inline">
						<div class="form-group">
							<button name="id" value="${client.id}" type="submit"
								class="btn btn-success">Effectuer un retrait</button>
						</div>

					</form>
				</div>
			</c:when>
			<c:when test="${tydeAction==1}">
				<div class="container">
					<c:url value="/comptes.html?id=" var="chemin" />
					<form method="post" class="form-inline">
						<div class="form-group">
							<label for="idCompteD">Compte à débiter </label> <select
								class="form-control" name="idCompteD" id="idCompteD">

								<c:forEach var="compte" items="${client.comptes}">

									<option value="${compte.id}"><c:out
											value="${compte.id}" /></option>

								</c:forEach>

							</select>
						</div>
						<div class="form-group">
							<label for="idCompteC">Compte à créditer </label> <select
								class="form-control" name="idCompteC" id="idCompteC">

								<c:forEach var="compte" items="${client.comptes}">

									<option value="${compte.id}"><c:out
											value="${compte.id}" /></option>

								</c:forEach>

							</select>
						</div>
						<div class="form-group">
							<label class="sr-only" for="montantVirement">Montant (en
								Euros)</label> <input type="number" class="form-control"
								id="montantVirement" name="montantVirement"
								placeholder="montant">

						</div>
						<div class="form-group">
							<button name="but" type="submit" class="btn btn-success">
								Effectuer Virement</button>
						</div>
					</form>

				</div>
			</c:when>
			<c:when test="${tydeAction==-1}">
				<div class="container">
					<c:url value="/retrait.html?id=" var="chemin" />
					<form action="${chemin}${client.id}" method="post"
						class="form-inline">
						<div class="form-group">
							<label for="type">Type de retrait </label> <select
								class="form-control" name="type" id="type">

								<option value="valeur1" selected>Especes</option>
								<option value="valeur2">Chequier</option>
								<option value="valeur3">Carte Bleu</option>

							</select>
						</div>
						<div class="form-group">
							<button name="but" type="submit" class="btn btn-success">
								Effectuer un retrait</button>
						</div>
					</form>

				</div>
			</c:when>
			<c:when test="${TT==0}">
				<div class="container">
					<c:url value="/especes.html" var="chemin" />
					<form action="${chemin}${id}" method="post"
						class="form-inline">
						<div class="form-group">
							<label for="id">Compte</label> <select class="form-control"
								name="id" id="id">

								<c:forEach var="compte" items="${client.comptes}">
									<option value="${compte.id}"><c:out
											value="${compte.id}" /></option>

								</c:forEach>

							</select>
						</div>
						<div class="form-group">
							<label class="sr-only" for="montantVirement">Montant (en
								Euros)</label> <input type="number" class="form-control"
								id="montantVirement" name="montantVirement"
								placeholder="montant">

						</div>
						<div class="form-group">
							<button name="but" type="submit" class="btn btn-success">
								Effectuer retrait d'espèces</button>
						</div>
						<c:choose>
							<c:when test="${not empty message}">
								<div class="alert alert-danger" role="alert"> ${message}</div>
							</c:when>
						</c:choose>
					</form>

				</div>
			</c:when>
			<c:when test="${TT==1}">
				<div class="container">
					<c:url value="/chequier.html?id=" var="chemin" />
					<form action="${chemin}${client.id}" method="post"
						class="form-inline">
						<div class="form-group">
							<label for="LL">Compte</label> <select
								class="form-control" name="LL" id="LL">

								<c:forEach var="compte" items="${client.comptes}">
									<option value="${compte.id}"><c:out
											value="${compte.id}" /></option>

								</c:forEach>

							</select>
						</div>
						<div class="form-group">
							<button name="but" type="submit" class="btn btn-success">
								Retirer un chequier</button>
						</div>
						<c:choose>
							<c:when test="${not empty message}">
								<div class="alert alert-danger" role="alert"> ${message}</div>
							</c:when>
						</c:choose>
					</form>

				</div>
			</c:when>
			<c:when test="${TT==-1}">
				<div class="container">
					<c:url value="/carteblue.html?id=" var="chemin" />
					<form action="${chemin}${client.id}" method="post"
						class="form-inline">
						<div class="form-group">
							<label for="LL">Compte</label> <select
								class="form-control" name="LL" id="LL">

								<c:forEach var="compte" items="${client.comptes}">
									<option value="${compte.id}"><c:out
											value="${compte.id}" /></option>

								</c:forEach>

							</select>
						</div>
						<div class="form-group">
							<label for="type">Type de retrait </label> <select
								class="form-control" name="carte" id="type">

								<option value="valeur1" selected>Visa electron</option>
								<option value="valeur2">Visa premier</option>

							</select>
						</div>
						<div class="form-group">
							<button name="but" type="submit" class="btn btn-success">
								Retirer carte bleu</button>
						</div>
						<c:choose>
							<c:when test="${not empty message}">
								<div class="alert alert-danger" role="alert"> ${message}</div>
							</c:when>
						</c:choose>
					</form>

				</div>
			</c:when>
		</c:choose>

	</div>



	<!-- Section 1  -->

	<div id="one" class="container-fluid">

		<div class="center">

			<h2>Gestion clientèle</h2>

			<p>L'application ProxyBanque vous offre un outil de gestion pour
				répondre aux besoins de vos clients.</p>

			<br>

		</div>

		<div id="div1" class="center col-xs-4">

			<span class="glyphicon glyphicon-refresh"></span>

			<p>Vous permet de mettre à jour les informations clients.</p>

		</div>

		<div id="div1" class="center col-xs-4">

			<span class="glyphicon glyphicon-folder-open"></span>

			<p>Vous permet de consulter les comptes Courants et Epargnes de
				vos clients.</p>

		</div>

		<div id="div1" class="center col-xs-4">

			<span class="glyphicon glyphicon-euro"></span>

			<p>Vous permet d'effectuer pour vos clients des virements de
				compte à compte.</p>

		</div>

	</div>

</body>

</body>
</html>