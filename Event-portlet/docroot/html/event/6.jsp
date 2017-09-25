<%@ include file="init.jsp" %>
<%@ page import="com.Trylof.services.service.ItemLostLocalServiceUtil" %>
<%@ page import="com.Trylof.services.model.ItemLost" %>
<%@ page import="com.Trylof.services.service.ItemFoundLocalServiceUtil" %>
<%@ page import="com.Trylof.services.model.ItemFound" %>
<%@ page import="com.Trylof.services.service.SearchResLocalServiceUtil" %>
<%@ page import="com.Trylof.services.model.SearchRes" %>
<%@ page import="java.util.List" %>
<%@ page import="com.Trylof.demo.diff_match_patch" %>
<%@ page import="com.liferay.counter.kernel.service.CounterLocalServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ListUtil" %>
<portlet:defineObjects />
<portlet:renderURL var="LogoutUrl" >
<portlet:param name="path" value=" "/>
</portlet:renderURL>
<div align="right">
<aui:button name ="Logout" style="border-radius:50%;" value="Logout" type="button" align="right" onClick="<%=LogoutUrl %>" />
</div>
<portlet:actionURL var="BackUrl" name="BackAndDelete">
<portlet:param name="path" value="adminlogin"/>
<img style="position:absolute; top:10px; left:10px; width:100px; height:25px;" src="<%=request.getContextPath()%>/images/white.jpg"  />
</portlet:actionURL>
<%
  SearchResLocalServiceUtil.deleteAllLocations();
%>
		

<a href="<%=BackUrl%>" >Back</a>
<br>
<h1>The item searched is :-</h1>

<%
String itemid = ParamUtil.getString(renderRequest, "search");
//out.print(itemid);

System.out.println(itemid);
long id = Long.parseLong(itemid);
ItemLost i = ItemLostLocalServiceUtil.getdetails(id);

%><br>
<portlet:resourceURL var="viewyURL" id="itemLost">
			<portlet:param name="dataId"
				value="<%=String.valueOf(i.getItemLostId())%>" />
		</portlet:resourceURL>
<table align="left">
  <tr>
    <th>Type</th>
   <td><%out.println(i.getLostType()); %> </td>
 </tr>
  <tr>
    <th>Location</th>
   <td><%out.println(i.getLostLocation()); %> </td>
 </tr> <tr>
    <th>Company</th>
   <td><%out.println(i.getLostCompany()); %> </td>
 </tr> <tr>
    <th>Color</th>
   <td><%out.println(i.getLostColor()); %> </td>
 </tr> <tr>
    <th>Size</th>
   <td><%out.println(i.getLostSize()); %> </td>
 </tr>
  <tr>
    <th>Date Lost</th>
   <td><%out.println(i.getLostDate()); %> </td>
 </tr>
</table>
<table align="right">
  <tr>
  <td> <img src="<%=viewyURL.toString()%>" alt="No image avaliable " height="100" width="150"/> </td>
 
  </tr>
</table>

<%  String type = i.getLostType(); 
String Lostcolor = i.getLostColor();
String LostCompany = i.getLostCompany();
String Lostdesrcip = i.getLostDesc();
String Lostlocation = i.getLostLocation();
String Lostsize = i.getLostSize();
Date d = i.getLostDate();
%>
 

