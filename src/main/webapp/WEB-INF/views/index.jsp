<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-02-03
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <title>test</title>
  </head>
  <body>

  <div id="ck">1</div>
  <table align="center" border="1" cellspacing="0" cellpadding="0">
      <tr>
          <th>编号</th>
          <th>姓名</th>
          <th>年龄</th>
          <th>操作</th>
          <%--<th>操作</th>--%>
      </tr>
      <c:forEach items="${userList}" var="user">
      <tr>
         <td>${user.no}</td>
          <td>${user.name!=''?user.name:1}</td>
          <td>${user.age}</td>
          <td>

              <form action="delete">
                  <input type="text" name="no" value="${user.no}" hidden >
                  <input type="submit" value="删除" onclick="al('确认删除${user.no} 吗？')">

              </form>

              <input type="checkbox" value="${user.no}" name="ck"/>
          </td>
          <%--<td>--%>
          <%--<a href="delete?no=${user.no}">1</a>--%>
          <%--</td>--%>
      </tr>
      </c:forEach>
  </table>
  <input type="button" onclick="delAll()" value="1"/>
        <form  action="query" method="post">
           no: <input type="text" name="no" >
          <button type="submit" >submit</button>
        </form>
  </body>
<script  type="text/javascript">
    function al(msg){
        confirm(msg);
    }

    function delAll() {

        var arr = [];
        //根据 标签的name取得所有复选框
        var ck = document.getElementsByName("ck");
        //将已经选中的复选框放入数组中
        for (var i = 0; i < ck.length; i++) {
            if (ck[i].checked == true) {
                arr.push(ck[i].value);

            }
            alert(arr)


        }
    }

</script>
</html>
