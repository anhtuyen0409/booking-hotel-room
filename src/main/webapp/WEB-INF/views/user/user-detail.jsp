<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<title>Cập nhật thông tin cá nhân</title>

<body>
	<div
		style="border-radius: 5px; background-color: #f2f2f2; padding: 20px;">

		<h3 style="color: red;">Cập nhật thông tin cá nhân</h3>
		<hr />
		<c:if test="${not empty userDetail }">
			<form:form action="id-user=${userDetail.id }" method="POST"
				modelAttribute="userDetail" enctype="multipart/form-data">

				<label for="name">Họ tên</label>
				<form:input type="text" path="name" id="form3Example8"
					class="form-control form-control-lg"
					placeholder="${userDetail.name }" />
				<label for="avatar">Ảnh đại diện</label>
				<form:input type="file" path="files" id="form3Example8"
					class="form-control form-control-lg"
					placeholder="${userDetail.avatar }" />

				<label for="birthday">Ngày sinh</label>
				<form:input type="date" path="birthday" id="form3Example8"
					class="form-control form-control-lg"
					placeholder="${userDetail.birthday }" />
				<label for="phone">Số điện thoại</label>
				<form:input type="number" path="phone" id="form3Example8"
					class="form-control form-control-lg"
					placeholder="${userDetail.phone }" />
				<input type="submit" value="Cập nhật">


			</form:form>
			<!--<div style="width: 50%;">
			<img
				src="<c:url value="/assets/user/img/blog/blog-6.jpg"/>"alt="Update" />-->
		</div>
		</c:if>
		
	</div>

	<style>
input[type=text], [type=date], [type=file], [type=number], select {
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
