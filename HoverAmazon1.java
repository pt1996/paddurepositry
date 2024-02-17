package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverAmazon1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=18419874107611442858&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062078&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		WebElement prime=driver.findElement(By.xpath("//span[@class='nav-icon nav-arrow'][5]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(prime).perform();
		WebElement del=driver.findElement(By.id("multiasins-img-link"));
		del.click();

	}

}
