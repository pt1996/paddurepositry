package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAmazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5km84u9k2k_e&adgrpid=155259813113&hvpone=&hvptwo=&hvadid=676742245333&hvpos=&hvnetw=g&hvrand=2717365658347952964&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062078&hvtargid=kwd-304880464215&hydadcr=14450_2367558");
		WebElement category=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(category);
		//s1.selectByValue("search-alias=mobile-apps");
		//s1.selectByVisibleText("Books");
          s1.selectByIndex(4);
	}

}
