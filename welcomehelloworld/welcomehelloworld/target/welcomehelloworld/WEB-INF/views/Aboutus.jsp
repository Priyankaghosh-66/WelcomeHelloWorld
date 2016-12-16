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
#actual-image
{
     height: 55px;
     margin-top: -16px;
}
img{
    float:right;
    margin: 0 0 10px 10px;
    }
</style>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">
      <img id="actual-image" alt="website-logo" src="resources\Images\imo8.JPG" ></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="returnback">Home</a></li>
      <li><a href="#">About us</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"> Products <span class="caret"></span></a>
      <ul class="dropdown-menu">
      <li><a href="#"> Processed</a></li>
      <li><a href="#"> unprocessed</a></li>
      <li><a href="Select"> Selection</a></li>
    </ul>
    </ul>
   </li>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
<div class="row">
 <div class="container">
	<div class="col-md-6" >
	<div style><img src="resources/Images/processed.jpg" alt="neon image" width="670" height="480">
	</div>
	</div>
	<div class="col-md-6">
		<h1 class="text-center"><Strong>ABOUT US</Strong></h1>
		<h2>FOOD: MORE THAN JUST A MEANS TO SURVIVE</h2>
		<p>Our eating habits have changed dramatically during the 20th century. In the first 50 years, especially in the immediate aftermath of World War II, food was simply a source of energy. Today it is also a sensory, cultural and social phenomenon. As well as providing enjoyment, we now want food to enhance our health and well being. Furthermore, many of us are no longer willing to spend scarce leisure time preparing elaborate meals. Our food has to be quick and convenient to prepare, as well as healthy and tasty. Finally, we expect our food to be reasonably priced. In short, our food has to be tasty, safe, cheap, healthy, available all year round, "as natural as possible", varied, and sometimes elegant or exotic.

We may take all this for granted, but catering to a market of more than 350 million people in central Europe alone is no easy task. Moreover, as the population grows, the number of agricultural growers is declining. This increases the pressure on transport and storage systems, especially since many raw materials are not grown in Europe. It may seem impossible to meet all the demands. However, technological progress in food manufacturing and recent discoveries in nutritional science have resulted in increasingly high food quality standards and enormous food variety</p><button data-text-swap="Show">Know More...</button>
		</div>
		</div>

<footer style="background-color:black;clear:both">
        <p class="pull-right">
        <i style="font-size:20px;padding-right:15px" class="fa">&#xf230;</i>
        <i style="font-size:20px;padding-right:15px" class="fa">&#xf1a0;</i>
        <i style="font-size:20px;padding-right:15px" class="fa">&#xf0e1;</i>
        <i style="font-size:20px;padding-right:15px" class="fa">&#xf081;</i>
        </p>
        <p>&copy; 2016 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
      </footer>
</body>
</html>