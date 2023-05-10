<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>전체 회원 리스트</title>
</head>
<body>
	<h2>전체 회원 리스트</h2>
	<hr>
	<c:forEach items="${memberDtos }" var="memberDto">
		학번 : ${memberDto.hakbun }<br>
		이름 : ${memberDto.name }<br>
		나이 : ${memberDto.age }<br>
		학년 : ${memberDto.grade }<br>
		기타 : ${memberDto.etc }<br>
		<hr>
	</c:forEach>
	
</body>
</html>