<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String errors = (String)request.getSession().getAttribute("errors"); %>
<font color="red"> Please correct those errors..</font><br>

<font color="black"><%=errors %></font>
<%request.getSession().removeAttribute("errors");%>
<br><br>
</body>
</html>