package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightGrotech {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/flights/");
		driver.manage().window().maximize();
		WebElement radio=driver.findElement(By.xpath("//input[@type='radio'][1]"));
		radio.click();
		WebElement f1=driver.findElement(By.xpath("//select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control select2-hidden-accessible'][1]"));
		Select s=new Select(f1);
		s.selectByIndex(4);
		
		

	}

}
