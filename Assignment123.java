package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment123 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement dropdown=driver.findElement(By.id("Skills"));
		Select s1=new Select(dropdown);
		s1.selectByIndex(1);
		WebElement dropdown1=driver.findElement(By.id("nontechnicalskills"));
		Select s2=new Select(dropdown);
		s2.selectByIndex(2);
		WebElement country=driver.findElement(By.id("Country"));
		Select s3=new Select(country);
		s3.selectByIndex(3);
		WebElement religion=driver.findElement(By.id("Relegion"));
		Select s4=new Select(religion);
		s4.selectByIndex(5);
		WebElement checkbox=driver.findElement(By.id("Agree"));
		checkbox.click();
		
		
		
		

	}

}
