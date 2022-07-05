<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Core예제</title>
</head>
<body>
	<c:set var="num1" value="36"/>
	<c:set var="num2" value="3"/>
	<h1>1. JSTL 변수</h1>
	num1<br>num2
	
	<h1>2. JSTL 연산</h1>
	${num1+num2}<br>
	${num1-num2}<br>
	${num1*num2}<br>
	${num1/num2}<br>
	${num1%num2}<br>
	
	<h1>3. Core out</h1>
	<c:out value="<title>core out</title>" />
	
	<h1>4. If문</h1>
	<c:if test="${(num1 + num2) / 2 >= 10}">
		<h1>${(num1 + num2) / 2}</h1>
	</c:if>
	<c:if test="${(num1 + num2) / 2 < 10}">
		<h3>${(num1 + num2) / 2}</h3>
	</c:if>
	
	<h1>5. core if</h1>
	<c:if test="${num1 * num2 > 100}">
		<c:out value="<script>alert('너무 큰 수 입니다.');</script>" escapeXml="false"  />
	</c:if>
</body>
</html>