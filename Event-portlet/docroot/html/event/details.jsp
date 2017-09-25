<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ include file="init.jsp" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>

<portlet:defineObjects />

You sucessfully logged in a user<br>


<img style="position:absolute; top:10px; left:10px; width:100px; height:25px;" src="<%=request.getContextPath()%>/images/white.jpg"  /> 
<portlet:renderURL var="LogoutUrl" >
<portlet:param name="path" value=" "/>
</portlet:renderURL>
<div align="right">
<aui:button name ="Logout"  style="border-radius:50%;" value="Logout" type="button" align="right" onClick="<%=LogoutUrl %>" />
</div>
<portlet:actionURL var="actionUrl" name="goclaim"></portlet:actionURL>
<portlet:actionURL var="ActionUrl" name="ViewClaimsUser">
<portlet:param name="path" value="ViewClaim"/>
</portlet:actionURL>
<aui:button name ="Claim" value="Go for Claim" onClick="<%=actionUrl %>" />
<aui:button name ="Viewclaim" value="View submitted claim" onClick="<%=ActionUrl %>" />