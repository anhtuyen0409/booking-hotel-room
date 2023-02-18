<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="zxx">

<head>
<meta charset="UTF-8">
<meta name="description" content="Sona Template">
<meta name="keywords" content="Sona, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title><decorator:title default="Master-layout"/></title>

<!-- Google Font -->
<link
	href="https://fonts.googleapis.com/css?family=Lora:400,700&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Cabin:400,500,600,700&display=swap"
	rel="stylesheet">

<!-- Css Styles -->
<link rel="stylesheet" href="<c:url value="/assets/user/css/bootstrap.min.css"/>" type="text/css">
<link rel="stylesheet" href="<c:url value="/assets/user/css/font-awesome.min.css"/>" type="text/css">
<link rel="stylesheet" href="<c:url value="/assets/user/css/elegant-icons.css"/>" type="text/css">
<link rel="stylesheet" href="<c:url value="/assets/user/css/flaticon.css"/>" type="text/css">
<link rel="stylesheet" href="<c:url value="/assets/user/css/owl.carousel.min.css"/>" type="text/css">
<link rel="stylesheet" href="<c:url value="/assets/user/css/nice-select.css"/>" type="text/css">
<link rel="stylesheet" href="<c:url value="/assets/user/css/jquery-ui.min.css"/>" type="text/css">
<link rel="stylesheet" href="<c:url value="/assets/user/css/magnific-popup.css"/>" type="text/css">
<link rel="stylesheet" href="<c:url value="/assets/user/css/slicknav.min.css"/>" type="text/css">
<link rel="stylesheet" href="<c:url value="/assets/user/css/style.css"/>" type="text/css">

</head>

<body>
	<!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>

	<%@ include file = "/WEB-INF/views/layouts/user/header.jsp" %>

	<decorator:body />

	<%@ include file = "/WEB-INF/views/layouts/user/footer.jsp" %>

	<!-- Search model Begin -->
	<div class="search-model">
		<div class="h-100 d-flex align-items-center justify-content-center">
			<div class="search-close-switch">
				<i class="icon_close"></i>
			</div>
			<form class="search-model-form">
				<input type="text" id="search-input" placeholder="Search here.....">
			</form>
		</div>
	</div>
	<!-- Search model end -->

	<!-- Js Plugins -->
	<script src="<c:url value="/assets/user/js/jquery-3.3.1.min.js"/>"></script>
	<script src="<c:url value="/assets/user/js/bootstrap.min.js"/>"></script>
	<script src="<c:url value="/assets/user/js/jquery.magnific-popup.min.js"/>"></script>
	<script src="<c:url value="/assets/user/js/jquery.nice-select.min.js"/>"></script>
	<script src="<c:url value="/assets/user/js/jquery-ui.min.js"/>"></script>
	<script src="<c:url value="/assets/user/js/jquery.slicknav.js"/>"></script>
	<script src="<c:url value="/assets/user/js/owl.carousel.min.js"/>"></script>
	<script src="<c:url value="/assets/user/js/main.js"/>"></script>
</body>

</html>