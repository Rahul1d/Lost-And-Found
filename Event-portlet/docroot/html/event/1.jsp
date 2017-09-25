<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<portlet:defineObjects />
<img style="position:absolute; top:10px; left:10px; width:100px; height:25px;" src="<%=request.getContextPath()%>/images/white.jpg"  />
You sucessfully logged in a Admin<br>
<portlet:actionURL var="actionUrl" name="itemFound" />
<portlet:actionURL var="Actionurl" name ="Foundlist"  />
<portlet:renderURL var="SearchUrl" >
<portlet:param name="path" value="SearchPage"/>
</portlet:renderURL>

<portlet:renderURL var="ClaimUrl" >
<portlet:param name="path" value="ViewClaimAdmin"/>
</portlet:renderURL>
<portlet:actionURL var="VerifyUrl" name="Verification">
</portlet:actionURL>
<portlet:renderURL var="LogoutUrl" >
<portlet:param name="path" value=" "/>
</portlet:renderURL>
<div align="right">
<aui:button name ="Logout" style="border-radius:50%;" value="Logout" type="button" align="right" onClick="<%=LogoutUrl %>" />
</div>
<aui:button-row>
<aui:button name="Foundlist" value="Get found items list" onClick="<%=Actionurl %>" />
<aui:button name ="Submitfound" value="Submit item found" onClick="<%=actionUrl %>" />
<aui:button name="ViewClaim" value="Get Claims from User " onClick="<%=ClaimUrl %>" />
<aui:button name="ViewVerification" value="Verification List" onClick="<%=VerifyUrl %>" />
</aui:button-row>