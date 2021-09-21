package com.exceptionalcasesinstitution.endtoendtest;

import org.testng.annotations.Test;


import com.exceptionalcasesinstitution.base.Base2;
import com.exceptionalcasesinstitution.stupom.StuFCPermission;
import com.exceptionalcasesinstitution.stupom.StuLogInPage;
import com.exceptionalcasesinstitution.stupom.StuNAPermission;
import com.exceptionalcasesinstitution.stupom.StuROPermission;
import com.exceptionalcasesinstitution.stupom.StuRWPermission;




public class StuEndToEndTest extends Base2
{
	@Test
	public void ApplicationExceptionalCaseTest() 
	{
		try 
		{
			Base2 base2=new Base2();
			base2.initialization2();
			StuLogInPage log1=new StuLogInPage(driver);
	
			log1.Logdata(prop1.getProperty("email"), prop1.getProperty("pass"));
			
			StuNAPermission nap=new StuNAPermission(driver); 
			nap.NAPermissionFields();
			nap.NewTabShifting(); 
			log1.Logfield(prop1.getProperty("em"),prop1.getProperty("ps")); 
			nap.NAScreenshootField();
		
			StuROPermission rop=new StuROPermission(driver);
			rop.ROPermissionFields();rop.ROScreenshootField(); rop.ROEditStuentFields();
			rop.ROSubEditStuentFields();
			rop.ROEducationalFields(); rop.ROSubEducationalFields();
			rop.ROTestScoreFields(); rop.ROSubTestScoreFields();
			rop.RODocumentFields();rop.ROSubDocumentFields();			  
			rop.ROVisaFields(); rop.ROSubVisaFields(); rop.ROInterestFields();
			rop.ROSubInterestFields(); rop.ROActivityFields(); rop.ROSubActivityFields();
			 
			StuRWPermission rwp=new StuRWPermission(driver);
			rwp.RWPermissionFields();rwp.RWScreenshootField(); rwp.RWEditStuentFields();
			rwp.RWSubEditStuentFields(); rwp.RWEducationalFields();
			rwp.RWSubEducationalFields(); rwp.RWTestScoreFields();
			rwp.RWSubTestScoreFields(); rwp.RWDocumentFields();
			rwp.RWSubDocumentFields(); rwp.RWVisaFields(); rwp.RWSubVisaFields();
			rwp.RWInterestFields(); rwp.RWSubInterestFields(); rwp.RWActivityFields();
			rwp.RWSubActivityFields();
				
			StuFCPermission fcp=new StuFCPermission(driver);
			fcp.FCPermissionFields();fcp.FCScreenshootField(); fcp.FCEditStuentFields();
			fcp.FCSubEditStuentFields(); fcp.FCEducationalFields();
			fcp.FCSubEducationalFields(); fcp.FCTestScoreFields();
			fcp.FCSubTestScoreFields(); fcp.FCDocumentFields();
			fcp.FCSubDocumentFields(); fcp.FCVisaFields(); fcp.FCSubVisaFields();
			fcp.FCInterestFields(); fcp.FCSubInterestFields(); fcp.FCActivityFields();
			fcp.FCSubActivityFields();
			 		
			} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}

}
