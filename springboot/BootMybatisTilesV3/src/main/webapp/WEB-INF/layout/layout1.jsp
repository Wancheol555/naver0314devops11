<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
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
    div.mainlayout>div{
        border: 0px solid gray;
        position: absolute;
    }
    div.mainlayout>div a{
        text-decoration: none;
        color: black;
    }
    div.mainlayout>div.header{
        width: 100%;
        height: 150px;
        line-height: 100px;
        font-size: 35px;
        text-align: center;
    }
    div.mainlayout>div.menu{
        top: 100px;
        width: 100%;
        height: 80px;
        line-height: 80px;
    }
    div.mainlayout>div.info{
        top:250px;
        left: 50px;
        width: 180px;
        height: 200px;

    }
    div.mainlayout>div.main{
        top:210px;
        left: 300px;
        width: 70%;
        height: auto;
    }

</style>

<body>

<div class="mainlayout">
    <div class="header">
        <tiles:insertAttribute name="header"/>
    </div>
    <div class="menu">
        <tiles:insertAttribute name="menu"/>
    </div>
    <div class="info">
        <tiles:insertAttribute name="info"/>
    </div>
    <div class="main">
        <tiles:insertAttribute name="main"/>
    </div>
</div>
</body>
</html>

