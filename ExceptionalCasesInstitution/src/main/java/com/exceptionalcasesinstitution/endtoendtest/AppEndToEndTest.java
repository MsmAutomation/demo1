package com.exceptionalcasesinstitution.endtoendtest;

import org.testng.annotations.Test;

import com.exceptionalcasesinstitution.apppom.FCPermission;
import com.exceptionalcasesinstitution.apppom.LogInPage1;
import com.exceptionalcasesinstitution.apppom.NAPermission;
import com.exceptionalcasesinstitution.apppom.ROPermission;
import com.exceptionalcasesinstitution.apppom.RWPermission;
import com.exceptionalcasesinstitution.base.Base2;




public class AppEndToEndTest extends Base2
{
	@Test
	public void ApplicationExceptionalCaseTest() 
	{
		try 
		{
			Base2 base2=new Base2();
			base2.initialization2();
			LogInPage1 log1=new LogInPage1(driver);
	
			log1.Logdata(prop1.getProperty("email"), prop1.getProperty("pass"));
			  NAPermission nap=new NAPermission(driver); nap.NAPermissionFields();
				log1.Logfield(prop1.getProperty("em"),prop1.getProperty("ps"));
			  nap.NASubPermissionField();
			 
			
			ROPermission rop=new ROPermission(driver);
			rop.ROPermissionFields();
			rop.ROSubPermissionFields();
			rop.RORecruiterAgentFields();
			rop.ROProgramtFields();
			rop.ROEducationalFields();
			rop.ROTestScoreFields();
			rop.ROStudyPermitFields();
			rop.ROSubStudyPermitFields();
			rop.RODocumentFields(); 
			rop.ROSubDocumentFields();
			rop.ROInstitutionDocFields();
			rop.ROSubInstitutionDocFields();
			rop.ROFeeFields();
			rop.ROSubFeeFields(); 
			rop.ROTaskFields(); 
			rop.ROSubTaskFields();
			
			
			
			 
			  RWPermission rwp=new RWPermission(driver);
			  rwp.RWPermissionFields();
			  rwp.RWSubPermissionFields();
			  rwp.RWRecruiterAgentFields();
			  rwp.RWProgramtFields();
			  rwp.RWEducationalFields();
			  rwp.RWTestScoreFields();
			  rwp.RWStudyPermitFields();
			  rwp.RWSubStudyPermitFields();
			  rwp.RWDocumentFields(); 
			  rwp.RWSubDocumentFields();
			  rwp.RWInstitutionDocFields();
			  rwp.RWSubInstitutionDocFields();
			  rwp.RWFeeFields();
			  rwp.RWSubFeeFields(); 
			  rwp.RWTaskFields(); 
			  rwp.RWSubTaskFields();
			  
			  FCPermission fcp=new FCPermission(driver);
			  fcp.FCPermissionFields();
			  fcp.FCSubPermissionFields();
			  fcp.FCRecruiterAgentFields();
			  fcp.FCProgramtFields();
			  fcp.FCEducationalFields();
			  fcp.FCTestScoreFields();
			  fcp.FCStudyPermitFields();
			  fcp.FCSubStudyPermitFields();
			  fcp.FCDocumentFields(); 
			  fcp.FCSubDocumentFields();
			  fcp.FCInstitutionDocFields();
			  fcp.FCSubInstitutionDocFields();
			  fcp.FCFeeFields();
			  fcp.FCSubFeeFields(); 
			  fcp.FCTaskFields(); 
			  fcp.FCSubTaskFields();
			 		
			} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}

}
