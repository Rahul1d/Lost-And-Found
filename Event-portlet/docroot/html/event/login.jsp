
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<portlet:defineObjects />

<portlet:actionURL var="loginAction" name="methodact">
</portlet:actionURL>
<portlet:renderURL var="Cancelurl" >
<img style="position:absolute; top:10px; left:10px; width:100px; height:25px;" src="<%=request.getContextPath()%>/images/white.jpg"  />
</portlet:renderURL>

<aui:form name="form1" id="form1" action="<%=loginAction %>" method="POST">
<aui:input name="Email" type="text" label="Email" /> 
<aui:input name="password" type="password"></aui:input> 
<aui:button name="submit" type="submit" value="SUBMIT" />  
<aui:button name="cancel" type="button" onClick="<%=Cancelurl %>" value="CANCEL"  />
</aui:form> 

<liferay-ui:success key="success" message="login successfullyy" />
<liferay-ui:error  key="error" message=" cant login ...." />




<aui:script>
AUI().use('aui-form-validator',
  function(A) {
 
//define rules for fields
    var rules = {
            
      <portlet:namespace/>Email: {
        required: true,
        email:true
      },
       <portlet:namespace/>password: {
        required: true
      },   
    };

    
    new A.FormValidator(
      {
        boundingBox: '#<portlet:namespace/>form1',
        
        rules: rules,
        showAllMessages: true
      }
    );
  }
);

</aui:script>



