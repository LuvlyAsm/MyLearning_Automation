package TestNG;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class M_Listeners implements ITestListener  
{		

	static int passNumber=0;
	static int failNumber=0;
	boolean pass=true;
    @Override		
    public void onFinish(ITestContext arg0) {					
        System.out.println("Testing Ended");			
        		
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
        System.out.println("Testing Started");			
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailure(ITestResult arg0) {
    	System.out.println("TC-Failure --> Take screenshot ");
    	try {
			takeScreenshot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        		
    }		

    public void takeScreenshot() throws AWTException, IOException {
    	Robot robot=new Robot();
	    
	    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	    System.out.println(d);
	    Rectangle rectangle=new Rectangle(d);
	    BufferedImage capturedImage= robot.createScreenCapture(rectangle);
	   if(pass==true) 
	   {
		   String s="./Screenshots/Pass"+passNumber+".png";
		    ImageIO.write(capturedImage, "PNG", new File(s));
		    passNumber++;
	    }
	   else if(pass==false) 
	   {
		   String s="./Screenshots/Pass"+failNumber+".png";
		    ImageIO.write(capturedImage, "PNG", new File(s));
		    failNumber++;
		    pass=true;
	    }
    
    }
	 

	@Override		
    public void onTestSkipped(ITestResult arg0) {	
    	
    	System.out.println("TC skipped - "+arg0);
       		
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {					
        System.out.println("Testing Started - onTestStart");			
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
        System.out.println("Testcase Passed - "+arg0);
        try {
			takeScreenshot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        		
    }	
   
}		
