package packagTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertProgram1 {
	@Test
	public void amazon()
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement accounts=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		Actions a=new Actions(driver);
		a.moveToElement(accounts).perform();
		WebElement signin=driver.findElement(By.xpath("//span[.='Sign in'][1]"));
		signin.click();
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys("9441057839");
		WebElement button=driver.findElement(By.id("continue"));
		button.click();
		WebElement pwd=driver.findElement(By.id("ap_password"));
		pwd.sendKeys("Yamini@98");
		WebElement singnin1=driver.findElement(By.id("signInSubmit"));
		singnin1.click();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("bag");
		//Assert.assertEquals(Search.isDisplayed(), false);
				//Assert.assertEquals(Search.isDisplayed(), false, "Sorry! Element not Found.");
				//Assert.assertTrue(search.isDisplayed()==false);
				//Assert.assertTrue(search.isDisplayed()==false, "Sorry the given component was not found");
				
				//Assert.assertFalse(false);
				 Assert.assertFalse(false, "Sorry ");
		
		
	

}

}


