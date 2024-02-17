package seleniumjava;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class ScrollDownYoutube {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver  driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		for(int i=0;;i++)
		{
			JavascriptExecutor jse=		driver;
			
			jse.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(3000);
			//jse.executeScript("window.scrollBy(0,-2000)");
		}
		}
		

}
