<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>  
<%@ taglib  uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.min.js"></script>
<link    rel="stylesheet"    href="<%=request.getContextPath() %>/css/css.css"  type="text/css">
<title>Insert title here</title>
<script type="text/javascript">
	$(function(){
		var sid = ${param.sid};
		$("input[name=sid]").val(sid);
		
		$.post(
			"searchShopById.do",
			{sid:sid},
			function(msg){
				$("input[name=sname]").val(msg.sname);
				$("input[name=sdate]").val(msg.sdate);
				$("input[name=gnames]").val(msg.gnames);
			},
			"json"
		)
	})
	function back(){
		location.href = "list.do";
	}
	
</script>
</head>
<body>
	<table>
		<tr>
			<td>编号</td>
			<td>
				<input type="text" name="sid">
			</td>
		</tr>
		<tr>
			<td>店铺名称</td>
			<td>
				<input type="text" name="sname">
			</td>
		</tr>
		<tr>
			<td>创建时间</td>
			<td>
				<input type="date" name="sdate">
			</td>
		</tr>
		<tr>
			<td>销售商品</td>
			<td>
				<input type="text" name="gnames">
			</td>
		</tr>
		<tr>
			<td colspan="10">
				<input type="button" onclick="back()" value="返回">
			</td>
		</tr>
	</table>
</body>
</html>