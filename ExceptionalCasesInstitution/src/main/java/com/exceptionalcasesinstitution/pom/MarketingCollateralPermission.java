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

public class MarketingCollateralPermission 
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	public MarketingCollateralPermission(WebDriver driver)
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
	@FindBy(xpath ="//a[@data-toggle='collapse']//span[text()='Marketing Collateral']")
	WebElement marketingcollateral;
	@FindBy(xpath ="(//span[@class='mat-button-wrapper']//mat-icon)[3]")
	WebElement docaction;
	
	
	

	List<WebElement> roinstilists;
	List<WebElement> rosubinstilists;
	List<String>rosupinst;
	List<String>rosubinst;
	
	List<WebElement> rodtupds;
	List<WebElement> rosubdtupds;
	List<String>rosupupdt;
	List<String>rosubupdt;
	
	List<WebElement> rwdtupds;
	List<WebElement> rwsubdtupds;
	List<String>rwsupupdt;
	List<String>rwsubupdt;
	
	List<WebElement> fcdtupds;
	List<WebElement> fcsubdtupds;
	List<String>fcsupupdt;
	List<String>fcsubupdt;
	
	List<WebElement>dcactions;
	List<WebElement>subdocactions;
	List<String> supact;
	List<String> subact;
	
	List<WebElement>rwdcactions;
	List<WebElement>rwsubdocactions;
	List<String> rwsupact;
	List<String> rwsubact;
	
	List<WebElement>fcdcactions;
	List<WebElement>fcsubdocactions;
	List<String> fcsupact;
	List<String>fcsubact;
	
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
			searchtab.sendKeys("Institution/Marketing Collateral");
			Thread.sleep(3000);
			natab.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			update.click();
			System.out.println("Marketing Collateral Permission For NA :-");
			System.out.println("Institution User Tab");
			 Assert.assertEquals(true, instutation.isDisplayed());
			 System.out.println("Instutation Tab Is Visible");
			 instutation.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 Assert.assertEquals(true, marketingcollateral.isDisplayed());
			 System.out.println("Marketing Collateral Tab Is Visible");
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
			 Assert.assertEquals(false, marketingcollateral.isDisplayed());
			 UtilityFile.Tab0(driver);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println("  ");
			System.out.println("Institution Sub User Tab");
			System.out.println("Marketing Collateral Not Present");
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
			searchtab.sendKeys("Institution/Marketing Collateral");
			Thread.sleep(3000);
			rotab.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			update.click();
			System.out.println("Marketing Collateral Permission For RO:-");
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
			 exi.executeScript("arguments[0].scrollIntoView();", marketingcollateral);
			 Assert.assertEquals(true, marketingcollateral.isDisplayed());
			 System.out.println("Marketing Collateral Tab Is Visible");
			 Thread.sleep(2000);
			 //a.moveToElement(campus).click(campus).build().perform();
			 marketingcollateral.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 rodtupds=driver.findElements(By.xpath("//div[@class='dx-datagrid-header-panel']//span[@class='mat-button-wrapper']//mat-icon"));
			 rosupupdt=new ArrayList<>();
			 for(WebElement dtupd:rodtupds)
			 {
				// exi.executeScript("arguments[0].scrollIntoView();", dtupd);
				// Thread.sleep(2000);
				 rosupupdt.add(dtupd.getText());
			 }
			 Thread.sleep(3000);
			 a.moveToElement(docaction).click(docaction).build().perform();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 dcactions=driver.findElements(By.xpath("//div[@class='mat-menu-content']//*[@role='menuitem']"));
			 supact=new ArrayList<>();
			 for(WebElement action:dcactions)
			 {
				 //exi.executeScript("arguments[0].scrollIntoView();", action);
				 //Thread.sleep(2000);
				 supact.add(action.getText());
			 }
			 Thread.sleep(3000);
			 a.moveToElement(docaction).click(docaction).build().perform();
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
			 Assert.assertEquals(true, marketingcollateral.isDisplayed());
			 System.out.println("Marketing Collateral Tab Is Visible");
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
				 exi.executeScript("arguments[0].scrollIntoView();", marketingcollateral);
				 Thread.sleep(2000);
				 marketingcollateral.click();
				 Thread.sleep(3000);
				 UtilityFile.screenShot(driver);
				 Thread.sleep(3000);
				 //a.moveToElement(campus).click(campus).build().perform();
				 rosubdtupds=driver.findElements(By.xpath("//div[@class='dx-datagrid-header-panel']//span[@class='mat-button-wrapper']//mat-icon"));
				 rosubupdt=new ArrayList<>();
				 for(WebElement subdtupd:rosubdtupds)
				 {
					// exi.executeScript("arguments[0].scrollIntoView();", subdtupd);
					 
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
					 
					 Thread.sleep(2000);
					 System.out.println(" ");
					 a.moveToElement(docaction).click(docaction).build().perform();
					 Thread.sleep(3000);
					 UtilityFile.screenShot(driver);
					 Thread.sleep(3000);
					 subdocactions=driver.findElements(By.xpath("//div[@class='mat-menu-content']//*[@role='menuitem']"));
					 subact=new ArrayList<>();
					 for(WebElement subaction:subdocactions)
					 {
						 //exi.executeScript("arguments[0].scrollIntoView();", subaction);
						 //Thread.sleep(3000);
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
			searchtab.sendKeys("Institution/Marketing Collateral");
			Thread.sleep(3000);
			rwtab.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			update.click();
			Thread.sleep(2000);
			System.out.println("Marketing Collateral Permission For RW :-");
			System.out.println("Institution User Tab");
			 Assert.assertEquals(true, instutation.isDisplayed());
			 System.out.println("Instutation Tab Is Visible");
			 instutation.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000); 
			 Assert.assertEquals(true, marketingcollateral.isDisplayed());
			 System.out.println("Marketing Collateral Tab Is Visible");
			// a.moveToElement(detail).click(detail).build().perform();
			 marketingcollateral.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 rwdtupds=driver.findElements(By.xpath("//div[@class='dx-datagrid-header-panel']//span[@class='mat-button-wrapper']//mat-icon"));
			 rwsupupdt=new ArrayList<>();
			 for(WebElement dtupd:rwdtupds)
			 {
				 //exi.executeScript("arguments[0].scrollIntoView();", dtupd);
				 //Thread.sleep(2000);
				 rwsupupdt.add(dtupd.getText());
			 }
			 System.out.println(" ");
			 a.moveToElement(docaction).click(docaction).build().perform();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 rwdcactions=driver.findElements(By.xpath("//div[@class='mat-menu-content']//*[@role='menuitem']"));
			rwsupact=new ArrayList<>();
			 for(WebElement action:rwdcactions)
			 {
				 //exi.executeScript("arguments[0].scrollIntoView();", action);
				 //Thread.sleep(2000);
				 rwsupact.add(action.getText());
			 }
			 Thread.sleep(3000);
			 a.moveToElement(docaction).click(docaction).build().perform();
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
			 Assert.assertEquals(true, marketingcollateral.isDisplayed());
			 System.out.println("Marketing Collateral Tab Is Visible");
			 marketingcollateral.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			rwsubdtupds=driver.findElements(By.xpath("//div[@class='dx-datagrid-header-panel']//span[@class='mat-button-wrapper']//mat-icon"));
			 rwsubupdt=new ArrayList<>();
			 for(WebElement subdtupd:rwsubdtupds)
			 {
				// exi.executeScript("arguments[0].scrollIntoView();", subdtupd);
				// Thread.sleep(2000);
				 rwsubupdt.add(subdtupd.getText());
			 }
			 Thread.sleep(2000);
			 System.out.println(" ");
				HashSet<String> hsrw = new HashSet<String>(rwsubupdt);
				 for (String match : rwsupupdt) {
			            if (hsrw.contains(match)) {	
			               System.out.println("---matching Elements---=" + match);
			            }
			            else {    
			               System.out.println("---Not matching elements----=" + match);
			            }
			        }
				 System.out.println(" ");
				 a.moveToElement(docaction).click(docaction).build().perform();
				 Thread.sleep(3000);
				 UtilityFile.screenShot(driver);
				 Thread.sleep(3000);
				 rwsubdocactions=driver.findElements(By.xpath("//div[@class='mat-menu-content']//*[@role='menuitem']"));
				 rwsubact=new ArrayList<>();
				 for(WebElement subaction:rwsubdocactions)
				 {
					 //exi.executeScript("arguments[0].scrollIntoView();", subaction);
					 //Thread.sleep(3000);
					 rwsubact.add(subaction.getText());
				 }
				 
				 HashSet<String> hs1 = new HashSet<String>(rwsubact);
				 for (String match : rwsupact) {
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
			searchtab.sendKeys("Institution/Marketing Collateral");
			Thread.sleep(3000);
			fctab.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			update.click();
			Thread.sleep(2000);
			System.out.println("Marketing Collateral Permission For FC:-");
			System.out.println("Institution User Tab");
			 Assert.assertEquals(true, instutation.isDisplayed());
			 System.out.println("Instutation Tab Is Visible");
			 instutation.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000); 
			 Assert.assertEquals(true, marketingcollateral.isDisplayed());
			 System.out.println("Marketing Collateral Tab Is Visible");
			// a.moveToElement(detail).click(detail).build().perform();
			 marketingcollateral.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 fcdtupds=driver.findElements(By.xpath("//div[@class='dx-datagrid-header-panel']//span[@class='mat-button-wrapper']//mat-icon"));
			 fcsupupdt=new ArrayList<>();
			 for(WebElement dtupd:fcdtupds)
			 {
				// exi.executeScript("arguments[0].scrollIntoView();", dtupd);
				// Thread.sleep(2000);
				 fcsupupdt.add(dtupd.getText());
			 }
			 System.out.println(" ");
			 a.moveToElement(docaction).click(docaction).build().perform();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 fcdcactions=driver.findElements(By.xpath("//div[@class='mat-menu-content']//*[@role='menuitem']"));
			 fcsupact=new ArrayList<>();
			 for(WebElement action:fcdcactions)
			 {
				// exi.executeScript("arguments[0].scrollIntoView();", action);
				// Thread.sleep(2000);
				 fcsupact.add(action.getText());
			 }
			 Thread.sleep(3000);
			 a.moveToElement(docaction).click(docaction).build().perform();
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
			 Assert.assertEquals(true, marketingcollateral.isDisplayed());
			 System.out.println("Marketing Collateral Tab Is Visible");
			 marketingcollateral.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			fcsubdtupds=driver.findElements(By.xpath("//div[@class='dx-datagrid-header-panel']//span[@class='mat-button-wrapper']//mat-icon"));
			 fcsubupdt=new ArrayList<>();
			 for(WebElement subdtupd:fcsubdtupds)
			 {
				// exi.executeScript("arguments[0].scrollIntoView();", subdtupd);
				// Thread.sleep(2000);
				 fcsubupdt.add(subdtupd.getText());
			 }
			 Thread.sleep(2000);
			 System.out.println(" ");
				HashSet<String> hsfc = new HashSet<String>(fcsubupdt);
				 for (String match : fcsupupdt) {
			            if (hsfc.contains(match)) {	
			               System.out.println("---matching Elements---=" + match);
			            }
			            else {    
			               System.out.println("---Not matching elements----=" + match);
			            }
			        }
				 System.out.println(" ");
				 a.moveToElement(docaction).click(docaction).build().perform();
				 Thread.sleep(3000);
				 UtilityFile.screenShot(driver);
				 Thread.sleep(3000);
				 fcsubdocactions=driver.findElements(By.xpath("//div[@class='mat-menu-content']//*[@role='menuitem']"));
				 fcsubact=new ArrayList<>();
				 for(WebElement subaction:fcsubdocactions)
				 {
					 //exi.executeScript("arguments[0].scrollIntoView();", subaction);
					 //Thread.sleep(3000);
					 fcsubact.add(subaction.getText());
				 }
				 
				 HashSet<String> hsfcc= new HashSet<String>(fcsubact);
				 for (String match : fcsupact) {
			            if (hsfcc.contains(match)) {
			               System.out.println("---matching Elements----=" + match);
			            }
			            else {    
			               System.out.println("----Not matching elements----=" + match);
			            }
			        } 
				 System.out.println(" ");
				 a.moveToElement(docaction).click(docaction).build().perform();
				 Thread.sleep(3000);
				
			 UtilityFile.Tab0(driver);
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
