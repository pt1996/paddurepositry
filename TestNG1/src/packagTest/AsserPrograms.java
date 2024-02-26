package packagTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AsserPrograms {
	@Test
	public void testcase1() {

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("India");
		element.sendKeys(Keys.ENTER);// ->infinite time
		//Assert.assertEquals(driver.getTitle(), "India - Google Search");
		Assert.assertEquals(driver.getTitle(), "India - Google Search",
		  "Sorry actual behavoir is not same as Expected behavoir");
		
		// driver.quit();
	}

}
