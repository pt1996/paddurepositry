package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment122 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		driver.findElement(By.id("fname")).sendKeys("Manish Kumar Tiwari");
		driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL +"A");
		driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL+"C");
		driver.findElement(By.id("Username")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("Username")).sendKeys(Keys.CONTROL+"V");
		driver.findElement(By.id("w3review")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("w3review")).sendKeys(Keys.CONTROL+"V");
		driver.findElement(By.id("Pincode")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("Pincode")).sendKeys(Keys.CONTROL+"V");
		
		
		

	}

}
