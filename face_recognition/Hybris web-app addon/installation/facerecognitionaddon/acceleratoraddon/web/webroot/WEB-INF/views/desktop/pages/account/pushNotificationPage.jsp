<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template" %>

<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<template:page pageTitle="${pageTitle}">
	<div id="breadcrumb" class="breadcrumb">
		<breadcrumb:breadcrumb breadcrumbs="${breadcrumbs}"/>
	</div>
	<div id="globalMessages">
		<common:globalMessages/>
	</div>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
	<title>pushnotification page</title>
	<!-- Edit Below -->
	<link rel="stylesheet" type="text/css" href="${commonResourcePath}/../../addons/facerecognitionaddon/desktop/common/css/style_browse_button.css" />
	<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
</head>
<body>
<br>
<br>
<br>
		<c:if test="${not empty message}">
			<h5>${message}</h5>
		</c:if>
		<h3>Send Notification:</h3>
		<form id="form2" method="post" action="pushNotification" enctype="multipart/form-data">
		  <!-- File input -->    
		  Select User :
		  <select id="username">
			
				<c:forEach var="csrcustomer" items="${csrCustomer}">
					<option value="${csrcustomer.devicetoken}">${csrcustomer.customerId}</option>
				</c:forEach>
			</select>
			<br/>
			<br/>
		  
		  Please enter your message:
		  <p></p>
		 
		 <textarea id ="pushmessage" rows="10" cols="40" name="message"></textarea>
		</form>
	 
		<button value="Submit" onclick='pushNotification();'>send notification</button>
		<script type="text/javascript">
		function pushNotification() 
		{
			
			var devicetoken = document.getElementById('username').value;
			var message = document.getElementById('pushmessage').value;
			alert("${contextPath}/pushNotification/push"+devicetoken);

            $.ajax({
					type : "GET",
					url : "${contextPath}/pushNotification/push",
					data : "devicetoken="+devicetoken+"&message="+message,

					dataType: "json",				
					success : function(response) 
					{
						alert("message sent successfully!!");
					},
					error : function(e) {
						alert("message not sent!!"+e);
					}
				});
		    }
		    
		    </script>
		    
		    </body>
		    </html>
		   </template:page> 
		