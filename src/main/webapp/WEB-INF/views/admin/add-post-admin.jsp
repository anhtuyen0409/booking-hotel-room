<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<title>Thêm mới bài viết</title>


<body>
	<div
		style="border-radius: 5px; background-color: #f2f2f2; padding: 20px;">

		<h3 style="color: red;">Create Posts</h3>

		<hr />
		<form:form action="add-post" method="POST" modelAttribute="post"
			enctype="multipart/form-data">
			<label for="title">Tiêu đề</label>
			<form:input type="text" path="title" id="form3Example8"
				class="form-control form-control-lg" />
			<label for="content">Nội dung</label>
			<form:input type="text" path="content" id="form3Example8"
				class="form-control form-control-lg" />
			<label for="img_1">Hình ảnh 1</label>
			<form:input type="file" path="files_1" id="form3Example8"
				class="form-control form-control-lg" />
			<label for="img_2">Hình ảnh 2</label>
			<form:input type="file" path="files_2" id="form3Example8"
				class="form-control form-control-lg" />
			<label for="img_3">Hình ảnh 3</label>
			<form:input type="file" path="files_3" id="form3Example8"
				class="form-control form-control-lg" />
			<label for="img_4">Hình ảnh 4</label>
			<form:input type="file" path="files_4" id="form3Example8"
				class="form-control form-control-lg" />

			<input type="submit" value="Thêm">
		</form:form>
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
