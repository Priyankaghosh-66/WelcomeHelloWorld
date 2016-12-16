<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
    .error {
        color: #FF6347;
        margin-bottom: 20px;
        padding: 15px;
    }
    </style>
     
</head>
<body>
<h1>
	Add a User
</h1>

<c:url var="addAction" value="/user/addition" ></c:url>

<form:form action="freshuser" commandName="User" method="POST">

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
		
			<form:input path="firstName" id="firstName" class="form-Control"/>
			</td>
			<td align="left"><form:errors path="firstName" cssClass="error"/>
			
		</td> 
		
		
	</tr>

	<tr>
		<td>
			<form:label path="lastName">
				<spring:message text="LastName"/>
			</form:label>
		</td>
		<td>
		
			<form:input path="lastName" id="lastName" class="form-Control"/>
			</td>
			<td align="left"><form:errors path="lastName" cssClass="error"/></td>
			
			

		
		
	</tr>
	<tr>
		<td>
			<form:label path="username">
				<spring:message text="Username"/>
			</form:label>
		</td>
		<td>
		
			<form:input path="username" id="username" class="form-Control"/>
			
			</td>
			<td align="left">
			<form:errors path="username" cssClass="error"/>
			</td>
		
		 
	</tr>
	
	<tr>
		<td>
			<form:label path="password">
				<spring:message text="Password"/>
			</form:label>
		</td>
		<td>
		
			<form:input path="password" id="password" class="form-Control"/>
			
			</td>
			<td align="left"> <form:errors path="password" cssClass="error"/>
			
		</td>
		
		
	</tr>
	<tr>
		<td>
			<form:label path="email">
				<spring:message text="Email"/>
			</form:label>
		</td>
		<td>
		
			<form:input path="email" id="email" class="form-Control"/>
			</td>
			<td align="left"><form:errors path="email" cssClass="error"/>
			
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