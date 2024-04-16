<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style type="text/css">
body {<!--
	background-image: url(''); -->
	background-size: cover;
	font-size: 16px;
	margin-left: 30%;
	margin-top: 20px;
	font-weight: bold;
}

.form-group {
	display: -ms-flexbox;
	display: flex;
	width: 100%;
	margin-bottom: 15px;
}

.form-group>label {
	margin-right: 1rem;
	width: 4rem;
}

.card {
	box-shadow: 4px 4px 8px 8px rgba(0, 0, 0, 0.2);
	transition: 0.3s;
}

.card:hover {
	box-shadow: 5px 8px 16px 9px rgba(0, 0, 0, 0.2);
}

.icon {
	padding: 10px;
	background:;
	color: white;
	min-width: 50px;
	text-align: center;
}
</style>
</head>

<body>
	<div class="card w-50 ">
		<div class="card-header text-center">
			<h5>Enter the Car Details :</h5>
		</div>
		<div class="card-body ">

			<form action="Insertion" modelAttribute="bean">

				<div class="form-group">
					<label for="carId"> <i class="fa fa-id-card icon"></i></label> <input
						type="text" id="id" name="CarID" autocomplete="off"
						placeholder="Car ID" class="form-control" required="required" />
				</div>


				<div class="form-group">
					<label for="carModel"><i class="fa fa-book icon"></i></label> <input
						type="text" name="CarModel" autocomplete="off"
						placeholder="Car Model" class="form-control" required="required" />
				</div>

				<div class="form-group">
					<label for="carType"><i class="fa fa-book icon"></i></label> <input
						type="text" name="CarType" autocomplete="off"
						placeholder="Car Type" class="form-control" required="required" />
				</div>

				<div class="form-group">
					<label for="Rate per km"><i class="fa fa-book icon"></i></label> <input
						type="text" name="Rate_per_km" autocomplete="off"
						placeholder="Rate per KM" class="form-control" required="required" />
				</div>


				<div class="form-group">
					<label for="seatCapacity"><i class="fa fa-pencil icon"></i></label>
					<input type="text" name="Seat_Capacity" autocomplete="off"
						placeholder="Seat Capacity" class="form-control"
						required="required" />
				</div>


				<div class="form-group" style="text-align: right;">
					<button type="submit" class="btn btn-primary btn-md" name="button"
						value="insert">
						<i class="fa fa-plus"></i> Insert
					</button>
				</div>

			</form>

		</div>
	</div>
</body>
</html>