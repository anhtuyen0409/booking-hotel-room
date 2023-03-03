<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Đăng nhập</title>
<body>
	<div class="wrapper">
		<div class="container">
			<div class="row justify-content-around">
				<form action='./admin/login.php' method='POST'
					class="col-md-6 bg-light p-3 my-3">
					<h1 class="text-center text-uppercase h3 py-3">Đăng Nhập</h1>
					<div class="form-group">
						<label for="username">Email</label> <input type="text"
							name="username" id="username" class="form-control" required>
					</div>
					<div class="form-group">
						<label for="password">Mật khẩu</label> <input type="password"
							name="password" id="password" class="form-control" required>
					</div>
					<input type="Checkbox" name="remember-me" id="remember-me">
					<label for="p-3">Lưu tài khoản</label> <a style="float: right;"
						href='./formquenmk.php' title='Quên mật khẩu?'>Quên mật khẩu?
					</a> <input type="submit" value="Đăng nhập"
						class="btn-primary btn btn-block my-3">
					<p>
						Chưa có tài khoản? <a href='<c:url value="/dang-ky"/>' title='Đăng ký'>Đăng
							ký </a> <a style="float: right;" href='<c:url value="/trang-chu"/>' title='Trang chủ'>Trang
							chủ</a>
					</p>
				</form>
			</div>
		</div>
	</div>
</body>
