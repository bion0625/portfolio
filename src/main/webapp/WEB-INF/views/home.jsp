<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>portfolio</title>
		<style type="text/css">
			*{	margin: 0;
				padding: 0;}
			li{list-style: none;}
			a{text-decoration: none;
				color: #000;}
			
			#head_var{
				width: 1200px;
				position: absolute;
				border: 1px solid gray;
			}
			#head_var li a:hover{
				color: #aaa;
				background: #fff;
			}
			#menu_var{
			}
			#menu_var li {
				float: left;
				width: 150px;
			}
			#menu_var li a{
				color: #fff;
				background: #000;
				display: block;
				border: 1px solid gray;
				text-align: center;
			}
			#private_var{
			}
			#private_var li {
				float: right;
				width: 150px;
			}
			#private_var li a{
				color: #fff;
				background: #000;
				display: block;
				border: 1px solid gray;
				text-align: center;
			}
		</style>
	</head>
	<body>
		<div id="head_var">
			<h1 align="center">
				포트폴리오portfolio - 이의정
			</h1>
			<h2 align="center">
				글쓰기에 관한 게시판입니다.
			</h2>
			<ul id="menu_var">
				<li><a href="#">글감 생성기</a></li>
				<li><a href="#">게시판</a></li>
			</ul>
			<ul id="private_var">
				<li><a href="#">로그인</a></li>
				<li><a href="#">ADMIN</a></li>
			</ul>
		</div>
	</body>
</html>