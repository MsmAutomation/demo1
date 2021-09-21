package com.exceptionalcasesinstitution.pom;

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

public class ProgramBulkUpdatePermission 
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	public ProgramBulkUpdatePermission(WebDriver driver)
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
	@FindBy(xpath ="(//label/div[1])[1]")
	WebElement natab;
	@FindBy(xpath ="(//label/div[1])[2]")
	WebElement rotab;
	@FindBy(xpath ="(//label/div[1])[3]")
	WebElement rwtab;
	@FindBy(xpath ="(//label/div[1])[4]")
	WebElement fctab;
	@FindBy(xpath ="//button[text()=' Update']")
	WebElement update;
	@FindBy(xpath = "//p[text()='Institution']")
	WebElement instutation;
	@FindBy(xpath ="//a[@data-toggle='collapse']//span[text()='Program Bulk Update']")
	WebElement programbulkupdate;
	
	@FindBy(xpath ="(//*[@name='IntekStatus']//div[@class='mat-select-value'])[1]")
	WebElement intak;
	@FindBy(xpath ="(//span[@class='mat-option-text'])[4]")
	WebElement intakclick;
	@FindBy(xpath ="(//*[@name='IntekStatus']//div[@class='mat-select-value'])[2]")
	WebElement open;
	@FindBy(xpath ="(//span[@class='mat-option-text'])[4]")
	WebElement openclick;
	
	List<WebElement> roinstilists;
	List<WebElement> rosubinstilists;
	List<String>rosupinst;
	List<String>rosubinst;
	
	List<WebElement> rodtupds;
	List<WebElement> rosubdtupds;
	List<String>rosupupdt;
	List<String>rosubupdt;
	
	List<WebElement>rointaklists;
	List<WebElement>rosubintaklists;
	List<String> rosupintak;
	List<String> rosubintak;
	
	List<WebElement>roopenlists;
	List<WebElement>rosubopenlists;
	List<String> rosupopen;
	List<String> rosubopen;
	
	List<WebElement>rouplists;
	List<WebElement>rosubuplists;
	List<String> rosupup;
	List<String> rosubup;
	
	List<WebElement> rwdtupds;
	List<WebElement> rwsubdtupds;
	List<String>rwsupupdt;
	List<String>rwsubupdt;
	
	List<WebElement>rwintaklists;
	List<WebElement>rwsubintaklists;
	List<String> rwsupintak;
	List<String> rwsubintak;
	
	List<WebElement>rwopenlists;
	List<WebElement>rwsubopenlists;
	List<String> rwsupopen;
	List<String> rwsubopen;
	
	List<WebElement>rwuplists;
	List<WebElement>rwsubuplists;
	List<String> rwsupup;
	List<String> rwsubup;
	
	List<WebElement> fcdtupds;
	List<WebElement> fcsubdtupds;
	List<String>fcsupupdt;
	List<String>fcsubupdt;

	List<WebElement>fcintaklists;
	List<WebElement>fcsubintaklists;
	List<String> fcsupintak;
	List<String> fcsubintak;
	
	List<WebElement>fcopenlists;
	List<WebElement>fcsubopenlists;
	List<String> fcsupopen;
	List<String> fcsubopen;
	
	List<WebElement>fcuplists;
	List<WebElement>fcsubuplists;
	List<String> fcsupup;
	List<String> fcsubup;
	
	public void PermissionFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 60);
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
			searchtab.sendKeys("DEVATA");
			Thread.sleep(3000);
			 a.moveToElement(editagent).click(editagent).build().perform();
			permission.click();
			wait.until(ExpectedConditions.elementToBeClickable(nexttab)).click();
			//nexttab.click();
			Thread.sleep(3000);
			searchtab.sendKeys("Institution/Program Bulk");
			Thread.sleep(3000);
			natab.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			update.click();
			System.out.println("Program/Bulk/Update Permission For NA :-");
			System.out.println("Institution User Tab");
			 Assert.assertEquals(true, instutation.isDisplayed());
			 System.out.println("Instutation Tab Is Visible");
			 instutation.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 exi.executeScript("arguments[0].scrollIntoView();", programbulkupdate);
			 Thread.sleep(3000);
			 Assert.assertEquals(true, programbulkupdate.isDisplayed());
			 System.out.println("Program/Bulk/Update Tab Is Visible");
			 System.out.println("  ");
			 Thread.sleep(2000);
			 //UtilityFile.NewTab(driver);
			 UtilityFile.Tab1(driver);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void NAPermissionFields() 
	{driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		try 
		{
			Thread.sleep(2000);
			 driver.navigate().refresh();
			 Thread.sleep(3000);
			 Assert.assertEquals(true, instutation.isDisplayed());
			 instutation.click(); 
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 Assert.assertEquals(false, programbulkupdate.isDisplayed());
			 UtilityFile.Tab0(driver);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println("  ");
			System.out.println("Institution Sub User Tab");
			System.out.println("Program/Bulk/Update Not Present");
			System.out.println("  ");
			UtilityFile.Tab0(driver);
		}
		
	}
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
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(user)).click();
			Thread.sleep(3000);
			nexttab.click();
			Thread.sleep(3000);
			a.moveToElement(searchtab).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(3000);
			searchtab.sendKeys("DEVATA");
			Thread.sleep(3000);
			 a.moveToElement(editagent).click(editagent).build().perform();
			permission.click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(nexttab)).click();
			//nexttab.click();
			Thread.sleep(3000);
			searchtab.sendKeys("Institution/Program Bulk");
			Thread.sleep(3000);
			rotab.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			update.click();
			System.out.println("Program/Bulk/Update Permission For RO :-");
			System.out.println("Institution User Tab");
			 Assert.assertEquals(true, instutation.isDisplayed());
			 System.out.println("Instutation Tab Is Visible");
			 instutation.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000); 
			 roinstilists=driver.findElements(By.xpath("//div[@id='show-Institution']//a[@class='nav-link child-menu ng-star-inserted']"));
			 rosupinst=new ArrayList<>();
			 for(WebElement instilist:roinstilists)
			 {
				 exi.executeScript("arguments[0].scrollIntoView();", instilist);
				 Thread.sleep(2000);
				 rosupinst.add(instilist.getText());
			 }
			 Thread.sleep(2000);
			 exi.executeScript("arguments[0].scrollIntoView();", programbulkupdate);
			 Assert.assertEquals(true, programbulkupdate.isDisplayed());
			 System.out.println("Program/Bulk/Update Tab Is Visible");
			 Thread.sleep(2000);
			 //a.moveToElement(campus).click(campus).build().perform();
			 programbulkupdate.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 intak.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 rointaklists=driver.findElements(By.xpath("//span[@class='mat-option-text']"));
			 rosupintak=new ArrayList<>();
			 for(WebElement intaklist:rointaklists)
			 {
				// exi.executeScript("arguments[0].scrollIntoView();", intaklist);
				// Thread.sleep(2000);
				 rosupintak.add(intaklist.getText());
			 }
			 Thread.sleep(2000);
			 intakclick.click();
			 Thread.sleep(3000);
			 rodtupds=driver.findElements(By.xpath("//div[@class='dx-datagrid-header-panel']//span[@class='mat-button-wrapper']//mat-icon"));
			 rosupupdt=new ArrayList<>();
			 for(WebElement dtupd:rodtupds)
			 {
				 //exi.executeScript("arguments[0].scrollIntoView();", dtupd);
				 //Thread.sleep(2000);
				 rosupupdt.add(dtupd.getText());
			 }
			 Thread.sleep(2000);
			 open.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 roopenlists=driver.findElements(By.xpath("//span[@class='mat-option-text']"));
			 rosupopen=new ArrayList<>();
			 for(WebElement roopenlist:roopenlists)
			 {
				 //exi.executeScript("arguments[0].scrollIntoView();", roopenlist);
				 //Thread.sleep(2000);
				 rosupopen.add(roopenlist.getText());
			 }
			 Thread.sleep(2000);
			 openclick.click();
			 Thread.sleep(2000);
			 rouplists=driver.findElements(By.xpath("//button[text()=' Update']"));
			 rosupup=new ArrayList<>();
			 for(WebElement rouplist:rouplists)
			 {
				 //exi.executeScript("arguments[0].scrollIntoView();", rouplist);
				 //Thread.sleep(2000);
				 rosupup.add(rouplist.getText());
			 }
			 Thread.sleep(3000);
			 UtilityFile.Tab1(driver);
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void SubROPermissionFields() 
	{
		try 
		{
			driver.navigate().refresh();
			Thread.sleep(5000);
			System.out.println(" ");
			System.out.println("Institution Sub User Tab");
			Assert.assertEquals(true, instutation.isDisplayed());
			 System.out.println("Instutation Tab Is Visible");
			instutation.click();
			Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			exi.executeScript("arguments[0].scrollIntoView();", programbulkupdate);
			Thread.sleep(3000);
			 Assert.assertEquals(true, programbulkupdate.isDisplayed());
			 System.out.println("Program/Bulk/Update Tab Is Visible");
			Thread.sleep(3000);
			 rosubinstilists=driver.findElements(By.xpath("//div[@id='show-Institution']//a[@class='nav-link child-menu ng-star-inserted']"));
			 rosubinst=new ArrayList<>();
			 for(WebElement subinstilist:rosubinstilists)
			 {
				 exi.executeScript("arguments[0].scrollIntoView();", subinstilist);
				 Thread.sleep(2000);
				 rosubinst.add(subinstilist.getText());
			 }
			 Thread.sleep(2000);
			 System.out.println(" ");
				HashSet<String> hsro = new HashSet<String>(rosubinst);
				 for (String match : rosupinst) {
			            if (hsro.contains(match)) {	
			               System.out.println("---matching Elements---=" + match);
			            }
			            else {    
			               System.out.println("---Not matching elements----=" + match);
			            }
			        }
				 System.out.println(" ");
				 Thread.sleep(2000);
				 exi.executeScript("arguments[0].scrollIntoView();", programbulkupdate);
				 Thread.sleep(2000);
				 programbulkupdate.click();
				 Thread.sleep(3000);
				 UtilityFile.screenShot(driver);
				 Thread.sleep(3000);
				 rosubintaklists=driver.findElements(By.xpath("//div//p[@class='alert alert-danger']"));
				 rosubintak=new ArrayList<>();
				 for(WebElement subintaklist:rosubintaklists)
				 {
					 //exi.executeScript("arguments[0].scrollIntoView();", subintaklist);
					 //Thread.sleep(2000);
					 rosupintak.add(subintaklist.getText());
				 }
				 Thread.sleep(2000);
					HashSet<String> hsrolist = new HashSet<String>(rosubintak);
					 for (String match : rosupintak) {
				            if (hsrolist.contains(match)) {	
				               System.out.println("---matching Elements---=" + match);
				            }
				            else {    
				               System.out.println("---Not matching elements----=" + match);
				            }
				        }
					 System.out.println(" ");
				 rosubdtupds=driver.findElements(By.xpath("//div//p[@class='alert alert-danger']"));
				 rosubupdt=new ArrayList<>();
				 for(WebElement subdtupd:rosubdtupds)
				 { 
					 rosubupdt.add(subdtupd.getText());
				 }
				 Thread.sleep(2000);
				 System.out.println(" ");
				 
					HashSet<String> hro = new HashSet<String>(rosubupdt);
					 for (String match : rosupupdt) {
				            if (hro.contains(match)) {	
				               System.out.println("---matching Elements---=" + match);
				            }
				            else {    
				               System.out.println("---Not matching elements----=" + match);
				            }
				        }
					 
					 System.out.println(" ");
					 Thread.sleep(2000);
					 rosubopenlists=driver.findElements(By.xpath("//div//p[@class='alert alert-danger']"));
					 rosubopen=new ArrayList<>();
					 for(WebElement rosubopenlist:rosubopenlists)
					 {
						// exi.executeScript("arguments[0].scrollIntoView();", rosubopenlist);
						// Thread.sleep(2000);
						 rosubopen.add(rosubopenlist.getText());
					 }
					 Thread.sleep(2000);
					 HashSet<String> hroop = new HashSet<String>(rosubopen);
					 for (String match : rosupopen) {
				            if (hroop.contains(match)) {	
				               System.out.println("---matching Elements---=" + match);
				            }
				            else {    
				               System.out.println("---Not matching elements----=" + match);
				            }
				        }
					 System.out.println(" ");
					 Thread.sleep(2000);
					 
					 rosubuplists=driver.findElements(By.xpath("//div//p[@class='alert alert-danger']"));
					 rosubup=new ArrayList<>();
					 for(WebElement rosubuplist:rosubuplists)
					 {
						 //exi.executeScript("arguments[0].scrollIntoView();", rosubuplist);
						 //Thread.sleep(2000);
						 rosubup.add(rosubuplist.getText());
					 }
					 HashSet<String> hroup = new HashSet<String>(rosubup);
					 for (String match : rosupup) {
				            if (hroup.contains(match)) {	
				               System.out.println("---matching Elements---=" + match);
				            }
				            else {    
				               System.out.println("---Not matching elements----=" + match);
				            }
				        }
					 
					 
					 
					 
				 Thread.sleep(3000);
			 UtilityFile.Tab0(driver);
	
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
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
			wait.until(ExpectedConditions.elementToBeClickable(acoount)).click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(user)).click();
			Thread.sleep(3000);
			nexttab.click();
			Thread.sleep(3000);
			a.moveToElement(searchtab).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(3000);
			searchtab.sendKeys("DEVATA");
			Thread.sleep(3000);
			 a.moveToElement(editagent).click(editagent).build().perform();
			permission.click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(nexttab)).click();
			//nexttab.click();
			Thread.sleep(3000);
			searchtab.sendKeys("Institution/Program Bulk");
			Thread.sleep(3000);
			rwtab.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			update.click();
			System.out.println("Program/Bulk/Update Permission For RW :-");
			System.out.println("Institution User Tab");
			 Assert.assertEquals(true, instutation.isDisplayed());
			 System.out.println("Instutation Tab Is Visible");
			 instutation.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000); 
			 exi.executeScript("arguments[0].scrollIntoView();", programbulkupdate);
			 Assert.assertEquals(true, programbulkupdate.isDisplayed());
			 System.out.println("Program/Bulk/Update Tab Is Visible");
			 Thread.sleep(2000);
			 programbulkupdate.click();
			 Thread.sleep(2000);
			 intak.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 rwintaklists=driver.findElements(By.xpath("//span[@class='mat-option-text']"));
			 rwsupintak=new ArrayList<>();
			 for(WebElement intaklist:rwintaklists)
			 {
				// exi.executeScript("arguments[0].scrollIntoView();", intaklist);
				// Thread.sleep(2000);
				 rwsupintak.add(intaklist.getText());
			 }
			 Thread.sleep(2000);
			 intakclick.click();
			 Thread.sleep(2000);
			 rwdtupds=driver.findElements(By.xpath("//div[@class='dx-datagrid-header-panel']//span[@class='mat-button-wrapper']//mat-icon"));
			 rwsupupdt=new ArrayList<>();
			 for(WebElement dtupd:rwdtupds)
			 {
				 //exi.executeScript("arguments[0].scrollIntoView();", dtupd);
				 //Thread.sleep(2000);
				 rwsupupdt.add(dtupd.getText());
			 }
			 Thread.sleep(2000);
			 open.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 rwopenlists=driver.findElements(By.xpath("//span[@class='mat-option-text']"));
			 rwsupopen=new ArrayList<>();
			 for(WebElement roopenlist:rwopenlists)
			 {
				 //exi.executeScript("arguments[0].scrollIntoView();", roopenlist);
				 //Thread.sleep(2000);
				 rwsupopen.add(roopenlist.getText());
			 }
			 Thread.sleep(2000);
			 openclick.click();
			 Thread.sleep(2000);
			 rwuplists=driver.findElements(By.xpath("//button[text()=' Update']"));
			 rwsupup=new ArrayList<>();
			 for(WebElement rwuplist:rwuplists)
			 {
				 //exi.executeScript("arguments[0].scrollIntoView();", rwuplist);
				 //Thread.sleep(2000);
				 rwsupup.add(rwuplist.getText());
			 }
			 System.out.println(" ");
			 Thread.sleep(3000);
			 UtilityFile.Tab1(driver);
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public void SubRWPermissionFields()
	{
		try 
		{
			driver.navigate().refresh();
			Thread.sleep(5000);
			System.out.println(" ");
			System.out.println("Institution Sub User Tab");
			Assert.assertEquals(true, instutation.isDisplayed());
			 System.out.println("Instutation Tab Is Visible");
			instutation.click();
			Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			exi.executeScript("arguments[0].scrollIntoView();", programbulkupdate);
			Thread.sleep(3000);
			 Assert.assertEquals(true, programbulkupdate.isDisplayed());
			 System.out.println("Program/Bulk/Update Tab Is Visible");
			 System.out.println(" ");
			Thread.sleep(3000);
				 exi.executeScript("arguments[0].scrollIntoView();", programbulkupdate);
				 Thread.sleep(2000);
				 programbulkupdate.click();
				 Thread.sleep(3000);
				 UtilityFile.screenShot(driver);
				 Thread.sleep(3000);
				 rwsubintaklists=driver.findElements(By.xpath("//div//p[@class='alert alert-danger']"));
				 rwsubintak=new ArrayList<>();
				 for(WebElement rwsubintaklist:rwsubintaklists)
				 {
					 rwsubintak.add(rwsubintaklist.getText());
				 }
				 Thread.sleep(2000);
					HashSet<String> hsrwlist = new HashSet<String>(rwsubintak);
					 for (String match : rwsupintak) {
				            if (hsrwlist.contains(match)) {	
				               System.out.println("---matching Elements---=" + match);
				            }
				            else {    
				               System.out.println("---Not matching elements----=" + match);
				            }
				        }
					 System.out.println(" ");
					 rwsubdtupds=driver.findElements(By.xpath("//div//p[@class='alert alert-danger']"));
					 rwsubupdt=new ArrayList<>();
				 for(WebElement rwsubdtupd:rwsubdtupds)
				 { 
					 rwsubupdt.add(rwsubdtupd.getText());
				 }
				 Thread.sleep(2000);
				 System.out.println(" ");
				 
					HashSet<String> hrw = new HashSet<String>(rwsubupdt);
					 for (String match : rwsupupdt) {
				            if (hrw.contains(match)) {	
				               System.out.println("---matching Elements---=" + match);
				            }
				            else {    
				               System.out.println("---Not matching elements----=" + match);
				            }
				        }
					 
					 System.out.println(" ");
					 Thread.sleep(2000);
					 rwsubopenlists=driver.findElements(By.xpath("//div//p[@class='alert alert-danger']"));
					 rwsubopen=new ArrayList<>();
					 for(WebElement rwsubopenlist:rwsubopenlists)
					 {
						 //exi.executeScript("arguments[0].scrollIntoView();", rwsubopenlist);
						 //Thread.sleep(2000);
						 rwsubopen.add(rwsubopenlist.getText());
					 }
					 Thread.sleep(2000);
					 HashSet<String> hrwop = new HashSet<String>(rwsubopen);
					 for (String match : rwsupopen) {
				            if (hrwop.contains(match)) {	
				               System.out.println("---matching Elements---=" + match);
				            }
				            else {    
				               System.out.println("---Not matching elements----=" + match);
				            }
				        }
					 System.out.println(" ");
					 Thread.sleep(2000);
					 
					 rwsubuplists=driver.findElements(By.xpath("//div//p[@class='alert alert-danger']"));
					 rwsubup=new ArrayList<>();
					 for(WebElement rwsubuplist:rwsubuplists)
					 {
						// exi.executeScript("arguments[0].scrollIntoView();", rwsubuplist);
						// Thread.sleep(2000);
						 rwsubup.add(rwsubuplist.getText());
					 }
					 HashSet<String> hrwup = new HashSet<String>(rwsubup);
					 for (String match : rwsupup) {
				            if (hrwup.contains(match)) {	
				               System.out.println("---matching Elements---=" + match);
				            }
				            else {    
				               System.out.println("---Not matching elements----=" + match);
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
	
	
	public void FCPermissionFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try 
		{
			driver.navigate().refresh();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(acoount)).click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(user)).click();
			Thread.sleep(3000);
			nexttab.click();
			Thread.sleep(3000);
			a.moveToElement(searchtab).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(3000);
			searchtab.sendKeys("DEVATA");
			Thread.sleep(3000);
			 a.moveToElement(editagent).click(editagent).build().perform();
			permission.click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(nexttab)).click();
			//nexttab.click();
			Thread.sleep(3000);
			searchtab.sendKeys("Institution/Program Bulk");
			Thread.sleep(3000);
			fctab.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			update.click();
			System.out.println("Program/Bulk/Update Permission For FC :-");
			System.out.println("Institution User Tab");
			 Assert.assertEquals(true, instutation.isDisplayed());
			 System.out.println("Instutation Tab Is Visible");
			 instutation.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000); 
			 exi.executeScript("arguments[0].scrollIntoView();", programbulkupdate);
			 Assert.assertEquals(true, programbulkupdate.isDisplayed());
			 System.out.println("Program/Bulk/Update Tab Is Visible");
			 System.out.println(" ");
			 Thread.sleep(2000);
			 programbulkupdate.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 intak.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 fcintaklists=driver.findElements(By.xpath("//span[@class='mat-option-text']"));
			 fcsupintak=new ArrayList<>();
			 for(WebElement fcintaklist:fcintaklists)
			 {
				 //exi.executeScript("arguments[0].scrollIntoView();", fcintaklist);
				 //Thread.sleep(2000);
				 fcsupintak.add(fcintaklist.getText());
			 }
			 Thread.sleep(2000);
			 intakclick.click();
			 
			 Thread.sleep(2000);
			 fcdtupds=driver.findElements(By.xpath("//div[@class='dx-datagrid-header-panel']//span[@class='mat-button-wrapper']//mat-icon"));
			 fcsupupdt=new ArrayList<>();
			 for(WebElement  fcdtupd: fcdtupds)
			 {
				 //exi.executeScript("arguments[0].scrollIntoView();",  fcdtupd);
				 //Thread.sleep(2000);
				 fcsupupdt.add( fcdtupd.getText());
			 }
			 Thread.sleep(2000);
			 open.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 fcopenlists=driver.findElements(By.xpath("//span[@class='mat-option-text']"));
			 fcsupopen=new ArrayList<>();
			 for(WebElement roopenlist:fcopenlists)
			 {
				 //exi.executeScript("arguments[0].scrollIntoView();", roopenlist);
				 //Thread.sleep(2000);
				 fcsupopen.add(roopenlist.getText());
			 }
			 Thread.sleep(2000);
			 openclick.click();
			 Thread.sleep(2000);
			 fcuplists=driver.findElements(By.xpath("//button[text()=' Update']"));
			 fcsupup=new ArrayList<>();
			 for(WebElement rouplist:fcuplists)
			 {
				// exi.executeScript("arguments[0].scrollIntoView();", rouplist);
				// Thread.sleep(2000);
				 fcsupup.add(rouplist.getText());
			 }
			 Thread.sleep(3000);
			 UtilityFile.Tab1(driver);
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public void SubFCPermissionFields()
	{
		try 
		{
			driver.navigate().refresh();
			Thread.sleep(5000);
			System.out.println(" ");
			System.out.println("Institution Sub User Tab");
			Assert.assertEquals(true, instutation.isDisplayed());
			 System.out.println("Instutation Tab Is Visible");
			instutation.click();
			Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			exi.executeScript("arguments[0].scrollIntoView();", programbulkupdate);
			Thread.sleep(3000);
			 Assert.assertEquals(true, programbulkupdate.isDisplayed());
			 System.out.println("Program/Bulk/Update Tab Is Visible");
			Thread.sleep(3000);
				 exi.executeScript("arguments[0].scrollIntoView();", programbulkupdate);
				 Thread.sleep(2000);
				 programbulkupdate.click();
				 Thread.sleep(3000);
				 UtilityFile.screenShot(driver);
				 Thread.sleep(3000);
				 intak.click();
				 Thread.sleep(3000);
				 UtilityFile.screenShot(driver);
				 Thread.sleep(3000);
				 fcsubintaklists=driver.findElements(By.xpath("//span[@class='mat-option-text']"));
				 fcsubintak=new ArrayList<>();
				 for(WebElement fcsubintaklist:fcsubintaklists)
				 {
					// exi.executeScript("arguments[0].scrollIntoView();", fcsubintaklist);
					 //Thread.sleep(2000);
					 fcsubintak.add(fcsubintaklist.getText());
				 }
				 Thread.sleep(2000);
				 intakclick.click();
				 Thread.sleep(2000);
					HashSet<String> hsfclist = new HashSet<String>(fcsubintak);
					 for (String match : fcsupintak) {
				            if (hsfclist.contains(match)) {	
				               System.out.println("---matching Elements---=" + match);
				            }
				            else {    
				               System.out.println("---Not matching elements----=" + match);
				            }
				        }
					 System.out.println(" ");
					 fcsubdtupds=driver.findElements(By.xpath("//div[@class='dx-datagrid-header-panel']//span[@class='mat-button-wrapper']//mat-icon"));
					 fcsubupdt=new ArrayList<>();
				 for(WebElement subdtupd:fcsubdtupds)
				 { 
					 fcsubupdt.add(subdtupd.getText());
				 }
				 Thread.sleep(2000);
				 System.out.println(" ");
				 
					HashSet<String> hfc = new HashSet<String>(fcsubupdt);
					 for (String match : fcsupupdt) {
				            if (hfc.contains(match)) {	
				               System.out.println("---matching Elements---=" + match);
				            }
				            else {    
				               System.out.println("---Not matching elements----=" + match);
				            }
				        }
					 
					 System.out.println(" ");
					 Thread.sleep(2000);
					 open.click();
					 Thread.sleep(3000);
					 UtilityFile.screenShot(driver);
					 Thread.sleep(3000);
					 fcsubopenlists=driver.findElements(By.xpath("//span[@class='mat-option-text']"));
					 fcsubopen=new ArrayList<>();
					 for(WebElement fcsubopenlist:fcsubopenlists)
					 {
						 //exi.executeScript("arguments[0].scrollIntoView();", fcsubopenlist);
						 //Thread.sleep(2000);
						 fcsubopen.add(fcsubopenlist.getText());
					 }
					 Thread.sleep(2000);
					 openclick.click();
					 HashSet<String> hfcop = new HashSet<String>(fcsubopen);
					 for (String match : fcsupopen) {
				            if (hfcop.contains(match)) {	
				               System.out.println("---matching Elements---=" + match);
				            }
				            else {    
				               System.out.println("---Not matching elements----=" + match);
				            }
				        }
					 System.out.println(" ");
					 Thread.sleep(2000);
					 
					 fcsubuplists=driver.findElements(By.xpath("//button[text()=' Update']"));
					 fcsubup=new ArrayList<>();
					 for(WebElement fcsubuplist:fcsubuplists)
					 {
						// exi.executeScript("arguments[0].scrollIntoView();", fcsubuplist);
						 //Thread.sleep(2000);
						 fcsubup.add(fcsubuplist.getText());
					 }
					 HashSet<String> hfcup = new HashSet<String>(fcsubup);
					 for (String match : fcsupup) {
				            if (hfcup.contains(match)) {	
				               System.out.println("---matching Elements---=" + match);
				            }
				            else {    
				               System.out.println("---Not matching elements----=" + match);
				            }
				        }
					 
					 
					 
					 
				 Thread.sleep(3000);
			 UtilityFile.Tab0(driver);
	
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
