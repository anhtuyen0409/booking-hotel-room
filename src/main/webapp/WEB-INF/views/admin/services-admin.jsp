<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<title>Danh sách dịch vụ</title>

<body>
	<!-- Begin Page Content -->
	<div class="container-fluid">
		<br />
		<!-- Page Heading -->
		<h1 class="h3 mb-2 text-gray-800">Danh sách dịch vụ</h1>
		<div style="position: relative;">
			<button style="position: absolute; right: 0;" type="button"
				class="btn btn-success">
				<a href="<c:url value="/quan-tri/add-service"/>">Thêm mới </a>
			</button>
		</div>

		<br /> <br />
		<!-- DataTales Example -->
		<div class="card shadow mb-4">

			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered" id="dataTable" width="100%"
						cellspacing="0">
						<thead>
							<tr>
								<th>ID</th>
								<th>Tên dịch vụ</th>
								<th>Hình ảnh</th>
								<th>Tác vụ</th>
							</tr>
						</thead>

						<tbody>
							<c:forEach var="item" items="${services }">
								<tr>
									<td>${item.id }</td>
									<td>${item.name }</td>
									<td><img style="width: 100px; height: 100px;"
										src="<c:url value="/assets/user/img/services/${item.img }"/>"
										alt="Alternate Text" /></td>
									<td>

										<button type="button" class="btn btn-light">
											<a style="text-decoration: none;" href="">Chi tiết 
										</button>
										<button type="button" class="btn btn-light">
											<a style="text-decoration: none;" href="<c:url value="/quan-tri/update-service/id-service=${item.id}"/>">Sửa 
										</button>
										<button type="button" class="btn btn-light">
											<a style="text-decoration: none;" href="<c:url value="/quan-tri/id-service=${item.id}"/>">Xoá 
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
