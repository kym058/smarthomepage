<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>이미지 파일 업로드</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/member/image.do"
		method="post" enctype="multipart/form-data">
		<input type="text" name="title" id="title"  />
		<input type="file" name="imageFile" id="imageFile" />
		<input type="submit" value="이미지전송" />
	</form>
	
	<div>
		<img src="${pageContext.request.contextPath}/images/<%=request.getAttribute("imageName") %>" alt="" />
	</div>
</body>
</html>