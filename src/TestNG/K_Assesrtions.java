package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class K_Assesrtions {
	
	//IT is useful when dev do unit testing
	//IT simplifies the set of codes.
	//Instead of writing if else we can go for the Assert 

	String name="agni";
	boolean val=true;
	boolean val2=false;
	boolean val3=true;
	
	@Test
	public void assertion() {
		
		Assert.assertTrue(val,"Value is true");
		Assert.assertFalse(val2,"Value is false");
		Assert.assertEquals(val, val3,val+" == "+val3);
	}
	

}
