package TestNG;

import java.util.Scanner;

import org.testng.annotations.Test;

public class C_PriorityTestcases {
	
	@Test(priority=0)
	public void first_case() {
		//System.err.println("Verify the Order of Execution ! /n Based on the priority it will work");
		System.out.println("1.Firstcase");
	}
	@Test(priority=1)
	public void second_case() {
		System.out.println("2.Secondcase");
	}
	@Test(priority=2)
	public void third_case() {
		System.out.println("3.Thirdcase");
	}
	@Test(priority=3)
	public void fourth_case() {
		int i=0;
		System.out.println("4.Fourth testcase");
	}
	@Test(priority=4)
	public void fifth_case() {
		int i;
		System.out.println("5.Fifthcase"+i);
	}

}
