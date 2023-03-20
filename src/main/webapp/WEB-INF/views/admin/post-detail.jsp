<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<title>Update Posts</title>

<body>
	<div
		style="border-radius: 5px; background-color: #f2f2f2; padding: 20px;">

		<h3 style="color: red;">Update Posts</h3>
		<hr />
		<c:if test="${not empty postDetail }">
			<form:form action="id-post=${postDetail.id }" method="POST"
				modelAttribute="postDetail" enctype="multipart/form-data">

				<label for="title">Tiêu đề</label>
				<form:input type="text" path="title" id="form3Example8"
					class="form-control form-control-lg"
					placeholder="${postDetail.title }" />
				<label for="content">Nội dung</label>
				<form:input type="text" path="content" id="form3Example8"
					class="form-control form-control-lg"
					placeholder="${postDetail.content }" />
				<label for="img_1">Hình ảnh 1</label>
				<form:input type="file" path="files_1" id="form3Example8"
					class="form-control form-control-lg"
					placeholder="${postDetail.img_1 }" />
				<label for="img_2">Hình ảnh 2</label>
				<form:input type="file" path="files_2" id="form3Example8"
					class="form-control form-control-lg"
					placeholder="${postDetail.img_2 }" />
				<label for="img_3">Hình ảnh 3</label>
				<form:input type="file" path="files_3" id="form3Example8"
					class="form-control form-control-lg"
					placeholder="${postDetail.img_3 }" />
				<label for="img_4">Hình ảnh 4</label>
				<form:input type="file" path="files_4" id="form3Example8"
					class="form-control form-control-lg"
					placeholder="${postDetail.img_4 }" />
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
