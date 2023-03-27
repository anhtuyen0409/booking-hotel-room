<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<title>Bài viết</title>

<body>
	<!-- Breadcrumb Section Begin -->
	<div class="breadcrumb-section">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="breadcrumb-text">
						<h2>Bài viết</h2>
						<div class="bt-option">
							<a href="/SpringProject/trang-chu">Trang chủ</a> <span>Bài
								viết</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Breadcrumb Section End -->

	<!-- Blog Section Begin -->
	<section class="blog-section blog-page spad">
		<div class="container">
			<div class="row">
				<c:forEach var="item" items="${postsPaginate }">
					<div class="col-lg-4 col-md-6">
						<div class="blog-item set-bg"
							data-setbg="<c:url value="/assets/user/img/post/${item.img_1 }"/>">
							<div class="bi-text">
								<h4>
									<a href="<c:url value="/bai-viet/id-post=${item.id }"/>">${item.title }</a>
								</h4>
							</div>
						</div>
					</div>
				</c:forEach>
				<div class="col-lg-12">
					<div class="room-pagination">
						<c:forEach var="item" begin="1" end="${paginateInfo.totalPage }"
							varStatus="loop">
							<c:if test="${(loop.index) == paginateInfo.currentPage}">
								<a
									href="<c:url value="/bai-viet/page=${loop.index }"/>">${loop.index}</a>
							</c:if>
							<c:if test="${(loop.index) != paginateInfo.currentPage}">
								<a
									href="<c:url value="/bai-viet/page=${loop.index }"/>">${loop.index}</a>
							</c:if>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Blog Section End -->
</body>
