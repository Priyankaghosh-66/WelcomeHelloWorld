<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Product selection Page</title>
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">   
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>


<link rel="stylesheet" 
href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css"></style>
<script type="text/javascript" 
src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" 
src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Add a Product
</h1>
<c:url var="addAction" value="/products/add" ></c:url>

<form:form action="${addAction}" method="POST" commandName="products" enctype="multipart/form-data">
<div align:centre>
<table>
	<c:if test="${!empty product.name}">
	<tr>
		<td>
			<form:label path="id">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="id" readonly="true" size="8"  disabled="true" />
			<form:hidden path="id" />
		</td> 
	</tr>
	</c:if>

	
	<tr>
		<td>
			<form:label path="name">
				<spring:message text="Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="name" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="status">
				<spring:message text="Status"/>
			</form:label>
		</td>
		<td>
			<form:input path="status" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="description">
				<spring:message text="Description"/>
			</form:label>
		</td>
		<td>
			<form:input path="description" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="price">
				<spring:message text="Price"/>
			</form:label>
		</td>
		<td>
			<form:input path="price" />
		</td>
	</tr>
	
	
	<tr>
		<td>
			<form:label path="category">
				<spring:message text="Category"/>
			</form:label>
		</td>
		<td>
			<form:input path="Category" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="image">
				<spring:message text="File to upload"/>
			</form:label>
		</td>
		<td>
			<form:input path="image" type="file" />
		</td> 
	</tr>
	
	<tr>
		<td colspan="2">
			<c:if test="${!empty product.id}">
				<input type="submit"
					value="<spring:message text="Edit Products"/>" />
			</c:if>
			<c:if test="${empty product.id}">
				<input type="submit"
					value="<spring:message text="Add Products"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
 <h3>Products List</h3>
<c:if test="${!empty listofProducts}">
    <table class="tg">
   
	<tr>
	
	    <th width="80">Product ID</th>
		<th width="100">Product NAME</th>
		<th width="100">Product STATUS</th>
		<th width="100">Product DESCRIPTION</th>
		<th width="80">Product PRICE</th>
		<th width="100">Product CATEGORY</th>
		<th width="100">Edit</th>
		<th width="100">Delete</th>
	</tr>
	<c:forEach items="${listofProducts}" var="products">
		<tr>
			<td>${products.id}</td>
			<td>${products.name}</td>
			<td>${products.status}</td>
			<td>${products.description}</td>
			<td>${products.price}</td>
			<td>${products.category}</td>
			<td><a href="<c:url value='/edit/${products.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/remove/${products.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
	</div>
</c:if>
</body>
</html>

<script>
$(document).ready(function(){
    $('#tg').dataTable();
});
</script>