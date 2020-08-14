<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>猜数字</title>
</head>
<body>
	<f:view>
		<h:form id = "helloForm">
			<h2>请猜一个<h:outputText value="#{testBean.minNum}" />
	    	至<h:outputText value="#{testBean.maxNum}" />的数字</h2>
	    	
	    	<h:inputText id="userNo" value="#{testBean.userNumber}">
	     		<f:validateLongRange minimum="#{testBean.minNum}" maximum="#{testBean.maxNum}" />
	    	</h:inputText>
			<h:commandButton id="submit" action="success" value="提交" />
			<br/>
			<h:message style="color:red;" id="errors1" for="userNo"/>
		</h:form>
</f:view>
</body>
</html>