<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.util.*"%>
<%@ page import="com.Trylof.services.service.ItemFoundLocalServiceUtil" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ page import="java.util.*" %>
<%@ page import="com.Trylof.services.model.ItemFound" %>
<%@ page import="com.liferay.portal.kernel.util.ListUtil" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:renderURL var="LogoutUrl" >
<portlet:param name="path" value=" "/>
</portlet:renderURL>
<div align="right">
<aui:button name ="Logout" style="border-radius:50%;" value="Logout" type="button" align="right" onClick="<%=LogoutUrl %>" />
</div>

<portlet:defineObjects />
<%
 int count = ItemFoundLocalServiceUtil.getItemFoundsCount();
 List <ItemFound> books = ItemFoundLocalServiceUtil.getItemFounds(0, count);
 %>
 
<img style="position:absolute; top:10px; left:10px; width:100px; height:25px;" src="<%=request.getContextPath()%>/images/white.jpg"  />
<portlet:renderURL var="BackUrl" >
<portlet:param name="path" value="adminlogin"/>
</portlet:renderURL>
<a href="<%=BackUrl%>">Back</a>
<liferay-ui:search-container  	emptyResultsMessage="There is no data to display" >

	<liferay-ui:search-container-results  >
<%
results=ListUtil.subList(books, searchContainer.getStart(), searchContainer.getEnd());
total=books.size();
pageContext.setAttribute("results", results);
pageContext.setAttribute("total", total);
%>
</liferay-ui:search-container-results>
	

	<liferay-ui:search-container-row
		className="com.Trylof.services.model.ItemFound"
		modelVar="aItemFound" keyProperty="ItemFoundId"
	>
	<portlet:renderURL var="leaveApplicationURL">
            <portlet:param name="path"  value="AddPage" />
            <portlet:param name="search" value="<%=String.valueOf(aItemFound.getItemFoundId())%>" />
        </portlet:renderURL>
        <portlet:resourceURL var="viewURL" id="itemFound">
			<portlet:param name="dataId"
				value="<%=String.valueOf(aItemFound.getItemFoundId())%>" />
		</portlet:resourceURL>
		<liferay-ui:search-container-column-text property="foundColor" name="color" />

		<liferay-ui:search-container-column-text property="foundCompany" name="company"/>

		<liferay-ui:search-container-column-text property="foundDate"  name="date"/>

		<liferay-ui:search-container-column-text property="foundDesc"  name="desc"/>

		<liferay-ui:search-container-column-text property="foundLocation" name="location"/>

		<liferay-ui:search-container-column-text property="foundSize" name="size"/>

		<liferay-ui:search-container-column-text property="foundStatus" name="status"/>

		<liferay-ui:search-container-column-text property="foundType" name="Type"/>

		<liferay-ui:search-container-column-text property="itemFoundId" name="id"/>


		
	<liferay-ui:search-container-column-text property="lostItem" name="Matched to LostItem id"/>
     <liferay-ui:search-container-column-text name="Image"> <img src="<%=viewURL.toString()%>" alt="no Image" height="50" width="100"> </liferay-ui:search-container-column-text>
		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator paginate="true"  searchContainer="<%= searchContainer %>" />
</liferay-ui:search-container>

<%
//String path = ParamUtil.getString(renderRequest, "search");
//out.print(path);
%>