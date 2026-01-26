<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>taskmanager - add task</title>
</head>
<body>
<h1>Add Task</h1>
<form:form modelAttribute="task">
    <form:label path="name">Task Name</form:label>
    <form:input path="name" />

    <form:label path="note">Task Notes</form:label>
    <form:input path="note" />

    <form:label path="isFinished">Is Finished?</form:label>
    <form:checkbox path="isFinished" />

    <input type="submit">
</form:form>
</body>
</html>