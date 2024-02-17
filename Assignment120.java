package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment120 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		driver.findElement(By.id("fname")).sendKeys("Puttaparthi Tirumala Padmini");
		for(int i=0;i<=7;i++)
		{
			driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		}
		

	}

}
