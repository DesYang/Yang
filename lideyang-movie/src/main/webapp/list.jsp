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
	function qbx(){
		$("input[name=mid]").each(function(){
			this.checked=!this.checked;
		})
	}
	function pxsc(){
		location.href = "list.do?flag=0";
	}
	function pxtime(){
		location.href = "list.do?flag=1";
	}
	function pxnd(){
		location.href = "list.do?flag=2";
	}
	function xiajia(id){
		$.post(
			"searchMovieById.do",
			{id:id},
			function(msg){
				if(msg.mtype==0){
					alert("该影片已下架");
				}else{
					var mid = msg.mid;
					$.post(
						"updateMtype.do",
						{id:mid},
						function(val){
							if(val>0){
								alert("下架成功");
								location.href = "list.do";
							}
						},
						"text"
					)
				}
			},	
			"json"
		)
	}
	
</script>
</head>
<body>
	<form action="list.do" method="post">
		<input type="text" name="mname">
		<input type="submit" value="查询影片">
		<input type="button" value="添加影片">
		<input type="button" value="删除影片">
	</form>
	
	<table>
		<tr>
			<td>
				<input type="checkbox" onclick="qbx()">
			</td>
			<td>影片名</td>
			<td>导演</td>
			<td>票价</td>
			<td onclick="pxtime()">上映时间↓</td>
			<td onclick="pxsc()">时长↓</td>
			<td>类型</td>
			<td onclick="pxnd()">年代↓</td>
			<td>区域</td>
			<td>状态</td>
			<td>操作</td>	
		</tr>
		<c:forEach items="${list }" var="l">
		<tr>
			<td>
				<input type="checkbox" value="${l.mid }" name="mid">
			</td>
			<td>${l.mname }</td>
			<td>${l.mdy }</td>
			<td>${l.price }</td>
			<td>${l.mtime }</td>
			<td>${l.msc }</td>
			<td>${l.tname }</td>
			<td>${l.myear }</td>
			<td>${l.mqy }</td>
			<td>${l.tyname }</td>
			<td>
				<input type="button" value="编辑" onclick="bianji()">
				<input type="button" value="下架" onclick="xiajia(${l.mid})">
			</td>	
		</tr>
		</c:forEach>
	</table>
</body>
</html>