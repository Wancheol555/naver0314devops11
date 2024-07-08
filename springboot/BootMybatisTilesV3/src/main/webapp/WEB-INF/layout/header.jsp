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
<body>
<c:set var="root" value="<%=request.getContextPath()%>"/>
<a href="${root}/">
    <img src="${root}/mycar/111.jpeg" width="50">
    SpringBoot&JSP 프로젝트</a>
<img src="${root}/mycar/111.jpg" width="50">

</body>
</html>
