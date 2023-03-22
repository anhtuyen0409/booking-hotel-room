<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<title>Danh sách User</title>

<body>
	<!-- Begin Page Content -->
	<div class="container-fluid">
		<br />
		<!-- Page Heading -->
		<h1 class="h3 mb-2 text-gray-800">Danh sách User</h1>
		<br />
		<!-- DataTales Example -->
		<div class="card shadow mb-4">

			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered" id="dataTable" width="100%"
						cellspacing="0" style="table-layout:fixed;">
						<thead>
							<tr>
								<th style="width: 2%;">ID</th>
								<th style="width: 10%;">Tên người dùng</th>
								<th style="width: 10%;">Ngày sinh</th>
								<th style="width: 10%;">Số điện thoại</th>
								<th style="width: 10%;">Email</th>
								<th style="width: 44%;">Mật khẩu</th>
								<!-- <th>Loại tài khoản</th>-->
								<th>Tác vụ</th>
							</tr>
						</thead>

						<tbody>
							<c:forEach var="item" items="${users }">
								<tr>
									<td style="white-space: pre-wrap;">${item.id }
									<td style="white-space: pre-wrap;">${item.name }</td>
									<td style="white-space: pre-wrap;">${item.birthday }</td>
									<td style="white-space: pre-wrap;">${item.phone }</td>
									<td style="white-space: pre-wrap;">${item.email }</td>
									<td>${item.password }</td>
									<!-- <td style="white-space: pre-wrap;">${item.type_account }</td>-->
									<td>
										<br/>
										<button type="button" class="btn btn-light">
											<a style="text-decoration: none;" href="">Sửa 
										</button>
										<button type="button" class="btn btn-light">
											<a style="text-decoration: none;" href="<c:url value="/quan-tri/id-user=${item.id}"/>">Xoá 
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
