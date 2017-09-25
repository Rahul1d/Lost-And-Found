<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.util.*"%>
<%@ page import="com.Trylof.services.service.ItemLostLocalServiceUtil" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ page import="java.util.*" %>
<%@ page import="com.Trylof.services.model.ItemLost" %>
<%@ page import="com.liferay.portal.kernel.util.ListUtil" %>
<%@ include file="init.jsp" %>
<img style="position:absolute; top:10px; left:10px; width:100px; height:25px;" src="<%=request.getContextPath()%>/images/white.jpg"  />
<portlet:renderURL var="LogoutUrl" >
<portlet:param name="path" value=" "/>
</portlet:renderURL>
<div align="right">
<aui:button name ="Logout" style="border-radius:50%;" value="Logout" type="button" align="right" onClick="<%=LogoutUrl %>" />
</div>
<portlet:defineObjects />
<%
 int count = ItemLostLocalServiceUtil.getItemLostsCount();
 List <ItemLost> books = ItemLostLocalServiceUtil.getDetailsByStatusMatch("Not found");
 %>
 
<portlet:renderURL var="BackUrl" >
<portlet:param name="path" value="Adminlogin"/>
</portlet:renderURL>
<a href="<%=BackUrl%>">Back</a>
<liferay-ui:search-container 	emptyResultsMessage="There is no data to display">

	<liferay-ui:search-container-results  >
<%
results=ListUtil.subList(books,searchContainer.getStart(), searchContainer.getEnd());
total=books.size();
pageContext.setAttribute("results", results);
pageContext.setAttribute("total", total);
%>
</liferay-ui:search-container-results>
	

	<liferay-ui:search-container-row
		className="com.Trylof.services.model.ItemLost"
		modelVar="aItemLost" keyProperty="ItemLostId"
	>
	<portlet:renderURL var="leaveApplicationURL" >
            <portlet:param name="path"  value="AddPage" />
            <portlet:param name="search" value="<%=String.valueOf(aItemLost.getItemLostId())%>" />
        </portlet:renderURL>
	 <portlet:resourceURL var="viewyURL" id="itemLost">
			<portlet:param name="dataId"
				value="<%=String.valueOf(aItemLost.getItemLostId())%>" />
		</portlet:resourceURL>	
         	<liferay-ui:search-container-column-text property="userId" name="User id"/>
        <liferay-ui:search-container-column-text property="lostType" name="Type"  />
		
		

		<liferay-ui:search-container-column-text property="lostDate"  name="Lost on  date"/>

		

		<liferay-ui:search-container-column-text property="lostLocation" name="location"/>

		

		<liferay-ui:search-container-column-text property="lostStatus" name="status"/>

             <liferay-ui:search-container-column-text name="Image"> <img src="<%=viewyURL.toString()%>" alt="no Image" height="50" width="100"> </liferay-ui:search-container-column-text>
        
		<liferay-ui:search-container-column-text value="Search" href="<%=leaveApplicationURL%>" />



	

		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator paginate="true"  searchContainer="<%= searchContainer %>" />
</liferay-ui:search-container>

