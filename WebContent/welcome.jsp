<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="panel panel-warning">
		<div class="panel-heading">
			<h3 class="panel-title">
				<center>Welcome</center>
			</h3>
		</div>

		<div class="panel-body">
		
			<div class="row">
			<div class="col-sm-4">
				<a href="http://localhost:8080/ProjetPlatforme/faces/pages/GestionClient.xhtml">	<button type="button" class="btn btn-danger btn-block">Gestion Du 
						Client</button></a>
				</div>
				<div class="col-sm-4">
					<a href="http://localhost:8080/ProjetPlatforme/faces/pages/GestionCategorie.xhtml"><button type="button" class="btn btn-success btn-block">Gestion du
						Categorie</button></a>
				</div>
				<div class="col-sm-4">
				 <a href="http://localhost:8080/ProjetPlatforme/faces/pages/GestionProduit.xhtml">	<button type="button" class="btn btn-primary btn-block">Gestion Du
						Produit</button></a>
				</div>
				
				
			</div>
		</div>
	</div>


</body>
</html>