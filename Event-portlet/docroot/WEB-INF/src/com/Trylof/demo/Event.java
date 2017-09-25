package com.Trylof.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.List;
import java.text.DateFormat;
import java.text.ParseException;


import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.Trylof.services.model.ItemLost;
import com.Trylof.services.model.ItemVerification;
import com.Trylof.services.model.SearchRes;
import com.Trylof.services.model.UserMaster;
import com.Trylof.services.exception.NoSuchItemLostException;
import com.Trylof.services.model.ItemFound;
import com.Trylof.services.service.ItemFoundLocalServiceUtil;
import com.Trylof.services.service.ItemLostLocalServiceUtil;

import com.Trylof.services.service.ItemVerificationLocalServiceUtil;
import com.Trylof.services.service.SearchResLocalServiceUtil;
import com.Trylof.services.service.UserMasterLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.jdbc.OutputBlob;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upload.UploadRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;


import javax.portlet.ProcessAction;



public class Event extends GenericPortlet {
	String usertype=null;
    long userid;
    String temp;
	public void init() {
		viewTemplate = getInitParameter("view-template");
	}

	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		renderRequest.setAttribute(WebKeys.PORTLET_DECORATE, Boolean.FALSE); 
		  //    String val=ParamUtil.get(renderRequest,"gender");
		//renderRequest.setAttribute("gender", (ParamUtil.getString(renderRequest, "gender")));
		
	  temp = ParamUtil.getString(renderRequest, "search");

		String path = ParamUtil.getString(renderRequest, "path");
		   	if (path.equalsIgnoreCase("loginPage")) {
				include("/html/event/login.jsp", renderRequest, renderResponse);
			}
			else if (path.equalsIgnoreCase("createPage")) {
					include("/html/event/create.jsp", renderRequest, renderResponse);
			}
			else if (path.equalsIgnoreCase("adminlogin")) {
				include("/html/event/1.jsp", renderRequest, renderResponse);
		}
			else if (path.equalsIgnoreCase("ViewClaimAdmin")) {
				include("/html/event/rough.jsp", renderRequest, renderResponse);
		}
			else if (path.equalsIgnoreCase("claimPage")) {
				include("/html/event/2.jsp", renderRequest, renderResponse);
			}
			else if (path.equalsIgnoreCase("itemFoundPage")) {
				
				include("/html/event/3.jsp", renderRequest, renderResponse);
			}
				else if (path.equalsIgnoreCase("details")) {
					
					include("/html/event/details.jsp", renderRequest, renderResponse);
				}
				else if (path.equalsIgnoreCase("action")) {
					
					include("/html/event/action.jsp", renderRequest, renderResponse);
				}
		   	
