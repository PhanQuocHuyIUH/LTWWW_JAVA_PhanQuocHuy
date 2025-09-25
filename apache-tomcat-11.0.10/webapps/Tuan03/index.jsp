<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Registration Form</h1>
<form action="registration-form" name="formDangKy" method="get">
    <table>
        <tr>
            <td><label for="firstName">First name</label></td>
            <td><input type="text" name="firstName" id="firstName"></td>
            <td><h5>(max 30 characters a-z and A-Z)</h5></td>
        </tr>
        <tr>
            <td><label for="lastName">Last name</label></td>
            <td><input type="text" name="lastName" id="lastName"></td>
            <td><h5>(max 30 characters a-z and A-Z)</h5></td>
        </tr>
        <tr>
            <td><label for="dateOfBirth">Day of birth</label></td>
            <td><input type="date" name="dateOfBirth" id="dateOfBirth"></td>
        </tr>
        <tr>
            <td><label for="email">Email</label></td>
            <td><input type="text" name="email" id="email"></td>
        </tr>
        <tr>
            <td><label for="mobileNumber">Mobile number</label></td>
            <td><input type="text" name="mobileNumber" id="mobileNumber"></td>
            <td><h5>(10 digit number)</h5></td>
        </tr>
        <tr>
            <td><label>Gender</label></td>
            <td>
                <label for="male">Male</label>
                <input type="radio" name="gender" id="male" value="Male">
            </td>
            <td>
                <label for="female">Female</label>
                <input type="radio" name="gender" id="female" value="Female">
            </td>
        </tr>
        <tr>
            <td><label>Address</label></td>
            <td><textarea name="address" cols="25" rows="5"></textarea></td>
        </tr>
        <tr>
            <td><label for="city">City</label></td>
            <td><input type="text" name="city" id="city"></td>
            <td><h5>(max 30 characters a-z and A-Z)</h5></td>
        </tr>
        <tr>
            <td><label for="pinCode">Pin code</label></td>
            <td><input type="text" name="pinCode" id="pinCode"></td>
            <td><h5>(6 digit number)</h5></td>
        </tr>
        <tr>
            <td><label for="state">State</label></td>
            <td><input type="text" name="state" id="state" placeholder="India"></td>
        </tr>
        <tr>
            <td><label>Hobbies</label></td>
            <td>
                <label for="drawing">Drawing</label>
                <input type="checkbox" name="drawing" id="drawing" value="Drawing">
            </td>
            <td>
                <label for="singing">Singing</label>
                <input type="checkbox" name="singing" id="singing" value="Singing">
            </td>
            <td>
                <label for="dancing">Dancing</label>
                <input type="checkbox" name="dancing" id="dancing" value="Dancing">
            </td>
            <td>
                <label for="sketching">Sketching</label>
                <input type="checkbox" name="sketching" id="sketching" value="Sketching">
            </td>
            <td>
<%--                if other checkbox checked set enable text field else disabled--%>
                <label for="other">Other</label>
                <input type="checkbox" name="other" id="other">
                <input type="text" name="otherHobby" id="otherHobby">
            </td>
        </tr>
        <tr>
            <td><label>Qualification</label></td>
        </tr>
        <tr>
            <td><label>Course applies for</label></td>
            <td>
                <label for="BCA">BCA</label>
                <input type="radio" name="course" id="BCA" value="BCA">
            </td>
            <td>
                <label for="B.Com">B.Com</label>
                <input type="radio" name="course" id="B.Com" value="B.Com">
            </td>
            <td>
                <label for="B.Sc">B.Sc</label>
                <input type="radio" name="course" id="B.Sc" value="B.Sc">
            </td>
            <td>
                <label for="B.A">B.A</label>
                <input type="radio" name="course" id="B.A" value="B.A">
            </td>
        </tr>
    </table>
    <div>
        <button type="submit">Submit</button>
        <button type="reset">Reset</button>
    </div>
</form>
</body>
</html>