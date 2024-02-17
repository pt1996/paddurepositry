package seleniumjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoAmazon {

	public static void main(String[] args) throws InterruptedException {
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5km84u9k2k_e&adgrpid=155259813113&hvpone=&hvptwo=&hvadid=674842289479&hvpos=&hvnetw=g&hvrand=13110623289060287820&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062009&hvtargid=kwd-304880464215&hydadcr=14450_2316420");
	     WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	     search.sendKeys("laptop");
	     Thread.sleep(4000);
	     List<WebElement> numbers=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	     int count=numbers.size();
	     System.out.println(count);
	     numbers.get(numbers.size()-4).click();
	     
	     
	     

	}

}
