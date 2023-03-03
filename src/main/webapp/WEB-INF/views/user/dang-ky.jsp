<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<title>Đăng ký tài khoản</title>

<body>
	<section class="h-110 bg-dark">
		<div class="container py-5 h-110">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col">
					<div class="card card-registration my-4">
						<div class="row g-0">
							<div class="col-xl-6 d-none d-xl-block">
								<img
									src="<c:url value="/assets/user/img/room/room-normal-1.jpg"/>"
									alt="Sample photo" class="img-fluid"
									style="border-top-left-radius: .25rem; border-bottom-left-radius: .25rem; width: 550px; height: 610px" />
							</div>
							<div class="col-xl-6">
								<div class="card-body p-md-5 text-black">
									<h3 class="mb-5 text-uppercase">Đăng ký tài khoản</h3>
									<form:form action="dang-ky" method="POST" modelAttribute="user">
										<div class="form-outline mb-4">
											<form:input type="text" path="name" id="form3Example8"
												class="form-control form-control-lg" placeholder="Họ tên" />
										</div>
										<div class="form-outline mb-4">
											<form:input type="date" path="birthday" id="form3Example8"
												class="form-control form-control-lg" placeholder="Ngày sinh" />
										</div>
										<div class="form-outline mb-4">
											<form:input type="number" path="phone" id="form3Example8"
												class="form-control form-control-lg" placeholder="Số điện thoại" />
										</div>
										<div class="form-outline mb-4">
											<form:input type="email" path="email" id="form3Example8"
												class="form-control form-control-lg" placeholder="Email" />
										</div>
										<div class="form-outline mb-4">
											<form:input type="password" path="password" id="form3Example8"
												class="form-control form-control-lg" placeholder="Mật khẩu" />
										</div>
										<div class="form-outline mb-4">
											<form:input type="password" path="confirm_password" id="form3Example8"
												class="form-control form-control-lg" placeholder="Xác nhận mật khẩu" />
										</div>
										<div>
											<button type="submit" class="btn btn-warning btn-lg ms-2"
												style="width: 455px;">Đăng ký</button>
										</div>
									</form:form>
									<br />
									<div class="d-flex justify-content-end">
										<p style="font-size: 18px;">Bạn đã có tài khoản?</p>
										<a href="<c:url value="/dang-nhap"/>">Đăng nhập</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
