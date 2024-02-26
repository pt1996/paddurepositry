package testngscenarios;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestScenario4 extends AmazonTestNGScenarios{
	@Test
	public void addcart()
	{
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("pen");
	search.sendKeys(Keys.ENTER);
	 WebElement pen=driver.findElement(By.xpath("//div[@class='a-section a-spacing-base'][1]"));
     pen.click();
       String parent =driver.getWindowHandle();
       Set<String> child =driver.getWindowHandles();
       Iterator<String>  parentid =child.iterator();
                 String par= parentid.next();
                   String child1= parentid.next();
                   driver.switchTo().window(child1);
        WebElement addcart=driver.findElement(By.id("add-to-cart-button"));
        addcart.click();
}
}
