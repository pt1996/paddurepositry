package packagTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment137 {
	@BeforeSuite
	public void method()
	{
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void method1()
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void method3()
	{
		System.out.println("Before class");
	}
	@BeforeMethod
	public void method4()
	{
		System.out.println("Before Method");
	}
	@Test
	public void main()
	{
		System.out.println("Main Method");
	}
	

}
