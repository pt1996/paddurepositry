package seleniumjava;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {

	public static void main(String[] args) {
		EdgeDriver e=new EdgeDriver();
		e.get("https://www.google.com");

	}

}
