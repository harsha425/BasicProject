<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal Info</title>
</head>
<body>
<%@include file="/jsp/Errors.jsp" %>
<form:form modelAttribute="allInfo" method="post" action="personInfo.do">
<table>
	<tr>
		<td><form:label path="firstName"> First Name: </form:label></td>
		<td><form:input path="firstName"/></td>
	</tr>
	
	<tr>
		<td><form:label path="lastName"> Last Name: </form:label></td>
		<td><form:input path="lastName"/></td>
	</tr>
	
	<tr>
		<td><form:label path="middleName"> Middle Name: </form:label></td>
		<td><form:input path="middleName"/></td>
	</tr>
	
	<tr>
		<td><form:label path="gender"> Gender: </form:label></td>
		<td><form:radiobutton path="gender" value="Male"/> Male</td>
		<td><form:radiobutton path="gender" value="FeMale"/>Female</td>
	</tr>
	
	<tr><td colspan="2"><input type="submit" value="Next"/>

</table>
</form:form>
</body>
</html>