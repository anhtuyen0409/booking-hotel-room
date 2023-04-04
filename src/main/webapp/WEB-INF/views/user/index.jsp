<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<title>TM Luxury - Đặt phòng khách sạn giá rẻ</title>
<body>

	<!-- Hero Section Begin -->
	<section class="hero-section">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="hero-text">

						<c:forEach var="item" items="${slides }" varStatus="index">
							<c:if test="${index.first }">
								<h1>${item.caption }</h1>
								<p>${item.content }</p>
							</c:if>


						</c:forEach>

						<a href="#" class="primary-btn">Discover Now</a>
					</div>
				</div>
				<div class="col-xl-4 col-lg-5 offset-xl-2 offset-lg-1">
					<div class="booking-form">
						<h3>Booking Your Hotel</h3>
						<form action="">
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
								<label for="guest">Type Room:</label> <select id="guest">

									<c:forEach var="item" items="${typeRoom }">
										<option value="${item.id }">${item.name }</option>
									</c:forEach>

								</select>
							</div>
							
							<button type="submit">Check Availability</button> 
				
						</form>

					</div>
				</div>
			</div>
		</div>
		<div class="hero-slider owl-carousel">

			<c:forEach var="item" items="${slides }">
				<div class="hs-item set-bg"
					data-setbg="<c:url value="/assets/user/img/hero/${item.img }"/>"></div>
			</c:forEach>

		</div>
	</section>
	<!-- Hero Section End -->

	<!-- About Us Section Begin -->
	<section class="aboutus-section spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="about-text">
						<div class="section-title">

							<h2>GIỚI THIỆU TM LUXURY - QUY NHON</h2>
						</div>
						<p class="f-para">TM Luxury Quy Nhơn – nơi bạn có những trải
							nghiệm chan hoà cùng thiên nhiên và cân bằng cho cuộc sống. Là
							nơi bình yên và thư thái dành cho bạn và gia đình.</p>
						<p class="s-para">TM Luxury Quy Nhơn tạo dựng các khu nghỉ
							dưỡng và khách sạn hướng biển với dấu ấn đặc trưng toàn diện, từ
							khâu lên ý tưởng, thiết kế, xây dựng, quản lý đến vận hành thông
							qua ý tưởng độc đáo kết hợp giữa nghỉ dưỡng và chăm sóc sức khoẻ,
							thuận tiện mọi lúc mọi nơi.</p>
						<a href="#" class="primary-btn about-btn">Xem thêm</a>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="about-pic">
						<div class="row">
							<div class="col-sm-12">
								<img src="<c:url value="/assets/user/img/about/about-3.jpg"/>"
									alt="">
							</div>
							<!--<div class="col-sm-6">
								<img src="<c:url value="/assets/user/user/img/about/about-4.jpg"/>"
									alt="">
							</div>-->
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- About Us Section End -->

	<!-- Services Section End -->
	<section class="services-section spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="section-title">

						<h2>Dịch vụ của chúng tôi</h2>
					</div>
				</div>
			</div>
			<div class="row">

				<c:forEach var="item" items="${services }">
					<div class="col-lg-4 col-sm-6">
						<div class="service-item">
							<img
								src="<c:url value="/assets/user/img/services/${item.img }"/>"
								alt="">
							<h4>${item.name }</h4>
						</div>
					</div>
				</c:forEach>

			</div>
		</div>
	</section>
	<!-- Services Section End -->

	<!-- Home Room Section Begin -->
	<section class="hp-room-section">
		<div class="container-fluid">
			<div class="hp-room-items">
				<div class="row">
					<div class="col-lg-12">
						<div class="section-title">
							<h2>Danh sách phòng mới</h2>
							<br />
						</div>
					</div>

					<c:forEach var="item" items="${newRooms }">
						<div class="col-lg-3 col-md-4">
							<div class="hp-room-item set-bg">
								<img src="<c:url value="/assets/user/img/room/${item.img }"/>"
									alt="" style="width: 400px; height: 500px;">
								<div class="hr-text">
									<h3>${item.name }</h3>
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
										</tbody>
									</table>
									<a href="#" class="primary-btn">Xem chi tiết</a>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</section>
	<!-- Home Room Section End -->

	<!-- Blog Section Begin -->
	<section class="blog-section spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="section-title">
						<h2>Bài viết mới</h2>
					</div>
				</div>
				<div class="row">
					<c:forEach var="item" items="${newPosts }">
						<div class="col-lg-4">
							<div class="blog-item set-bg">
								<img src="<c:url value="/assets/user/img/post/${item.img_1 }"/>"
									alt="" style="width: 400px; height: 450px;">
								<div class="bi-text">
									<h4>
										<a href="<c:url value="/bai-viet/id-post=${item.id }"/>">${item.title }</a>
									</h4>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</section>
	<!-- Blog Section End -->

</body>
