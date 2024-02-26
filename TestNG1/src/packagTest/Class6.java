package packagTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Class6 {
	@BeforeSuite
	public void bs()
	{
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("Before class");
	}
	
	@Test
	public void testcase1()
	{
		System.out.println("Test Case 1");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("After Class");
	}
	@AfterTest
	public void at()
	{
		System.out.println("After Test");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After Suite");
	}
	@Test
	public void TestCase2()
	{
		System.out.println("After Test2");
	

}
}
