package stringclass;

import java.util.Arrays;

public class Assignment79 {

	public static void main(String[] args) {
		String p="ya12mi3ni";
		System.out.println("characters:"+ p.replaceAll("[^a-zA-Z]", ""));
	    System.out.println("numeric values:" + p.replaceAll("[a-z]", ""));
	    
	}

}
