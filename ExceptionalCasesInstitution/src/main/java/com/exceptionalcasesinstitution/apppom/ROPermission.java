package com.exceptionalcasesinstitution.apppom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.exceptionalcasesinstitution.utility.UtilityFile;


public class ROPermission 
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	public ROPermission(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//i[@title='User Account']")
	WebElement acoount;
	@FindBy(xpath ="//a[text()='Users']")
	WebElement user;
	@FindBy(xpath = "//dx-data-grid/div/div[4]/div/div/div[3]/div[1]/div/button//span//*[text()='filter_list']")
	WebElement nexttab;
	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[1]")
	WebElement searchtab;
	@FindBy(xpath ="(//*[@class='dx-datagrid-table dx-datagrid-table-fixed']//tbody)[2]/tr[1]/td[1]")
	WebElement editagent;
	@FindBy(xpath = "//div[@class='mat-tab-label-content'][text()='Permission']")
	WebElement permission;
	@FindBy(xpath ="(//label/div[1])[2]")
	WebElement rotab;
	@FindBy(xpath ="//button[text()=' Update']")
	WebElement update;
	@FindBy(xpath ="//a[@data-toggle='collapse']//p[text()='Operation']")
	WebElement operation;
	@FindBy(xpath ="//span[text()='Applications']")
	WebElement applications;
	
	
	@FindBy(xpath ="(//*[@class='dx-datagrid-table dx-datagrid-table-fixed']//tbody)[2]/tr[1]/td[1]")
	WebElement editstudent;
	
	@FindBy(xpath ="//mat-expansion-panel//span[@class='mat-content']//h1[text()='Recruiter/Agent']")
	WebElement agent;
	@FindBy(xpath ="//mat-expansion-panel//span[@class='mat-content']//h1[text()='Program Information']")
	WebElement program;
	@FindBy(xpath ="//mat-expansion-panel//span[@class='mat-content']//h1[text()='Educational Background']")
	WebElement educational;
	@FindBy(xpath ="//mat-expansion-panel//span[@class='mat-content']//h1[text()='Test Scores']")
	WebElement testscore;
	@FindBy(xpath ="//mat-expansion-panel//span[@class='mat-content']//h1[text()='Study Permit']")
	WebElement studypermit;
	@FindBy(xpath ="(//div/table/tbody)[4]/tr[1]/td[3]/div//button/span/*[text()='keyboard_arrow_down']")
	WebElement studyaction;
	@FindBy(xpath ="//mat-expansion-panel//span[@class='mat-content']//h1[text()='Documents']")
	WebElement document;
	@FindBy(xpath ="//mat-expansion-panel//span[@class='mat-content']//span[text()='Fee']")
	WebElement fee;
	@FindBy(xpath ="//mat-expansion-panel//span[@class='mat-content']//h1[text()='Tasks']")
	WebElement task;
	@FindBy(xpath ="(//div/table/tbody)[7]/tr[1]/td[6]/div//button/span/*[text()='keyboard_arrow_down']")
	WebElement docaction;
	@FindBy(xpath ="//mat-expansion-panel//span[@class='mat-content']//h1[text()='Institution Documents']")
	WebElement institutiondoc;
	@FindBy(xpath ="(//div[@class='dx-scrollable-wrapper'])[3]/div//table/tbody/tr/td[8]//mat-icon[text()='keyboard_arrow_down']")
	WebElement intdocact;
	 
	List<WebElement>agbuttons;
	List<WebElement>subagbuttons;
	List<String> supbt;
	List<String> subbt;
	
	List<WebElement>stbuttons;
	List<WebElement>stsubagbuttons;
	List<String> stsupbt;
	List<String> stsubbt;
	
	List<WebElement>intadds;
	List<WebElement>intsubintadds;
	List<String> intsupint;
	List<String> intsubint;
	
	List<WebElement>intclo;
	List<WebElement>intsubintclo;
	List<String> intsupic;
	List<String> intsubic;
	
	List<WebElement> agelists;
	List<WebElement> subagelists;
	List<String> sup;
	List<String> sub;
	
	List<WebElement>dcactions;
	List<WebElement>subdocactions;
	List<String> supact;
	List<String> subact;
	
	List<WebElement>docadds;
	List<WebElement>subdocadds;
	List<String> supdoc;
	List<String> subdoc;
	
	
	
	List<WebElement>actiadds;
	List<WebElement>subactiadds;
	List<String> supacti;
	List<String> subacti;
	
	List<WebElement>acticlo;
	List<WebElement>subclo;
	List<String> supac;
	List<String> subac;
	
	
	List<WebElement>taskactiadds;
	List<WebElement>tasksubactiadds;
	List<String> tasksupacti;
	List<String> tasksubacti;
	
	List<WebElement>taskacticlo;
	List<WebElement>tasksubclo;
	List<String> tasksupac;
	List<String> tasksubac;
	ArrayList<String> tab;
	public void ROPermissionFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try 
		{
			driver.navigate().refresh();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(acoount)).click();
			
			 Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(user)).click();
			
			 Thread.sleep(3000);
			nexttab.click();
			Thread.sleep(3000);
			a.moveToElement(searchtab).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(3000);
			searchtab.sendKeys("Sheshnag");
			
			 Thread.sleep(3000);
			 a.moveToElement(editagent).click(editagent).build().perform();
			
			permission.click();
			
			 Thread.sleep(3000);
			nexttab.click();
			Thread.sleep(3000);
			searchtab.sendKeys("Operation/Applications");
			
			 Thread.sleep(3000);
			rotab.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			update.click();
			Thread.sleep(3000);
			
			System.out.println("  ");
			System.out.println("Permission For RO");
			System.out.println("Institution Tabs");
			 Assert.assertEquals(true, operation.isDisplayed());
			 System.out.println("operation Tab Is Visible");
			 operation.click();
			 Thread.sleep(3000);
			 Assert.assertEquals(true, applications.isDisplayed());
			 System.out.println("applications Tab Is Visible");
			 
			 wait.until(ExpectedConditions.elementToBeClickable(applications));
			 applications.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 agbuttons=driver.findElements(By.xpath("//span[@class='mat-button-wrapper']//mat-icon"));
				supbt=new ArrayList<>();
				for(WebElement agbutton:agbuttons)
				 {
					 exi.executeScript("arguments[0].scrollIntoView();", agbutton);
					 Thread.sleep(3000);
					 supbt.add(agbutton.getText());
				 }
			 
			 
			 nexttab.click();
			 Thread.sleep(3000);
			  a.moveToElement(searchtab).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform(); 
			  searchtab.sendKeys("74356"); 
			  Thread.sleep(3000);
			  a.moveToElement(editstudent).click(editstudent).build().perform();
			  Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 agelists=driver.findElements(By.xpath("//mat-expansion-panel//span[@class='mat-content']"));
			 sup=new ArrayList<>();
			 for(WebElement aglist:agelists)
			 {
				 exi.executeScript("arguments[0].scrollIntoView();", aglist);
				 Thread.sleep(2000);
				 sup.add(aglist.getText());
			 }
			Thread.sleep(3000);	 
			 UtilityFile.Tab1(driver);
			 
			 
			 
			 
			 
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void ROSubPermissionFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try 
		{
			driver.navigate().refresh();
			Thread.sleep(3000);
			System.out.println("  ");
			System.out.println("Sub User Tabs");
			Assert.assertEquals(true, operation.isDisplayed());
			 System.out.println("operation Tab Is Visible");
			 operation.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 Assert.assertEquals(true, applications.isDisplayed());
			 System.out.println("applications Tab Is Visible");
			 wait.until(ExpectedConditions.elementToBeClickable(applications));
			 applications.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 subagbuttons=driver.findElements(By.xpath("//span[@class='mat-button-wrapper']//mat-icon"));
				subbt=new ArrayList<>();
				for(WebElement subagbutton:subagbuttons)
				 {
					 exi.executeScript("arguments[0].scrollIntoView();", subagbutton);
					 Thread.sleep(3000);
					 subbt.add(subagbutton.getText());
				 }
				System.out.println(" ");
				HashSet<String> hs = new HashSet<String>(subbt);
				 for (String match : supbt) {
			            if (hs.contains(match)) {	
			               System.out.println("---matching Elements---=" + match);
			            }
			            else {    
			               System.out.println("---Not matching elements----=" + match);
			            }
			        }
				 System.out.println(" ");
			 
			 
			 
			 
			 
			 nexttab.click();
			 Thread.sleep(3000);
			  a.moveToElement(searchtab).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform(); 
			  searchtab.sendKeys("74356");
			  Thread.sleep(3000);
			  a.moveToElement(editstudent).click(editstudent).build().perform();
			  Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 subagelists=driver.findElements(By.xpath("//mat-expansion-panel//span[@class='mat-content']"));
			 sub=new ArrayList<>();
			 for(WebElement subaglist:subagelists)
			 {
				 exi.executeScript("arguments[0].scrollIntoView();", subaglist);
				 Thread.sleep(3000);
				 sub.add(subaglist.getText());
			 }
			 HashSet<String> hs1 = new HashSet<String>(sub);
			 for (String match : sup) {
		            if (hs1.contains(match)) {
		               System.out.println("---matching Elements----=" + match);
		            }
		            else {    
		               System.out.println("----Not matching elements----=" + match);
		            }
		        } 
			System.out.println(" ");
			Thread.sleep(3000);
					 
			 UtilityFile.Tab0(driver);
				
			 
			 
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
	}

	public void RORecruiterAgentFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try 
		{
			exi.executeScript("arguments[0].scrollIntoView();",agent );
			agent.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 agent.click();
		 UtilityFile.Tab1(driver);
		 Thread.sleep(3000);
		 exi.executeScript("arguments[0].scrollIntoView();",agent );
			agent.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 agent.click();
			 Thread.sleep(3000);
			 UtilityFile.Tab0(driver);
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
		
	public void ROProgramtFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			program.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 program.click();
			 Thread.sleep(3000);
			 UtilityFile.Tab1(driver);
			 Thread.sleep(3000);
			 program.click();
				Thread.sleep(3000);
				  UtilityFile.screenShot(driver);
				 Thread.sleep(3000);
				 program.click();
				 Thread.sleep(3000);
				 UtilityFile.Tab0(driver);
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	
	
	public void ROEducationalFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try 
		{
			exi.executeScript("arguments[0].scrollIntoView();",educational );
			educational.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 educational.click();
			 UtilityFile.Tab1(driver);
			 Thread.sleep(3000);
			 exi.executeScript("arguments[0].scrollIntoView();",educational );
				educational.click();
				Thread.sleep(3000);
				  UtilityFile.screenShot(driver);
				 Thread.sleep(3000);
				 educational.click();
				 Thread.sleep(3000);
				 UtilityFile.Tab0(driver);
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	
	
	public void ROTestScoreFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			exi.executeScript("arguments[0].scrollIntoView();",testscore );
			testscore.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 testscore.click();
			 Thread.sleep(3000);
			 UtilityFile.Tab1(driver);
			 Thread.sleep(3000);
			 exi.executeScript("arguments[0].scrollIntoView();",testscore );
				testscore.click();
				Thread.sleep(3000);
				  UtilityFile.screenShot(driver);
				 Thread.sleep(3000);
				 testscore.click();
				 UtilityFile.Tab0(driver);
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	
	public void ROStudyPermitFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			exi.executeScript("arguments[0].scrollIntoView();",studypermit );
			//a.doubleClick(studypermit).build().perform();
			studypermit.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 stbuttons=driver.findElements(By.xpath("(//div[@class='dx-datagrid-header-panel'])[1]//span[@class='mat-button-wrapper']//mat-icon"));
				stsupbt=new ArrayList<>();
				for(WebElement stbutton:stbuttons)
				 {
					 stsupbt.add(stbutton.getText());
				 }
				studypermit.click();
				UtilityFile.Tab1(driver);
			 
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	public void ROSubStudyPermitFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			exi.executeScript("arguments[0].scrollIntoView();",studypermit );
			//a.doubleClick(studypermit).build().perform();
			studypermit.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 System.out.println("For Study Permit");
			 stsubagbuttons=driver.findElements(By.xpath("(//div[@class='dx-datagrid-header-panel'])[1]//span[@class='mat-button-wrapper']//mat-icon"));
				stsubbt=new ArrayList<>();
				for(WebElement stsubagbutton:stsubagbuttons)
				 {
					 stsubbt.add(stsubagbutton.getText());
				 }
				System.out.println(" ");
				HashSet<String> hs = new HashSet<String>(stsubbt);
				 for (String match : stsupbt) {
			            if (hs.contains(match)) {	
			               System.out.println("---matching Elements---=" + match);
			            }
			            else {    
			               System.out.println("---Not matching elements----=" + match);
			            }
			        }
				 System.out.println(" ");
				 studypermit.click();
				 UtilityFile.Tab0(driver);
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	
	public void RODocumentFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			exi.executeScript("arguments[0].scrollIntoView();",document );
			document.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 docadds=driver.findElements(By.xpath("(//div[@class='dx-datagrid-header-panel'])[2]//span[@class='mat-button-wrapper']//mat-icon"));
			 supdoc=new ArrayList<>();
			 for(WebElement docadd:docadds)
			 {
				 supdoc.add(docadd.getText());
			 }
			 
			 
			 
			 
			 a.moveToElement(docaction).click(docaction).build().perform();
			 Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 dcactions=driver.findElements(By.xpath("//div[@class='mat-menu-content']//span[@class='material-icons icon-position']"));
			 supact=new ArrayList<>();
			 for(WebElement action:dcactions)
			 {
				 supact.add(action.getText());
			 }
			 
			 
			 
			 
			 a.moveToElement(docaction).click(docaction).build().perform();
			 Thread.sleep(3000);
			 document.click();
			 UtilityFile.Tab1(driver);
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	public void ROSubDocumentFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			exi.executeScript("arguments[0].scrollIntoView();",document );
			document.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 System.out.println("For Document");
			 subdocadds=driver.findElements(By.xpath("(//div[@class='dx-datagrid-header-panel'])[2]//span[@class='mat-button-wrapper']//mat-icon"));
			 subdoc=new ArrayList<>();
			 for(WebElement subdocadd:subdocadds)
			 {
				 subdoc.add(subdocadd.getText());
			 }
			 
			 HashSet<String> hss = new HashSet<String>(subdoc);
			 for (String match : supdoc) {
		            if (hss.contains(match)) {
		               System.out.println("---matching Elements----=" + match);
		            }
		            else {    
		               System.out.println("----Not matching elements----=" + match);
		            }
		        } 
			 System.out.println(" ");
			 
			 
			 
			 a.moveToElement(docaction).click(docaction).build().perform();
			 Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 subdocactions=driver.findElements(By.xpath("//div[@class='mat-menu-content']//span[@class='material-icons icon-position']"));
			 subact=new ArrayList<>();
			 for(WebElement subaction:subdocactions)
			 {
				 subact.add(subaction.getText());
			 }
			 
			 HashSet<String> hs1 = new HashSet<String>(subact);
			 for (String match : supact) {
		            if (hs1.contains(match)) {
		               System.out.println("---matching Elements----=" + match);
		            }
		            else {    
		               System.out.println("----Not matching elements----=" + match);
		            }
		        } 
			 System.out.println(" ");
			 
			 
			 
			 a.moveToElement(docaction).click(docaction).build().perform();
			 Thread.sleep(3000);
			 document.click();
			 UtilityFile.Tab0(driver);
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	
	
	
	
	public void ROInstitutionDocFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			exi.executeScript("arguments[0].scrollIntoView();",institutiondoc );
			//a.doubleClick(fee).build().perform();
			institutiondoc.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 intadds=driver.findElements(By.xpath("(//div[@class='dx-datagrid-header-panel'])[3]//span[@class='mat-button-wrapper']//mat-icon"));
			 intsupint=new ArrayList<>();
			 for(WebElement intadd:intadds)
			 {
				 //exi.executeScript("arguments[0].scrollIntoView();", intadd);
				 Thread.sleep(3000);
				 intsupint.add(intadd.getText());
			 }
			 a.moveToElement(intdocact).click(intdocact).build().perform();
			 Thread.sleep(3000);
			 intclo=driver.findElements(By.xpath("//div[@class='mat-menu-content']//*[@role='menuitem']"));
			 intsupic=new ArrayList<>();
				for(WebElement intcl:intclo) 
				{
					intsupic.add(intcl.getText());
				}
			 
				 a.moveToElement(intdocact).click(intdocact).build().perform();
				 Thread.sleep(3000);
				 institutiondoc.click();
			 UtilityFile.Tab1(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	public void ROSubInstitutionDocFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			exi.executeScript("arguments[0].scrollIntoView();",institutiondoc );
			//a.doubleClick(fee).build().perform();
			institutiondoc.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 System.out.println("For Institution Document");
			 intsubintadds=driver.findElements(By.xpath("(//div[@class='dx-datagrid-header-panel'])[3]//span[@class='mat-button-wrapper']//mat-icon"));
			 intsubint=new ArrayList<>();
			 for(WebElement intsubintadd:intsubintadds)
			 {
				 
				 intsubint.add(intsubintadd.getText());
			 }
			 HashSet<String> hsacti = new HashSet<String>(intsubint);
			 for (String match : intsupint) {
		            if (hsacti.contains(match)) {
		               System.out.println("---matching Elements----=" + match);
		            }
		            else {    
		               System.out.println("----Not matching elements----=" + match);
		            }
		        } 
			 System.out.println(" ");
			 a.moveToElement(intdocact).click(intdocact).build().perform();
			 Thread.sleep(3000);
			 intsubintclo=driver.findElements(By.xpath("//div[@class='mat-menu-content']//*[@role='menuitem']"));
			 intsubic=new ArrayList<>();
				for(WebElement intsubintcl:intsubintclo) 
				{
					intsubic.add(intsubintcl.getText());
				}
				 HashSet<String> hsacclo = new HashSet<String>(intsubic);
				 for (String match : intsupic) {
			            if (hsacclo.contains(match)) {
			               System.out.println("---matching Elements----=" + match);
			            }
			            else {    
			               System.out.println("----Not matching elements----=" + match);
			            }
			        }
				 System.out.println(" ");
				 a.moveToElement(intdocact).click(intdocact).build().perform();
				 Thread.sleep(3000);
				 institutiondoc.click();
			 UtilityFile.Tab0(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	
	
	
	
	public void ROFeeFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			exi.executeScript("arguments[0].scrollIntoView();",fee );
			//a.doubleClick(fee).build().perform();
			fee.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 actiadds=driver.findElements(By.xpath("(//div[@class='dx-datagrid-header-panel'])[4]//span[@class='mat-button-wrapper']//mat-icon"));
			 supacti=new ArrayList<>();
			 for(WebElement actiadd:actiadds)
			 {
				 exi.executeScript("arguments[0].scrollIntoView();", actiadd);
				 Thread.sleep(3000);
				 supacti.add(actiadd.getText());
			 }
			 
			 acticlo=driver.findElements(By.xpath("(//div[@class='dx-scrollable-container'])[4]//button[@type='button']/span/mat-icon"));
			 supac=new ArrayList<>();
				for(WebElement acticl:acticlo) 
				{
					exi.executeScript("arguments[0].scrollIntoView();", acticl);
					supac.add(acticl.getText());
				}
				UtilityFile.Tab1(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	public void ROSubFeeFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			exi.executeScript("arguments[0].scrollIntoView();",fee );
			//a.doubleClick(fee).build().perform();
			fee.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			  System.out.println("For Fee");
			  subactiadds=driver.findElements(By.xpath("(//div[@class='dx-datagrid-header-panel'])[4]//span[@class='mat-button-wrapper']//mat-icon"));
				 subacti=new ArrayList<>();
				 for(WebElement subactiadd:subactiadds)
				 {
					 //exi.executeScript("arguments[0].scrollIntoView();", stuadd);
					 Thread.sleep(3000);
					 subacti.add(subactiadd.getText());
				 }
				 HashSet<String> hsacti = new HashSet<String>(subacti);
				 for (String match : supacti) {
			            if (hsacti.contains(match)) {
			               System.out.println("---matching Elements----=" + match);
			            }
			            else {    
			               System.out.println("----Not matching elements----=" + match);
			            }
			        } 
				 System.out.println(" ");
				 subclo=driver.findElements(By.xpath("(//div[@class='dx-scrollable-container'])[4]//button[@type='button']/span/mat-icon"));
				 subac=new ArrayList<>();
					for(WebElement subcl:subclo) 
					{
						exi.executeScript("arguments[0].scrollIntoView();", subcl);
						subac.add(subcl.getText());
					}
					 HashSet<String> hsacclo = new HashSet<String>(subac);
					 for (String match : supac) {
				            if (hsacclo.contains(match)) {
				               System.out.println("---matching Elements----=" + match+"close Delete");
				            }
				            else {    
				               System.out.println("----Not matching elements----=" + match+"close Delete");
				            }
				        } 
		
					 System.out.println(" ");
					 UtilityFile.Tab0(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	
	public void ROTaskFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			exi.executeScript("arguments[0].scrollIntoView();",task );
			task.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 taskactiadds=driver.findElements(By.xpath("(//div[@class='dx-datagrid-header-panel'])[6]//span[@class='mat-button-wrapper']//mat-icon"));
			 tasksupacti=new ArrayList<>();
			 for(WebElement taskactiadd:taskactiadds)
			 {
				 exi.executeScript("arguments[0].scrollIntoView();", taskactiadd);
				 Thread.sleep(3000);
				 tasksupacti.add(taskactiadd.getText());
			 }
			 
			 taskacticlo=driver.findElements(By.xpath("(//div[@class='dx-scrollable-container'])[6]//button[@type='button']/span/mat-icon"));
			 tasksupac=new ArrayList<>();
				for(WebElement taskacticl:taskacticlo) 
				{
					tasksupac.add(taskacticl.getText());
				}
				UtilityFile.Tab1(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	public void ROSubTaskFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			exi.executeScript("arguments[0].scrollIntoView();",task );
			task.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 System.out.println("For Task");
			 tasksubactiadds=driver.findElements(By.xpath("(//div[@class='dx-datagrid-header-panel'])[6]//span[@class='mat-button-wrapper']//mat-icon"));
			 tasksubacti=new ArrayList<>();
			 for(WebElement tasksubactiadd:tasksubactiadds)
			 {
				 Thread.sleep(3000);
				 tasksubacti.add(tasksubactiadd.getText());
			 }
			 HashSet<String> hstask = new HashSet<String>(tasksubacti);
			 for (String match : tasksupacti) {
		            if (hstask.contains(match)) {
		               System.out.println("---matching Elements----=" + match);
		            }
		            else {    
		               System.out.println("----Not matching elements----=" + match);
		            }
		        } 
			 System.out.println(" ");
			 tasksubclo=driver.findElements(By.xpath("(//div[@class='dx-scrollable-container'])[6]//button[@type='button']/span/mat-icon"));
			 tasksubac=new ArrayList<>();
				for(WebElement tasksubcl:tasksubclo) 
				{
					tasksubac.add(tasksubcl.getText());
				}
				 HashSet<String> hsatask = new HashSet<String>(tasksubac);
				 for (String match : tasksupac) {
			            if (hsatask.contains(match)) {
			               System.out.println("---matching Elements----=" + match+"close Delete");
			            }
			            else {    
			               System.out.println("----Not matching elements----=" + match+"close Delete");
			            }
			        } 
				 System.out.println(" ");
				 UtilityFile.Tab0(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	
	
	
}
