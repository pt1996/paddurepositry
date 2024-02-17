package seleniumjava;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment111 {

	public static void main(String[] args) {
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.Flipkart.com");
	 System.out.println(driver.getTitle());
	 String f=driver.getTitle();
     char[] g=f.toCharArray();
     System.out.println(Arrays.toString(g));

	}

}
