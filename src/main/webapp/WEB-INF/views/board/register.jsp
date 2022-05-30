<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<div class="container">
<form action="${pageContext.request.contextPath}/board/register" method="post">
글 제목 : <input type="text" name="title"><br>
작성자 : <input type="text" name="writer"><br>
<textarea rows="20" cols="80" name="content"></textarea>
<button>Register</button>
</form>
</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>