<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="" rel="stylesheet">
    <title> List todo page</title>
   \META-INF\resources\webjars\jquery\3.6.3\jquery.min.js
</head>
    <body>
        <div>Welcome ${name}</div>
        <hr>
        <h1>Your todos</h1>
            <table>
                <thead>
                    <tr>
                        <th>id</th>
                        <th>Description</th>
                        <th>Target Date</th>
                        <th>Is Done?</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${todos}" var="todo">
                        <tr>
                            <td>${todo.id}</td>
                            <td>${todo.description}</td>
                            <td>${todo.targetDate}</td>
                            <td>${todo.done}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
    </body>

</html>