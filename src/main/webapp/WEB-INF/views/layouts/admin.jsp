<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en" class="material-style layout-fixed">

<head>

<title><decorator:title default="Master-layout" /></title>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0">
<meta name="description"
	content="Empire Bootstrap admin template made using Bootstrap 4, it has tons of ready made feature, UI components, pages which completely fulfills any dashboard needs." />
<meta name="keywords"
	content="Empire, bootstrap admin template, bootstrap admin panel, bootstrap 4 admin template, admin template">
<meta name="author" content="Srthemesvilla" />
<link rel="icon" type="image/x-icon"
	href="<c:url value="/assets/admin/img/favicon.ico"/>">


<!-- Google fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700"
	rel="stylesheet">

<!-- Icon fonts -->
<link rel="stylesheet"
	href="<c:url value="/assets/admin/fonts/fontawesome.css"/>">
<link rel="stylesheet"
	href="<c:url value="/assets/admin/fonts/ionicons.css"/>">
<link rel="stylesheet"
	href="<c:url value="/assets/admin/fonts/linearicons.css"/>">
<link rel="stylesheet"
	href="<c:url value="/assets/admin/fonts/open-iconic.css"/>">
<link rel="stylesheet"
	href="<c:url value="/assets/admin/fonts/pe-icon-7-stroke.css"/>">
<link rel="stylesheet"
	href="<c:url value="/assets/admin/fonts/feather.css"/>">

<!-- Core stylesheets -->
<link rel="stylesheet"
	href="<c:url value="/assets/admin/css/bootstrap-material.css"/>">
<link rel="stylesheet"
	href="<c:url value="/assets/admin/css/shreerang-material.css"/>">
<link rel="stylesheet"
	href="<c:url value="/assets/admin/css/uikit.css"/>">

<!-- Libs -->
<link rel="stylesheet"
	href="<c:url value="/assets/admin/libs/perfect-scrollbar/perfect-scrollbar.css"/>">
<link rel="stylesheet"
	href="<c:url value="/assets/admin/libs/flot/flot.css"/>">

</head>

<body>

	<!-- [ Preloader ] Start -->
	<div class="page-loader">
		<div class="bg-primary"></div>
	</div>
	<!-- [ Preloader ] End -->

	<!-- [ Layout wrapper ] Start -->
	<div class="layout-wrapper layout-2">
		<div class="layout-inner">
			
			<!-- menu -->
			<%@ include file = "/WEB-INF/views/layouts/admin/menu-admin.jsp" %>
			
			<!-- [ Layout container ] Start -->
			<div class="layout-container">
				
				<!-- header -->
				<%@ include file = "/WEB-INF/views/layouts/admin/header-admin.jsp" %>
				
				<!-- index -->
				<decorator:body />
				
			</div>
			<!-- [ Layout container ] End -->
		</div>
		<!-- Overlay -->
		<div class="layout-overlay layout-sidenav-toggle"></div>
	</div>
	<!-- [ Layout wrapper] End -->

	<!-- Core scripts -->
	<script src="<c:url value="/assets/admin/js/pace.js"/>"></script>
	<script src="<c:url value="/assets/admin/js/jquery-3.3.1.min.js"/>"></script>
	<script src="<c:url value="/assets/admin/libs/popper/popper.js"/>"></script>
	<script src="<c:url value="/assets/admin/js/bootstrap.js"/>"></script>
	<script src="<c:url value="/assets/admin/js/sidenav.js"/>"></script>
	<script src="<c:url value="/assets/admin/js/layout-helpers.js"/>"></script>
	<script src="<c:url value="/assets/admin/js/material-ripple.js"/>"></script>

	<!-- Libs -->
	<script
		src="<c:url value="/assets/admin/libs/perfect-scrollbar/perfect-scrollbar.js"/>"></script>
	<script src="<c:url value="/assets/admin/libs/eve/eve.js"/>"></script>
	<script src="<c:url value="/assets/admin/libs/flot/flot.js"/>"></script>
	<script src="<c:url value="/assets/admin/libs/flot/curvedLines.js"/>"></script>
	<script src="<c:url value="/assets/admin/libs/chart-am4/core.js"/>"></script>
	<script src="<c:url value="/assets/admin/libs/chart-am4/charts.js"/>"></script>
	<script src="<c:url value="/assets/admin/libs/chart-am4/animated.js"/>"></script>

	<!-- Demo -->
	<script src="<c:url value="/assets/admin/js/demo.js"/>"></script>
	<script src="<c:url value="/assets/admin/js/analytics.js"/>"></script>
	<script
		src="<c:url value="/assets/admin/js/pages/dashboards_index.js"/>"></script>
</body>

</html>
