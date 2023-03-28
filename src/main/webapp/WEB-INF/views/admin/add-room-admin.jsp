<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<title>Thêm mới phòng</title>


<body>
	<div
		style="border-radius: 5px; background-color: #f2f2f2; padding: 20px;">

		<h3 style="color: red;">Create Room</h3>

		<hr />
		<form:form action="add-room" method="POST" modelAttribute="room"
			enctype="multipart/form-data">
			<label for="id_typeroom">Loại phòng</label>
			<br />

			<form:select id="form3Example8" path="id_typeroom">
				<c:forEach var="item" items="${typeRoom }">
					<form:option value="${item.id }">${item.name }</form:option>
				</c:forEach>
			</form:select>
			<br />
			

			<label for="name">Tên phòng</label>
			<form:input type="text" path="name" id="form3Example8"
				class="form-control form-control-lg" />

			<label for="img">Hình ảnh</label>
			<form:input type="file" path="files" id="form3Example8"
				class="form-control form-control-lg" />

			<label for="price">Giá thuê</label>
			<form:input type="text" path="price" id="form3Example8"
				class="form-control form-control-lg" />

			<label for="sizes">Kích thước (m2)</label>
			<form:input type="text" path="sizes" id="form3Example8"
				class="form-control form-control-lg" />

			<label for="guests">Số lượng khách</label>
			<form:input type="number" path="guests" id="form3Example8"
				class="form-control form-control-lg" />

			<label for="services">Dịch vụ</label>
			<form:input type="text" path="services" id="form3Example8"
				class="form-control form-control-lg" />

			<label for="description">Mô tả</label>
			<form:input type="text" path="description" id="form3Example8"
				class="form-control form-control-lg" />

			<input type="submit" value="Thêm">
		</form:form>
	</div>

	<style>
input[type=text], [type=number], select {
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
