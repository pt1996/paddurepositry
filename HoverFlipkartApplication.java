package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverFlipkartApplication {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(2000);
		WebElement  ele=driver.findElement(By.xpath("//span[.='Electronics'][1]"));
		//Thread.sleep(3000);
		Actions a2=new Actions(driver);
		a2.moveToElement(ele).perform();
		WebElement blu=driver.findElement(By.linkText("Bluetooth Headphones"));
		blu.click();
		
		

	}

}
