<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List,com.wipro.springboot.model.Customer"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>
<h1 style="text-align:center;color:blue;">CUSTOMER INFO</h1>

<%
	
List<Customer> customerList=(List<Customer>)request.getAttribute("customers");

	out.println("<table border=1 style='margin-left:30%'><tr><th>Id</th><th>Name</th><th>EmailId</th></tr>");
		for(Customer c:customerList){
			
			out.println("<tr><td>"+c.getId()+"</td><td>"+c.getName()+"</td><td>"+c.getEmailId()+"</td></tr>");
		}
		out.println("</table>");

%>

</div>
	

</body>
</html>