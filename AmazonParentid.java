package seleniumjava;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonParentid {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=17594367623060956854&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062009&hvtargid=kwd-10573980&hydadcr=14453_2371562&gad_source=1");
        driver.manage().window().maximize();
       WebElement amazon= driver.findElement(By.id("twotabsearchtextbox"));
       amazon.sendKeys("shoes");
       amazon.sendKeys(Keys.ENTER);
       WebElement shoe=driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect'][1]"));
       shoe.click();
       String parent  =driver.getWindowHandle();
       Set<String> child =driver.getWindowHandles();
       System.out.println(parent);
       System.out.println(child);
       Iterator<String>  pcid=child.iterator();
       String parentid=pcid.next();
       String childid=pcid.next();
       driver.switchTo().window(childid);
       WebElement addcart=driver.findElement(By.id("add-to-cart-button"));
       addcart.click();
      
       
       
        
	}

}
