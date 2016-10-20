<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
<title>Product selection Page</title>
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
<c:url var="addAction" value="/product/add" ></c:url>

<form:form action="${addAction}" commandName="products">
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
			<form:input path="category" />
		</td> 
	</tr>
	<tr>
		<td colspan="2">
			<c:if test="${!empty products.name}">
				<input type="submit"
					value="<spring:message text="Edit Products"/>" />
			</c:if>
			<c:if test="${empty products.name}">
				<input type="submit"
					value="<spring:message text="Add Products"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
<h3>Products List</h3>
<c:if test="${!empty listProducts}">
	<table class="tg">
	<tr>
		<th width="50">Product ID</th>
		<th width="60">Product CATEGORY</th>
		<th width="120">Product DESCRIPTION</th>
		<th width="60">Product NAME</th>
		<th width="50">Product PRICE</th>
		<th width="50">Product STATUS</th>
		<th width="55">Edit</th>
		<th width="55">Delete</th>
	</tr>
	<c:forEach items="${listProducts}" var="products">
		<tr>
			<td>${products.id}</td>
			<td>${products.category}</td>
			<td>${products.description}</td>
			<td>${products.name}</td>
			<td>${products.price}</td>
			<td>${products.status}</td>
			<td><a href="<c:url value='/edit/${product.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/remove/${product.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
