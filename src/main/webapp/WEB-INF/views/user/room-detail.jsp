<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<title>Chi tiết phòng</title>

<body>
	<!-- Breadcrumb Section Begin -->
	<div class="breadcrumb-section">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="breadcrumb-text">
						<h2>Thông tin chi tiết</h2>
						<div class="bt-option">
							<a href="/SpringProject/phong-nghi/">Phòng nghỉ</a> <span>Thông
								tin chi tiết</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Breadcrumb Section End -->

	<!-- Room Details Section Begin -->
	<section class="room-details-section spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-10">
					<c:forEach var="item" items="${roomDetail }">
						<div class="room-details-item">
							<img src="<c:url value="/assets/user/img/room/${item.img }"/>"
								alt="" style="width: 1000px; height: 400px;">
							<div class="rd-text">
								<div class="rd-title">
									<h3>${item.name }</h3>
									<div class="rdt-right">
										<c:if test="${empty LoginInfo }">
											<h3 style="color: red;">Vui lòng đăng nhập để đặt phòng!</h3>
										</c:if>
										<c:if test="${not empty LoginInfo }">
											<a href="<c:url value="/dat-phong/id-room=${item.id }"/>">Đặt
												phòng ngay </a>
										</c:if>

									</div>
								</div>
								<h2>
									<fmt:formatNumber type="number" groupingUsed="true"
										value="${item.price }" />
									đ<span>/ngày đêm</span>
								</h2>
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

										<tr>
											<td class="r-o">Services:</td>
											<td>${item.services }</td>
										</tr>
									</tbody>
								</table>
								<p class="f-para">${item.description }</p>
							</div>
						</div>
					</c:forEach>

					<div class="rd-reviews">
						<h4>Đánh giá của khách</h4>
						<c:forEach var="item" items="${comments }">
							<div class="review-item">
								<div class="ri-pic">
									<img
										src="<c:url value="/assets/user/img/avatar/${item.avatar }"/>"
										alt="">
								</div>
								<div class="ri-text">
									<h5>${item.name }</h5>
									<p>${item.content }</p>
								</div>
							</div>
						</c:forEach>
					</div>
					<div class="review-add">
						<c:if test="${empty LoginInfo }">
							<h4 style="color: red;">Vui lòng đăng nhập để bình luận!</h4>
						</c:if>
						<c:if test="${not empty LoginInfo }">
							<h4>Đánh giá của bạn</h4>
							<form action="#" class="ra-form">
								<div class="row">
									<div class="col-lg-12">
										<textarea placeholder="Nhập bình luận ở đây"></textarea>
										<button type="submit">Submit Now</button>
									</div>
								</div>
							</form>
						</c:if>
					</div>
				</div>
				<!--<c:forEach var="item" items="${roomDetail }">
					<div class="col-lg-4">
						<div class="room-booking">
							<c:if test="${empty LoginInfo }">
								<h3 style="color: red;">Vui lòng đăng nhập để đặt phòng!</h3>
							</c:if>
							<c:if test="${not empty LoginInfo }">
								<!-- <h3>Thông tin đặt phòng</h3>
								<form action="#">
									<div class="check-date">
										<label for="date-in">Check In:</label> <input type="text"
											class="date-input" id="date-in"> <i
											class="icon_calendar"></i>
									</div>
									<div class="check-date">
										<label for="date-out">Check Out:</label> <input type="text"
											class="date-input" id="date-out"> <i
											class="icon_calendar"></i>
									</div>
									<div class="select-option">
										<label for="guest">Guests:</label> <select id="guest">
											<option value="">${item.guests }guests</option>
										</select>
									</div>
									<div class="select-option">
										<label for="room">Room:</label> <select id="room">
											<option value="">1 Room</option>
										</select>
									</div>
								<div style="position: relative;">
									<button style="position: absolute; right: 0;" type="button"
										class="btn btn-warning">
										<a href="<c:url value="/phong-nghi/add-booking"/>">Đặt
											phòng ngay </a>
									</button>
								</div>

								<!--</form>
							</c:if>
						</div>
					</div>
				</c:forEach>-->
			</div>
		</div>
	</section>
	<!-- Room Details Section End -->
</body>