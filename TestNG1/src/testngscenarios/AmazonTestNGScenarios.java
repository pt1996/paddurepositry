package testngscenarios;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AmazonTestNGScenarios<Workbook> {
	public WebDriver driver;
	@BeforeMethod
	public void launch()
	{
		driver=new EdgeDriver();
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
		
			driver.navigate().refresh();
		
		
		
	}
	@AfterMethod
	public void quit()
	{
		WebElement accounts1=driver.findElement(By.xpath("//span[@class='nav-line-2 '][1]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(accounts1).perform();
		WebElement signout=driver.findElement(By.linkText("Sign Out"));
		signout.click();
		
		
		driver.close();
	}

}
