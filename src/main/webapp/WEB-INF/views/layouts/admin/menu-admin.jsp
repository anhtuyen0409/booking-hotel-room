<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!-- [ Layout sidenav ] Start -->
<div id="layout-sidenav"
	class="layout-sidenav sidenav sidenav-vertical bg-white logo-dark">
	<!-- Brand demo (see assets/user/css/demo/demo.css) -->
	<div class="app-brand demo">
		<span class="app-brand-logo demo"> <img
			src="<c:url value="/assets/admin/img/logo.png"/>" alt="Brand Logo"
			class="img-fluid">
		</span> <a href="index.html"
			class="app-brand-text demo sidenav-text font-weight-normal ml-2">Trang
			Admin</a> <a href="javascript:"
			class="layout-sidenav-toggle sidenav-link text-large ml-auto"> <i
			class="ion ion-md-menu align-middle"></i>
		</a>
	</div>
	<div class="sidenav-divider mt-0"></div>

	<!-- Links -->
	<ul class="sidenav-inner py-1">

		<!-- Dashboards -->
		<li class="sidenav-item active"><a href="index.html"
			class="sidenav-link"> <i class="sidenav-icon feather icon-home"></i>
				<div>Khách sạn</div>

		</a></li>



		<!-- giao diện -->
		<li class="sidenav-item"><a href="javascript:"
			class="sidenav-link sidenav-toggle">
				<div>Giao diện</div>
		</a>
			<ul class="sidenav-menu">
				<li class="sidenav-item"><a href="<c:url value="/quan-tri/danh-sach-menu"/>"
					class="sidenav-link">
						<div>Menus</div>
				</a></li>
				<li class="sidenav-item"><a href="<c:url value="/quan-tri/danh-sach-slides"/>"
					class="sidenav-link">
						<div>Slides</div>
				</a></li>

			</ul></li>

		<!-- phòng -->

		<li class="sidenav-item"><a href="javascript:"
			class="sidenav-link sidenav-toggle">
				<div>Phòng nghỉ</div>
		</a>
			<ul class="sidenav-menu">
				<li class="sidenav-item"><a href="<c:url value="/quan-tri/danh-sach-loai-phong"/>"
					class="sidenav-link">
						<div>Type Rooms</div>
				</a></li>
				<li class="sidenav-item"><a href="<c:url value="/quan-tri/danh-sach-phong"/>"
					class="sidenav-link">
						<div>Rooms</div>
				</a></li>
			</ul></li>


		<!--  bài viết -->

		<li class="sidenav-item"><a href="javascript:"
			class="sidenav-link sidenav-toggle">
				<div>Bài viết</div>
		</a>
			<ul class="sidenav-menu">
				<li class="sidenav-item"><a href="<c:url value="/quan-tri/danh-sach-bai-viet"/>"
					class="sidenav-link">
						<div>Posts</div>
				</a></li>

			</ul></li>

		<!--  dịch vụ -->
		<li class="sidenav-item"><a href="javascript:"
			class="sidenav-link sidenav-toggle">
				<div>Dịch vụ</div>
		</a>
			<ul class="sidenav-menu">
				<li class="sidenav-item"><a href="<c:url value="/quan-tri/danh-sach-dich-vu"/>"
					class="sidenav-link">
						<div>Services</div>
				</a></li>

			</ul></li>

		<!--  người dùng -->
		<li class="sidenav-item"><a href="javascript:"
			class="sidenav-link sidenav-toggle">
				<div>Người dùng</div>
		</a>
			<ul class="sidenav-menu">
				<li class="sidenav-item"><a href="<c:url value="/quan-tri/danh-sach-nguoi-dung"/>"
					class="sidenav-link">
						<div>Users</div>
				</a></li>

			</ul></li>

	</ul>
</div>
<!-- [ Layout sidenav ] End -->