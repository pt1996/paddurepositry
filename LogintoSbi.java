package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoSbi {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		WebElement login=driver.findElement(By.xpath("//a[.='CONTINUE TO LOGIN'][1]"));
		login.click();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("Padmini@96");
		WebElement password=driver.findElement(By.id("label2"));
		password.sendKeys("padmini@123");
		WebElement captch=driver.findElement(By.id("loginCaptchaValue"));
		captch.sendKeys("AXCVqJ");
		

	}

}
