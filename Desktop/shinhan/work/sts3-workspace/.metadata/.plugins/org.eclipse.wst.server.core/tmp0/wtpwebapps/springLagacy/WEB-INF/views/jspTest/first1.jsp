<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.servletContext.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>first1.jsp����</h1>

	<h2>POST ��û ����</h2>
	<form action="${path}/second3.do" method="post">
		id : <input type="text" name="userid" value="zzilre"> pw : <input
			type="text" name="userpw" value="qwer"> <input type="submit"
			value="������ ����(POST)">
	</form>

	<h2>request parameter check</h2>
	<form action="${path}/second4.do">
		id : <input type="text" name="userid" value="zzilre"> pw : <input
			type="text" name="userpw" value="qwer"> <input type="submit"
			value="������ ����(GET)">
	</form>
</body>
</html>