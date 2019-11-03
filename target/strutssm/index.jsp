<%@ taglib uri="/struts-tags" prefix="s"%>
<%@page isELIgnored="false" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>

<body>
<h2>Hello World!</h2>
<s:property value="#request.aa"/><br>
${requestScope.aa}
</body>
</html>
