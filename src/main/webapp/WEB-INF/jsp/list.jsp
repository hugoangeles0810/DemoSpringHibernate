<%-- 
    Document   : list
    Created on : 08/04/2016, 02:05:40 PM
    Author     : Hugo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="cp" scope="application" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact - List</title>
        <link rel="stylesheet" href="resources/css/materialize.min.css"/>
    </head>
    <body>
        <div class="container">
            <h1>Contact List</h1>
            
            <table class="highlight">
                <thead>
                    <tr>
                        <th>Firstname</th>
                        <th>Lastname</th>
                        <th>Email</th>
                        <th>Telephone</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="contact" items="${contacts}">
                        <tr>
                            <td>${contact.firstname}</td>
                            <td>${contact.lastname}</td>
                            <td>${contact.email}</td>
                            <td>${contact.telephone}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <a href="${cp}">Regresar</a>
        </div>
        <script src="resources/js/jquery.min.js"></script>
        <script src="resources/js/materialize.min.js"></script>
    </body>
</html>
