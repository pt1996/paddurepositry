package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment124 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/x-path/#1");
		driver.findElement(By.xpath("//span[@class='folder']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='folder']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='folder'])[15]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='folder'])[24]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='folder'])[31]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='folder'])[37]")).click();
		Thread.sleep(2000);
	
        
		 
		
		

	}

}
