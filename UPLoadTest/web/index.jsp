<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/8/26
  Time: 10:25上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>测试上传文件</title>
  </head>
  <body>
    <form action="uploadServlet" enctype="multipart/form-data" method="post">
      上传图片：<input type="file" name="userPicture">
      <input type="submit" value="提交" />
    </form>
  </body>
</html>
