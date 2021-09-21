package com.exceptionalcasesinstitution.apppom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

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



public class NAPermission 
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	public NAPermission(WebDriver driver)
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
	@FindBy(xpath ="//button[text()=' Update']")
	WebElement update;
	
	@FindBy(xpath ="//a[@data-toggle='collapse']//p[text()='Operation']")
	WebElement operation;
	@FindBy(xpath ="//span[text()='Applications']")
	WebElement applications;
	
	
	ArrayList<String> tab;
	
	
	public void NAPermissionFields()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try 
		{
			
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
			searchtab.sendKeys("Sheshnag");
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
			nexttab.click();
			Thread.sleep(3000);
			searchtab.sendKeys("Operation/Applications");
			natab.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			update.click();
			 Thread.sleep(3000);
			 Assert.assertEquals(true, operation.isDisplayed());
			 System.out.println("operation Tab Is Visible");
			 operation.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 Assert.assertEquals(true, applications.isDisplayed());
			 System.out.println("applications Tab Is Visible");
			 System.out.println("  ");
			 wait.until(ExpectedConditions.elementToBeClickable(applications));
			 applications.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 
			 UtilityFile.NewTab(driver);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void NASubPermissionField()
	{
		try 
		{
			 driver.navigate().refresh();
			 Thread.sleep(3000);
			 Assert.assertEquals(true, operation.isDisplayed());
			 operation.click(); 
			 Thread.sleep(3000);
			 Assert.assertEquals(false, applications.isDisplayed());
			 applications.click();
			 UtilityFile.Tab0(driver);
			 
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println("  ");
			System.out.println("Permission For NA");
			System.out.println("Applications Not Present");
			UtilityFile.Tab0(driver);
			
		}
		
	}

}
