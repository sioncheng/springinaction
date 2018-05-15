<%@ page session="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h1>Register</h1>
    <form method="POST">
        First Name: <input type="text" name="firstName" /> <br/>
        Last Name: <input type="text" name="lastName" /> <br/>
        Username: <input type="text" name="username" /> <br/>
        Password: <input type="password" name="password" /> <br/>
        Profile Picture：<input type="file" name="profilePicture" accept="image/jpeg, image/png, image/gif" />
        <input type="submit" value="Register" />
    </form>
</body>
</html>