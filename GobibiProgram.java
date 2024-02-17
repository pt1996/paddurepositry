package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GobibiProgram {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		WebElement close=driver.findElement(By.xpath("//span[@class='logSprite icClose']"));
		close.click();
		/*WebElement source=driver.findElement(By.xpath("//p[.='Enter city or airport'][1]"));
		source.click();
		WebElement sendvalue=driver.findElement(By.xpath("//input[@type='text']"));
		sendvalue.sendKeys("Bangalore");
		sendvalue.sendKeys(Keys.ENTER);*/
		WebElement destination=driver.findElement(By.xpath("//p[.='Enter city or airport'][2]]"));
		destination.click();
		WebElement sendvalue1=driver.findElement(By.xpath("//input[@type='text']"));
		sendvalue1.sendKeys("new delhi");
	}

}
