package TestNG;

import org.testng.annotations.Test;

public class E_Dependecies {
	
	//If some testcases depends on another testcase,we should handle it properly
	//Eg. We are going to execute a test for google.com . 
	//    If the google server is down, we can't check anything
	//    So those testcases depends on one case.
	//    So we need to use dependsOnMethods to overcome this issue

	@Test(priority=0, enabled = true)
	public void school() {
		System.out.println("School Completed - 10th");
	}
	
	@Test(dependsOnMethods="school")
	public void higherScondarySchool() {
		System.out.println("Higher Scondary School - 12th");
	}
	@Test(dependsOnMethods="higherScondarySchool")
	public void college() {
		System.out.println("College");
	}
	
}
