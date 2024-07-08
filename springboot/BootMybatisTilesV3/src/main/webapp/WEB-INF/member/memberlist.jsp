<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: qhal5
  Date: 2024-05-23
  Time: 오전 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<c:set var="stpath" value="https://kr.object.ncloudstorage.com/bitcamp-bucket-56/photocommon"/>
<body>
<h2 class="alert alert-danger" style="width: 600px">
    총 ${totalCount}명의 회원이 있습니다
    <span style="float: right">
        <button type="button" class="btn btn-sm btn-success"
                onclick="location.href='./form'">멤버등록</button>
    </span>
</h2>
<%--<!-- amin 이 아닌계정으로 로그인을 했거나 로그인상태가 아닐경우 보여질 모세지-->--%>
<%--<c:if test="${sessionScope.loginok==null or sessionScope.loginid!='admin'}">--%>
<%--    <h2>--%>
<%--        <b>--%>
<%--            전체 회원 명단은 관리자만 확인가능해용~--%>
<%--        </b>--%>
<%--    </h2>--%>
<%--</c:if>--%>
<%--<!-- amin 계정으로 로그인시에만 전체 명단을 확인가능-->--%>
<%--<c:if test="${sessionScope.loginok!=null and sessionScope.loginid=='admin'}">--%>
    <table class="table table-striped" style="width: 600px">
        <caption align="top">
            <h2>회원정보</h2>
        </caption>
        <tr class="table-danger">
            <th width="100">번호</th>
            <th width="200">회원명</th>
            <th width="100">아이디</th>
            <th width="100">핸드폰</th>
            <th width="100">상세보기</th>
        </tr>
        <c:forEach var="dto" items="${list}">
            <tr>
                <td>${dto.num}</td>
                <td>
                    <img src="${stpath}/${dto.photo}" class="rounded-circle" style="width: 30px; height: 30px;"
                         onerror="this.src='../image/noimages1.jpeg'">
                        ${dto.name}
                </td>
                <td>${dto.myid}</td>
                <td>${dto.hp}</td>
                <td>
                    <button type="button" class="btn btn-sm btn-info"
                            onclick="location.href='./detail?num=${dto.num}'">Detail</button>
                </td>
            </tr>
        </c:forEach>
    </table>
<%--</c:if>--%>
</body>
</html>