<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="helloworld">helloworld</a>
<form action="${pageContext.request.contextPath}/helloworld" method="post">
       <input type="text" name="id" value="id">&nbsp;
       <input type="text" name="name" value="name">&nbsp;
       <input type="text" name="age" value="age">&nbsp;
       <input type="submit" value="提交数据">
    </form>
</body>
</html>