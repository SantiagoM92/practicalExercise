<%@ include file="/WEB-INF/views/root.jsp" %>

<html>
<head><title><fmt:message key="productsTitle"/></title></head>

<h1><fmt:message key="productsHeading"/></h1>
<table border="2" width="70%" cellpadding="2">
    <tr>
        <th><fmt:message key="productName"/></th>
        <th><fmt:message key="productValue"/></th>
        <th><fmt:message key="edit"/></th>
        <th><fmt:message key="delete"/></th>
    </tr>
    <c:forEach items="${productModel.products}" var="product">
        <tr>
            <td>${product.name}</td>
            <td>$<c:out value="${product.value}"/></td>
            <td><a href="product/edit/${product.code}"><fmt:message key="edit"/></a></td>
            <td><a href="product/delete/${product.code}"><fmt:message key="delete"/></a></td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="/product/new">Add New</a>