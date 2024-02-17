package seleniumjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationSuggestion {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement type=driver.findElement(By.name("q"));
		type.sendKeys("India");
		Thread.sleep(1000);
		List<WebElement> count=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int result=count.size();
		System.out.println(result);
		count.get(3).click();
		
		

	}

}
