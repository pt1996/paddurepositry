package seleniumjava;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DdtProgram {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f=new FileInputStream("C:\\seleniumjava\\ExcelSheets\\padmini.xlsx"); //step1 - to find the excel sheet
		Workbook w=WorkbookFactory.create(f);    //step-2 to open the excel sheet
		  //  String usn=w.getSheet("login").getRow(1).getCell(0).getStringCellValue();  //step-6 to fetch the value from a particular string
		    String pwd=w.getSheet("login").getRow(1).getCell(1).getStringCellValue();
String usn=NumberToTextConverter.toText(w.getSheet("login").getRow(1).getCell(0).getNumericCellValue());     
             
		             EdgeDriver driver=new EdgeDriver();
		             driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
                     driver.manage().window().maximize();
                     driver.findElement(By.id("ap_email")).sendKeys(usn);
             		driver.findElement(By.id("ap_password")).sendKeys(pwd);
             		driver.findElement(By.id("signInSubmit")).click();
             	}
	}


