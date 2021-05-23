<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<body>
<h1>All Products list</h1>
<br>

<ul>
    <c:forEach var="item" items="${products}">
        <li><a href="/product/${item.id}">${item.title} - ${item.cost}</a></li>
    </c:forEach>
</ul>
<br>
<a href="/product/showForm">Add product</a>
</body>
</html>