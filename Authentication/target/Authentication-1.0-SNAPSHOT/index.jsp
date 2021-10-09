<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>


<html>
<body>
<form action="Register" method="post">

    Name:<input type="text" name="userName"/><br/><br/>
    Password:<input type="password" name="userPass"/><br/><br/>
    Email Id:<input type="text" name="userEmail"/><br/><br/>
    Country:
    <select name="userCountry">
        <option>India</option>
        <option>USA</option>
        <option>CANADA</option>
        <option>Other</option>
    </select>

    <br/><br/>
    <input type="submit" value="register"/>

</form>
<a href='Login.jsp'>click here to login if already registered!</a>
</body>
</html>