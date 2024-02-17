package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment117 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Padmini/Downloads/learningHTML1.html");
		driver.findElement(By.xpath("(/html/body/input[1])")).sendKeys("padmini");
		driver.findElement(By.xpath("(/html/body/input[2])")).sendKeys("hello");
		driver.findElement(By.xpath("(/html/body/input[3])")).sendKeys("Paddu@96");
		driver.findElement(By.xpath("(/html/body/form/input[1])")).sendKeys("puttaparthi");
		driver.findElement(By.xpath("(/html/body/form/input[2])")).sendKeys("Tirumala");
		driver.findElement(By.xpath("(/html/body/form/input[3])")).click();
		driver.findElement(By.xpath("(/html/body/form[2]/input[1]")).click();
		driver.findElement(By.xpath("(/html/body/form[2]/input[2]")).click();
		driver.findElement(By.xpath("(/html/body/form[2]/input[3]")).click();
		driver.findElement(By.xpath("(/html/body/form[2]/input[4]")).click();
		
		
		
		
	}

}
