package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment119 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("padmavathiyamini003@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Paddu@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
