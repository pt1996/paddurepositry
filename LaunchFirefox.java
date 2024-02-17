package seleniumjava;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		FirefoxDriver f=new FirefoxDriver();
		f.get("https://www.google.com");
		

	}

}
