<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h2>Đăng ký thông tin</h2>
<form action="RegisterServlet" method="post" enctype="multipart/form-data">
  Họ tên: <input type="text" name="fullname"><br><br>

  Giới tính:
  <input type="radio" name="gender" value="Nam"> Nam
  <input type="radio" name="gender" value="Nữ"> Nữ
  <br><br>

  Sở thích: <br>
  <input type="checkbox" name="hobby" value="Đọc sách"> Đọc sách
  <input type="checkbox" name="hobby" value="Du lịch"> Du lịch
  <input type="checkbox" name="hobby" value="Thể thao"> Thể thao
  <br><br>

  Quốc gia:
  <select name="country">
    <option value="VN">Việt Nam</option>
    <option value="US">Mỹ</option>
    <option value="JP">Nhật Bản</option>
  </select>
  <br><br>

  Giới thiệu bản thân: <br>
  <textarea name="about" rows="5" cols="40"></textarea><br><br>

  Chọn ảnh đại diện: <input type="file" name="profilePic"><br><br>

  <input type="submit" value="Đăng ký">
</form>
</body>
</html>