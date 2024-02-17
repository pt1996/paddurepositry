package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeFlipkartHover {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(2000);
		WebElement  home=driver.findElement(By.xpath("//span[.='Home & Furniture'][1]"));
		//Thread.sleep(3000);
		Actions a2=new Actions(driver);
		a2.moveToElement(home).perform();
		WebElement bed=driver.findElement(By.linkText("Bedsheets"));
		bed.click();
		

	}

}
