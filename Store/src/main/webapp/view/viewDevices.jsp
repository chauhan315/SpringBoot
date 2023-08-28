<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${devices.brandName} Devices</title>
</head>
<body>
	<h3>List of ${devices.brandName}</h3>  <hr>

	<ul>
	<c:forEach var="device" items="${devices.devices}">
		<li> Name: ${device.name},  Category: ${device.type},  Ram: ${device.ram} </li>
	
	</c:forEach>
	</ul>
</body>
</html>