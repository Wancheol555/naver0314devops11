<%--
  Created by IntelliJ IDEA.
  User: wancheol
  Date: 5/20/24
  Time: 10:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
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
<h3 class="alert alert-danger">Post 방식으로 데이타 읽기 -dto</h3>
<form action="./read3" method="post">
    <table class="table" style="width: 300px">
        <tr>
            <th width="100">메뉴명</th>
            <td>
                <input type="text" name="foodname" class="form-control">
            </td>
        </tr>
        <tr>
            <th width="100">사진</th>
            <td class="input-group">
                <select name="foodphoto" id="fphoto" class="form-control">
                    <c:forEach var="s" begin="1" end="12">
                        <option>${s}.jpg</option>
                    </c:forEach>
                </select>
                <img src="./image/1.jpg" width="40" border="1" id="foodphoto">
                <script type="text/javascript">
                    $("#fphoto").change(function (){
                        $("#foodphoto").attr("src","./image/"+$(this).val());
                    });
                </script>
            </td>
        </tr>
        <tr>
            <th width="100">가격</th>
            <td>
                <input type="text" name="price" class="form-control">
            </td>
        </tr>
        <tr>
            <th width="100">갯수</th>
            <td>
                <input type="text" name="cnt" class="form-control">
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <button type="submit" class="btn btn-success">폼 전체 전송</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
