<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

body{
margin:0px;
background-color: rgb(120,153,173);
}
	.bg-img{
		
		display: flex;
		position: absolute;
		background-position: center;
		background-repeat: no-repeat;
		background-size: cover;
		
	}
	
	.background{
		width: 1518px;
		height: 100px;
	}
	
	.mainContainer{
		display: flex;
		position: relative;
		align-content: center;
	}
	
	.banner{
		display:flex;
		flex:1;
		color: white;
		font-size: 24px;
	}
	
	.empty{
		display:flex;
		flex:1;
	}
	
	.links{
		display:flex;
		flex:1;
		justify-content: space-between;
		margin: 20px 10px;
		align-content: center;
	}
	
	#linktag{
		text-decoration: none;
		font-size: 24px;
		color: whitesmoke;
	}

</style>
</head>
<body>
	<div class="mainContainer">
		<div class="banner"><h3><marquee>Welcome to Student Management System</marquee></h3></div>
		<div class="empty"></div>
		<div class="links">
			<div><a href="Insert.jsp" class="btn btn-primary btn-lg" name="button" target="frame2" id="linktag">Insert</a></div>
			<div><a href="delete.jsp" class="btn btn-primary btn-lg" name="button" target="frame2" id="linktag">Delete</a></div>
			<div><a href="update.jsp" class="btn btn-primary btn-lg" name="button" target="frame2" id="linktag">Update</a></div>
			<div><a href="view.jsp"   class="btn btn-primary btn-lg" name="button" target="frame2" id="linktag">View</a></div>
		
		</div>
	
	</div>	

</body>
</html>