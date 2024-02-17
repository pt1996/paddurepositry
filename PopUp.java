package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) throws InterruptedException {
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("file:///C:/Users/Padmini/Downloads/learningHTML1.html");
	    Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    WebElement username=driver.findElement(By.id("1"));
	    username.sendKeys("padmini");

	}

}
