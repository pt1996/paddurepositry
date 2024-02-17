package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment121 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement fname=driver.findElement(By.id("fname"));
		fname.sendKeys("P T Padmini");
		WebElement lname=driver.findElement(By.id("lname"));
		lname.sendKeys("tirumala");
		WebElement Uname=driver.findElement(By.id("Username"));
		Uname.sendKeys("paddu@gmail.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("paddu@1234");
		WebElement radio=driver.findElement(By.id("Male"));
		radio.click();
		WebElement radio1=driver.findElement(By.id("FeMale"));
		radio1.click();
		WebElement textarea=driver.findElement(By.id("w3review"));
		textarea.sendKeys("Sarvabhoma Nagar, chikkalasandra , 4th main road");
		WebElement textarea1=driver.findElement(By.id("Address"));
		textarea1.sendKeys("Sarvabhoma Nagar, chikkalasandra , 4th main road");
		WebElement input=driver.findElement(By.id("Pincode"));
		input.sendKeys("515601");
		WebElement checkbox=driver.findElement(By.id("Agree"));
		checkbox.click();
		WebElement input1=driver.findElement(By.xpath("//input[@type='Submit']"));
		input1.click();
	
	
	
	
	
	

	}

}
