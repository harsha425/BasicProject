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
<form:form modelAttribute="datar" method="post" action="contactInfo.do">
<table>
	<tr>
		<td><form:label path="street"> Street : </form:label></td>
		<td><form:input path="street"/></td>
	</tr>
	
	<tr>
		<td><form:label path="apt"> Apt: </form:label></td>
		<td><form:input path="apt"/></td>
	</tr>
	
	<tr>
		<td><form:label path="city"> City: </form:label></td>
		<td><form:input path="city"/></td>
	</tr>
	
	<tr>
		<td><form:label path="state"> State: </form:label></td>
		<td><form:input path="state"/></td>
	</tr>
	
	<tr>
		<td><form:label path="country"> Country: </form:label></td>
		<td><form:input path="country"/></td>
	</tr>
	
	<tr><td colspan="2"><input type="submit" value="Next"/>

</table>
</form:form>
</body>
</html>