package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class F_TestSuite_Selenium {
	
	long overAllTime;
	
	
	@Test(priority=0)
	public void openGoogle() {
		
		long startTime=System.currentTimeMillis(); // start time
	
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\akbar.syed\\eclipse-workspace\\MyLearning_Automation\\SeleniumWebDriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://google.com");
	    System.out.println("Google Opened successfully");
		
	    long endTime=System.currentTimeMillis(); //end time
	    
	    long totalTime = endTime-startTime;      //total time taken for execution
		System.out.println("Total Time Taken for Execution : "+totalTime);
		overAllTime=overAllTime+totalTime;

	    driver.close();
	}
	@Test(priority=1)
	public void openBing() {
	
		long startTime=System.currentTimeMillis(); // start time
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\akbar.syed\\eclipse-workspace\\MyLearning_Automation\\SeleniumWebDriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://bing.com");
	    System.out.println("Bing Opened successfully");
	    
	    long endTime=System.currentTimeMillis(); //end time
	    
		long totalTime = endTime-startTime;     //total time taken for execution
		System.out.println("Total Time Taken for Execution : "+totalTime);
		overAllTime=overAllTime+totalTime;
		
	    driver.close();
	}
	@Test(priority=-1)
	public void openYahoo() {
		
		long startTime=System.currentTimeMillis(); // start time
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\akbar.syed\\eclipse-workspace\\MyLearning_Automation\\SeleniumWebDriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://yahoo.com");
	    System.out.println("Yahoo Opened successfully");
	    
	    long endTime=System.currentTimeMillis(); //end time
	    
	    long totalTime = endTime-startTime;      //total time taken for execution
		System.out.println("Total Time Taken for Execution : "+totalTime); 
		overAllTime=overAllTime+totalTime;
		
	    driver.close();
	}
	@Test(priority=5)
	public void timeTaken(){
		System.out.println("Over all time taken to perform the execution : "+overAllTime);
	}

}
