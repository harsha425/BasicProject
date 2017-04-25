<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="allInfo" class="com.hareesh.vo.PersonInfo" scope="session">  </jsp:useBean>
 FirstName: <jsp:getProperty property="firstName" name="allInfo"/><br>
  LastName: <jsp:getProperty property="lastName" name="allInfo"/><br>
   MiddleName: <jsp:getProperty property="middleName" name="allInfo"/><br>
  Gender: <jsp:getProperty property="gender" name="allInfo"/><br>
   Street: <jsp:getProperty property="street" name="allInfo"/><br>
  Apt: <jsp:getProperty property="apt" name="allInfo"/><br>
   City: <jsp:getProperty property="city" name="allInfo"/><br>
    State: <jsp:getProperty property="state" name="allInfo"/><br>
  Country: <jsp:getProperty property="country" name="allInfo"/><br>
    SSN: <jsp:getProperty property="ssn" name="allInfo"/><br>
  Account: <jsp:getProperty property="account" name="allInfo"/><br>
   Bank: <jsp:getProperty property="bank" name="allInfo"/><br>
</body>
</html>