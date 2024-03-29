<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- Offcanvas Menu Section Begin -->
<div class="offcanvas-menu-overlay"></div>
<div class="canvas-open">
	<i class="icon_menu"></i>
</div>
<div class="offcanvas-menu-wrapper">
	<div class="canvas-close">
		<i class="icon_close"></i>
	</div>
	<div class="search-icon  search-switch">
		<i class="icon_search"></i>
	</div>
	<div class="header-configure-area">
		<div class="language-option">
			<img src="<c:url value="/assets/user/user/img/flag.jpg"/>" alt="">
			<span>EN <i class="fa fa-angle-down"></i>
			</span>
			<div class="flag-dropdown">
				<ul>
					<li><a href="#">Zi</a></li>
					<li><a href="#">Fr</a></li>
				</ul>
			</div>
		</div>
		<a href="#" class="bk-btn">Booking Now</a>
	</div>
	<nav class="mainmenu mobile-menu">
		<ul>
			<c:forEach var="item" items="${menus }">
				<li><a href="./about-us.html">${item.name }</a></li>
			</c:forEach>
		</ul>
	</nav>
	<div id="mobile-menu-wrap"></div>
	<div class="top-social">
		<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
			class="fa fa-twitter"></i></a> <a href="#"><i
			class="fa fa-tripadvisor"></i></a> <a href="#"><i
			class="fa fa-instagram"></i></a>
	</div>
	<ul class="top-widget">
		<li><i class="fa fa-phone"></i> 039 442 0076</li>
		<li><i class="fa fa-envelope"></i> nguyenanhtuyen10a5@gmail.com</li>
	</ul>
</div>
<!-- Offcanvas Menu Section End -->

<!-- Header Section Begin -->
<header class="header-section">
	<div class="top-nav">
		<div class="container">
			<div class="row">
				<div class="col-lg-7">
					<ul class="tn-left">
						<li><i class="fa fa-phone"></i> 039 442 0076</li>
						<li><i class="fa fa-envelope"></i>
							nguyenanhtuyen10a5@gmail.com</li>
					</ul>
				</div>

				<div class="col-lg-5">
					<div class="menu-item">
						<div class="container">
							<div class="row">

								<div class="nav-menu">
									<nav class="mainmenu">
										<ul>
											<c:if test="${empty LoginInfo }">
												<li><a href="<c:url value="/dang-nhap"/>">Đăng nhập</a></li>
												<li><a href="<c:url value="/dang-ky"/>">Đăng ký</a></li>
											</c:if>
											<c:if test="${not empty LoginInfo }">
												<img src="<c:url value="/assets/user/img/avatar/${LoginInfo.avatar}"/>"
													class="rounded-circle" style="width: 50px;" alt="Avatar" />
												<li><a href="<c:url value="/cap-nhat-thong-tin-ca-nhan/id-user=${LoginInfo.id}"/>">Xin
														chào ${LoginInfo.name }!</a>
												
												<li><a href="<c:url value="/dang-xuat"/>">Đăng xuất</a></li>
												</li>

											</c:if>

										</ul>
									</nav>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="menu-item">
		<div class="container">
			<div class="row">
				<div class="col-lg-2">
					<div class="logo">
						<a href="./index.html"> <img
							src="<c:url value="/assets/user/user/img/logo3.png"/>" alt="">
						</a>
					</div>
				</div>
				<div class="col-lg-10">
					<div class="nav-menu">
						<nav class="mainmenu">
							<ul>
								<c:forEach var="item" items="${menus }">
									<li><a href="<c:url value="/${item.url }"/>">${item.name }</a></li>
								</c:forEach>
							</ul>
						</nav>
						<div class="nav-right search-switch">
							<i class="icon_search"></i>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</header>
<!-- Header End -->
