<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>结果</title>
</head>
<body>
	<f:view>
 		<h:form id="responseForm">
    	<h2>
    		 <h:outputText id="result" value="#{UserNumberBean.responseStr}" />
    	</h2>
    
    	<h:commandButton id="back" value="返回" action="success" />
 		</h:form>
	</f:view>
</body>
</html>