<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page 3</title>
</head>
<body>

<table width="100%" height="100%">

<tr height="30%">
<td colspan="2"><jsp:include page="/header"></jsp:include></td>
</tr>
<tr height="60%">
<td width="30%"><%@include file="leftContent.html" %></td>
<td width="70%"><jsp:include page="Sport.jsp"/></td>
</tr>

<tr height="10%">
<td colspan="2"><%@include file="footer.html" %></td>
</tr>



</table>
</body>
</html>