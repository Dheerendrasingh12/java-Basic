<%int a=12;
int square = a*a;%>
<jsp:forward page="B.jsp">
	<jsp:param value="<%=square %>" name="result1"/>	
	<jsp:param value="thinking in java" name="bookname"/>

</jsp:forward>

