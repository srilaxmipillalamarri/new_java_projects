<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%!
String productName="";
String modeOfTransport="";
%>
<%
productName=session.getAttribute("productname").toString();
modeOfTransport=request.getParameter("rbtrans");

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Congratulations</title>
</head>
<body>
<h1>Following are your order details</h1>
<h2>product name:<%=productName %></h2>
<h2>mode of transport :<%=modeOfTransport %></h2>
<h3>your product will be delivered very soon</h3>
</body>
</html>