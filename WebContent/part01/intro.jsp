<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>환경구축</title>
</head>
<body>
	<div>
		<h3>웹 프로그래밍</h3>
		<ul>
			<li>웹서버 : 요청을 받아 웹페이지를 찾아서 보내주는 일을 하는 프로그램</li>
			<li>클라이언트 : 요청된 페이지를 받아보는 브라우저</li>
			<li>웹어플리케이션 : 웹(인터넷)을 기반으로 실행되는 어플리케이션</li>
		</ul>
	</div>
	<div>
		<h3>개발환경 구축하기</h3>
		<ol>
			<li>JDK 1.7
				<a href="http://www.oracle.com/technetwork/java/javase/downloads/index.html">
					다운로드 : 예제는 1.7 버전을 사용함
				</a>
			</li>
			<li>Tomcat 7.0
				<a href="http://tomcat.apache.org/download-70.cgi">
					다운로드 
				</a>
			</li>
			<li>이클립스
				<a href="http://eclipse.org/">다운로드</a>
			</li>
			<li>
				이클립스와 톰캣의 연동
			</li>
			<li>
				이클립스 인코딩 방식을  UTF-8 로 변경하기
			</li>
			<li>
				Dynamic Web Project 를 만들고 jsp 파일 만들기
			</li>
		</ol>
	</div>
	<div>
		<h3>서블릿과 JSP 기초개념</h3>
		<ul>
			<li>
				서블릿(Servlet) : Server + Applet 합성어로 서버에서 실행되는 Applet 이란 의미로<br />
				자바를 이용하여 웹에서 실행되는 프로그램을 작성하는 기술을 말한다 <br />
				<a href="part01/add_demo.do">예제 : 서블릿 방식</a><br />
				<a href="part01/add_demo2.do">예제 : 모델 1 방식(JSP버전)</a><br />
				<a href="part01/add_demo3.do">예제 : 모델 2 방식(향상된 서블릿)</a><br />
			</li>
		</ul>
	</div>
	<div>
		<h3>GET 방식과 POST 방식의 차이점</h3>
		<ul>
			<li>
				<a href="part01/go_method.do">메소드JSP 로 이동</a>
			</li>
		</ul>
	</div>
</body>
</html>





