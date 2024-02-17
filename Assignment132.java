package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment132 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement drag=driver.findElement(By.id("drag2"));
		WebElement drop=driver.findElement(By.id("div2"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		WebElement drag1=driver.findElement(By.id("drag2"));
		Thread.sleep(2000);
		WebElement drop2=driver.findElement(By.xpath("//div[@id='div1'][2]"));
		Actions a2=new Actions(driver);
		a1.dragAndDrop(drag1, drop2).perform();
		
		
		
		
	}

}
