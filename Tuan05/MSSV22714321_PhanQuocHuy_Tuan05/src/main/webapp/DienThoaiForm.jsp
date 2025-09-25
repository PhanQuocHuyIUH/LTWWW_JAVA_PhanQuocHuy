<%--
  Created by IntelliJ IDEA.
  User: QUOC HUY
  Date: 25/09/2025
  Time: 3:01 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Thêm điện thoại</title></head>
<body>
<h2>Thêm sản phẩm mới</h2>
<form action="themsp" method="post" enctype="multipart/form-data">
    Mã ĐT: <input type="text" name="madt" required/><br/>
    Tên ĐT: <input type="text" name="tendt" required/><br/>
    Năm SX: <input type="number" name="namsx" required/><br/>
    Cấu hình: <input type="text" name="cauhinh" required/><br/>
    Nhà cung cấp (Mã): <input type="text" name="mancc" required/><br/>
    Hình ảnh: <input type="file" name="hinhanh" required/><br/>
    <input type="submit" value="Thêm"/>
</form>
</body>
</html>
