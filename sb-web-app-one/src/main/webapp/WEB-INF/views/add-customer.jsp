<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h1 style="text-align: center; color: blue;">CUSTOMER-REG. FORM</h1>

	<form action="/MVCApp/add-customer" method="post">

		<label>CustomerId:</label> 
		<input type="text" name="id" placeholder="Id" /> <br /> 
		<label>CustomerName:</label> 
		<input	type="text" name="name" placeholder="Name" /> <br /> 
		<label>EmailId:</label>
		<input type="email" name="emailId" placeholder="Email" /> 
		<br /> <br />
		<input type="submit" name="s" value="AddCustomer" />

	</form>

</body>
</html>