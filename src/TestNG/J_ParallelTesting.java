package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class J_ParallelTesting {
	
	//We can use parallel execution while none of the cases depends on another
	
	
	
    @Test
	public void openGoogle() 
	{
	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\akbar.syed\\eclipse-workspace\\MyLearning_Automation\\SeleniumWebDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://google.com");
    driver.manage().window().maximize();
    driver.close();		
	}
	
    @Test
	public void openBing() 
	{
	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\akbar.syed\\eclipse-workspace\\MyLearning_Automation\\SeleniumWebDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://bing.com");
    driver.manage().window().maximize();
    driver.close();		
	}

}
