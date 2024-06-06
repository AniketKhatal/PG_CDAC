<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AdditionFirst</title>
</head>
<body>
<%!
int a,b,c;
%>
<%
    try {
        int a = 100;
        int b = 200;
        int c = a + b;
        out.println("<h1>The Addition is: " + c + "</h1>");
    } catch (Exception e) {
       // e.printStackTrace(out);
    }
%>
<h1>The Addition is &nbsp; <%=c%></h1>
</body>
</html>