package seleniumjava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmaScenario2 {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement accounts=driver.findElement(By.xpath("//span[@class='nav-line-2 '][1]"));
		Actions a=new Actions(driver);
		a.moveToElement(accounts).perform();
		WebElement signin=driver.findElement(By.linkText("Sign in"));
		signin.click();
		WebElement mobile=driver.findElement(By.id("ap_email"));
		mobile.sendKeys("9441057839");
		WebElement con=driver.findElement(By.id("continue"));
		con.click();
		WebElement password=driver.findElement(By.id("ap_password"));
		password.sendKeys("Yamini@98");
		WebElement button=driver.findElement(By.id("signInSubmit"));
		button.click();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		WebElement first_option=driver.findElement(By.xpath("//div[@class='left-pane-results-container']/div[1]"));
		search.sendKeys(Keys.ENTER);
		

	}

}
