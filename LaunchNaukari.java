package seleniumjava;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchNaukari {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=CjwKCAiA_OetBhAtEiwAPTeQZ6i0r_Mpa0Wq8UUrl2TxErekkUuqfUA7qXi0vUFKja40LFNVa0MSCRoCwrkQAvD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		WebElement google=driver.findElement(By.xpath("//span[.='Google']"));
		google.click();
		    String parent =driver.getWindowHandle();
		    Set<String> Parentandchild =driver.getWindowHandles();
		    System.out.println(parent);
		    System.out.println(Parentandchild);
		    Iterator<String> pcid=Parentandchild.iterator();
		    String parentid1=pcid.next(); // gives the parent id
		    String childid1=pcid.next(); // gives the child id
		    driver.switchTo().window(childid1);
		    Thread.sleep(3000);
		    driver.close();
		    
		     
	}

}
