package seleniumjava;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment113 {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/search?q=amazon+sing+in&sca_esv=599065716&sxsrf=ACQVn0_QxH_0XWE3D8ipXzCyOwqlVQpI9w%3A1705480309010&ei=dZCnZaEi9Yfj4Q-96qj4Dw&ved=0ahUKEwjhsPWfgeSDAxX1wzgGHT01Cv8Q4dUDCBA&uact=5&oq=amazon+sing+in&gs_lp=Egxnd3Mtd2l6LXNlcnAiDmFtYXpvbiBzaW5nIGluMgcQIxixAhgnMgcQABiABBgKMgcQABiABBgKMgcQABiABBgKMgcQABiABBgKMgcQABiABBgKMgcQABiABBgKMgcQABiABBgKMgcQABiABBgKMgcQABiABBgKSNoZULUEWO4XcAF4AZABAJgBkwGgAaIHqgEDMC44uAEDyAEA-AEBwgIHECMYsAMYJ8ICChAAGEcY1gQYsAPCAhkQLhiABBiKBRhDGMcBGNEDGMgDGLAD2AEBwgITEC4YgAQYigUYQxjIAxiwA9gBAcICChAjGIAEGIoFGCfCAhEQABiABBiKBRiRAhixAxiDAcICDRAAGIAEGBQYhwIYyQPCAggQABiABBixA8ICCxAAGIAEGIoFGJIDwgILEAAYgAQYsQMYgwHCAgUQABiABMICDRAAGIAEGBQYhwIYsQPCAgoQABiABBgUGIcCwgINEAAYgAQYChixAxiDAeIDBBgAIEGIBgGQBgu6BgQIARgI&sclient=gws-wiz-serp");
		driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.id("ap_email")).sendKeys("kishoresiet@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("Kishore@123");
		driver.findElement(By.id("signInSubmit")).click();
        WebElement signin =driver.findElement(By.id("signInSubmit"));
        signin.click();
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
      WebElement whislist  =driver.findElement(By.linkText("Add to Wish List" ));
      whislist.click();
	}

}
