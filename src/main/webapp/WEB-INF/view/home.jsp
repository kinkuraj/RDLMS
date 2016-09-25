<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2>Welcome Home!</h2>
Message : <h2><%=request.getAttribute("message")%></h2> 
<%=session.getAttribute("lastLoggedIn") %>
<a href="<c:url value='/fetchJobList'></c:url>">Job</a>
</body>
</html>
