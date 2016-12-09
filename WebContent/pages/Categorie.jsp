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
				<center>Ajouter une catégorie</center>
			</h3>
		</div>

		<div class="panel-body">
			<form class="form-horizontal form-label-left" class="form-inline"
				method="post" action="AjoutCategorie">

				<div class="item form-group">
					<label class="control-label col-md-3 col-sm-3 col-xs-12"
						for="ville">Nom Catégorie : <span class="required"></span>
					</label>
					<div class="col-md-6 col-sm-6 col-xs-12">
						<input id="name" class="form-control col-md-7 col-xs-12"
							name="nom" type="text">
					</div>
				</div>
				<div class="item form-group">
					<label class="control-label col-md-3 col-sm-3 col-xs-12"
						for="textarea">Description : <span class="required"></span>
					</label>
					<div class="col-md-6 col-sm-6 col-xs-12">
						<input type="text" id="textarea" name="description"
							class="form-control col-md-7 col-xs-12">
					</div>
				</div>
				<div class="ln_solid"></div>
				<center>
					<div class="form-group">
						<div class="col-md-6 col-md-offset-3">
							<button id="send" type="submit" class="btn btn-warning">Ajouter
								la catégorie</button>
						</div>
					</div>
				</center>

			</form>
		</div>
	</div>
	

</body>
</html>