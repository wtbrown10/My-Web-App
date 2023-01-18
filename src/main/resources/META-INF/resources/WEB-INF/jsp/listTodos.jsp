<%@include file="common/header.jspf" %>

        <%@include file="common/navigation.jspf" %>
            <div class="container">
                <div>Welcome ${name}</div>
                <hr>
                <h1>Your todos</h1>
                    <table class="table">
                        <thead>
                            <tr>
                                <th>id</th>
                                <th>Description</th>
                                <th>Target Date</th>
                                <th>Is Done?</th>
                                <th></th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${todos}" var="todo">
                                <tr>
                                    <td>${todo.id}</td>
                                    <td>${todo.description}</td>
                                    <td>${todo.targetDate}</td>
                                    <td>${todo.done}</td>
                                    <td><a href="delete-todos?id=${todo.id}" class="btn btn-warning">DELETE</a> </td>
                                    <td><a href="update-todos?id=${todo.id}" class="btn btn-success">Update</a> </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                <a href="add-todos" class="btn btn-success">Add To do</a>
            </div>
        <%@include file="common/footer.jspf" %>