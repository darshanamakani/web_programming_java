<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Tag Example</title>  
</head>  
<body>  
<c:import var="data" uri="https://www.javatpoint.com"/>  
<c:out value="${data}"/>  
</body>  