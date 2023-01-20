package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class I_Parameterization {

	
	@Test
	@Parameters("Name")       //this one automatically passed as parameter to the method
	public void name(String nameFromParameter) 
	{
		System.out.println("The name is : "+nameFromParameter);
	}

}
