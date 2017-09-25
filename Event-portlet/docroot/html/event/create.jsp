<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<portlet:defineObjects />

<portlet:actionURL var="createAction" name="actionmethod" >
</portlet:actionURL>
<portlet:renderURL var="Cancelurl"  >

</portlet:renderURL>
<img style="position:absolute; top:10px; left:10px; width:100px; height:25px;" src="<%=request.getContextPath()%>/images/white.jpg"  />

<aui:form name="fm2" id="fm2" action="<%=createAction %>" method="post">
          <aui:field-wrapper>
           <aui:input name="User" type="radio" value="1" label="User" onClick="hideDiv('Adminor')" checked="true"/>
         <aui:input name="User" type="radio" value="2" label="Admin" onClick="showDiv('Adminor')"/>  
         <br>
            <aui:input name="Name" type="text" label=" Name"></aui:input>
           
            <aui:input name="email" value='' label="Email"></aui:input>
            
            <aui:input name="phoneNumber" type="text" label="Phone Number"></aui:input>
          
            <aui:input name="password1" id="password1" value='' label="Password" type="password"></aui:input>
            <aui:input name="password2" value='' label="Re Type Password" type="password"></aui:input>
            <aui:input name="address" value='' label=" address"></aui:input>
           <div class="hidden" id="Adminor">
            <aui:input  name="Organisation " value='' label="Organisation " />
            </div>
            <aui:button type="submit" name="" value="Save" />
           
            <aui:button name="cancel" type="button" onClick="<%=Cancelurl %>" value="CANCEL"  />
</aui:field-wrapper>
</aui:form>

<aui:script>
AUI().use('aui-form-validator',
  function(A) {
 
//define rules for fields
    var rules = {
            
      <portlet:namespace/>Name: {
        required: true,
        alpha:true
      },
     
      <portlet:namespace/>email: {
        email: true,
        required: true
      },
     
      <portlet:namespace/>phoneNumber: {
        required: true,
        digits: true,
        rangeLength:[8, 10]
      },
       
      <portlet:namespace/>password1: {
        required: true
      },
      <portlet:namespace/>password2: {
        equalTo: '#<portlet:namespace/>password1',
        required: true
      },
      <portlet:namespace/>address: {
          required: true
         
        },
     
      
    };
// overrding default error messages for fields
    var fieldStrings = {
      <portlet:namespace/>email: {
        required: 'Type your email in this field.'
      },
      <portlet:namespace/>name: {
        required: 'Please provide your name.'
      }
    };
    new A.FormValidator(
      {
        boundingBox: '#<portlet:namespace/>fm2',
        fieldStrings: fieldStrings,
        rules: rules,
        showAllMessages: true
      }
    );
  }
);
</aui:script>
<style>
.hidden { visibility: hidden; }
.unhidden { visibility: visible; }
</style>

<script type="text/javascript">
 function showDiv(divID) {
    var item = document.getElementById(divID);
 if (item) {
        item.className='unhidden';
        }
}

function hideDiv(divID) {
    var item = document.getElementById(divID);
    if (item) {
       item.className='hidden';
    }
}
</script>

