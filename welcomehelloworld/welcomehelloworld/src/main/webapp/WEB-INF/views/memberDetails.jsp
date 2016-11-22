<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Mvc WebFlow Demo</title>
<!-- <link href="style.css" rel="stylesheet" type="text/css" /> -->
</head>

<body>
	<div class="content">
		<fieldset>
			<legend>Become Member</legend>
			<!-- for triggering webflow events using links,
					 the eventId to be triggered is given in "href" attribute as:
				 -->
			<%-- <a href="${flowExecutionUrl}&_eventId_home">Home</a> --%>
			<sf:form modelAttribute="userBean">
				<br />
				<sf:label path="userId">UserName:</sf:label>
				<sf:input path="userId" />
				<br />
				<sf:label path="email">Email Id: </sf:label>
				<sf:input path="email" />
				<br />
				<sf:label path="age">Age: </sf:label>
				<sf:input path="age" />
				<br />
				<input name="_eventId_submit" type="submit" value="Submit" />
				<br />
			</sf:form>
		</fieldset>
	</div>


</body>
</html>