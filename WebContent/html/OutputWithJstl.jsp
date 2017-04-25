<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
FirstName: <c:out value="${allInfo.firstName}"></c:out>
Middle Name: ${allInfo.middleName }<br>
Last Name: ${allInfo.lastName }<br>
Gender:${allInfo.gender}<br>
Street:${allInfo.street}<br>
Apartment: ${allInfo.apt }<br>
City: ${allInfo.city }<br>
State:${allInfo.state}<br>
Country:${allInfo.country}<br>
SSN: ${allInfo.ssn }<br>
Account:${allInfo.account}<br>
Bank:${allInfo.bank}<br>

</body>
</html>

	