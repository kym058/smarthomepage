<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>CheckBox 폼</title>
</head>
<body>
	<h2>악세사리</h2>
	관심항목을 선택하세요 <hr />
	<form action="${pageContext.request.contextPath}/part03/checkbox.do">
		<input type="checkbox" name="item" value="신발" />신발
		<input type="checkbox" name="item" value="가방" />가방
		<input type="checkbox" name="item" value="벨트" />벨트
		<input type="checkbox" name="item" value="모자" />모자
		<input type="checkbox" name="item" value="시계" />시계
		<input type="checkbox" name="item" value="쥬얼리" />쥬얼리
		<input type="submit" value="전 송" />		
	</form>
	
</body>
</html>