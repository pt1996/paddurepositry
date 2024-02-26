package packagTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment138 {
	@BeforeSuite
	public void bs()
	{
		System.out.println("Suite");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("Suite1");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("Method");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("Class");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("Class1");
	}
	@Test
	public void main1()
	{
		System.out.println("Mainm");
	}
	

}
