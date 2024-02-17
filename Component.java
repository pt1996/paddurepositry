package seleniumjava;

import org.openqa.selenium.chrome.ChromeDriver;

public class Component {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

	}

}
