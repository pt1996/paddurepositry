package packagTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment139 {
	@BeforeMethod
	public void bm()
	{
		System.out.println("Method");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("Method1");
	}
	@Test
	public void test1()
	{
		System.out.println("Test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("Test 2");
	}
	

}
