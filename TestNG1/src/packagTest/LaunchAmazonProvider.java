package packagTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LaunchAmazonProvider {
	@Test(dataProvider="data2")
	public void method2(String name)
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.id("twotabsearchtextbox"));
		e.sendKeys(name);
		e.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}
	@DataProvider(name="data2")
	public Object[][] text()
	{
	return new Object[][] {{"watches"},{"pen"},{"bags"},{"laptop"},{"mobiles"}};
	
		
	
	

}
}
