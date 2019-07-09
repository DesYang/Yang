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
		$.post(
			"searchGoods.do",
			function(msg){
				var str = "";
				for ( var i in msg) {
					var name = msg[i].gname
					str+="<input type='checkbox' value="+msg[i].gid+" name='gid'>";
					str+=name
				}
				$("#sp").append(str);
			},
			"json"
		)
	})
	
	function baocun(){
		var gids = $("input[name=gid]:checked").map(function(){
			return this.value
		}).get().join()
		var sname=$("input[name=sname]").val();
		var sdate=$("input[name=sdate]").val();
		
		$.post(
			"addShop.do",
			{gids:gids,sname:sname,sdate:sdate},
			function(msg){
				if(msg>0){
					alert("添加成功");
					location.href = "list.do";
				}
			},
			"text"
		) 
	}
</script>
</head>
<body>
	<form action="">
		<table>
			<tr>
				<td>店铺名称</td>
				<td>
					<input type="text" name="sname">
				</td>
			</tr>
			<tr>
				<td>创建日期</td>
				<td>
					<input type="date" name="sdate">
				</td>
			</tr>
			<tr>
				<td>销售商品</td>
				<td id="sp">
				
				</td>
			</tr>
			<tr>
				<td colspan="10">
					<input type="button" value="保存" onclick="baocun()">
					<input type="button" value="关闭">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>