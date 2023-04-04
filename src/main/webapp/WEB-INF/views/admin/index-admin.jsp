<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<title>Trang quản trị</title>

<body>
	<!-- [ Layout content ] Start -->
	<div class="layout-content">

		<!-- [ content ] Start -->
		<div class="container-fluid flex-grow-1 container-p-y">
			<h4 class="font-weight-bold py-3 mb-0">Tổng quan</h4>

			<div class="row">
				<!-- 1st row Start -->
				<div class="col-lg-12">
					<div class="row">
						<div class="col-md-3">
							<div class="card mb-4">
								<c:if test="${not empty countUser }">
									<div class="card-body">
										<div class="d-flex align-items-center justify-content-between">
											<div class="">
												<h3 class="mb-2">${ countUser} user</h3>

											</div>
											<i class="lnr lnr-users text-primary display-4"></i>
										</div>
									</div>
								</c:if>
							</div>
						</div>
						<div class="col-md-3">
							<div class="card mb-4">
								<c:if test="${not empty countTypeRoom }">
									<div class="card-body">
										<div class="d-flex align-items-center justify-content-between">
											<div class="">
												<h3 class="mb-2">${countTypeRoom } loại phòng</h3>

											</div>
											<div class="lnr lnr-rocket display-4 text-danger"></div>
										</div>
									</div>

								</c:if>

							</div>
						</div>
						<div class="col-md-3">
							<div class="card mb-4">
								<c:if test="${not empty countRoom }">
									<div class="card-body">
										<div class="d-flex align-items-center justify-content-between">
											<div class="">
												<h3 class="mb-2">${countRoom } phòng</h3>

											</div>
											<div class="lnr lnr-chart-bars display-4 text-success"></div>
										</div>
									</div>
								</c:if>
							</div>
						</div>
						
						<div class="col-md-3">
							<div class="card mb-4">
								<c:if test="${not empty countBooking }">
									<div class="card-body">
										<div class="d-flex align-items-center justify-content-between">
											<div class="">
												<h3 class="mb-2">${countBooking } đơn đặt phòng</h3>

											</div>
											<div class="lnr lnr-cart display-4 text-warning"></div>
										</div>
									</div>
								</c:if>
							</div>
						</div>
					</div>
				</div>

			</div>
			
			<div class="row">
				<!-- 1st row Start -->
				<div class="col-lg-12">
					<div class="row">
						
						<div class="col-md-3">
							<div class="card mb-4">
								<c:if test="${not empty countPost }">
									<div class="card-body">
										<div class="d-flex align-items-center justify-content-between">
											<div class="">
												<h3 class="mb-2">${countPost } bài viết</h3>

											</div>
											<div class="lnr lnr-chart-bars display-4 text-success"></div>
										</div>
									</div>
								</c:if>
							</div>
						</div>
						
						<div class="col-md-3">
							<div class="card mb-4">
								<c:if test="${not empty countService }">
									<div class="card-body">
										<div class="d-flex align-items-center justify-content-between">
											<div class="">
												<h3 class="mb-2">${countService } dịch vụ</h3>

											</div>
											<div class="lnr lnr-chart-bars display-4 text-success"></div>
										</div>
									</div>
								</c:if>
							</div>
						</div>
						
					</div>
				</div>

			</div>
			



		</div>
		<!-- [ content ] End -->

		<!-- [ Layout footer ] Start -->
		<nav class="layout-footer footer bg-white">
			<div
				class="container-fluid d-flex flex-wrap justify-content-between text-center container-p-x pb-3">
				<div class="pt-3">
					<span class="footer-text font-weight-semibold">&copy; <a
						href="https://srthemesvilla.com" class="footer-link"
						target="_blank">nguyenanhtuyen10a5@gmail.com</a></span>
				</div>
				<div>
					<a href="javascript:" class="footer-link pt-3">Về chúng tôi</a> <a
						href="javascript:" class="footer-link pt-3 ml-4">Trợ giúp</a> <a
						href="javascript:" class="footer-link pt-3 ml-4">Liên hệ</a>
				</div>
			</div>
		</nav>
		<!-- [ Layout footer ] End -->
	</div>
	<!-- [ Layout content ] Start -->
</body>
