
package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class G_Testsuite_Selenium2 {
	//BeforSuite/AfterSuite
	
	long startTime=0,endTime=0,totalTime=0;
	WebDriver driver;
	
	@BeforeSuite
	public void openBrowser()
	{
		startTime=System.currentTimeMillis(); // start time
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\akbar.syed\\eclipse-workspace\\MyLearning_Automation\\SeleniumWebDriver\\chromedriver.exe");
	    driver=new ChromeDriver();
	}
	
	
	@Test(priority=0)
	public void openGoogle() 
	{
	    driver.get("http://google.com");
	    System.out.println("Google Opened successfully");
	}
	
	@Test(priority=1)
	public void openBing() 
	{
	    driver.get("http://bing.com");
	    System.out.println("Bing Opened successfully");   
	}
	
	@Test(priority=-1)
	public void openYahoo() {
	    driver.get("http://yahoo.com");
	    System.out.println("Yahoo Opened successfully");  
	}
	
	@AfterSuite
	public void closeBrowser(){
		driver.close();
		endTime=System.currentTimeMillis(); //end time
		totalTime = endTime-startTime;      //total time taken for execution
		System.out.println("Total Time Taken for Execution : "+totalTime); 
	}

}
