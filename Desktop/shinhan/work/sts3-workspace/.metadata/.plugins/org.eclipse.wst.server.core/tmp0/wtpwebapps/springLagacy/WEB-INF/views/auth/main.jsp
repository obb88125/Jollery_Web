<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.servletContext.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>��������</h1>
	<ul>
		<li><a href="${path}/auth/login.do">�α���</a></li>
		<li><a href="${path}/emp/empList.do">������ȸ</a></li>
		<li><a href="${path}/emp/empInsert.do">�����Է�</a></li>
		<li><a href="${path}/dept/deptList.do">�μ���ȸ</a></li>
		<li><a href="${path}/dept/deptInsert.do">�μ��Է�</a></li>
	</ul>
</body>
</html>