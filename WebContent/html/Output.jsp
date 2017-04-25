<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
FirstName:<%= session.getAttribute("fn") %><br>
LastName: <%= session.getAttribute("ln") %><br>
MiddleName: <%= session.getAttribute("mn") %><br>
Gender: <%= session.getAttribute("gender") %><br>
Street: <%= session.getAttribute("str") %><br>
Apt: <%= session.getAttribute("apt") %><br>
City: <%= session.getAttribute("city") %><br>
State: <%= session.getAttribute("state") %><br>
Country: <%= session.getAttribute("country") %><br>
SSN: <%= session.getAttribute("ssn") %><br>
Bank: <%= session.getAttribute("bank") %><br>
Account: <%= session.getAttribute("acc") %><br>
</body>
</html>