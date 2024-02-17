package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		/*
		 * driver.manage().window().maximize(); WebElement accounts
		 * =driver.findElement(By.id("nav-link-accountList-nav-line-1")); Actions a1=new
		 * Actions(driver); a1.moveToElement(accounts).perform(); WebElement
		 * signin=driver.findElement(By.xpath("//span[@class='nav-action-inner'][1]"));
		 * signin.click();
		 */
		 
              WebElement email=driver.findElement(By.id("ap_email"));
              email.sendKeys("kishoresiet@gmail.com");
               WebElement button= driver.findElement(By.id("continue"));
               button.click();
               WebElement pass= driver.findElement(By.id("ap_password"));
               pass.sendKeys("Kishore@123");
               WebElement signin1= driver.findElement(By.id("signInSubmit"));
               signin1.click();
               


	}

}
