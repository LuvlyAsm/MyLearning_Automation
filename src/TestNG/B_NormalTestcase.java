package TestNG;

import org.testng.annotations.Test;

public class B_NormalTestcase {

	@Test
	public void first_case() {
		System.err.println("Verify the Order of Execution ! /n It Will be executed based on the method name alphabetical order");
		System.out.println("1.Firstcase");
	}
	@Test
	public void second_case() {
		System.out.println("2.Secondcase");
	}
	@Test
	public void third_case() {
		System.out.println("3.Thirdcase");
	}
	@Test
	public void fourth_case() {
		int i=0;
		System.out.println("4.Fourth testcase");
	}
	@Test
	public void fifth_case() {
		int i;
		System.out.println("5.Fifthcase"+i);
	}
}
