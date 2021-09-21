package com.exceptionalcasesinstitution.endtoendtest;

import org.testng.annotations.Test;

import com.exceptionalcasesinstitution.base.Base;
import com.exceptionalcasesinstitution.pom.AgentPermission;
import com.exceptionalcasesinstitution.pom.CampusPermission;
import com.exceptionalcasesinstitution.pom.DetailsPermission;
import com.exceptionalcasesinstitution.pom.EventsUpdatesPermission;
import com.exceptionalcasesinstitution.pom.LogInPage;
import com.exceptionalcasesinstitution.pom.MarketingCollateralPermission;
import com.exceptionalcasesinstitution.pom.ProgramBulkUpdatePermission;
import com.exceptionalcasesinstitution.pom.TeamPermission;

public class EndToEndTest extends Base
{
	@Test
	public void ExceptionalCaseTest() 
	{
		try 
		{
			Base base=new Base();
			base.initialization();
			LogInPage log=new LogInPage(driver);
			
			log.Logdata(prop.getProperty("email"), prop.getProperty("pass"));
			DetailsPermission dp=new DetailsPermission(driver); 
			dp.PermissionFields();
			log.Logdata(prop.getProperty("em"), prop.getProperty("ps"));	
			dp.NAPermissionFields();
			dp.ROPermissionFields();dp.SubROPermissionFields();	
			dp.RWPermissionFields();dp.SubRWPermissionFields();
			dp.FCPermissionFields();dp.SubFCPermissionFields();
				 
			CampusPermission cp=new CampusPermission(driver);
			cp.PermissionFields();cp.NAPermissionFields();
			cp.ROPermissionFields();cp.SubROPermissionFields();
			cp.RWPermissionFields();cp.SubRWPermissionFields();
			cp.FCPermissionFields();cp.SubFCPermissionFields();
		
			MarketingCollateralPermission mcp=new MarketingCollateralPermission(driver);
			mcp.PermissionFields();mcp.NAPermissionFields();
			mcp.ROPermissionFields();mcp.SubROPermissionFields();
			mcp.RWPermissionFields();mcp.SubRWPermissionFields();
			mcp.FCPermissionFields();mcp.SubFCPermissionFields();
			 
			EventsUpdatesPermission eup=new EventsUpdatesPermission(driver);
			eup.PermissionFields();eup.NAPermissionFields();
			eup.ROPermissionFields();eup.SubROPermissionFields();
			eup.RWPermissionFields();eup.SubRWPermissionFields();
			eup.FCPermissionFields();eup.SubFCPermissionFields();
				
			TeamPermission tp=new TeamPermission(driver);
			tp.PermissionFields();tp.NAPermissionFields();
			tp.ROPermissionFields();tp.SubROPermissionFields();
			tp.RWPermissionFields();tp.SubRWPermissionFields();
			tp.FCPermissionFields();tp.SubFCPermissionFields();
		
			AgentPermission ap=new AgentPermission(driver);
			ap.PermissionFields();ap.NAPermissionFields();
			ap.ROPermissionFields();ap.SubROPermissionFields();
			ap.RWPermissionFields();ap.SubRWPermissionFields();
			ap.FCPermissionFields();ap.SubFCPermissionFields();
				
			ProgramBulkUpdatePermission pbup=new ProgramBulkUpdatePermission(driver);
			pbup.PermissionFields();pbup.NAPermissionFields(); pbup.ROPermissionFields();
			pbup.SubROPermissionFields(); pbup.RWPermissionFields();
			pbup.SubRWPermissionFields(); pbup.FCPermissionFields();
			pbup.SubFCPermissionFields();
				 
				 
			 
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}

}
