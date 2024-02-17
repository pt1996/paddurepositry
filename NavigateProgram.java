package seleniumjava;

import java.awt.Window;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateProgram {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		
		

	}

	

}
