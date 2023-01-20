package TestNG;

import org.testng.annotations.Test;

public class H_Testsuite_Grouping {

	
	@Test(groups= {"Vivo"})
	public void vivo() {
		System.out.println("Vivo mobile - 1");
	}
	
	@Test(groups= {"Vivo"})
	public void vivo2() {
		System.out.println("Vivo mobile - 2");
	}
	
	@Test(groups= {"Apple"})
	public void apple() {
		System.out.println("Apple mobile - 1");
	}
	
	@Test(groups= {"Apple"})
	public void apple2() {
		System.out.println("Apple mobile - 2");
	}
	
	@Test(groups= {"Moto"})
	public void moto() {
		System.out.println("Moto mobile - 1");
	}
	
	@Test(groups= {"Moto"})
	public void moto2() {
		System.out.println("Moto mobile - 2");
	}
	
	@Test(groups= {"Mi"})
	public void mi() {
		System.out.println("MI mobile - 1");
	}
	
	@Test(groups= {"Mi"})
	public void mi2() {
		System.out.println("MI mobile - 2");
	}
}
