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
    
    .modal-header, h4, .close {
      background-color: #5cb85c;
      color:white !important;
      text-align: center;
      font-size: 30px;
  }
  .modal-footer {
      background-color: #f9f9f9;
  }
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
            	<a href="#myModal" role="button" class="btn btn-default btn-lg" data-toggle="mymodal" id="myBtn"><span class="glyphicon glyphicon-shopping-cart"></span> Add to cart</a>
            </td>
		</tr>
	</tbody>
	</table>
	 <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="padding:35px 50px;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4><span class="glyphicon glyphicon-lock"></span> Login</h4>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
          <form class="form-horizontal" name="loginform" method="post" action="signup">
            <div class="form-group">
              <label for="usrname"><span class="glyphicon glyphicon-user"></span> Username</label>
              <input type="text" class="form-control" id="usrname" placeholder="Enter email">
            </div>
            <div class="form-group">
              <label for="psw"><span class="glyphicon glyphicon-eye-open"></span> Password</label>
              <input type="text" class="form-control" id="psw" placeholder="Enter password">
            </div>
            <div class="checkbox">
              <label><input type="checkbox" value="" checked>Remember me</label>
            </div>
              <button type="submit" class="btn btn-success btn-block"><span class="glyphicon glyphicon-off"></span> Login</button>
          </form>
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Cancel</button>
          <p>Not a member? <a href="#">Sign Up</a></p>
          <p>Forgot <a href="#">Password?</a></p>
        </div>
      </div>
      
    </div>
  </div> 
	
	<footer style="background-color:black;height:40px">
        <p class="pull-right">
        <i style="font-size:20px;padding-right:15px" class="fa">&#xf230;</i>
        <i style="font-size:20px;padding-right:15px" class="fa">&#xf1a0;</i>
        <i style="font-size:20px;padding-right:15px" class="fa">&#xf0e1;</i>
        <i style="font-size:20px;padding-right:10px" class="fa">&#xf081;</i>
        </p>
        <p>&copy; 2016 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
      </footer>
      <script>
$(document).ready(function(){
    $("#myBtn").click(function(){
        $("#myModal").modal();
    });
});
</script>
      
     
</body>
</html>
