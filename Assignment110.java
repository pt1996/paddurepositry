package seleniumjava;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment110 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
        String c=driver.getTitle();
        System.out.println(c);
              char[] r   =c.toCharArray();
              System.out.println(Arrays.toString(r));
              System.out.println(driver.getCurrentUrl());
              System.out.println(driver.findElement(By.id("https://www.google.com/")));

        
	}

}
