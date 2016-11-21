<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

	<title>User Page</title>
	<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">   
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>


<link rel="stylesheet" 
href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css"></style>
<script type="text/javascript" 
src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" 
src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	<style type="text/css">
		.tk  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tk td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tk th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tk .tg-4eph{background-color:#f9f9f9}

    .error 
    {
        color: #ff0000;
        font-weight: bold;
    }
    </style> 
</head>
<body>
<h1>
	Add a User
</h1>

<c:url var="addAction" value="/user/addition" ></c:url>

<form:form action="${addAction}" commandName="User">

<table>
	<c:if test="${!empty user.username}">
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
			<form:label path="firstName">
				<spring:message text="FirstName"/>
			</form:label>
		</td>
		<td>
		<form:errors path="firstName" cssClass="error"/>
			<form:input path="firstName" />
			
		</td> 
		
		
	</tr>
	<tr>
		<td>
			<form:label path="lastName">
				<spring:message text="LastName"/>
			</form:label>
		</td>
		<td>
		<form:errors path="lastName" cssClass="error"/>
			<form:input path="lastName" />
			</td>
			

		
		
	</tr>
	<tr>
		<td>
			<form:label path="username">
				<spring:message text="Username"/>
			</form:label>
		</td>
		<td>
		<form:errors path="username" cssClass="error"/>
			<form:input path="username" />
			
			
		</td>
		
		 
	</tr>
	
	<tr>
		<td>
			<form:label path="password">
				<spring:message text="Password"/>
			</form:label>
		</td>
		<td>
		<form:errors path="password" cssClass="error"/>
			<form:input path="password" />
			
		</td>
		
		
	</tr>
	<tr>
		<td>
			<form:label path="email">
				<spring:message text="Email"/>
			</form:label>
		</td>
		<td>
		<form:errors path="email" cssClass="error"/>
			<form:input path="email" />
			
		</td>
		
		
	</tr>
	<tr>
		<td colspan="2">
			<%-- <c:if test="${!empty user.id}">
				<input type="submit"
					value="<spring:message text="Edit User"/>" />
			</c:if> --%>
			<%-- <c:if test="${empty user.id}"> --%>
				<input type="submit"
					value="<spring:message text="Add User"/>" />
			<%-- </c:if> --%>
		</td>
	</tr>
</table>	
</form:form>
</body>
</html>
<%-- <br>
 <h3>User List</h3>
<c:if test="${!empty listUsers}">
	<table class="tk">
	<tr>
		<th width="80">User ID</th>
		<th width="120">User FirstName</th>
		<th width="120">User LastName</th>
		<th width="120">Username</th>
		<th width="120">Password</th>
		<th width="120">Email</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listUsers}" var="User">
		<tr>
			<td>${User.id}</td>
			<td>${User.firstName}</td>
			<td>${User.lastName}</td>
			<td>${User.username}</td>
			<td>${User.password}</td>
			<td>${User.email}</td>
			<td><a href="<c:url value='/edit/${User.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/removal/${User.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
<script>
$(document).ready(function(){
    $('#tk').DataTable();
});
</script>  --%>