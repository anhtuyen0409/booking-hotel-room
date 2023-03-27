<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<title>Chi tiết bài viết</title>

<body>
	<c:forEach var="item" items="${postDetail }">
		<!-- Blog Details Hero Section Begin -->
		<section class="blog-details-hero set-bg"
			data-setbg="<c:url value="/assets/user/img/post/${item.img_1 }"/>">
			<div class="container">
				<div class="row">
					<div class="col-lg-10 offset-lg-1">
						<div class="bd-hero-text">
							<span>Travel Trip & Camping</span>
							<h2>${item.title }</h2>

						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- Blog Details Hero End -->

		<!-- Blog Details Section Begin -->
		<section class="blog-details-section">
			<div class="container">
				<div class="row">
					<div class="col-lg-10 offset-lg-1">
						<div class="blog-details-text">
							<div class="bd-title">${item.content}</div>
							<div class="bd-pic">
								<div class="bp-item">
									<img style="height: 200px;"
										src="<c:url value="/assets/user/img/post/${item.img_2 }"/>"
										alt="">
								</div>
								<div class="bp-item">
									<img style="height: 200px;"
										src="<c:url value="/assets/user/img/post/${item.img_3 }"/>"
										alt="">
								</div>
								<div class="bp-item">
									<img style="height: 200px;"
										src="<c:url value="/assets/user/img/post/${item.img_4 }"/>"
										alt="">
								</div>
							</div>

							<div class="tag-share">
								<div class="tags">
									<a href="#">Travel Trip</a> <a href="#">Camping</a> <a href="#">Event</a>
								</div>
								<div class="social-share">
									<span>Share:</span> <a href="#"><i class="fa fa-facebook"></i></a>
									<a href="#"><i class="fa fa-twitter"></i></a> <a href="#"><i
										class="fa fa-tripadvisor"></i></a> <a href="#"><i
										class="fa fa-instagram"></i></a> <a href="#"><i
										class="fa fa-youtube-play"></i></a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- Blog Details Section End -->
	</c:forEach>
</body>
