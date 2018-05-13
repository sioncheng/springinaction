<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h1>spittles</h1>
    <c:forEach items="${spittleList}" var="spittle">
        <li id="">
            <div class="spittleMessage">
                <c:out value="${spittle.message}" />
            </div>
        </li>
    </c:forEach>
</body>
</html>