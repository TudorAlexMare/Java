<%@page import="model.Babbo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin view</title>
</head>
<body>

<% ArrayList<Babbo> listaBabbi = (ArrayList<Babbo>) request.getAttribute("key2"); %>

<table>
	<tbody>
		<tr>
			<th>nome</th>
			<th>mezzo di trasporto</th>
			<th>zona</th>
		</tr>
		
<% for(Babbo b :listaBabbi){ %>	

		<tr>
			<td><%=b.getUsername() %></td>
			<td><%=b.getMezzo() %></td>
			<td><%=b.getZona() %></td>
		</tr>

<%}%>
	</tbody>
</table>

<a href="index.jsp">home</a>
<a href="lista-doni">lista doni</a>
<a href="lista-babbi">lista babbi</a>
</body>
</html>