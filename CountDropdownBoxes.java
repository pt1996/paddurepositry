package seleniumjava;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountDropdownBoxes {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement rel=driver.findElement(By.name("Relegion"));
		Select s=new Select(rel);
		s.selectByIndex(3);
	   List<WebElement> count =s.getOptions();
	   int count1=count.size();
	   System.out.println(count1);
	   String print=rel.getText();
	   System.out.println(print);
	          
		
		

	}

}
