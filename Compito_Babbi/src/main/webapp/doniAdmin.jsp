<%@page import="model.Dono"%>
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

<% ArrayList<Dono> listaDoni = (ArrayList<Dono>) request.getAttribute("key1"); %>

<table>
	<tbody>
		<tr>
			<th>dono</th>
			<th>disponibilit√†</th>
		</tr>
<% for(Dono d :listaDoni){ %>		
		
		<tr>
			<td><%=d.getDescrizione() %></td>
			<td><%=d.getDisponibilita() %></td>
		</tr>
		
<%}%>
	
	</tbody>

</table>
<a href="index.jsp">home</a>
<a href="lista-doni">lista doni</a>
<a href="lista-babbi">lista babbi</a>
</body>
</html>