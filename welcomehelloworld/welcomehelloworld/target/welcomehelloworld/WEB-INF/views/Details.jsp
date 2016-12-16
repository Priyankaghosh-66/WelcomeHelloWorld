<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style type="text/css">
       .table{background-color:#FFFFFF} 
    
    </style>
<title>Foodies</title>
</head>

<body background="<c:url value='/resources/Images/back.jpg' />">
<table class="table">
	<thead colspan="3">
	<th><h1>Details</h1></th>
	</thead>
	<tbody>
		<tr >
			<td rowspan="6"><img src="resources/Images/${param.id}.jpg"></td>
			
		</tr>
		
		<tr>
		<td><h3>Features</h3></td>
		<td><h3>Details</h3></td>
		</tr>
		<tr>
		<td><b>Name</b></td>
		<td>${param.name}</td>
		</tr>
		<tr>
		<td><b>Status</b></td>
		<td>${param.status}</td>
		</tr>
		<tr>
		<td><b>Category</b></td>
		<td>${param.category}</td>
		</tr>
		<tr>
		<td><b>Price</b></td>
		<td>${param.price}</td>
		</tr>
		<tr>
			<td colspan="3"><b>Product Description</b></b></td>
			<td>${param.description}</td>
		</tr>
		<tr>
			<td>
				<a href = "checkoutFlow" class = "btn btn-primary" role = "button">Buy </a> 
            	<a href = "#" class = "btn btn-default" role = "button">Wishlist</a>
            	<a href="#" role="button" data-toggle="modal" class = "btn btn-default">Share with a Friend</a>
            	<a href="modal"><span class="glyphicon glyphicon-shopping-cart"></span> Add to cart</a>
            </td>
		</tr>
		<tr>
			
		</tr>
	</tbody>
	</table>
	<footer style="background-color:black;height:40px">
        <p class="pull-right">
        <i style="font-size:20px;padding-right:15px" class="fa">&#xf230;</i>
        <i style="font-size:20px;padding-right:15px" class="fa">&#xf1a0;</i>
        <i style="font-size:20px;padding-right:15px" class="fa">&#xf0e1;</i>
        <i style="font-size:20px;padding-right:10px" class="fa">&#xf081;</i>
        </p>
        <p>&copy; 2016 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
      </footer>
 </style>

</body>
</html>
