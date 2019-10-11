<%@ page import = "com.maker.connor.dto.ScheduleDto" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%request.setCharacterEncoding("utf-8");
response.setContentType("text/html; charset=utf-8");
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>교육 목록</title>
</head>
<body>
	<div>
		<h1>교육 목록</h1>
	</div>
	<div>
		<table>
			<tr>
				<th>교육</th>
			</tr>
			<c:choose>
				<c:when test="${empty list}">
					<tr><td colspan="10">-----가능한 교육 없음.-----</tr>
				</c:when>
				<c:otherwise>
					<c:forEach items="${list}" var="edu">
						<tr>
							<td>${schedule.sche_school}</td>
						</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>
</body>
</html>