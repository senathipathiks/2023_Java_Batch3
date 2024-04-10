<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@  taglib uri="jakarta.tags.core"  prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<style type="text/css">
select {
	margin-top: 10px;
	margin-bottom: 30px;
}

body {
	font-size: 24px;
}
</style>
</head>
<body>
	<div class="container-fluid" style="padding: 80px 0">
		<div class="container">
			<div class="row">
				<div class="col-md-6" style="display: flex; align-items: center; justify-content: center">
					<img alt="" src="https://t3.ftcdn.net/jpg/01/02/03/92/360_F_102039256_SipORuRpBYHXseiNFsvEKlF6uWpbKwYd.jpg" class="img-fluid">
				</div>
				<div class="col-md-6" style="margin: 80px 0">
					<form action="Deletion">
						<div class="form-group">
							<label class="control-label">Select Employee
								Id<br>
							</label>
							<div class="col-md-6">
								<select name="eid" class="form-control" required="required">
									<c:forEach var="id" items="${idList }">
										<option value="${id}">${id}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<input type="submit" class="btn btn-danger" value="Delete"
									name="button" />
							</div>
						</div>
					</form>
					${Msg}

				</div>
			</div>
		</div>
	</div>

</body>
</html>