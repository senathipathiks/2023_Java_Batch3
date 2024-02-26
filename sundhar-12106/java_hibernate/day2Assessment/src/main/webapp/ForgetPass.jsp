<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forget password</title>
</head>
<body>
	<div>
		<form action="" id="form">
			<label for="umail"></label> <input type="email" id="umail"
				name="umail" placeholder="xyz@gmail.com"><br> <input
				type="submit" value="get password">
		</form>
	</div>
	<script type="text/javascript">
	
	let form = document.getElementById("form")
	
	form.addEventListener("submit",e=>{
		e.preventDefault();
		alert("hello");
		form.setAttribute("action","ControllerServlet")
	})
		

		function submit() {
			console.log("I'm Working");
			
			console.log(form);
		}
	</script>
</body>
</html>