<%@ page import="com.example.UserAuthenticate.ServletUtility" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 06-08-2021
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<h3 style="color: green;"><%=ServletUtility.getSuccessMessage(request)%></h3>
<h1>Welcome User</h1>
</body>
</html>
