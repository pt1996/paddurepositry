package testngscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestScenario5 extends AmazonTestNGScenarios {
	@Test
	public void dropdown()
	{
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("Books");
		WebElement search=driver.findElement(By.id("nav-search-submit-button"));
		search.click();
	}

}
