<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>


<img style="position:absolute; top:10px; left:10px; width:100px; height:25px;" src="<%=request.getContextPath()%>/images/white.jpg"  />
<table align="center">
<tr><td>
<img  src="<%=request.getContextPath()%>/images/lost-and-found-logo.jpg" align="middle" />
</table>

<portlet:renderURL var="loginURL" >
   <portlet:param name="path" value=" loginPage" />
  
</portlet:renderURL>

<portlet:renderURL var="createURL"  >
 <portlet:param name="path" value="createPage" />
  
</portlet:renderURL>
<aui:form >

  
   <br><br><br>
   <div align="center" 
     >
    
    <br>
    <aui:button name="login" type="submit" id="login" onClick="<%=loginURL %>" value="Click Here For Login" />
    &nbsp
    &nbsp
    <aui:button name ="create" type="submit" id="create" onClick="<%=createURL %>" value="CREATE account" />
  <br>
  <br>
  </div>


</aui:form>






