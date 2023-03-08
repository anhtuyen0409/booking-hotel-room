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
				<div class="col-lg-5">
					<div class="row">
						<div class="col-md-6">
							<div class="card mb-4">
								<div class="card-body">
									<div class="d-flex align-items-center justify-content-between">
										<div class="">
											<h2 class="mb-2">256</h2>
											<p class="text-muted mb-0">
												<span class="badge badge-primary">Revenue</span> Today
											</p>
										</div>
										<div class="lnr lnr-leaf display-4 text-primary"></div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="card mb-4">
								<div class="card-body">
									<div class="d-flex align-items-center justify-content-between">
										<div class="">
											<h2 class="mb-2">8451</h2>
											<p class="text-muted mb-0">
												<span class="badge badge-success">20%</span> Stock
											</p>
										</div>
										<div class="lnr lnr-chart-bars display-4 text-success"></div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="card mb-4">
								<div class="card-body">
									<div class="d-flex align-items-center justify-content-between">
										<div class="">
											<h2 class="mb-2">
												31% <small></small>
											</h2>
											<p class="text-muted mb-0">
												New <span class="badge badge-danger">20%</span> Customer
											</p>
										</div>
										<div class="lnr lnr-rocket display-4 text-danger"></div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="card mb-4">
								<div class="card-body">
									<div class="d-flex align-items-center justify-content-between">
										<div class="">
											<h2 class="mb-2">158</h2>
											<p class="text-muted mb-0">
												<span class="badge badge-warning">$143.45</span> Profit
											</p>
										</div>
										<div class="lnr lnr-cart display-4 text-warning"></div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-sm-12">
							<div class="card d-flex w-100 mb-4">
								<div class="row no-gutters row-bordered row-border-light h-100">
									<div class="d-flex col-md-6 align-items-center">
										<div class="card-body">
											<div class="row align-items-center mb-3">
												<div class="col-auto">
													<i class="lnr lnr-users text-primary display-4"></i>
												</div>
												<div class="col">
													<h6 class="mb-0 text-muted">
														Unique <span class="text-primary">Visitors</span>
													</h6>
													<h4 class="mt-3 mb-0">
														652<i class="ion ion-md-arrow-round-down ml-3 text-danger"></i>
													</h4>
												</div>
											</div>
											<p class="mb-0 text-muted">36% From Last 6 Months</p>
										</div>
									</div>
									<div class="d-flex col-md-6 align-items-center">
										<div class="card-body">
											<div class="row align-items-center mb-3">
												<div class="col-auto">
													<i class="lnr lnr-magic-wand text-primary display-4"></i>
												</div>
												<div class="col">
													<h6 class="mb-0 text-muted">
														Monthly <span class="text-primary">Earnings</span>
													</h6>
													<h4 class="mt-3 mb-0">
														5963<i class="ion ion-md-arrow-round-up ml-3 text-success"></i>
													</h4>
												</div>
											</div>
											<p class="mb-0 text-muted">36% From Last 6 Months</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-7">
					<div class="card mb-4">
						<div class="card-header with-elements">
							<h6 class="card-header-title mb-0">Statistics</h6>
							<div class="card-header-elements ml-auto">
								<label class="text m-0"> <span
									class="text-light text-tiny font-weight-semibold align-middle">SHOW
										STATS</span> <span
									class="switcher switcher-primary switcher-sm d-inline-block align-middle mr-0 ml-2"><input
										type="checkbox" class="switcher-input" checked><span
										class="switcher-indicator"><span class="switcher-yes"></span><span
											class="switcher-no"></span></span></span>
								</label>
							</div>
						</div>
						<div class="card-body">
							<div id="statistics-chart-1" style="height: 300px"></div>
						</div>
					</div>
				</div>
				<!-- 1st row Start -->
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
						target="_blank">Srthemesvilla</a></span>
				</div>
				<div>
					<a href="javascript:" class="footer-link pt-3">About Us</a> <a
						href="javascript:" class="footer-link pt-3 ml-4">Help</a> <a
						href="javascript:" class="footer-link pt-3 ml-4">Contact</a> <a
						href="javascript:" class="footer-link pt-3 ml-4">Terms &amp;
						Conditions</a>
				</div>
			</div>
		</nav>
		<!-- [ Layout footer ] End -->
	</div>
	<!-- [ Layout content ] Start -->
</body>
