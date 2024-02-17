package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class GoogleIndia {

	public static void main(String[] args) {
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_2kclp8mbdm_e&adgrpid=155259813113&hvpone=&hvptwo=&hvadid=678802104197&hvpos=&hvnetw=g&hvrand=14898988548971086589&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062078&hvtargid=kwd-26688406979&hydadcr=14450_2371567");
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	  

	}

}
