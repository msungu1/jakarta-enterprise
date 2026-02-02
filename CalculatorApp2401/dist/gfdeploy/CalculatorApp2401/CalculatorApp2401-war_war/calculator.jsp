<%-- 
    Document   : calculator
    Created on : May 7, 2025, 3:02:54 PM
    Author     : m.dossa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.adse2401.CalculatorRemote, javax.naming.InitialContext" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADSE2401 - Calculator Client</title>
    </head>
    <body>
        <h1>Calculator Page</h1>
        <form method="POST">
            Number 1: <br /> <input type="text" name="num1" /> <br />
            Number 2: <br /> <input type="text" name="num2" /> <br />
            <input type="submit" value="Add number"/>
            <!-- Java code to handle the request to the remote server -->
            <%
                if ("POST".equalsIgnoreCase(request.getMethod())) {
                    try {
                        int num1 = Integer.parseInt(request.getParameter("num1"));
                        int num2 = Integer.parseInt(request.getParameter("num2"));

                        InitialContext ctx = new InitialContext();
                        CalculatorRemote calc = (CalculatorRemote) ctx.lookup("java:global/CalculatorApp2401/CalculatorApp2401-ejb/CalculatorBean!com.adse2401.CalculatorRemote");

                        int result = calc.addNumbers(num1, num2);
            %>
            <h2>Result: <%= result%></h2>
            <%
            } catch (Exception ex) {
                ex.printStackTrace();
            %>
            <h2>Error: <%= ex.getLocalizedMessage()%></h2>
            <%
                    }
                }
            %>
        </form>
    </body>
</html>
