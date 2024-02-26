package testngscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestScenario2 extends AmazonTestNGScenarios {
	@Test
	public void T2()
	{
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("pen");
		Actions a=new Actions(driver);
		WebElement auto_drop=driver.findElement(By.xpath("//div[@class='left-pane-results-container']/div[1]"));
		a.moveToElement(auto_drop).perform();
		auto_drop.click();
		
	}

}
