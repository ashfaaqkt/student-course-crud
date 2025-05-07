<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Add Student</title></head>
<body>
<h2>Add Student</h2>
<form action="/students" method="post">
    Name: <input type="text" name="name" required/><br/>
    Email: <input type="email" name="email" required/><br/>
    Course:
    <select name="course.id">
        <c:forEach var="course" items="${courses}">
            <option value="${course.id}">${course.title}</option>
        </c:forEach>
    </select><br/>
    <input type="submit" value="Add Student"/>
</form>
<a href="/students">Back to List</a>
</body>
</html>
