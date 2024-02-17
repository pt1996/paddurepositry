package seleniumjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFlipkartAuto {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement flipkart=driver.findElement(By.name("q"));
		flipkart.sendKeys("mobiles");
		 List<WebElement> numbers=driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']/li/div"));
		 int count=numbers.size();
	     System.out.println(count);
	     numbers.get(numbers.size()-4).click();
	     

	}

}
