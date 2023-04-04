<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<title>Chi tiết đặt phòng</title>

<body>
	<!-- Breadcrumb Section Begin -->
	<div class="breadcrumb-section">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="breadcrumb-text">
						<h2>Chi tiết đặt phòng</h2>
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
				<div class="col-lg-8">
					<c:forEach var="item" items="${room }">
						<div class="room-details-item">
							<img src="<c:url value="/assets/user/img/room/${item.img }"/>"
								alt="" style="width: 800px; height: 400px;">
							<div class="rd-text">
								<div class="rd-title">
									<h3>${item.name }</h3>
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
				</div>
				<c:forEach var="item" items="${room }">
					<div class="col-lg-4">
						<div class="room-booking">
							<h3>Thông tin đặt phòng</h3>
							<form:form action="id-room=${item.id }" method="POST"
								modelAttribute="booking" enctype="multipart/form-data">
								<div class="check-date">
									<label for="date-in">Check In:</label>
									<form:input type="text" class="date-input" id="date-in"
										path="checkin" />
									<i class="icon_calendar"></i>
								</div>
								<div class="check-date">
									<label for="date-out">Check Out:</label>
									<form:input type="text" class="date-input" id="date-out"
										path="checkout" />
									<i class="icon_calendar"></i>
								</div>
								<div class="select-option">
									<label for="guest">Guests:</label> <select id="guest">
										<option value="${item.guests }">${item.guests }guests</option>
									</select>
								</div>
								<div class="select-option">
									<label for="room">Room:</label> <select id="room">
										<option value="">1 Room</option>
									</select>
								</div>
								<c:if test="${not empty LoginInfo }">
									<div class="select-option" style="display: none;">
										<form:select id="id_user" path="id_user">
											<form:option value="${LoginInfo.id }"></form:option>
										</form:select>
									</div>
									<div class="select-option" style="display: none;">
										<form:select id="name_user" path="name_user">
											<form:option value="${LoginInfo.name }"></form:option>
										</form:select>
									</div>
									<div class="select-option" style="display: none;">
										<form:select id="email" path="email">
											<form:option value="${LoginInfo.email }"></form:option>
										</form:select>
									</div>
								</c:if>

								<div class="select-option" style="display: none;">
									<form:select id="id_room" path="id_room">
										<form:option value="${item.id }"></form:option>
									</form:select>
								</div>
								<div class="select-option" style="display: none;">
									<form:select id="name_room" path="name_room">
										<form:option value="${item.name }"></form:option>
									</form:select>
								</div>
								<button type="submit">Đặt phòng</button>
								
							</form:form>

						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</section>
	<!-- Room Details Section End -->
</body>