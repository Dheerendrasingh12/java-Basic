<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Discount</title>
</head>
<body>
	<% 
		float billAmt=Float.parseFloat(request.getParameter("billAmt"));
		
		float discount=billAmt*0.3f;
		
		float finalAmt=billAmt-discount;
	<a href="form.html">Home Page</a>
	 	
	 %>
	 
	 Item name: <%=request.getParameter("iname") %><br>
	 Bill Amt: <%=billAmt %><br>
	 Discount: <%=discount %><br>
	 Final Amount :<%=finalAmt %>
	 
	 
</body>

	 <a href="form.html">Home Page</a>
	 
</html>