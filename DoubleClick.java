package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 WebElement c1=driver.findElement(By.xpath(" //a[.='Mobiles']"));
		 Actions a=new Actions(driver);
		 a.doubleClick(c1).perform();
		 

	}

}
