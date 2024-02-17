package seleniumjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment127 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("books");
		List<WebElement>  suggestion=driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef'][2]"));
		int result=suggestion.size();
		System.out.println(result);
		suggestion.get(3).click();
	}

}
