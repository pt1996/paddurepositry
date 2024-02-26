package stringclass;

import java.util.Arrays;

public class PalindromeProgram {

	public static void main(String[] args) {
		String s="paddu";
		        char [] c=s.toCharArray();
		        System.out.println(Arrays.toString(c));
		        System.out.println(s.length());
		        for(int i=s.length()-1;i>=0;i--)
		        {
		        	System.out.println(c[i]);
		        }
		        if(c.equals(s))
		        {
		        	System.out.println("The given string :"+s +"is a palindrome");
		        }
		        else
		        {
		        	System.out.println("The given string :"+s +"is not a palindrome");
		        }
				
		        

	}

}
