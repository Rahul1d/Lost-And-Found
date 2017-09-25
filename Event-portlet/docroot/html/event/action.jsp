 
 <%@page import="com.Trylof.services.service.ItemFoundLocalServiceUtil"%>
<%@page import="com.Trylof.services.service.ItemVerificationLocalServiceUtil"%>
<%@page import="com.Trylof.services.model.ItemVerification"%>
<%@page import="com.Trylof.services.model.ItemFound"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<img style="position:absolute; top:10px; left:10px; width:100px; height:25px;" src="<%=request.getContextPath()%>/images/white.jpg"  />
<%@ include file="init.jsp" %>
<%
String itemid = ParamUtil.getString(renderRequest, "vid");

ItemVerification blobDemo = ItemVerificationLocalServiceUtil.getItemVerification(Long.parseLong(itemid));
//String rowURL = (String)row.getParameter("rowURL");
%>
 <portlet:actionURL var="MatchVerifyURL" name="actmet" > 
 <portlet:param name="path" value="action"/>
 <portlet:param name="itemdd" value="<%=String.valueOf(itemid) %>"/>
      </portlet:actionURL>
      <portlet:actionURL var="MatchNotVerifyURL" name="notVerifyMethod" > 
 <portlet:param name="path" value="action"/>
 <portlet:param name="itemdd" value="<%=String.valueOf(itemid) %>"/>
      </portlet:actionURL>
<portlet:resourceURL  var="viewURL" id="itemFound"> 
       	<portlet:param name="dataId" value="<%=String.valueOf(blobDemo.getFoundItemid()) %>"/> 
       </portlet:resourceURL>
 
     
      <portlet:actionURL name="delete" var="deleteURL"> 
      	<portlet:param name="dataId" value="<%=String.valueOf(blobDemo.getItemVerificationId()) %>"/> 
      </portlet:actionURL>
      
        <portlet:resourceURL  var="viewURL1" id="itemLost"> 
       	<portlet:param name="dataId" value="<%=String.valueOf(blobDemo.getLostItemid()) %>"/> 
       </portlet:resourceURL>
   <portlet:resourceURL  var="viewURL2" id="itemVerify1"> 
       	<portlet:param name="dataId" value="<%=String.valueOf(blobDemo.getItemVerificationId()) %>"/> 
       </portlet:resourceURL>
   <portlet:resourceURL  var="viewURL3" id="itemVerify2"> 
       	<portlet:param name="dataId" value="<%=String.valueOf(blobDemo.getItemVerificationId()) %>"/> 
       </portlet:resourceURL>
        <table align="right" >
       <caption>Verification Proof</caption>
  <tr><td>Identity Proof &nbsp  &nbsp &nbsp &nbsp
  <td>  <img src="<%=viewURL3.toString()%>" alt="No image avaliable " height="100" width="150"/> 
  </tr>
  <tr><td>Bill: &nbsp &nbsp &nbsp &nbsp &nbsp
  <td>  <img src="<%=viewURL2.toString()%>" alt="No image avaliable " height="100" width="150"/> 
  </tr>
</table>
 <table>
       <caption>Item Found</caption>
  <tr>
   <td> <img src="<%=viewURL.toString()%>" alt="No image avaliable " height="100" width="150"/> 
  </tr>
</table>
     <table>
       <caption>Item Lost</caption>
  <tr>
   <td> <img src="<%=viewURL1.toString()%>" alt="No image avaliable " height="100" width="150"/> 
  </tr>
</table>
<div align="center">
Additional Desrciption: <% out.print(blobDemo.getVerifyDesc()); %>
</div>
  <div align="center">
  <br>
  <br><br><br>
  <br>
  <aui:button style=" background-color: white;
    color: black;
    border: 2px solid green;" type="button" name="verify" value="Verified" onClick="<%=MatchVerifyURL %>" />&nbsp &nbsp  
   <aui:button type="button"style=" background-color: white;
    color: black;
    border: 2px solid red;" name="verify" value="Not Verified" onClick="<%=MatchNotVerifyURL %>" />
  </div>
      
