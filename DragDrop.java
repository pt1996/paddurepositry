package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		// Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.id("drag7"));// 1.find element 2.locate 3.perform action-send
																// text
		WebElement drop = driver.findElement(By.id("div2"));

		Actions a1 = new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();

	}

}

	


