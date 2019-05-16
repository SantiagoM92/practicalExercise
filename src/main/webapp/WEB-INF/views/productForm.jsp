<%@ include file="/WEB-INF/views/root.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head><title><fmt:message key="productTitle"/></title></head>
<h1><fmt:message key="productHeading"/></h1>

<form:form method="POST" modelAttribute="productModel" action="/product/save">
    <table>
        <tr>
            <td></td>
            <td><form:hidden path="code"/></td>
        </tr>
        <tr>
            <td><fmt:message key="productName"/></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><fmt:message key="productValue"/></td>
            <td>$<form:input path="value"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Save"/></td>
        </tr>
    </table>
</form:form>