package seleniumjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintURL {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("the number of links is :"+links.size());
		for(int i=0;i<=links.size()-1;i++)
		{
			WebElement a=links.get(i);
			// To Print the URLs
			//String url=a.getAttribute("href");
			// To Print the text 
			String url=a.getText();
			System.out.println(url);
			
		}
		

	}

}
