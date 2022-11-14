<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Eletrodomestico</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
	  <h3>Eletrodomestico: ${listagem.size()}</h3>
	
	<table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Quantidade</th>
	        <th>Garantia Estendida</th>
	        <th>Descrição</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="s" items="${listagem}">
		      <tr>
				<td>${s.id}</td>
		        <td>${s.quantidade}</td>
		        <td>${s.garantiaEstendida}</td>
		        <td>${s.descricao}</td>
		        <td><a href="/eletrodomestico/${s.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>