<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<title>Danh sách phòng</title>

<body>
	<!-- Begin Page Content -->
	<div class="container-fluid">
		<br />
		<!-- Page Heading -->
		<h1 class="h3 mb-2 text-gray-800">Danh sách phòng</h1>
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
								<th>Tên phòng</th>
								<th>Hình ảnh</th>
								<th>Giá thuê</th>
								<th>Kích thước</th>
								<th>Số người</th>
								<th>Dịch vụ</th>
								<th>Mô tả</th>
								<th>Trạng thái</th>
								<th>Tác vụ</th>
							</tr>
						</thead>

						<tbody>
							<c:forEach var="item" items="${rooms }">
								<tr>
									<td>${item.id }</td>
									<td style="white-space: pre-wrap;">${item.name }</td>
									<td style="width: 10%;"><img
										style="width: 100px; height: 100px;"
										src="<c:url value="/assets/user/img/room/${item.img }"/>"
										alt="Alternate Text" /></td>
									<td style="white-space: pre-wrap;"><fmt:formatNumber type="number" groupingUsed="true" value="${item.price }" /> đ</td>
									<td style="white-space: pre-wrap;">${item.sizes }</td>
									<td style="white-space: pre-wrap;">${item.guests }</td>
									<td style="white-space: pre-wrap;">${item.services }</td>
									<td style="white-space: pre-wrap;">${item.description }</td>
									<td style="white-space: pre-wrap;">${item.status }</td>

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
