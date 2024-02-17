package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PdfUpload {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement upload=driver.findElement(By.id("Resume"));
		upload.sendKeys("C:\\Users\\Padmini\\Downloads\\MAnish Kumar Tiwari.pdf");
		

	}

}
