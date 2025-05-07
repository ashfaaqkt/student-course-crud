<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Students List</title></head>
<body>
<h2>Students</h2>
<table border="1">
<tr><th>ID</th><th>Name</th><th>Email</th><th>Course</th><th>Actions</th></tr>
<c:forEach var="student" items="${students}">
<tr>
    <td>${student.id}</td>
    <td>${student.name}</td>
    <td>${student.email}</td>
    <td>${student.course.title}</td>
    <td><a href="/students/update/${student.id}">Edit</a></td>
</tr>
</c:forEach>
</table>
<a href="/students/add">Add Student</a>
</body>
</html>
