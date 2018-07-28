<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<span style="font-size:14px;"><!-- 引入BootStrap的CSS -->  
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />  
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap-theme.min.css" />  
<!-- 引入JS-->  
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js" ></script>  
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js" ></script></span>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container">
	<div class="row">
		<div class="span8">
			<table class="table">
				<thead>
					<tr>
						<th>
							编号
						</th>
						<th>
							产品
						</th>
						<th>
							交付时间
						</th>
						<th>
							状态
						</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							1
						</td>
						<td>
							TB - Monthly
						</td>
						<td>
							01/04/2012
						</td>
						<td>
							Default
						</td>
					</tr>
					<tr class="success">
						<td>
							1
						</td>
						<td>
							TB - Monthly
						</td>
						<td>
							01/04/2012
						</td>
						<td>
							Approved
						</td>
					</tr>
					<tr class="error">
						<td>
							2
						</td>
						<td>
							TB - Monthly
						</td>
						<td>
							02/04/2012
						</td>
						<td>
							Declined
						</td>
					</tr>
					<tr class="warning">
						<td>
							3
						</td>
						<td>
							TB - Monthly
						</td>
						<td>
							03/04/2012
						</td>
						<td>
							Pending
						</td>
					</tr>
					<tr class="info">
						<td>
							4
						</td>
						<td>
							TB - Monthly
						</td>
						<td>
							04/04/2012
						</td>
						<td>
							Call in to confirm
						</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="span4">
			<ul class="nav nav-list">
				<li class="nav-header">
					列表标题
				</li>
				<li class="active">
					<a href="#">首页</a>
				</li>
				<li>
					<a href="#">库</a>
				</li>
				<li>
					<a href="#">应用</a>
				</li>
				<li class="nav-header">
					功能列表
				</li>
				<li>
					<a href="#">资料</a>
				</li>
				<li>
					<a href="#">设置</a>
				</li>
				<li class="divider">
				</li>
				<li>
					<a href="#">帮助</a>
				</li>
			</ul>
		</div>
	</div>
</div>

</body>
</html>