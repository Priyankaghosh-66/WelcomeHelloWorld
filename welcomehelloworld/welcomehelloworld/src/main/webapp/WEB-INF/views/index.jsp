<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Example of Bootstrap 3 Carousel</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<style type="text/css">
.carousel{
    background: #2f4357;
    margin-top: 20px;
}
.carousel .item img{
    margin:  auto; /* Align slide image horizontally center */
}
.bs-example{
	margin: 20px;
}
#actual-image
{
    height: 55px;
    margin-top: -16px;    
}
</style>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">
      <img id="actual-image" alt="website-logo" src="resource\Images\imo8.JPG" ></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="Aboutus">About us</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Product <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#"> Processed</a></li>
          <li><a href="Demean"> Unprocessed</a></li>
          <li><a href="Select"> Selection</a></li>
        </ul>
      </li>
      
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="Register"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
  


<div class="bs-example">
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Carousel indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
            <li data-target="#myCarousel" data-slide-to="3"></li>
        </ol>   
        <!-- Wrapper for carousel items -->
        <div class="carousel-inner">
            <div class="item active">
                <img src="resource\Images\veggies.jpg" alt="First Slide">
            </div>
            <div class="item">
                <img src="resource\Images\choco.jpg" alt="Second Slide">
            </div>
            <div class="item">
                <img src="resource\Images\Nuts.jpg" alt="Third Slide">
            </div>
            <div class="item">
                <img src="resource\Images\icy.jpg" alt="Fourth Slide">
            </div>
        </div>
        <!-- Carousel controls -->
        <a class="carousel-control left" href="#myCarousel" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left"></span>
        </a>
        <a class="carousel-control right" href="#myCarousel" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right"></span>
        </a>
    </div>
</div>
    
<div class="row">
<div class="col-md-6">
<h1 class=text-centre><Strong>About FOOD PROCESSING TECHNOLOGY</Strong></h1><br>
<p>Food Processing Technology is a recent trend in India's market.India’s agricultural base is quite strong but wastage is very high and processing of food products
is very low. The country’s processing sector is small and processing of food to consumable
standards in India has reached only 10% recently. India’s share in exports of processed food in
World trade has remained at about 1.5 percent or $3.2 billion.</p>
</div>
<div class="col-md-6">
<iframe width="850" height="600" src="https://www.youtube.com/embed/lSjI0aLZGy8" frameborder="0" allowfullscreen></iframe>
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

</body>
</html>                             