<%--
  Created by IntelliJ IDEA.
  User: QUOC HUY
  Date: 25/09/2025
  Time: 3:01 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Quản lý điện thoại</title></head>
<body>
<h2>Quản lý điện thoại</h2>
<table border="1" cellpadding="5">
  <tr>
    <th>Mã</th><th>Tên</th><th>Năm SX</th><th>Cấu hình</th><th>Xóa</th>
  </tr>
  <c:forEach var="d" items="${listDT}">
    <tr>
      <td>${d.madt}</td>
      <td>${d.tendt}</td>
      <td>${d.namsx}</td>
      <td>${d.cauhinh}</td>
      <td>
        <form action="quanly" method="post">
          <input type="hidden" name="madt" value="${d.madt}"/>
          <input type="submit" value="Xóa"/>
        </form>
      </td>
    </tr>
  </c:forEach>
</table>
<a href="danhsach">Quay lại danh sách</a>
</body>
</html>

