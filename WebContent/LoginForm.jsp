<%@ page language = "java" contentType = "text/html; charset= UTF-8"
pageEncoding = "UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	<style>
	body{
	background-color : pink;
	}


	</style>
</head>
<body>
<%
String msg = (String)Request.getAttribute("msg");
if(msg!=null){

%>
<label><b><%=msg%></b></label>
<%}%>
<!--  <form action = "Hello.jsp" method = "post">-->
	<form action = "LoginAction.java" method = "post">
		id : <input name = "id" type = "text" value = "" placeholder ="your id."><br>
		pwd: <input name="pwd" type="password" value="" placeholder="your password."><br>
			<input type="submit" value="OK">
	</form>
</body>
</html>