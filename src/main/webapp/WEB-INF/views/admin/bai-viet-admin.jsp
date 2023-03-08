<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<title>Danh sách bài viết</title>

<body>
	<!-- Begin Page Content -->
	<div class="container-fluid">
		<br />
		<!-- Page Heading -->
		<h1 class="h3 mb-2 text-gray-800">Danh sách bài viết</h1>
		<br />
		<!-- DataTales Example -->
		<div class="card shadow mb-4">

			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered" id="dataTable" width="100%"
						cellspacing="0">
						<thead>
							<tr>
								<th>ID</th>
								<th>Tiêu đề</th>
								<th>Nội dung</th>
								<th>Ảnh 1</th>
								<th>Ảnh 2</th>
								<th>Ảnh 3</th>
								<th>Ảnh 4</th>
								<th>Tác vụ</th>
							</tr>
						</thead>

						<tbody>
							<c:forEach var="item" items="${posts }">
								<tr>
									<td>${item.id }</td>
									<td style="white-space: pre-wrap;">${item.title }</td>
									<td style="white-space: pre-wrap;">${item.content }</td>
									<td style="width: 10%;"><img
										style="width: 100px; height: 100px;"
										src="<c:url value="/assets/user/img/post/${item.img_1 }"/>"
										alt="Alternate Text" /></td>
									<td><img style="width: 100px; height: 100px;"
										src="<c:url value="/assets/user/img/post/${item.img_2 }"/>"
										alt="Alternate Text" /></td>
									<td><img style="width: 100px; height: 100px;"
										src="<c:url value="/assets/user/img/post/${item.img_3 }"/>"
										alt="Alternate Text" /></td>
									<td><img style="width: 100px; height: 100px;"
										src="<c:url value="/assets/user/img/post/${item.img_4 }"/>"
										alt="Alternate Text" /></td>
									<td>

										<button type="button" class="btn btn-light">
											<a style="text-decoration: none;" href="">Chi tiết 
										</button>
										<button type="button" class="btn btn-light">
											<a style="text-decoration: none;" href="">Sửa 
										</button>
										<button type="button" class="btn btn-light">
											<a style="text-decoration: none;" href="">Xoá 
										</button>

									</td>

								</tr>
							</c:forEach>
						</tbody>
					</table>
					<!-- @using (Html.BeginForm("ExportToExcel", "SanPham", FormMethod.Post,
					new { enctype = "multipart/form-data" })) {

					<div>
						<input type="submit" value="Export Excel" class="btn-primary" />
					</div>

					}-->
				</div>
			</div>
		</div>
		<!-- <div class="dataTables_paginate paging_simple_numbers"
			id="dataTable_paginate">@Html.PagedListPager(Model, page =>
			Url.Action("Index", new { page }))</div>-->

	</div>
	<!-- /.container-fluid -->
</body>
