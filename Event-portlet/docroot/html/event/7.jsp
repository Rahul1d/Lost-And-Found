<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.util.*"%>
<%@ page import="com.Trylof.services.service.ItemLostLocalServiceUtil" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ page import="java.util.*" %>
<%@ page import="com.Trylof.services.model.ItemLost" %>
<%@ page import="com.liferay.portal.kernel.util.ListUtil" %>
<%@ include file="init.jsp" %>

<style>
.hidden { visibility: hidden; }
.unhidden { visibility: visible; }
</style>
<portlet:defineObjects />
<portlet:actionURL var="FounditemUrl" name="submitVerifyDetails"></portlet:actionURL>
<portlet:actionURL var="verifyUrl" name="Verification">
</portlet:actionURL>
<portlet:renderURL var="CancelUrl" >
<portlet:param name="path" value="details"/>
</portlet:renderURL>
<%
//Long userid = ParamUtil.getLong(renderRequest,"userid");
long uid = (long)request.getAttribute("userid");
System.out.println("user >>>"+uid);
 int count = ItemLostLocalServiceUtil.getItemLostsCount();
 List <ItemLost> books = ItemLostLocalServiceUtil.getDetailsByUserid(uid);
 int token = 0;
 for (ItemLost i:books)
 {
	 if(i.getLostStatus().equalsIgnoreCase("Match Found"))
	 {
		 System.out.println("found");
		 token=1;
		 request.setAttribute("token",1);
	 }
 }
 %>
 <img style="position:absolute; top:10px; left:10px; width:100px; height:25px;" src="<%=request.getContextPath()%>/images/white.jpg"  />
 <portlet:renderURL var="LogoutUrl" >
<portlet:param name="path" value=" "/>
</portlet:renderURL>
<div align="right">
<aui:button name ="Logout" style="border-radius:50%;" value="Logout" type="button" align="right" onClick="<%=LogoutUrl %>" />
</div>
 
<portlet:renderURL var="BackUrl" >
<portlet:param name="path" value="details"/>
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
	  <portlet:resourceURL var="viewURL" id="itemLost">
			<portlet:param name="dataId"
				value="<%=String.valueOf(aItemLost.getItemLostId())%>" />
		</portlet:resourceURL>
		<liferay-ui:search-container-column-text property="itemLostId" name="Item id"/>
		
			<liferay-ui:search-container-column-text property="lostType" name="Type"  />
			<liferay-ui:search-container-column-text property="lostDate"  name="date"/>
			<liferay-ui:search-container-column-text property="lostLocation" name="location"/>
		<liferay-ui:search-container-column-text property="lostColor" name="color" />

		<liferay-ui:search-container-column-text property="lostCompany" name="company"/>

	

	

		

		<liferay-ui:search-container-column-text property="lostSize" name="size"/>

		<liferay-ui:search-container-column-text property="lostStatus" name="status"/>

		<liferay-ui:search-container-column-text property="lostDesc"  name="desc"/>
		
	          <liferay-ui:search-container-column-text name="Image"> <img src="<%=viewURL.toString()%>" alt="no Image" height="50" width="100"> </liferay-ui:search-container-column-text>
		
        
		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator paginate="true"  searchContainer="<%=searchContainer %>" />
</liferay-ui:search-container>

<div id="Proceed">
<!-- This same as your request attribute -->
<c:choose>
    <c:when test="${token == 1}">
        <aui:button type="button" value="Proceed to Verification"  name ="try"  onClick="showDiv('Adminor')" />
    </c:when>
      
</c:choose>
</div>

<%
 
 List <ItemLost> i = ItemLostLocalServiceUtil.getDetailsByStatusMatchAndUser("Match Found", uid);
 %>
<div class="hidden" id="Adminor">
<aui:form name="form1" action="<%=FounditemUrl %>" method="post" enctype="multipart/form-data">
<aui:select id="Lostid" name="Lostid" >
<%
if(Validator.isNotNull(i)){
for (ItemLost con : i ){ 

%>
<aui:option value="<%=con.getItemLostId() %>"><%=con.getItemLostId() %></aui:option>
<%}
}%>
</aui:select>


<aui:input name="IdProof" label="Upload Your Identification Details(Image size should be less than 100Kb)" type="file" >
<aui:validator name="required"></aui:validator>
</aui:input>
<aui:input name="bill" label="Upload Your Bill If available (Image size should be less than 100Kb)" type="file" />

<aui:input label="Enter additional description" type="textarea" style="width: 100%;" name="VerifyDescription" rows="7" />
<aui:button name="Submit" type="submit" value="Submit Item" ></aui:button>
<aui:button name ="Cancel"  value="Cancel" type="button" onClick="<%=CancelUrl %>" />
</aui:form>
</div>
<script type="text/javascript">
function hideDiv(divID) {
    var item = document.getElementById(divID);
    if (item) {
       item.className='hidden';
    }
}
 function showDiv(divID) {
    var item = document.getElementById(divID);
 if (item) {
        item.className='unhidden';
        }
   hideDiv('Proceed');
}



</script>
