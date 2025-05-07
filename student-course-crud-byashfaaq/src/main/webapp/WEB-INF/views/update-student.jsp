<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Update Student</title></head>
<body>
<h2>Update Student</h2>
<form action="/students/update/${student.id}" method="post">
    Name: <input type="text" name="name" value="${student.name}" required/><br/>
    Email: <input type="email" name="email" value="${student.email}" required/><br/>
    Course:
    <select name="course.id">
        <c:forEach var="course" items="${courses}">
            <option value="${course.id}" ${course.id == student.course.id ? 'selected' : ''}>${course.title}</option>
        </c:forEach>
    </select><br/>
    <input type="submit" value="Update Student"/>
</form>
<a href="/students">Back to List</a>
</body>
</html>
