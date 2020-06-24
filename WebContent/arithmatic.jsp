<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<%
	String start = request.getParameter("start");
	String end = request.getParameter("end");
	String step = request.getParameter("step");
%>


<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach var="n" begin="${param.start }" end="${param.end }" step="${param.step }">
		${n }
	</c:forEach>

</body>
</html>