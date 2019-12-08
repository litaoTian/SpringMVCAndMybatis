<%--
  Created by IntelliJ IDEA.
  User: TIAN
  Date: 2019/11/18
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <script src="https://code.jquery.com/jquery-3.0.0.min.js"></script>
  <script type="text/javascript">
    $(document).ready(function () {
      $('#button').click(function () {
        $.ajax({
          type:"GET",
          url:"showStudentsJSON",
          dataType:"json",
          success:function (data) {
            var show="";
            $.each(data,function (i,n) {
              show+="<tr><td>"+n["id"]+"</td><td>"+n["stuname"]+"</td><td>"+n["stuclass"]+"</td></tr>"
            })
            $('#result').html(show);
          }
        });
      })
    })
  </script>
  <body>
  <form action="insertStudents" method="post">
    学号：<input type="text" name="id"><br>
    姓名：<input type="text" name="stuname"><br>
    班级：<input type="text" name="stuclass"><br>
    <input type="submit" value="注册"><br>
  </form>
  <a href="showStudents">显示信息</a><br>
  <input type="submit"  id="button" value="显示所有的数据信息">
  <table border="1px" id="result">
    <tr>
      <td>学号</td>
      <td>姓名</td>
      <td>班级</td>
    </tr>
  </table>

  </body>
</html>
