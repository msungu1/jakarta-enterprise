<%-- 
    Document   : index
    Created on : May 20, 2025, 2:37:07 PM
    Author     : m.dossa
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Web App 2401 - Home</title>
    </head>
    <body>
        <h1>Student List</h1>
        <form method:"get" action="students">
            Search: <input type="text" placeholder="Enter keyword to search student" name="keyword"/>
            <input type="submit" value="search" />

            <!--LINK TO ADD NEW STUDENT-->
            <a href="form.jsp">Add new student</a><br/><br/>

            <!--TABLE TO DISPLAY THE STUDENTS DETAILS-->
            <table border="1">
                <tr>
                    <th>Student Number</th>
                    <th>Student Name</th>
                    <th>Student Date of Birth</th>
                    <th>Student Gender</th>
                    <th>Actions</th>
                </tr>
                <c:forEach var="s" items="${students}">
                    <tr>
                        <td>${s.studentNo}</td>
                        <td>${s.name}</td>
                        <td>${s.birthdate}</td>
                        <td>${s.gender}</td>
                        <td><a href="students?action=edit&Student_No=${s.studentNo}">Edit</a></td>
                        <td><a href="students?action=delete&Student_No=${s.studentNo}" onclick="return confirm('Delete this student ?');" >Delete</a></td>
                    </tr>
                </c:forEach>
            </table>
        </form>
    </body>
</html>
