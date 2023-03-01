<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<title>Phòng nghỉ</title>

<body>
	<!-- Breadcrumb Section Begin -->
	<div class="breadcrumb-section">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="breadcrumb-text">
						<h2>Phòng nghỉ</h2>
						<div class="bt-option">
							<a href="/SpringProject/trang-chu">Trang chủ</a> <span>Phòng
								nghỉ</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Breadcrumb Section End -->

	<!-- Rooms Section Begin -->
	<section class="rooms-section spad">
		<div class="container">
			<div class="row">
				<c:forEach var="item" items="${typeRoom }">
					<div class="col-lg-4 col-md-6">
						<div class="room-item">
							<img
								src="<c:url value="/assets/user/img/typeroom/${item.img }"/>"
								alt="">
							<div class="ri-text">
								<h4>${item.name }</h4>
								<p>${item.description }</p>
								<a href="<c:url value="/phong-nghi/type-room=${item.name }"/>" class="primary-btn">Xem thêm</a>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</section>
	<!-- Rooms Section End -->
</body>
</html>