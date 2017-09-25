
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@page import="java.util.Calendar"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:actionURL var="FounditemUrl" name="submitFounditem"></portlet:actionURL>
<portlet:renderURL var="CancelUrl" >
<portlet:param name="path" value="adminlogin"/>
</portlet:renderURL>
<img style="position:absolute; top:10px; left:10px; width:100px; height:25px;" src="<%=request.getContextPath()%>/images/white.jpg"  />
<portlet:renderURL var="LogoutUrl" >
<portlet:param name="path" value=" "/>
</portlet:renderURL>
<div align="right">
<aui:button name ="Logout" style="border-radius:50%;" value="Logout" type="button" align="right" onClick="<%=LogoutUrl %>" />
</div>

<%
// To set today's date as default for the calendar.
Calendar today = Calendar.getInstance();
%>
<aui:form name="form1" action="<%=FounditemUrl %>" method="post" enctype="multipart/form-data">
<aui:select name="itemtype">

  <aui:option  value="Bag">Bag(Not lugggage)</aui:option>
<aui:option  value="Laptop">Laptop</aui:option>
 <aui:option  value="Camera">Camera/ Photo equipment</aui:option>>
 <aui:option  value="Phone">Phone</aui:option>
 <aui:option  value="Phone_assr">Phone accessory</aui:option>
 <aui:option  value="tape">Tape/Disc</aui:option>
 <aui:option  value="Keys">Keys</aui:option>
 <aui:option  value="Electronic">Electronic Equipment</aui:option>
 
</aui:select>
<div>
Date
<liferay-ui:input-date name="dobDate" 
			dayValue="<%= today.get(Calendar.DAY_OF_MONTH) %>" dayParam="dobDay"
			monthValue="<%= today.get(Calendar.MONTH) %>" monthParam="dobMonth"
			yearValue="<%= today.get(Calendar.YEAR) %>" yearParam="dobYear" />
</div>
<aui:input name="lostLocation" type="text" size="10" value=''>
<aui:validator name="required"></aui:validator>
</aui:input>
	<aui:input name="itemCompany" label=" Item Company/Model" type="text" value=''></aui:input>
<aui:input name="itemColor" label=" Item Color" type="text" value=''></aui:input>
<aui:input name="itemSize" label=" Item Size" type="text" value=''></aui:input>
<aui:input label="Enter additional description" type="textarea" style="width: 100%;" name="description" rows="7" />
<aui:input name="file" label="Upload image of item Found" type="file" />
<aui:button name="Submit" type="submit" value="Submit Item" />
<aui:button name ="Cancel"  value="Cancel" type="button" onClick="<%=CancelUrl %>" />
</aui:form>



<script type="text/javascript" charset="utf-8">
AUI().use('aui-datepicker', function(A) {
var simpleDatepicker1 = new A.DatePicker({
trigger: '#myDatepicker',
calendar: {
dateFormat: '%d/%m/%y %A',
setValue: true,
minDate: '01/01/2011',
maxDate: '09/05/2012',
selectMultipleDates: false
}
}).render();
});
</script>

 