<% 
int count=0;
//out.print(type);
List<ItemFound> item = ItemFoundLocalServiceUtil.getitemType (type);
for(ItemFound u:item)
{   Date d1 = u.getFoundDate();
	long searchResId = CounterLocalServiceUtil.increment();
	SearchRes s1 = null;
	s1 = SearchResLocalServiceUtil.createSearchRes(searchResId);
	count=0;
//System.out.print(u.getFoundColor());
diff_match_patch dmp = new diff_match_patch();
//dmp.Match_Distance = 10;
//dmp.Match_Threshold = 0.7f;
int match = dmp.match_main(u.getFoundColor(),Lostcolor, 10);
if (match == -1) {
    System.out.println("Notfound");
  } else {
	  if(u.getFoundColor().length()>= (match + Lostcolor.length()))
	  { String quote = u.getFoundColor().substring(match, match + Lostcolor.length());
	  System.out.print("found");
	  if(quote!=null)
	  count=count+quote.length();}
	  else 
		  count++;
}
System.out.print("count>>>"+count );
match = dmp.match_main(u.getFoundCompany(),LostCompany, 10);
if (match == -1) {
    System.out.println("Notfound");
  } else {
	  System.out.print("found");
	  if(u.getFoundCompany().length()>= (match + LostCompany.length()))
	  {  String quote = u.getFoundCompany().substring(match, match + LostCompany.length());
	  System.out.print("found");
	  if(quote!=null)
	  count=count+quote.length();
	  } else 
		  count++;
}
System.out.print("count>>>"+count );
match = dmp.match_main(u.getFoundDesc(),Lostdesrcip, 10);
if (match == -1) {
    System.out.println("Notfound");
  } else {
	  System.out.print("found");
	 // count++;
	 if(u.getFoundDesc().length()>= (match + Lostdesrcip.length()))
	 {  String quote = u.getFoundDesc().substring(match, match + Lostdesrcip.length());
	  System.out.print("found");
	  if(quote!=null)
	  count=count+quote.length();
	 }
	 else 
		  count++;
}
System.out.print("count>>>"+count );
match = dmp.match_main(u.getFoundLocation(),Lostlocation, 10);
if (match == -1) {
    System.out.println("Notfound");
  } else {
	  System.out.print("found");
	  if(u.getFoundLocation().length()>= (match + Lostlocation.length())){
	    String quote = u.getFoundLocation().substring(match, match + Lostlocation.length());
	    if(quote!=null)
	  count=count+ quote.length();
} else 
	  count++;
	  }
System.out.print("count>>>"+count );
match = dmp.match_main(u.getFoundSize(),Lostsize, 10);
if (match == -1) {
    System.out.println("Notfound");
  } else {
	  if(u.getFoundSize().length()>= (match + Lostsize.length()))
	  {	  String quote = u.getFoundSize().substring(match, match + Lostsize.length());
	  System.out.print("found");
	  if(quote!=null)
	  count=count+quote.length();
	  System.out.print("found");
	  }
	  else 
		  count++;
	//  count++;
}
System.out.print("count>>>"+count );
if(count!=0 && d.before(d1)){
	s1.setStatus(u.getFoundStatus());
	s1.setColor(u.getFoundColor());
	s1.setCount(count);
	s1.setDesc(u.getFoundDesc());
	s1.setItemid(u.getItemFoundId());
	s1.setSize(u.getFoundSize());
	s1.setLocation(u.getFoundLocation());
	s1.setCompany(u.getFoundCompany());
	s1.setDate(u.getFoundDate());
	s1 = SearchResLocalServiceUtil.addSearchRes(s1);
}
}
%>
<br><br>
<br>
<br>
<br>
<br>

<%
 int counts = SearchResLocalServiceUtil.getSearchResesCount();
 List <SearchRes> books = SearchResLocalServiceUtil.getSearchReses(0, counts);
 if(counts==0)
 {
out.print("	No RESULTS found on  search ");
 }
 else{
	out.print("THe SEARCH results are");
 }
 
 %>
 

<liferay-ui:search-container  	emptyResultsMessage="There is no data to display">
  
	<liferay-ui:search-container-results  >
<%
results=ListUtil.subList(books,searchContainer.getStart(), searchContainer.getEnd());
total=books.size();
pageContext.setAttribute("results", results);
pageContext.setAttribute("total", total);
%>
</liferay-ui:search-container-results>
	

	<liferay-ui:search-container-row
		className="com.Trylof.services.model.SearchRes"
		modelVar="aSearchRes" keyProperty="SearchResId"
	>
	<portlet:actionURL var="MacthURL" name="MatchfoundItem">
            <portlet:param name="path"  value="adminlogin" />
           <portlet:param name="searchid" value="<%=String.valueOf(aSearchRes.getSearchResId())%>" /> 
        </portlet:actionURL>
        <portlet:resourceURL var="viewURL" id="itemFound">
			<portlet:param name="dataId"
				value="<%=String.valueOf(aSearchRes.getItemid())%>" />
		</portlet:resourceURL>
		<liferay-ui:search-container-column-text property="color" name="color" />

		<liferay-ui:search-container-column-text property="company" name="company"/>

		<liferay-ui:search-container-column-text property="date"  name="date"/>

		<liferay-ui:search-container-column-text property="desc"  name="desc"/>

		<liferay-ui:search-container-column-text property="location" name="location"/>

		<liferay-ui:search-container-column-text property="size" name="size"/>

		<liferay-ui:search-container-column-text property="status" name="status"/>

		
<liferay-ui:search-container-column-text property="count" name="count"/>
		
		<liferay-ui:search-container-column-text property="userId" name="User id"/>
		     <liferay-ui:search-container-column-text name="Image"> <img src="<%=viewURL.toString()%>" alt="no Image" height="50" width="100"> </liferay-ui:search-container-column-text>
		
  <liferay-ui:search-container-column-text value="Match Found" href="<%=MacthURL%>" />
		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator paginate="true"  searchContainer="<%=searchContainer %>" />
</liferay-ui:search-container>

