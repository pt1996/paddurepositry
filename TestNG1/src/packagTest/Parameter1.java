package packagTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Parameter1 {
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before method");
	}
	@Test
	public void method()
	{
		System.out.println("method");
	}
	@Test(invocationCount=11)
	public void method1()
	{
		System.out.println("method 1");
	}
	@Test
	public void method2()
	{
		System.out.println("method 2");
	}
	@Test
	public void method3()
	{
		System.out.println("method 3");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("After Method");
	}
	



}
