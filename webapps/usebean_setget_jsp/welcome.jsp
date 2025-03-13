<jsp:useBean id="obj" class="com.javatpoint.User" />
<jsp:setProperty name="obj" property="*" />

Welcome, <jsp:getProperty name="obj" property="name" />