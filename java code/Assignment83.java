package stringclass;

import java.util.Arrays;

public class Assignment83 {

	public static void main(String[] args) {
		String l="level";
		String output="";
		for(int i=l.length()-1;i>=0;i--)
		{
			char reverse=l.charAt(i);
			output=output+reverse;
		}
		System.out.println(output);
		if(l.equals(output))
		{
		
			System.out.println("The given string is a palindrome ");
		}
		else
		{
		
			System.out.println("The given string is not a palindrome");
		}
		
		    		

	}

}

