package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazon1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		for(int i=0;i<=10;i++)
		{
			driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Software");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		
		
		

	}

}
