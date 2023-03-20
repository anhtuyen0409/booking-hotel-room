<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<title>Update Services</title>

<body>
	<div
		style="border-radius: 5px; background-color: #f2f2f2; padding: 20px;">

		<h3 style="color: red;">Update Services</h3>
		<hr />
		<c:if test="${not empty serviceDetail }">
			<form:form action="id-service=${serviceDetail.id }" method="POST"
				modelAttribute="serviceDetail" enctype="multipart/form-data">

				<label for="name">Tên dịch vụ</label>
				<form:input type="text" path="name" id="form3Example8"
					class="form-control form-control-lg"
					placeholder="${serviceDetail.name }" />
				<label for="img">Hình ảnh</label>
				<form:input type="file" path="files" id="form3Example8"
					class="form-control form-control-lg"
					placeholder="${serviceDetail.img }" />

				<input type="submit" value="Sửa">


			</form:form>
		</c:if>
	</div>

	<style>
input[type=text], select {
	width: 50%;
	padding: 12px 20px;
	margin: 8px 0;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=submit] {
	width: 50%;
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #45a049;
}
</style>
</body>
