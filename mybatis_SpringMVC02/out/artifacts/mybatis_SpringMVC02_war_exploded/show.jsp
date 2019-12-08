<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: TIAN
  Date: 2019/11/18
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示学生信息</title>
</head>
<body>
    <h1>学生信息</h1>
    <table>
        <tr>
            <td>学号：</td>
            <td>姓名：</td>
            <td>班级：</td>

        </tr>
        <c:forEach items="${list}" var="list">
                <tr>
                    <td>${list.id}</td>
                    <td>${list.stuname}</td>
                    <td>${list.stuclass}</td>
                </tr>
        </c:forEach>
    </table>



</body>
</html>
