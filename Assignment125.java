package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment125 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Padmini/Downloads/learningHTML1.html");
		
		/*   component is prese t or not 
		 * WebElement fname=driver.findElement(By.xpath("//input[@id='fname']"));
		        boolean checking   =fname.isDisplayed();
            if(checking==true)
            {
            	fname.sendKeys("padmini");
            }
            else
            {
            	System.out.println("Do Nothing");
            }*/
		WebElement disable=driver.findElement(By.id("121"));
		boolean checking_disable=disable.isDisplayed();
		if(checking_disable==true|| disable.isEnabled()==true)
		{
			disable.sendKeys("yes");
		}
		
	}

}
