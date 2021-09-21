package com.exceptionalcasesinstitution.stupom;

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



public class StuRWPermission 
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	public StuRWPermission(WebDriver driver)
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
	@FindBy(xpath ="(//label/div[1])[3]")
	WebElement rwtab;
	@FindBy(xpath ="//button[text()=' Update']")
	WebElement update;
	@FindBy(xpath ="//a[@data-toggle='collapse']//p[text()='Operation']")
	WebElement operation;
	@FindBy(xpath ="//span[text()='Students']")
	WebElement student;
	@FindBy(xpath ="(//*[@class='dx-datagrid-table dx-datagrid-table-fixed']//tbody)[2]/tr[1]/td[1]")
	WebElement editstudent;
	
	@FindBy(xpath ="//mat-expansion-panel//span[@class='mat-content']//h1[text()='Educational Background']")
	WebElement educational;
	@FindBy(xpath ="//mat-expansion-panel//span[@class='mat-content']//h1[text()='Test Scores']")
	WebElement testscore;
	@FindBy(xpath ="//mat-expansion-panel//span[@class='mat-content']//h1[text()='Documents']")
	WebElement document;
	@FindBy(xpath ="//mat-expansion-panel//span[@class='mat-content']//h1[text()='Student Visa']")
	WebElement visa;
	@FindBy(xpath ="//mat-expansion-panel//span[@class='mat-content']//h1[text()='Interest']")
	WebElement interest;
	@FindBy(xpath ="//mat-expansion-panel//span[@class='mat-content']//h1[text()='Activities']")
	WebElement activity;
	@FindBy(xpath ="(//div/table/tbody)[3]/tr[1]/td[6]/div/button/span/mat-icon[text()='keyboard_arrow_down']")
	WebElement docaction;
	
	List<WebElement> agelists;
	List<WebElement> subagelists;
	List<String> sup;
	List<String> sub;
	
	List<WebElement>agbuttons;
	List<WebElement>subagbuttons;
	List<String> supbt;
	List<String> subbt;
	
	List<WebElement>eduadds;
	List<WebElement>subeduadds;
	List<String> supedu;
	List<String> subedu;
	
	List<WebElement>docadds;
	List<WebElement>subdocadds;
	List<String> supdoc;
	List<String> subdoc;
	
	List<WebElement>dcactions;
	List<WebElement>subdocactions;
	List<String> supact;
	List<String> subact;
	
	List<WebElement>stuadds;
	List<WebElement>substuadds;
	List<String> supstu;
	List<String> substu;
	
	List<WebElement>stuclo;
	List<WebElement>substuclo;
	List<String> supsc;
	List<String> subsc;
	
	List<WebElement>intadds;
	List<WebElement>subintadds;
	List<String> supint;
	List<String> subint;
	
	List<WebElement>intclo;
	List<WebElement>subintclo;
	List<String> supic;
	List<String> subic;
	
	List<WebElement>actiadds;
	List<WebElement>subactiadds;
	List<String> supacti;
	List<String> subacti;
	
	List<WebElement>acticlo;
	List<WebElement>subclo;
	List<String> supac;
	List<String> subac;
	
	ArrayList<String> tab;
	public void RWPermissionFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try 
		{
			driver.navigate().refresh();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 exi.executeScript("arguments[0].scrollIntoView();",acoount );
			 Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(acoount)).click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(user)).click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			nexttab.click();
			Thread.sleep(3000);
			a.moveToElement(searchtab).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(3000);
			searchtab.sendKeys("RAGHU");
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 a.moveToElement(editagent).click(editagent).build().perform();
			//editagent.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			permission.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			nexttab.click();
			Thread.sleep(3000);
			searchtab.sendKeys("Operation/Students");
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			rwtab.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			update.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			System.out.println("  ");
			System.out.println("Permission For RW");
			System.out.println("Agent Tabs");
			 Assert.assertEquals(true, operation.isDisplayed());
			 System.out.println("operation Tab Is Visible");
			 operation.click();
			 
			 Assert.assertEquals(true, student.isDisplayed());
			 System.out.println("student Tab Is Visible");
			 
			 wait.until(ExpectedConditions.elementToBeClickable(student));
			// a.moveToElement(student).click(student).build().perform();
			 student.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 tab = new ArrayList<>(driver.getWindowHandles());
				driver.switchTo().window(tab.get(1));
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void RWScreenshootField()
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
			 Assert.assertEquals(true, student.isDisplayed());
			 System.out.println("student Tab Is Visible");
			 wait.until(ExpectedConditions.elementToBeClickable(student));
			 student.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 tab = new ArrayList<>(driver.getWindowHandles());
				driver.switchTo().window(tab.get(0));
				
			 
			 
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println("Operation Not Present");
			tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(0));
		}
		
		
	}
	public void RWEditStuentFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			agbuttons=driver.findElements(By.xpath("//span[@class='mat-button-wrapper']//mat-icon"));
			supbt=new ArrayList<>();
			for(WebElement agbutton:agbuttons)
			 {
				 exi.executeScript("arguments[0].scrollIntoView();", agbutton);
				 Thread.sleep(3000);
				 supbt.add(agbutton.getText());
			 }
			Thread.sleep(3000);
		  nexttab.click(); Thread.sleep(3000);
		  a.moveToElement(searchtab).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform(); 
		  searchtab.sendKeys("76412"); Thread.sleep(3000);
		 // wait.until(ExpectedConditions.elementToBeClickable(editstudent));
		  a.moveToElement(editstudent).click(editstudent).build().perform();
		  //editstudent.click();
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
		Thread.sleep(5000);
		 tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(1));
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	
	public void RWSubEditStuentFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
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
			 System.out.println("Edit Both Matching And Non Matching Tabs");
			Thread.sleep(3000);
		  nexttab.click(); Thread.sleep(3000);
		  a.moveToElement(searchtab).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform(); 
		  searchtab.sendKeys("76412"); Thread.sleep(3000);
		 // wait.until(ExpectedConditions.elementToBeClickable(editstudent));
		  a.moveToElement(editstudent).click(editstudent).build().perform();
		  //editstudent.click();
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
		 tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(0));
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	
	public void RWEducationalFields()
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
			 eduadds=driver.findElements(By.xpath("(//div[@class='mat-expansion-panel-body'])[2]//button[@type='button']"));
				supedu=new ArrayList<>();
				for(WebElement eduadd:eduadds)
				{
					//exi.executeScript("arguments[0].scrollIntoView();", eduadd);
					 Thread.sleep(3000);
					 supedu.add(eduadd.getText());
				}
				
				Thread.sleep(3000);
		 tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(1));
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	
	public void RWSubEducationalFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			exi.executeScript("arguments[0].scrollIntoView();",educational );
			educational.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 subeduadds=driver.findElements(By.xpath("(//div[@class='mat-expansion-panel-body'])[2]//button[@type='button']"));
				subedu=new ArrayList<>();
				for(WebElement subeduadd:subeduadds)
				{
					//exi.executeScript("arguments[0].scrollIntoView();", subeduadd);
					 Thread.sleep(3000);
					 subedu.add(subeduadd.getText());
				}
				
				HashSet<String> hs = new HashSet<String>(subedu);
				 for (String match : supedu) {
			            if (hs.contains(match)) {
			               System.out.println("---matching Elements----=" + match);
			            }
			            else {    
			               System.out.println("----Not matching elements----=" + match);
			            }
			        } 
				 System.out.println(" ");
				Thread.sleep(3000);
		 tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(0));
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	
	public void RWTestScoreFields()
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
		 tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(1));
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	public void RWSubTestScoreFields()
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
		 tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(0));
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	public void RWDocumentFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			exi.executeScript("arguments[0].scrollIntoView();",document );
			a.moveToElement(document).click(document).build().perform();
			//document.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 docadds=driver.findElements(By.xpath("(//div[@class='dx-datagrid-header-panel'])[1]//span[@class='mat-button-wrapper']//mat-icon"));
			 supdoc=new ArrayList<>();
			 for(WebElement docadd:docadds)
			 {
				 exi.executeScript("arguments[0].scrollIntoView();", docadd);
				 Thread.sleep(3000);
				 supdoc.add(docadd.getText());
			 }
			 Thread.sleep(3000);
			 a.moveToElement(docaction).click(docaction).build().perform();
			// docaction.click();
			 Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 dcactions=driver.findElements(By.xpath("//div[@class='mat-menu-content']//span[@class='material-icons icon-position']"));
			 supact=new ArrayList<>();
			 for(WebElement action:dcactions)
			 {
				 exi.executeScript("arguments[0].scrollIntoView();", action);
				 Thread.sleep(3000);
				 supact.add(action.getText());
			 }
			 Thread.sleep(3000);
			 a.moveToElement(docaction).click(docaction).build().perform();
		 tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(1));
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	public void RWSubDocumentFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			exi.executeScript("arguments[0].scrollIntoView();",document );
			a.moveToElement(document).click(document).build().perform();
			//document.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 subdocadds=driver.findElements(By.xpath("(//div[@class='dx-datagrid-header-panel'])[1]//span[@class='mat-button-wrapper']//mat-icon"));
			 subdoc=new ArrayList<>();
			 for(WebElement subdocadd:subdocadds)
			 {
				 exi.executeScript("arguments[0].scrollIntoView();", subdocadd);
				 Thread.sleep(3000);
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
			 //docaction.click();
			 Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 subdocactions=driver.findElements(By.xpath("//div[@class='mat-menu-content']//span[@class='material-icons icon-position']"));
			 subact=new ArrayList<>();
			 for(WebElement subaction:subdocactions)
			 {
				 exi.executeScript("arguments[0].scrollIntoView();", subaction);
				 Thread.sleep(3000);
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
		 tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(0));
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	public void RWVisaFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			exi.executeScript("arguments[0].scrollIntoView();",visa );
			//a.doubleClick(visa).build().perform();
			visa.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 stuadds=driver.findElements(By.xpath("(//div[@class='dx-datagrid-header-panel'])[2]//span[@class='mat-button-wrapper']//mat-icon"));
			 supstu=new ArrayList<>();
			 for(WebElement stuadd:stuadds)
			 {
				 //exi.executeScript("arguments[0].scrollIntoView();", stuadd);
				 Thread.sleep(3000);
				 supstu.add(stuadd.getText());
			 }
			 
			 stuclo=driver.findElements(By.xpath("(//div[@class='dx-scrollable-container'])[2]//button[@type='button']"));
				supsc=new ArrayList<>();
				for(WebElement stucl:stuclo) 
				{
					supsc.add(stucl.getText());
				}
		 tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(1));
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	public void RWSubVisaFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			exi.executeScript("arguments[0].scrollIntoView();",visa );
			//a.doubleClick(visa).build().perform();
			visa.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 substuadds=driver.findElements(By.xpath("(//div[@class='dx-datagrid-header-panel'])[2]//span[@class='mat-button-wrapper']//mat-icon"));
			 substu=new ArrayList<>();
			 for(WebElement substuadd:substuadds)
			 {
				 //exi.executeScript("arguments[0].scrollIntoView();", stuadd);
				 Thread.sleep(3000);
				 substu.add(substuadd.getText());
			 }
			 
			 HashSet<String> hstu = new HashSet<String>(substu);
			 for (String match : supstu) {
		            if (hstu.contains(match)) {
		               System.out.println("---matching Elements----=" + match);
		            }
		            else {    
		               System.out.println("----Not matching elements----=" + match);
		            }
		        } 
			 
			 substuclo=driver.findElements(By.xpath("(//div[@class='dx-scrollable-container'])[2]//button[@type='button']"));
			 subsc=new ArrayList<>();
				for(WebElement substucl:substuclo) 
				{
					subsc.add(substucl.getText());
				}
				 HashSet<String> hstuclo = new HashSet<String>(subsc);
				 for (String match : supsc) {
			            if (hstuclo.contains(match)) {
			               System.out.println("---matching Elements----=" + match);
			            }
			            else {    
			               System.out.println("----Not matching elements----=" + match);
			            }
			        } 
			 System.out.println(" ");
		 tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(0));
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	public void RWInterestFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			exi.executeScript("arguments[0].scrollIntoView();",interest );
			interest.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 intadds=driver.findElements(By.xpath("(//div[@class='dx-datagrid-header-panel'])[3]//span[@class='mat-button-wrapper']//mat-icon"));
			 supint=new ArrayList<>();
			 for(WebElement intadd:intadds)
			 {
				 //exi.executeScript("arguments[0].scrollIntoView();", stuadd);
				 Thread.sleep(3000);
				 supint.add(intadd.getText());
			 }
			 
			 intclo=driver.findElements(By.xpath("(//div[@class='dx-scrollable-container'])[3]//button[@type='button']"));
			 supic=new ArrayList<>();
				for(WebElement intcl:intclo) 
				{
					supic.add(intcl.getText());
				}
		 tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(1));
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	public void RWSubInterestFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			exi.executeScript("arguments[0].scrollIntoView();",interest );
			interest.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 subintadds=driver.findElements(By.xpath("(//div[@class='dx-datagrid-header-panel'])[3]//span[@class='mat-button-wrapper']//mat-icon"));
			 subint=new ArrayList<>();
			 for(WebElement subintadd:subintadds)
			 {
				 //exi.executeScript("arguments[0].scrollIntoView();", stuadd);
				 Thread.sleep(3000);
				 subint.add(subintadd.getText());
			 }
			 
			 HashSet<String> hsint = new HashSet<String>(subint);
			 for (String match : supint) {
		            if (hsint.contains(match)) {
		               System.out.println("---matching Elements----=" + match);
		            }
		            else {    
		               System.out.println("----Not matching elements----=" + match);
		            }
		        } 
			 subintclo=driver.findElements(By.xpath("(//div[@class='dx-scrollable-container'])[3]//button[@type='button']"));
			 subic=new ArrayList<>();
				for(WebElement subintcl:subintclo) 
				{
					subic.add(subintcl.getText());
				}
				 HashSet<String> hsinclo = new HashSet<String>(subic);
				 for (String match : supic) {
			            if (hsinclo.contains(match)) {
			               System.out.println("---matching Elements----=" + match);
			            }
			            else {    
			               System.out.println("----Not matching elements----=" + match);
			            }
			        } 
			 
			
			 System.out.println(" ");
		 tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(0));
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	public void RWActivityFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			exi.executeScript("arguments[0].scrollIntoView();",activity );
			activity.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 actiadds=driver.findElements(By.xpath("(//div[@class='dx-datagrid-header-panel'])[4]//span[@class='mat-button-wrapper']//mat-icon"));
			 supacti=new ArrayList<>();
			 for(WebElement actiadd:actiadds)
			 {
				 //exi.executeScript("arguments[0].scrollIntoView();", stuadd);
				 Thread.sleep(3000);
				 supacti.add(actiadd.getText());
			 }
			 
			 acticlo=driver.findElements(By.xpath("(//div[@class='dx-scrollable-container'])[4]//button[@type='button']"));
			 supac=new ArrayList<>();
				for(WebElement acticl:acticlo) 
				{
					exi.executeScript("arguments[0].scrollIntoView();", acticl);
					supac.add(acticl.getText());
				}
		 tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(1));
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	public void RWSubActivityFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try {
			exi.executeScript("arguments[0].scrollIntoView();",activity );
			activity.click();
			Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
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
			 
			 subclo=driver.findElements(By.xpath("(//div[@class='dx-scrollable-container'])[4]//button[@type='button']"));
			 subac=new ArrayList<>();
				for(WebElement subcl:subclo) 
				{
					exi.executeScript("arguments[0].scrollIntoView();", subcl);
					subac.add(subcl.getText());
				}
				 HashSet<String> hsacclo = new HashSet<String>(subac);
				 for (String match : supac) {
			            if (hsacclo.contains(match)) {
			               System.out.println("---matching Elements----=" + match);
			            }
			            else {    
			               System.out.println("----Not matching elements----=" + match);
			            }
			        } 
		 tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(0));
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}

}
