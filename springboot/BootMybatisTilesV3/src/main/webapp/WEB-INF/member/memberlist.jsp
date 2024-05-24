<%--
  Created by IntelliJ IDEA.
  User: wancheol
  Date: 5/23/24
  Time: 11:53 AM
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
    </style>
</head>
<body>
<img src="<%=request.getContextPath()%>/mycar/mycar13.png" width="100">
<h3 class="alert alert-success">총 ${totalCount}명의 회원이 있습니다</h3>
<table class="table table-bordered" style="width: 700px">
    <tr class="table-success">
        <td>번호</td>
        <td>회원명</td>
        <td>아이디</td>
        <td>핸드폰</td>
        <td>상세보기</td>
    </tr>

    <c:forEach var="s" items="${list}" varStatus="i">
        <tr>
            <td>${s.num}</td>
            <td><img src="../save/${s.photo}" style="width: 100px;height: 100px" onerror="this.src='../image/noimages1.jpeg'"> ${s.name}</td>
            <td>${s.myid}</td>
            <td>${s.hp}</td>
            <td>
                <button type="button" class="btn btn-sm btn-outline-secondary"
                        onclick="location.href='./detail?num=${s.num}'">Detail</button>
            </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
