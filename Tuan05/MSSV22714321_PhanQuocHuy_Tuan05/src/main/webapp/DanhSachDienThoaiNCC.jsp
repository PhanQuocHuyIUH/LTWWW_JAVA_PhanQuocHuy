<%--
  Created by IntelliJ IDEA.
  User: QUOC HUY
  Date: 25/09/2025
  Time: 2:59 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Danh sách điện thoại</title></head>
<body>
<h2>Danh sách điện thoại</h2>
<table border="1" cellpadding="5">
  <tr>
    <th>Mã</th><th>Tên</th><th>Năm SX</th><th>Cấu hình</th><th>Hình ảnh</th><th>Nhà cung cấp</th>
  </tr>
  <c:forEach var="d" items="${listDT}">
    <tr>
      <td>${d.madt}</td>
      <td>${d.tendt}</td>
      <td>${d.namsx}</td>
      <td>${d.cauhinh}</td>
      <td><img src="uploads/${d.hinhanh}" width="100"/></td>
      <td>${d.nhaCungCap.tennhacc}</td>
    </tr>
  </c:forEach>
</table>
<a href="DienThoaiForm.jsp">Thêm sản phẩm</a> | <a href="quanly">Quản lý</a>
</body>
</html>

