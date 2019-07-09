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
	function qx(){
		$("input[name=sid]").each(function(){
			this.checked=!this.checked;
		})
	}
	function add(){
		location.href = "add.jsp";
	}
	function pdel(){
		var sids = $("input[name=sid]:checked").map(function(){
			return this.value
		}).get().join()
		$.post(
			"deleteAll.do",
			{sids:sids},
			function(msg){
				if(msg>0){
					alert("删除成功");
					location.href = "list.do";
				}
			},
			"text"
		)
	}
	function chakan(sid){
		location.href = "slist.jsp?sid="+sid;
	}
</script>
</head>
<body>
	<form action="list.do" method="post">
		销售商品:<input type="checkbox">IBM笔记本
		<input type="checkbox">华为手机
		<input type="checkbox">苹果手机
		<input type="checkbox">内存<br><br>
		店铺名称:<input type="text" name="sname">
		<input type="submit" value="查询">
		<input type="button" value="添加" onclick="add()">
		<input type="button" value="批量删除" onclick="pdel()">
	</form>
	<table>
		<tr>
			<td>
				<input type="checkbox" onclick="qx()">
			</td>
			<td>编号</td>
			<td>店铺名称</td>
			<td>创建时间</td>
			<td>销售商品</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${page.list }" var="l">
		<tr>
			<td>
				<input type="checkbox" value="${l.sid }" name="sid">
			</td>
			<td>${l.sid }</td>
			<td>${l.sname }</td>
			<td>${l.sdate }</td>
			<td>${l.gnames }</td>
			<td>
				<input type="button" value="详情" onclick="chakan(${l.sid})">
			</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="10">
				<a href="list.do?pageNum=1">首页</a>
				<a href="list.do?pageNum=${prePage }">上一页</a>
				<a href="list.do?pageNum=${nextPage }">下一页</a>
				<a href="list.do?pageNum=${lastPage }">尾页</a>
			</td>
		</tr>
	</table>
</body>
</html>