package seleniumjava;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment129 {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://grotechminds.com/javascript-popup/");
		 driver.switchTo().alert().accept();
		 System.out.println(driver.getTitle());

	}

}
