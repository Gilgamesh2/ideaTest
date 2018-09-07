<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-09-07
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table align="center">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
    </tr>
    <tr>
        <td>${user.no}</td>
        <td>${user.name}</td>
        <td>${user.age}</td>
    </tr>
    <input type="button" name="Submit" onclick="javascript:history.back(-1);" value="返回上一页">
</table>
</body>
</html>
