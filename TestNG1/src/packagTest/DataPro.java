package packagTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro {
	@Test(dataProvider="data1")
	public void method(String emailid)
	{
		System.out.println(emailid.concat("is email id"));
	}
	@DataProvider(name="data1")
	public Object[][] method2()
	{
		return new Object[][] {{"ram@gmail.com"},{"paddu@gmail.com"},{"sita@gmail.com"},{"shiva@gmail.com"},{"manish@gmail.com"}};
		
	}

}
