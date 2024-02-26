package packagTest;

import org.testng.annotations.Test;

public class GroupingProgram {
	@Test
	public void m1()
	{
		System.out.println("Method 1");
	}
	@Test (groups={"smoke","system"})
	public void m2()
	{
		System.out.println("Method 2");
	}
	@Test (groups="system")
	public void m3()
	{
		System.out.println("Method 3");
	}
	@Test (groups=("smoke"))
	public void m4()
	{
		System.out.println("Method 4");
	}
	@Test
	public void m5()
	{
		System.out.println("Method 5");
	}

}
