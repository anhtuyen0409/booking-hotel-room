<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
								<label for="guest">Type Room:</label> <select id="guest">

									<c:forEach var="item" items="${typeRoom }">
										<option value="">${item.name }</option>
									</c:forEach>

								</select>
							</div>
							<div class="select-option">
								<label for="room">Guests:</label> <select id="room">
									<option value="">1</option>
									<option value="">2</option>
									<option value="">3</option>
									<option value="">4</option>
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
				<!-- <c:url value="/assets/user/img/flag.jpg"/> img/about/about-1.jpg-->
				<div class="col-lg-6">
					<div class="about-pic">
						<div class="row">
							<div class="col-sm-6">
								<img src="<c:url value="/assets/user/img/about/about-1.jpg"/>"
									alt="">
							</div>
							<div class="col-sm-6">
								<img src="<c:url value="/assets/user/img/about/about-2.jpg"/>"
									alt="">
							</div>
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
						<span>What We Do</span>
						<h2>Discover Our Services</h2>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-4 col-sm-6">
					<div class="service-item">
						<i class="flaticon-036-parking"></i>
						<h4>Travel Plan</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna.</p>
					</div>
				</div>
				<div class="col-lg-4 col-sm-6">
					<div class="service-item">
						<i class="flaticon-033-dinner"></i>
						<h4>Catering Service</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna.</p>
					</div>
				</div>
				<div class="col-lg-4 col-sm-6">
					<div class="service-item">
						<i class="flaticon-026-bed"></i>
						<h4>Babysitting</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna.</p>
					</div>
				</div>
				<div class="col-lg-4 col-sm-6">
					<div class="service-item">
						<i class="flaticon-024-towel"></i>
						<h4>Laundry</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna.</p>
					</div>
				</div>
				<div class="col-lg-4 col-sm-6">
					<div class="service-item">
						<i class="flaticon-044-clock-1"></i>
						<h4>Hire Driver</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna.</p>
					</div>
				</div>
				<div class="col-lg-4 col-sm-6">
					<div class="service-item">
						<i class="flaticon-012-cocktail"></i>
						<h4>Bar & Drink</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna.</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Services Section End -->

	<!-- Home Room Section Begin -->
	<section class="hp-room-section">
		<div class="container-fluid">
			<div class="hp-room-items">
				<div class="row">
					<div class="col-lg-3 col-md-6">
						<div class="hp-room-item set-bg"
							data-setbg="<c:url value="/assets/user/img/room/room-b1.jpg"/>">
							<div class="hr-text">
								<h3>Double Room</h3>
								<h2>
									199$<span>/Pernight</span>
								</h2>
								<table>
									<tbody>
										<tr>
											<td class="r-o">Size:</td>
											<td>30 ft</td>
										</tr>
										<tr>
											<td class="r-o">Capacity:</td>
											<td>Max persion 5</td>
										</tr>
										<tr>
											<td class="r-o">Bed:</td>
											<td>King Beds</td>
										</tr>
										<tr>
											<td class="r-o">Services:</td>
											<td>Wifi, Television, Bathroom,...</td>
										</tr>
									</tbody>
								</table>
								<a href="#" class="primary-btn">More Details</a>
							</div>
						</div>
					</div>
					<div class="col-lg-3 col-md-6">
						<div class="hp-room-item set-bg"
							data-setbg="<c:url value="/assets/user/img/room/room-b2.jpg"/>">
							<div class="hr-text">
								<h3>Premium King Room</h3>
								<h2>
									159$<span>/Pernight</span>
								</h2>
								<table>
									<tbody>
										<tr>
											<td class="r-o">Size:</td>
											<td>30 ft</td>
										</tr>
										<tr>
											<td class="r-o">Capacity:</td>
											<td>Max persion 5</td>
										</tr>
										<tr>
											<td class="r-o">Bed:</td>
											<td>King Beds</td>
										</tr>
										<tr>
											<td class="r-o">Services:</td>
											<td>Wifi, Television, Bathroom,...</td>
										</tr>
									</tbody>
								</table>
								<a href="#" class="primary-btn">More Details</a>
							</div>
						</div>
					</div>
					<div class="col-lg-3 col-md-6">
						<div class="hp-room-item set-bg"
							data-setbg="<c:url value="/assets/user/img/room/room-b3.jpg"/>">
							<div class="hr-text">
								<h3>Deluxe Room</h3>
								<h2>
									198$<span>/Pernight</span>
								</h2>
								<table>
									<tbody>
										<tr>
											<td class="r-o">Size:</td>
											<td>30 ft</td>
										</tr>
										<tr>
											<td class="r-o">Capacity:</td>
											<td>Max persion 5</td>
										</tr>
										<tr>
											<td class="r-o">Bed:</td>
											<td>King Beds</td>
										</tr>
										<tr>
											<td class="r-o">Services:</td>
											<td>Wifi, Television, Bathroom,...</td>
										</tr>
									</tbody>
								</table>
								<a href="#" class="primary-btn">More Details</a>
							</div>
						</div>
					</div>
					<div class="col-lg-3 col-md-6">
						<div class="hp-room-item set-bg"
							data-setbg="<c:url value="/assets/user/img/room/room-b4.jpg"/>">
							<div class="hr-text">
								<h3>Family Room</h3>
								<h2>
									299$<span>/Pernight</span>
								</h2>
								<table>
									<tbody>
										<tr>
											<td class="r-o">Size:</td>
											<td>30 ft</td>
										</tr>
										<tr>
											<td class="r-o">Capacity:</td>
											<td>Max persion 5</td>
										</tr>
										<tr>
											<td class="r-o">Bed:</td>
											<td>King Beds</td>
										</tr>
										<tr>
											<td class="r-o">Services:</td>
											<td>Wifi, Television, Bathroom,...</td>
										</tr>
									</tbody>
								</table>
								<a href="#" class="primary-btn">More Details</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Home Room Section End -->

	<!-- Testimonial Section Begin -->
	<section class="testimonial-section spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="section-title">
						<span>Testimonials</span>
						<h2>What Customers Say?</h2>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-8 offset-lg-2">
					<div class="testimonial-slider owl-carousel">
						<div class="ts-item">
							<p>After a construction project took longer than expected, my
								husband, my daughter and I needed a place to stay for a few
								nights. As a Chicago resident, we know a lot about our city,
								neighborhood and the types of housing options available and
								absolutely love our vacation at Sona Hotel.</p>
							<div class="ti-author">
								<div class="rating">
									<i class="icon_star"></i> <i class="icon_star"></i> <i
										class="icon_star"></i> <i class="icon_star"></i> <i
										class="icon_star-half_alt"></i>
								</div>
								<h5>- Alexander Vasquez</h5>
							</div>
							<!-- <c:url value="/assets/user/img/room/room-b1.jpg"/> img/testimonial-logo.png-->
							<img src="<c:url value="/assets/user/img/testimonial-logo.png"/>"
								alt="">
						</div>
						<div class="ts-item">
							<p>After a construction project took longer than expected, my
								husband, my daughter and I needed a place to stay for a few
								nights. As a Chicago resident, we know a lot about our city,
								neighborhood and the types of housing options available and
								absolutely love our vacation at Sona Hotel.</p>
							<div class="ti-author">
								<div class="rating">
									<i class="icon_star"></i> <i class="icon_star"></i> <i
										class="icon_star"></i> <i class="icon_star"></i> <i
										class="icon_star-half_alt"></i>
								</div>
								<h5>- Alexander Vasquez</h5>
							</div>
							<img src="<c:url value="/assets/user/img/testimonial-logo.png"/>"
								alt="">
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Testimonial Section End -->

	<!-- Blog Section Begin -->
	<section class="blog-section spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="section-title">
						<span>Hotel News</span>
						<h2>Our Blog & Event</h2>
					</div>
				</div>
			</div>
			<!-- <c:url value="/assets/user/img/testimonial-logo.png"/> img/blog/blog-1.jpg-->
			<div class="row">
				<div class="col-lg-4">
					<div class="blog-item set-bg"
						data-setbg="<c:url value="/assets/user/img/blog/blog-1.jpg"/>">
						<div class="bi-text">
							<span class="b-tag">Travel Trip</span>
							<h4>
								<a href="#">Tremblant In Canada</a>
							</h4>
							<div class="b-time">
								<i class="icon_clock_alt"></i> 15th April, 2019
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="blog-item set-bg"
						data-setbg="<c:url value="/assets/user/img/blog/blog-2.jpg"/>">
						<div class="bi-text">
							<span class="b-tag">Camping</span>
							<h4>
								<a href="#">Choosing A Static Caravan</a>
							</h4>
							<div class="b-time">
								<i class="icon_clock_alt"></i> 15th April, 2019
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="blog-item set-bg"
						data-setbg="<c:url value="/assets/user/img/blog/blog-3.jpg"/>">
						<div class="bi-text">
							<span class="b-tag">Event</span>
							<h4>
								<a href="#">Copper Canyon</a>
							</h4>
							<div class="b-time">
								<i class="icon_clock_alt"></i> 21th April, 2019
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-8">
					<div class="blog-item small-size set-bg"
						data-setbg="<c:url value="/assets/user/img/blog/blog-wide.jpg"/>">
						<div class="bi-text">
							<span class="b-tag">Event</span>
							<h4>
								<a href="#">Trip To Iqaluit In Nunavut A Canadian Arctic
									City</a>
							</h4>
							<div class="b-time">
								<i class="icon_clock_alt"></i> 08th April, 2019
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="blog-item small-size set-bg"
						data-setbg="<c:url value="/assets/user/img/blog/blog-10.jpg"/>">
						<div class="bi-text">
							<span class="b-tag">Travel</span>
							<h4>
								<a href="#">Traveling To Barcelona</a>
							</h4>
							<div class="b-time">
								<i class="icon_clock_alt"></i> 12th April, 2019
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Blog Section End -->

</body>
