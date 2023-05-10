<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 탈퇴</title>
</head>
<body>
	<h2>회원 탈퇴</h2>
	<hr>
	<form action="deleteOk">
		탈퇴할 회원 학번 입력 : <input type="text" name = "deleteHakbun"> 
		<input type="submit" value="탈퇴">
	</form>
	<form action="deleteOk2">
		탈퇴할 회원 이름 입력 : <input type="text" name = "deleteName"> 
		<input type="submit" value="탈퇴">
	</form>

</body>
</html>