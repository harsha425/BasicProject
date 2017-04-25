<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="/jsp/Errors.jsp" %>
<form:form modelAttribute="datar" method="post" action="bankInfo.do">
<table>
	<tr>
		<td><form:label path="ssn"> SSN : </form:label></td>
		<td><form:input path="ssn"/></td>
	</tr>
	
	<tr>
		<td><form:label path="account"> Account: </form:label></td>
		<td><form:input path="account"/></td>
	</tr>
	
	<tr>
		<td><form:label path="bank"> Bank: </form:label></td>
		<td><form:input path="bank"/></td>
	</tr>
	
	<tr><td colspan="2"><input type="submit" value="Next"/>

</table>
</form:form>
</body>
</html>