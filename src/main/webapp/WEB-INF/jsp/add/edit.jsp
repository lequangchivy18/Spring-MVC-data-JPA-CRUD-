<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>CMS</title>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/bootstrap-4.6.2-dist/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/font-awesome-4.7.0/css/font-awesome.min.css" />
</head>
<body>
	<div class="container pt-3">
		<div class="content-title pb-4 border-bottom w-100 mb-4">
			<h2>Edit</h2>
		</div>
		<div class="card-header border">Edit</div>
		<div class="card-body border" style="box-sizing: border-box;">
			<form:form  action="${pageContext.request.contextPath}/home/edit" method="Post" modelAttribute="tt">
				<div class="form-group px-1">
					<label for="matt">Mã thông tin</label> 
					<form:input type="text"
						name = "matt"
						class="form-control" id="matt"
						placeholder="Mã thông tin"
						maxlength="30"
						path="matt"
						/>
					<p class="text-danger"><form:errors path="matt" /></p>
				</div>
				<div class="form-group px-1">
					<label for="id">Mã căn hộ</label> 
					<form:input type="text"
						name = "macanho"
						class="form-control" id="macanho"
						placeholder="Mã căn hộ"
						maxlength="30"
						path="macanho"
						/>
					<p class="text-danger"><form:errors path="macanho" /></p>
				</div>
				<div class="form-group px-1">
					<label for="dientich">Diện tích</label>
					<form:input type="number" min="0" class="form-control" id="dientich" name = "name" placeholder="diện tích" path="dientich"/>
					<p class="text-danger"><form:errors path="dientich" /></p>
				</div>
				<div class="form-group px-1">
					<label for="matoanha">Mã toà nhà</label>
					<form:input type="text" min="0" class="form-control" id="matoanha" name = "matoanha" placeholder="mã toà nhà" path="matoanha.matoanha"/>
					<p class="text-danger"><form:errors path="matoanha.matoanha" /></p>
					<p class="text-danger">${log}</p>
				</div>
				<div class="form-group px-1">
					<label for="tenchuho">Tên chủ hộ</label>
					<form:input type="text" min="0" class="form-control" id="tenchuho" name = "tenchuho" placeholder="Tên chủ hộ" path="tenchuho"/>
					<p class="text-danger"><form:errors path="tenchuho" /></p>
				</div>
				<div class="form-group px-1">
					<label for="sodienthoai">Số điện thoại</label>
					<form:input type="text" min="0" class="form-control" id="sodienthoai" name = "sodienthoai" placeholder="Số điện thoại" path="sodienthoai"/>
					<p class="text-danger"><form:errors path="sodienthoai" /></p>
				</div>
				<div class="form-group px-1">
					<label for="thangbd">Tháng bắt đầu</label>
					<form:input type="date" class="form-control" id="thangbd" name = "thangbd" placeholder="Tháng bắt đầu" path="thangbd"/>
					<p class="text-danger"><form:errors path="thangbd" /></p>
				</div>
				<div class="form-group px-1">
					<label for="sothang">Số tháng</label>
					<form:input type="number" min="1" class="form-control" id="sothang" name = "sothang" placeholder="Số tháng" max="12" path="sothang"/>
					<p class="text-danger"><form:errors path="sothang" /></p>
				</div>
				<div class="form-group px-1">
					<label for="ngaydong">Ngày đóng</label>
					<form:input type="date" class="form-control" id="ngaydong" name = "ngaydong" placeholder="Ngày đóng" path="ngaydong"/>
					<p class="text-danger"><form:errors path="ngaydong" /></p>
				</div>
				<div class="form-group p-2">
					<button type="submit" class="btn btn-success">Submit Button</button>
					<a href="${pageContext.request.contextPath}/home/list" class="btn btn-danger">Cancel</a>
				</div>
			</form:form>
		</div>
	</div>
	
	<script
		src="${pageContext.request.contextPath}/resources/jquery/jquery-3.6.1.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/bootstrap-4.6.2-dist/js/bootstrap.min.js"></script>
</body>
</html>

