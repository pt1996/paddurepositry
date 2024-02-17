package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment112 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("padmavathiyamini003@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Paddu@123");
		driver.findElement(By.name("login")).click();
		

	}

}
