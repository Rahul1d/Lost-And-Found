<%@page import="com.Trylof.services.service.ItemFoundLocalServiceUtil"%>
<%@page import="com.Trylof.services.service.ItemVerificationLocalServiceUtil"%>
<%@page import="com.Trylof.services.model.ItemVerification"%>
<%@page import="com.Trylof.services.model.ItemFound"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ page import="java.util.List" %>
<%@ page import="com.liferay.portal.kernel.util.ListUtil" %>

<portlet:defineObjects />
<img style="position:absolute; top:10px; left:10px; width:100px; height:25px;" src="<%=request.getContextPath()%>/images/white.jpg"  />

<portlet:renderURL var="BackUrl" >
<portlet:param name="path" value="adminlogin"/>
</portlet:renderURL>
<a href="<%=BackUrl%>">Back</a>
<%
int counts = ItemVerificationLocalServiceUtil.getItemVerificationsCount();
long uid = (long)request.getAttribute("userid");
 List <ItemVerification> books = ItemVerificationLocalServiceUtil.getDetailsByUser(uid,"Sent For Verification");
 %>
<liferay-ui:search-container
	emptyResultsMessage="There is no data to display">
		<liferay-ui:search-container-results  >
<%
results=ListUtil.subList(books,searchContainer.getStart(), searchContainer.getEnd());
total=books.size();
pageContext.setAttribute("results", results);
pageContext.setAttribute("total", total);
%>
</liferay-ui:search-container-results>
	

	<liferay-ui:search-container-row
		className="com.Trylof.services.model.ItemVerification"
		modelVar="aItemVerification">

<portlet:renderURL var="actionURL"  > 
 <portlet:param name="path" value="action"/>
 <portlet:param name="vid" value="<%=String.valueOf(aItemVerification.getItemVerificationId())%>" />
      </portlet:renderURL>
		
				<liferay-ui:search-container-column-text
			value="<%=String.valueOf(row.getPos() + 1)%>" name="Serial No" />
			<%ItemFound i = ItemFoundLocalServiceUtil.itemType(aItemVerification.getFoundItemid());
		   i.getFoundType();%>
		<liferay-ui:search-container-column-text  name="Item Type" value="<%=i.getFoundType() %>" />
		<liferay-ui:search-container-column-text value="View" href="<%=actionURL %>"
			 />
		
		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>


