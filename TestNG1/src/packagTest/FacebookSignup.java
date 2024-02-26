package packagTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookSignup {
	
      @Test(dataProvider="testdata")
      public void singup(String fname, String surname, String email, String password)
      {
    	  EdgeDriver driver=new EdgeDriver();
    	  driver.get("https://www.facebook.com/signup");
    	  WebElement first_name=driver.findElement(By.name("firstname"));
    	  first_name.sendKeys(fname);
    	  WebElement sname=driver.findElement(By.name("lastname"));
    	  sname.sendKeys(surname);
    	  WebElement mail=driver.findElement(By.name("reg_email__"));
    	  mail.sendKeys(email);
    	  WebElement pwd=driver.findElement(By.name("reg_passwd__"));
    	  pwd.sendKeys(password);
    	  driver.quit();
    	  
    	 }
      @DataProvider(name="testdata")
      public Object[][]
    		  data_for_facebook()
    		  {
    	        Object d1[][]=new Object[11][4];
    	        //test case1
				d1[0][0]="padmini";
				d1[0][1]="PT";
				d1[0][2]="paddu96@gmail.com";
				d1[0][3]="Paddu@123";
				// test case2
				d1[1][0]="padmini";
				d1[1][1]=" ";
				d1[1][2]="paddu96@gmail.com";
				d1[1][3]="Paddu@123";
				//test case3
				d1[2][0]="padmini";
				d1[2][1]="965789#5";
				d1[2][2]="paddu96@gmail.com";
				d1[2][3]="Paddu@123";
				//test case4
				d1[3][0]="padmini";
				d1[3][1]="PT";
				d1[3][2]="paddu96@gmail.com90";
				d1[3][3]="Paddu@123";
				//test case5
				d1[4][0]="padmini";
				d1[4][1]="PT";
				d1[4][2]="paddu96@gmail.com";
				d1[4][3]=" ";
				//test case6
				d1[5][0]=" ";
				d1[5][1]="PT";
				d1[5][2]="paddu96@gmail.com";
				d1[5][3]="Paddu@123";
				//test case7
				d1[6][0]="padmini";
				d1[6][1]="PT";
				d1[6][2]=" ";
				d1[6][3]="Paddu@123";
				//test case8
				d1[7][0]="padmini";
				d1[7][1]="1234";
				d1[7][2]="paddu96@gmail.com";
				d1[7][3]="Paddu@123";
				//test case9
				d1[8][0]="padmini";
				d1[8][1]="PT";
				d1[8][2]="paddu96@gmail.com";
				d1[8][3]="4567     ";
				//test case10
				d1[9][0]="879065";
				d1[9][1]="PT";
				d1[9][2]="paddu96@gmail.com";
				d1[9][3]="Paddu@123";
				//test case11 
				d1[10][0]="padmini1234";
				d1[10][1]="PT";
				d1[10][2]="paddu96@gmail.com";
				d1[10][3]="Paddu@123";
				
				return d1;
				
    	        
    		  }
}
