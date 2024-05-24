<%--
  Created by IntelliJ IDEA.
  User: wancheol
  Date: 5/23/24
  Time: 4:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css">
    <link href="https://fonts.googleapis.com/css2?family=Caveat:wght@400..700&family=Dancing+Script:wght@400..700&family=East+Sea+Dokdo&family=Jua&family=Gaegu&family=Gamja+Flower&family=Pacifico&family=Single+Day&display=swap"
          rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
    <style>
        body * {
            font-family: 'Jua';
        }

        ul.menu {
            list-style: none;
            text-align: center;
            background-color: #f0f0f0; /* 배경색 */
        }

        ul.menu li {
            float: left;
            width: 120px;
            font-size: 22px;
            margin-left: 20px;
            margin-right: 20px;
            background-color: #fff; /* 항목 배경색 */
        }

        ul.menu li a {
            color: #333; /* 글꼴 색상 */
            text-decoration: none; /* 밑줄 없음 */
            padding: 10px; /* 여백 */
        }

        ul.menu li:hover {
            background-color: #e0e0e0; /* 마우스 올라갔을 때 배경색 */
        }

        ul.menu li.active {
            background-color: #ccc; /* 선택된 항목 배경색 */
        }

        /* 드롭다운 메뉴 스타일 */
        ul.menu li ul {
            position: absolute;
            display: none;
            background-color: #fff;
            list-style: none;
            padding: 0;
        }

        ul.menu li:hover ul {
            display: block;
        }

        ul.menu li ul li {
            margin: 0;
            padding: 10px;
        }
    </style>
</head>
<body>
<c:set var="root" value="<%=request.getContextPath()%>"/>
<ul class="menu">
    <li>
        <a href="${root}/" style="color: red">Home</a>
    </li>
    <li>
        <a href="${root}/member/form" style="color: orange">회원가입</a>
    </li>
    <li>
        <a href="${root}/member/list" style="color: green">회원목록</a>
    </li>
    <li>
        <a href="${root}/board/list" style="color: blue">게시판</a>
    </li>
    <li>
        <a href="${root}/guest/list" style="color: purple">방명록</a>
    </li>
</ul>

</body>
</html>