                else if (path.equalsIgnoreCase("AddPage")) {
					
					include("/html/event/6.jsp", renderRequest, renderResponse);
				}
                  else if (path.equalsIgnoreCase("ViewClaimUser")) {
					
					include("/html/event/7.jsp", renderRequest, renderResponse);
				}
                   else if (path.equalsIgnoreCase("FoundListPage")) {
					
					include("/html/event/4.jsp", renderRequest, renderResponse);
                   }else if (path.equalsIgnoreCase("Verify")) {
						
						include("/html/event/8.jsp", renderRequest, renderResponse);
				}
				else {
					include(viewTemplate, renderRequest, renderResponse);
				}
		
		
	}

	
	/*@Override
	public void processAction(ActionRequest arg0, ActionResponse arg1) throws PortletException, IOException {
		// TODO Auto-generated method stub
		super.processAction(arg0, arg1);
	}*/
	@ProcessAction(name = "methodact")
	public void methodact(ActionRequest request, ActionResponse response) throws PortletException, IOException {
		String email = ParamUtil.getString(request, "Email");
		String password = ParamUtil.getString(request, "password");
      //  String gender=ParamUtil.getString(request,"gender");
        response.setRenderParameter("email", email);
        response.setRenderParameter("password", password);
		System.out.println("Name=>"+email+" Password=>"+password);	
		response.setRenderParameter("path", "details");
		//System.out.println("gender>>>" + gender);   
		
	try{	
	List<UserMaster> id = UserMasterLocalServiceUtil.match(email, password);
	if(id!=null && !id.isEmpty())
	{
		
		for(UserMaster u:id)
		{
		System.out.print(u.getUserMasterId());
	    userid=	u.getUserMasterId();
		 usertype =u.getUserType();
		}
		if(usertype.equalsIgnoreCase("1")){
		response.setRenderParameter("path", "details");
		}
		else
			{
			response.setRenderParameter("path", "adminlogin");	
			}
		System.out.println("Success");
		//SessionMessages.add(request,"success");
	}
	else{
		response.setRenderParameter("path", "loginPage");
		//SessionMessages.add(request,"error");
	}
	}
	catch(Exception e)
	{
		System.out.println("Error log in");
	}
	}
	
	protected void include(String path, RenderRequest renderRequest, RenderResponse renderResponse) throws IOException,
			PortletException {

		PortletRequestDispatcher portletRequestDispatcher = getPortletContext().getRequestDispatcher(path);

		if (portletRequestDispatcher == null) {
			_log.error(path + " is not a valid include");
		} else {
			portletRequestDispatcher.include(renderRequest, renderResponse);
		}
	}

	protected String viewTemplate;

	private static Log _log = LogFactoryUtil.getLog(Event.class);

	@ProcessAction(name = "actionmethod")
	public void actionmethod(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
	System.out.print("Save");
	String name =ParamUtil.getString(actionRequest, "Name");
//	String lastname =ParamUtil.getString(actionRequest, "lastName");
	String email =ParamUtil.getString(actionRequest, "email");
	String address=ParamUtil.getString(actionRequest,"address");
	String password =ParamUtil.getString(actionRequest,"password1");
	int phoneNumber =ParamUtil.getInteger(actionRequest,"phoneNumber");
	String val=ParamUtil.getString(actionRequest,"User");
	String org = ParamUtil.getString(actionRequest, "Organization");
	System.out.println(val) ;
	System.out.println(name  );
//	System.out.println(lastname  );
	System.out.println(email  );
	System.out.println(address );
	System.out.println(password  );
	System.out.println(phoneNumber  );
	System.out.println(org);
	actionResponse.setRenderParameter("path", "loginPage");
	//SessionMessages.add(actionRequest,"success");
	
	long UserMasterid = CounterLocalServiceUtil.increment();
	UserMaster user1=null;
	user1 = UserMasterLocalServiceUtil.createUserMaster(UserMasterid);
	//UserMaster.set
	user1.setUserName(name);
	user1.setUserPass(password);
    user1.setUserEmail(email);
    user1.setUserAddress(address);
    user1.setUserPhoneno(phoneNumber);
    user1.setUserOrganization(org);
    user1.setUserType(val);
	user1=UserMasterLocalServiceUtil.addUserMaster(user1);
	
	}

	@ProcessAction(name = "failmethod")
	public void failmethod(ActionRequest actionRequest, ActionResponse actionResponse) {
	System.out.print("Cancel");
	
	}

	@ProcessAction(name = "submitClaim")
	public void submitClaim(ActionRequest actionRequest, ActionResponse actionResponse) {
		//SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
//	String d=(ParamUtil.getDate(actionRequest,"DateLost", dateFormat)).toString();
	//	Date s=ParamUtil.getDate(actionRequest,"DateLost",dateFormat);
		String itemtype=ParamUtil.getString(actionRequest,"itemtype");
		String location=ParamUtil.getString(actionRequest, "lostLocation");
		String Company=ParamUtil.getString(actionRequest,"itemCompany");
		String Color=ParamUtil.getString(actionRequest,"itemColor");
		String Size=ParamUtil.getString(actionRequest,"itemSize");
		String decs=ParamUtil.getString(actionRequest, "description");
		System.out.println(decs);
		System.out.println(itemtype +" "+ location + " " +Company + " " + Color + " " + Size);
		Date dobDate = null;
		try {
			String dobDateString =
				ParamUtil.getString(actionRequest, "dobDate");
			
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			 dobDate = sdf.parse(dobDateString);
		//	 DateFormat outputFormatter = new SimpleDateFormat("MM/dd/yyyy");
		//	  dobDate = outputFormatter.format(dobDate);
			System.out.println("Method 2: " + dobDate);
		}
		catch (ParseException pe) {
			pe.printStackTrace();
		}
		System.out.println("Claim submitted");
		
		long itemLostId = CounterLocalServiceUtil.increment();
		ItemLost item1=null;
		item1 = ItemLostLocalServiceUtil.createItemLost(itemLostId);
		//UserMaster.set
		item1.setUserId(userid);
		item1.setLostDate(dobDate);
		item1.setLostLocation(location);
		item1.setLostColor(Color);
		item1.setLostCompany(Company);
		item1.setLostType(itemtype);
		item1.setLostSize(Size);
		item1.setLostDesc(decs);
		item1.setLostStatus("Not found");
	  //  item1=ItemLostLocalServiceUtil.addItemLost(item1);
UploadRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		
		
		/**
		 * Get the uploaded file name with extension
		 */
	try{	
		String uploadedFileName = uploadRequest.getFileName("file");
		
		File file = uploadRequest.getFile("file");
		
		InputStream inputStream = new FileInputStream(file);
		/**
		 * Below is the actual blob data
		 */
		OutputBlob blobData = new OutputBlob(inputStream, file.length());

		/**
		 * Create and set the primary key
		 */
		
		

		//.setName(uploadedFileName);
		item1.setBlobData(blobData);
		item1.setMimeType(MimeTypesUtil.getContentType(file));
	}catch(Exception e){
		System.out.println("No image upoloaded");
	}
		   item1=ItemLostLocalServiceUtil.addItemLost(item1);
		System.out.println("Sucess submit");
		actionResponse.setRenderParameter("path", "details");
	}

	

	@ProcessAction(name = "goclaim")
	public void goclaim(ActionRequest actionRequest, ActionResponse actionResponse) {
		actionResponse.setRenderParameter("path", "claimPage");	
		System.out.println("Claim page");
	}

	@ProcessAction(name = "submitFounditem")
	public void submitFounditem(ActionRequest actionRequest, ActionResponse actionResponse) throws FileNotFoundException {
		String itemtype=ParamUtil.getString(actionRequest,"itemtype");
		String location=ParamUtil.getString(actionRequest, "lostLocation");
		String Company=ParamUtil.getString(actionRequest,"itemCompany");
		String Color=ParamUtil.getString(actionRequest,"itemColor");
		String Size=ParamUtil.getString(actionRequest,"itemSize");
		String decs=ParamUtil.getString(actionRequest, "description");
		System.out.println(decs);
		System.out.println(itemtype +" "+ location + " " +Company + " " + Color + " " + Size);
		Date dobDate = null;
		try {
			String dobDateString =
				ParamUtil.getString(actionRequest, "dobDate");
			
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			 dobDate = sdf.parse(dobDateString);
			
			System.out.println("Method 2: " + dobDate);
		}
		catch (ParseException pe) {
			pe.printStackTrace();
		}
		long itemFoundId = CounterLocalServiceUtil.increment();
		ItemFound item2=null;
		item2 = ItemFoundLocalServiceUtil.createItemFound(itemFoundId);
		//UserMaster.set
		item2.setUserId(userid);
		item2.setFoundDate(dobDate);
		item2.setFoundLocation(location);
		item2.setFoundColor(Color);
		item2.setFoundCompany(Company);
		item2.setFoundType(itemtype);
		item2.setFoundSize(Size);
		item2.setFoundDesc(decs);
		item2.setFoundStatus("Not matched");
	 
UploadRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		
		
		/**
		 * Get the uploaded file name with extension
		 */
	try{	
		String uploadedFileName = uploadRequest.getFileName("file");
		
		File file = uploadRequest.getFile("file");
		
		InputStream inputStream = new FileInputStream(file);
		/**
		 * Below is the actual blob data
		 */
		OutputBlob blobData = new OutputBlob(inputStream, file.length());

		/**
		 * Create and set the primary key
		 */
		
		

		//.setName(uploadedFileName);
		item2.setBlobData(blobData);
		item2.setMimeType(MimeTypesUtil.getContentType(file));
	}catch(Exception e){
		System.out.println("No image upoloaded");
	}
		   item2=ItemFoundLocalServiceUtil.addItemFound(item2);
			
		actionResponse.setRenderParameter("path","Adminlogin");
		System.out.println("item found submitted");
	}

	@ProcessAction(name = "itemFound")
	public void itemFound(ActionRequest actionRequest, ActionResponse actionResponse) {
		actionResponse.setRenderParameter("path", "itemFoundPage");	
		System.out.println("New item found"); 
	
	}

	@ProcessAction(name = "Foundlist")
	public void Foundlist(ActionRequest actionRequest, ActionResponse actionResponse) {
		actionResponse.setRenderParameter("path", "FoundListPage");	
	}

	@ProcessAction(name = "searchMethod")
	public void searchMethod(ActionRequest actionRequest, ActionResponse actionResponse) throws NoSuchItemLostException {
		actionResponse.setRenderParameter("path", "AddPage");	
	/*	String itemid = ParamUtil.getString(actionRequest, "search");
		System.out.println("Hello");
		System.out.println(itemid);
		long id = Long.parseLong(itemid);
		ItemLost i = ItemLostLocalServiceUtil.getdetails(id);
		System.out.println(" Type :"+i.getLostType());
		String color = i.getLostColor();
		String company = i.getLostCompany();
		String desrcip = i.getLostDesc();
		String location = i.getLostLocation();
		String size = i.getLostSize();
		int count=0;
		
		
		Match a = new Match();
		
		  String type = i.getLostType(); 
		//out.print(type);
		List<ItemFound> item = ItemFoundLocalServiceUtil.getitemType (type);
		for(ItemFound u:item)
		{
		a.getinput(u.getFoundColor());
		a.getkeyword(color);
		count= a.compute(count);
		System.out.println(count);
	
	}
	*/

	
	
}

	@ProcessAction(name = "ViewClaimsUser")
	public void ViewClaimsUser(ActionRequest actionRequest, ActionResponse actionResponse) {
		actionResponse.setRenderParameter("path","ViewClaimUser");
		actionRequest.setAttribute("userid",userid);
	}

	@ProcessAction(name = "MatchfoundItem")
	public void MatchfoundItem(ActionRequest actionRequest, ActionResponse actionResponse) {
		String searchid = ParamUtil.getString(actionRequest, "searchid");
		actionResponse.setRenderParameter("path","adminlogin");
		long id = Long.parseLong(searchid);
		long itemVerificationId = CounterLocalServiceUtil.increment();
		ItemVerification item2=null;
		
		item2 = ItemVerificationLocalServiceUtil.createItemVerification(itemVerificationId);
		try {
			SearchRes se1 = SearchResLocalServiceUtil.getSearchRes(id);
			long foundid1 = se1.getItemid();
			ItemFound found1 = ItemFoundLocalServiceUtil.getItemFound(foundid1);
			//String itemid = actionRequest.getParameter("search");
		String itemid =	temp ;
			System.out.println(itemid);
			long lostid1 = Long.parseLong(itemid);
			ItemLost i = ItemLostLocalServiceUtil.getItemLost(lostid1);
			found1.setFoundStatus("Match Found");
			found1.setLostItem(lostid1);
			i.setLostStatus("Match Found");
			found1 = ItemFoundLocalServiceUtil.updateItemFound(found1);
			i = ItemLostLocalServiceUtil.updateItemLost(i);
			item2.setLostItemid(lostid1);
			item2.setFoundItemid(foundid1);
			item2.setUserId(userid);
			//item2.setuse
			item2 = ItemVerificationLocalServiceUtil.addItemVerification(item2);

			//SearchResLocalServiceUtil.deleteAllLocations();
			
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@ProcessAction(name = "BackAndDelete")
	public void BackAndDelete(ActionRequest actionRequest, ActionResponse actionResponse) {
		actionResponse.setRenderParameter("path","adminlogin");
		SearchResLocalServiceUtil.deleteAllLocations();
	}

	@ProcessAction(name = "SearchItem")
	public void SearchItem(ActionRequest actionRequest, ActionResponse actionResponse) {
		actionResponse.setRenderParameter("path","AddPage");
		System.out.println("Go searhch");
		
	}
    
	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		 if(resourceRequest.getResourceID().equals("itemFound")){
		try {
			long dataId = ParamUtil.getLong(resourceRequest, "dataId");
			ItemFound blobDemo = ItemFoundLocalServiceUtil.getItemFound(dataId);
					if(blobDemo != null) {
				Blob blob = blobDemo.getBlobData();
				byte[] binaryData = blob.getBytes(1, (int) blob.length());
				// resourceResponse.setContentType(blobDemo.getMimeType());
				resourceResponse.setContentType("image/jpg");

				//resourceResponse.setContentType("application/application-download");
				//resourceResponse.setProperty("Content-disposition","attachement; filename=" + blobDemo.getName());
				OutputStream o = resourceResponse.getPortletOutputStream();
				o.write(binaryData);
				o.flush();
				o.close();
				resourceResponse.flushBuffer();
			}

		} catch (Exception e) {

		}}
		 else	 if(resourceRequest.getResourceID().equals("itemLost")){
				try {
					long dataId = ParamUtil.getLong(resourceRequest, "dataId");
					ItemLost blobDemo = ItemLostLocalServiceUtil.getItemLost(dataId);
							if(blobDemo != null) {
						Blob blob = blobDemo.getBlobData();
						byte[] binaryData = blob.getBytes(1, (int) blob.length());
						// resourceResponse.setContentType(blobDemo.getMimeType());
						resourceResponse.setContentType("image/jpg");

						//resourceResponse.setContentType("application/application-download");
						//resourceResponse.setProperty("Content-disposition","attachement; filename=" + blobDemo.getName());
						OutputStream o = resourceResponse.getPortletOutputStream();
						o.write(binaryData);
						o.flush();
						o.close();
						resourceResponse.flushBuffer();
					}

				} catch (Exception e) {

				}}
		 else	 if(resourceRequest.getResourceID().equals("itemVerify1")){
				try {
					long dataId = ParamUtil.getLong(resourceRequest, "dataId");
					ItemVerification blobDemo = ItemVerificationLocalServiceUtil.getItemVerification(dataId);
							if(blobDemo != null) {
						Blob blob = blobDemo.getImage1();
						byte[] binaryData = blob.getBytes(1, (int) blob.length());
						// resourceResponse.setContentType(blobDemo.getMimeType());
						resourceResponse.setContentType("image/jpg");

						//resourceResponse.setContentType("application/application-download");
						//resourceResponse.setProperty("Content-disposition","attachement; filename=" + blobDemo.getName());
						OutputStream o = resourceResponse.getPortletOutputStream();
						o.write(binaryData);
						o.flush();
						o.close();
						resourceResponse.flushBuffer();
					}

				} catch (Exception e) {

				}}
		 else	 if(resourceRequest.getResourceID().equals("itemVerify2")){
				try {
					long dataId = ParamUtil.getLong(resourceRequest, "dataId");
					ItemVerification blobDemo = ItemVerificationLocalServiceUtil.getItemVerification(dataId);
							if(blobDemo != null) {
						Blob blob = blobDemo.getImage2();
						byte[] binaryData = blob.getBytes(1, (int) blob.length());
						// resourceResponse.setContentType(blobDemo.getMimeType());
						resourceResponse.setContentType("image/jpg");

						//resourceResponse.setContentType("application/application-download");
						//resourceResponse.setProperty("Content-disposition","attachement; filename=" + blobDemo.getName());
						OutputStream o = resourceResponse.getPortletOutputStream();
						o.write(binaryData);
						o.flush();
						o.close();
						resourceResponse.flushBuffer();
					}

				} catch (Exception e) {

				}}
	}
	protected boolean isCheckMethodOnProcessAction() {
		return _CHECK_METHOD_ON_PROCESS_ACTION;
	}
	private static final boolean _CHECK_METHOD_ON_PROCESS_ACTION = false;
	@ProcessAction(name = "Verification")
	public void Verification(ActionRequest actionRequest, ActionResponse actionResponse) {
		actionResponse.setRenderParameter("path","Verify");
		System.out.println("Verify user");
		actionRequest.setAttribute("userid",userid);
	}

	@ProcessAction(name = "submitVerifyDetails")
	public void submitVerifyDetails(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		actionResponse.setRenderParameter("path","details");
		String Desc=ParamUtil.getString(actionRequest, "VerifyDescription");
		long lostid = ParamUtil.getLong(actionRequest, "Lostid");
		System.out.println(lostid);
		try{
		ItemVerification item2 = ItemVerificationLocalServiceUtil.getDetailsByStatusMatch(lostid);
			
UploadRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		
		
		File file = uploadRequest.getFile("bill");
		File file1 = uploadRequest.getFile("IdProof");
		
		InputStream inputStream = new FileInputStream(file);
		InputStream inputStream1 = new FileInputStream(file1);
		/**
		 * Below is the actual blob data
		 */
		OutputBlob blobData = new OutputBlob(inputStream, file.length());
		OutputBlob blobData1 = new OutputBlob(inputStream1, file1.length());


		/**
		 * Create and set the primary key
		 */
		
		

		
		item2.setImage2(blobData1);
		item2.setImage1(blobData);
	    item2.setVerifyDesc(Desc);
	    item2.setVerifyStatus("Sent For Verification");
			item2 = ItemVerificationLocalServiceUtil.updateItemVerification(item2);
			ItemLost i = ItemLostLocalServiceUtil.getItemLost(lostid);
		//	found1.setFoundStatus("Match Found");
		//	found1.setLostItem(lostid1);
			i.setLostStatus("Sent For Verification");
			//found1 = ItemFoundLocalServiceUtil.updateItemFound(found1);
			i = ItemLostLocalServiceUtil.updateItemLost(i);	
	
	
	}catch(Exception e)
	{
	System.out.println("Upload failed");	
	}
	

}

	@ProcessAction(name = "delete")
	public void delete(ActionRequest actionRequest, ActionResponse actionResponse) {
		long dataId = ParamUtil.getLong(actionRequest, "dataId");
		try {
			ItemFoundLocalServiceUtil.deleteItemFound(dataId);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@ProcessAction(name = "actmet")
	public void actmet(ActionRequest actionRequest, ActionResponse actionResponse) {
		actionResponse.setRenderParameter("path","adminlogin");	
		String idd = ParamUtil.getString(actionRequest,"itemdd");
		System.out.println(idd);
		try {
			Long id = Long.parseLong(idd);
			ItemVerification item = ItemVerificationLocalServiceUtil.getItemVerification(id);
			ItemLost i1 = ItemLostLocalServiceUtil.getItemLost(item.getLostItemid());
			ItemFound i2 = ItemFoundLocalServiceUtil.getItemFound(item.getFoundItemid());
			
			i1.setLostStatus("Matched And Verified");
            i2.setFoundStatus("Matched And Verified");
            item.setVerifyStatus("Matched And Verified");
			
            i1 = ItemLostLocalServiceUtil.updateItemLost(i1);
            i2 = ItemFoundLocalServiceUtil.updateItemFound(i2);
            item = ItemVerificationLocalServiceUtil.updateItemVerification(item);
		} catch (NumberFormatException | PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@ProcessAction(name = "notVerifyMethod")
	public void notVerifyMethod(ActionRequest actionRequest, ActionResponse actionResponse) {
		actionResponse.setRenderParameter("path","adminlogin");	
		String id = ParamUtil.getString(actionRequest,"itemdd");
		System.out.println(id);
		try {
			ItemVerification item = ItemVerificationLocalServiceUtil.getItemVerification(Long.parseLong(id));
			ItemLost i1 = ItemLostLocalServiceUtil.getItemLost(item.getLostItemid());
			ItemFound i2 = ItemFoundLocalServiceUtil.getItemFound(item.getFoundItemid());
			
			i1.setLostStatus("Verification of Documents Failed");
            i2.setFoundStatus("Not matched");
            item.setVerifyStatus("Not Verified");
			
            i1 = ItemLostLocalServiceUtil.updateItemLost(i1);
            i2 = ItemFoundLocalServiceUtil.updateItemFound(i2);
           
             ItemVerificationLocalServiceUtil.deleteItemVerification(Long.parseLong(id));
		} catch (NumberFormatException | PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	}
	