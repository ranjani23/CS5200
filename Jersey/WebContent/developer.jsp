<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Developer</h1>
<form method="get" action="rest/developer">
	<button>Get All Developers</button>
</form>
<form method="post" action="rest/developer">
	<input name="firstName" placeholder="First Name"/>
	<input name="lastName" placeholder="Last Name"/>
	<button>New Developer</button>
</form>
<form method="get" action="rest/developer">
	<input name="firstName" placeholder="First Name"/>
	<input name="lastName" placeholder="Last Name"/>
	<button>New Developer</button>
</form>
</body>
</html>