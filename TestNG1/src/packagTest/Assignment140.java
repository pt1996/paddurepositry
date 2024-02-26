package packagTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment140 {
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
	@Test
	public void test3()
	{
		System.out.println("Test 3");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("Method");
	}

}
