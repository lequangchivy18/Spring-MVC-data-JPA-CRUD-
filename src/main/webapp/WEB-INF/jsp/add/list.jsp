<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/bootstrap-4.6.2-dist/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/font-awesome-4.7.0/css/font-awesome.min.css" />
	<style>
.pagination {
	display: inline-block;
}

.pagination a {
	color: black;
	float: left;
	padding: 8px 16px;
	text-decoration: none;
	transition: background-color .3s;
	border: 1px solid #ddd;
	margin: 0 4px;
}

.pagination a.active {
	background-color: #4CAF50;
	color: white;
	border: 1px solid #4CAF50;
}

.pagination a:hover:not(.active) {
	background-color: #ddd;
}

table, td, th {
	border: 1px solid black;
}

table {
	border-collapse: collapse;
	width: 50%;
}

td {
	text-align: center;
}
</style>
</head>
<body>
	<div class ="p-5">
		<h1 class = "text-center mb-4">Bảng thống kê</h1>
		<c:if test="${log }">
			<div class="text-center text-success">
				Cập nhật thành công
			</div>
		</c:if>
		<div class="d-flex align-items-center justify-content-between mb-2" style="gap:10px">
			<a href="${pageContext.request.contextPath}/home/show" class="btn btn-success">ADD</a>
		</div>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th class="text-center align-middle">Mã TT</th>
					<th class="text-center align-middle">Mã căn hộ</th>
					<th class="text-center align-middle">Diện tích</th>
					<th class="text-center align-middle">Mã toà nhà</th>
					<th class="text-center align-middle">Tên chủ hộ</th>
					<th class="text-center align-middle">Số điện thoại</th>
					<th class="text-center align-middle">Tháng bắt đầu</th>
					<th class="text-center align-middle">Số tháng</th>
					<th class="text-center align-middle">Ngày dóng</th>
					<th class="text-center align-middle">Tổng tiền</th>
					<th class="text-center align-middle">Chức năng</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listTT}" var="s">
					<tr>
						<td class="text-center align-middle">${s.matt}</td>
						<td class="text-center align-middle">${s.macanho}</td>
						<td class="text-center align-middle">${s.dientich}</td>
						<td class="text-center align-middle">${s.matoanha.getMatoanha()}</td>
						<td class="text-center align-middle">${s.tenchuho}</td>
						<td class="text-center align-middle">${s.sodienthoai}</td>
						<td class="text-center align-middle">${s.thangbd}</td>
						<td class="text-center align-middle">${s.sothang}</td>
						<td class="text-center align-middle">${s.ngaydong}</td>
						<td class="text-center align-middle">${s.tongtien}</td>
						<td class="d-flex align-middle justify-content-center" style="gap: 4px;">
							<a href="${pageContext.request.contextPath}/home/edit/ma=${s.matt}" class="btn btn-info"> 
								<i class='fa fa-edit' style="width: 12.575px"></i>
							</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
					<th class="text-center align-middle">Mã TT</th>
					<th class="text-center align-middle">Mã căn hộ</th>
					<th class="text-center align-middle">Diện tích</th>
					<th class="text-center align-middle">Mã toà nhà</th>
					<th class="text-center align-middle">Tên chủ hộ</th>
					<th class="text-center align-middle">Số điện thoại</th>
					<th class="text-center align-middle">Tháng bắt đầu</th>
					<th class="text-center align-middle">Số tháng</th>
					<th class="text-center align-middle">Ngày dóng</th>
					<th class="text-center align-middle">Tổng tiền</th>
					<th class="text-center align-middle">Chức năng</th>
				</tr>
			</tfoot>
		</table>
		<div class="pagination">
			<c:if test="${page > 0}">
				<a href="list?page=${page-1}">Previous</a>
			</c:if>
			<c:forEach begin="0" end="${totalPages-1}" var="i">
				<c:choose>
					<c:when test="${page eq i}">
						<a class="active"> ${i+1} </a>
					</c:when>
					<c:otherwise>
						<a href="list?page=${i}">${i+1}</a>
					</c:otherwise>
				</c:choose>
			</c:forEach>

			<c:if test="${page lt totalPages-1}">
				<a href="list?page=${page+1}">Next</a>
			</c:if>
		</div>
	</div>
	<script
		src="${pageContext.request.contextPath}/resources/jquery/jquery-3.6.1.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/bootstrap-4.6.2-dist/js/bootstrap.min.js"></script>
	<script>
		$(document).ready(function(){
		  $(".del").click(function(){
		    if (!confirm("Do you want to delete")){
		      return false;
		    }
		  });
		});
	</script>
	
</body>
</html>