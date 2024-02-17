package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverProgramFlipkart {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement login=driver.findElement(By.xpath("//a[.='Login']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(login).perform();

	}

}
