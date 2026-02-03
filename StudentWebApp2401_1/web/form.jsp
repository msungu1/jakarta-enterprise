<%-- 
    Document   : form
    Created on : May 20, 2025, 2:37:19 PM
    Author     : m.dossa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Web App 2401 - Add / Update Student</title>
    </head>
    <body>
        <h1>${student != null ? "Update exisitng" : "Add new"} Student</h1>
        <form method='post' action="students">
            <p>Student Number *: <br />
                <input required type='text' name="studentNo" value="${student.studentNo}" ${student != null ? "readonly" : ""} placeholder="Enter Student Number"/>
            </p>   
            <p>Student Name *: <br />
                <input required type='text' name="name" value="${student.name}" ${student != null ? "readonly" : ""} placeholder="Enter Student Name"/>
            </p>
            <p>Student Gender (M or F) *: <br />
                <select name="Gender">
                    <option value="M" ${student.gender == 'M' ? selected : ""}>Male</option>
                    <option value="F" ${student.gender == 'F' ? selected : ""}>Female</option>
                </select>
            </p>
            <p>Student Date of Birth *: <br />
                <input required type='date' name="Birthdate" value="${student.birthdate}" ${student != null ? "readonly" : ""} placeholder="Enter Student Date of Birth"/>
            </p>
            <input type="submit" name="${student != null ? "Update" : "Add"}" value=${student != null ? "Update" : "Add"}/>
        </form>
        <a href="students">Back to list</a>
    </body>
</html>
