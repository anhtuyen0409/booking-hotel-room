<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<title>Danh sách phòng Normal</title>

<body>
	<!-- Breadcrumb Section Begin -->
	<div class="breadcrumb-section">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="breadcrumb-text">
						<h2>Danh sách phòng Normal</h2>
						<div class="bt-option">
							<a href="/SpringProject/phong-nghi/">Phòng nghỉ</a> <span>Normal</span>
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
				<c:forEach var="item" items="${normalRooms }">
					<div class="col-lg-4 col-md-6">
						<div class="room-item">
							<img
								src="<c:url value="/assets/user/img/room/normal/${item.img }"/>"
								alt="">
							<div class="ri-text">
								<h4>${item.name }</h4>
								<h3>
									${item.price }<span>/ngày đêm</span>
								</h3>
								<table>
									<tbody>
										<tr>
											<td class="r-o">Size:</td>
											<td>${item.sizes }m2</td>
										</tr>
										<tr>
											<td class="r-o">Guests:</td>
											<td>${item.guests }</td>
										</tr>
									</tbody>
								</table>
								<a href="<c:url value="/phong-nghi/${item.name }"/>"
									class="primary-btn">More Details</a>
							</div>
						</div>
					</div>
				</c:forEach>
				<div class="col-lg-12">
					<div class="room-pagination">
						<a href="#">1</a> <a href="#">2</a> <a href="#">Next <i
							class="fa fa-long-arrow-right"></i></a>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Rooms Section End -->
</body>
