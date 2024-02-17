package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment116 {


	public static void main(String[] args) throws InterruptedException {
        EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		  driver.get("https://www.amazon.in/?tag=googmantxtmob170-21&ascsubtag=_k_Cj0KCQiAtaOtBhCwARIsAN_x-3LKmaZUMB3uUJO9VwgKMGc1RjXxWW1nhwReeiX8dJSmWNMS2HrBrsoaAsWMEALw_wcB_k_");
		  driver.findElement(By.partialLinkText("Arab")).click(); 
		  Thread.sleep(2000);
		 driver.get("https://www.amazon.in/?tag=googmantxtmob170-21&ascsubtag=_k_Cj0KCQiAtaOtBhCwARIsAN_x-3LKmaZUMB3uUJO9VwgKMGc1RjXxWW1nhwReeiX8dJSmWNMS2HrBrsoaAsWMEALw_wcB_k_");
		  driver.findElement(By.partialLinkText("Kingdom")).click(); 
		  Thread.sleep(2000);
		  driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5km84u9k2k_e&adgrpid=155259813113&hvpone=&hvptwo=&hvadid=676742245333&hvpos=&hvnetw=g&hvrand=15609376281092907066&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062009&hvtargid=kwd-304880464215&hydadcr=14450_2367558_");
		  driver.findElement(By.partialLinkText("States")).click();
		 }
		 

	  
	  
}

	

