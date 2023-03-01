package genericlibraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages.HomePage;

public class BaseClass {
	protected Properties_file_utility property;
	protected Excel_utility excel;
	protected WebDriver_Utility web;
	protected WebDriver driver;
	protected HomePage home;
	protected Skillrary_Demoapp_Page skillraryDemo;
	protected Sele_Training_Page selenium;
	protected CoreJava_Selenium_page corejava;
	protected Core_Java_Video_page javavideo;
	protected Testing_Page testing;
	protected ContactUs_Page contact;
	
	
	//@BeforeSuite
	//@BeforeTest
	@BeforeClass
	 public void classConfiguration()
	 {
		 property= new Properties_file_utility();
		 excel= new Excel_utility();
		 web= new WebDriver_Utility();
		 
		 property.property_file_inilization(IConstantPath.PROPERTIES_FILE_PATH);
		 excel.excel_Intilization(IConstantPath.EXCEL_FILE_PATH);
		 
		 
		 
	 }
	@BeforeMethod
	public void methodConfiguration()
	{
		long time= Long.parseLong(property.fetchProperty("timeouts"));
		 driver=web.openApplication(property.fetchProperty("browser"), 
				 property.fetchProperty("url"), time);
		 
		 home= new HomePage(driver);
		 skillraryDemo= new Skillrary_Demoapp_Page(driver);
		 selenium=new Sele_Training_Page(driver);
		 corejava=new CoreJava_Selenium_page(driver);
		 javavideo=new Core_Java_Video_page(driver);
		 testing=new Testing_Page(driver);
		 contact = new ContactUs_Page(driver); 
		 
	}
	@AfterMethod
	public void methodTearDown()
	{
		web.quitBrowser();
	}
	@AfterClass
	public void classTearDown()
	{
		excel.closeExcel();
	}
	//@AfterTest
	//@AfterSuite
	

}
