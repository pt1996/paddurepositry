package seleniumjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment126 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=5034687870056644266&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062078&hvtargid=kwd-10573980&hydadcr=14453_2367553");
        List<WebElement> links=driver.findElements(By.className("nav-a"));
        System.out.println("The number of links present in amazon is :"+links.size());
        
        }
	}


