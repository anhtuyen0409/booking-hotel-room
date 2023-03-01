<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

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
							<a href="/SpringProject/phong-nghi/">Phòng nghỉ</a> <span>Thông tin chi tiết</span>
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
				<div class="col-lg-8">
					<c:forEach var="item" items="${roomDetail }">
						<div class="room-details-item">
							<img src="<c:url value="/assets/user/img/room/${item.img }"/>"
								alt="" style="width: 800px; height: 400px;">
							<div class="rd-text">
								<div class="rd-title">
									<h3>${item.name }</h3>
									<div class="rdt-right">
										<div class="rating">
											<i class="icon_star"></i> <i class="icon_star"></i> <i
												class="icon_star"></i> <i class="icon_star"></i> <i
												class="icon_star-half_alt"></i>
										</div>
										
									</div>
								</div>
								<h2>
									<fmt:formatNumber type="number" groupingUsed="true" value="${item.price }" /> đ<span>/ngày đêm</span>
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
						<h4>Đánh giá</h4>
						<div class="review-item">
							<div class="ri-pic">
								<img src="img/room/avatar/avatar-1.jpg" alt="">
							</div>
							<div class="ri-text">
								<span>27 Aug 2019</span>
								<div class="rating">
									<i class="icon_star"></i> <i class="icon_star"></i> <i
										class="icon_star"></i> <i class="icon_star"></i> <i
										class="icon_star-half_alt"></i>
								</div>
								<h5>Brandon Kelley</h5>
								<p>Neque porro qui squam est, qui dolorem ipsum quia dolor
									sit amet, consectetur, adipisci velit, sed quia non numquam
									eius modi tempora. incidunt ut labore et dolore magnam.</p>
							</div>
						</div>
						<div class="review-item">
							<div class="ri-pic">
								<img src="img/room/avatar/avatar-2.jpg" alt="">
							</div>
							<div class="ri-text">
								<span>27 Aug 2019</span>
								<div class="rating">
									<i class="icon_star"></i> <i class="icon_star"></i> <i
										class="icon_star"></i> <i class="icon_star"></i> <i
										class="icon_star-half_alt"></i>
								</div>
								<h5>Brandon Kelley</h5>
								<p>Neque porro qui squam est, qui dolorem ipsum quia dolor
									sit amet, consectetur, adipisci velit, sed quia non numquam
									eius modi tempora. incidunt ut labore et dolore magnam.</p>
							</div>
						</div>
					</div>
					<div class="review-add">
						<h4>Add Review</h4>
						<form action="#" class="ra-form">
							<div class="row">
								<div class="col-lg-6">
									<input type="text" placeholder="Name*">
								</div>
								<div class="col-lg-6">
									<input type="text" placeholder="Email*">
								</div>
								<div class="col-lg-12">
									<div>
										<h5>You Rating:</h5>
										<div class="rating">
											<i class="icon_star"></i> <i class="icon_star"></i> <i
												class="icon_star"></i> <i class="icon_star"></i> <i
												class="icon_star-half_alt"></i>
										</div>
									</div>
									<textarea placeholder="Your Review"></textarea>
									<button type="submit">Submit Now</button>
								</div>
							</div>
						</form>
					</div>
				</div>
				<c:forEach var="item" items="${roomDetail }">
					<div class="col-lg-4">
						<div class="room-booking">
							<h3>Thông tin đặt phòng</h3>
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
										<option value="">${item.guests } guests</option>
									</select>
								</div>
								<div class="select-option">
									<label for="room">Room:</label> <select id="room">
										<option value="">1 Room</option>
									</select>
								</div>
								<button type="submit">Đặt phòng</button>
							</form>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</section>
	<!-- Room Details Section End -->
</body>