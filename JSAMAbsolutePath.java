package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAMAbsolutePath {     // Using Absolute xpath

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Padmini/Downloads/learningHTML1.html");
		WebElement user=driver.findElement(By.xpath("/html/body/input[1]"));
		user.sendKeys("padmini");
		WebElement hint=driver.findElement(By.xpath("/html/body/input[2]"));
		hint.sendKeys("Hello");
		WebElement pass=driver.findElement(By.xpath("/html/body/input[3]"));
		pass.sendKeys("Paddu@123");
		WebElement fname=driver.findElement(By.xpath("/html/body/form[1]/input[1]"));
		fname.sendKeys("Puttaparthi");
		WebElement checkbox=driver.findElement(By.xpath("/html/body/form[2]/input[1]"));
		checkbox.click();
		WebElement checkbox1=driver.findElement(By.xpath("/html/body/form[2]/input[2]"));
		checkbox1.click();
		WebElement checkbox2=driver.findElement(By.xpath("/html/body/form[2]/input[3]"));
		checkbox2.click();
		WebElement radio=driver.findElement(By.xpath("/html/body/input[4]"));
		radio.click();
		WebElement radio1=driver.findElement(By.xpath("/html/body/input[5]"));
		radio1.click();
		WebElement radio2=driver.findElement(By.xpath("/html/body/input[6]"));
		radio2.click();
		WebElement rel=driver.findElement(By.xpath("/html/body/select/option[3]"));
		rel.click();
		Thread.sleep(5000);
		WebElement link=driver.findElement(By.xpath("/html/body/a"));
		link.click();
		
		
		

	}

}
