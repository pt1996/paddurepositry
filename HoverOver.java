package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=17327582736037558678&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062078&hvtargid=kwd-10573980&hydadcr=14453_2367553");
        WebElement hover=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions a1=new Actions(driver);
        a1.moveToElement(hover).perform();
	}

}
