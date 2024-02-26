package stringclass;

import java.util.Arrays;

public class Assignment84 {

	public static void main(String[] args) {
		// Two strings anagram or not 
		String ch1="race";
		String ch2="care";
		      char[] f  =ch1.toCharArray();   // converting into char array
		      char[] e=ch2.toCharArray();
		      Arrays.sort(f);       // sorting the array
		      Arrays.sort(e);
		      if(Arrays.equals(f, e))  // checking the condition by using equal 
	    	  {
	    		  System.out.println("The given  two strings are anangram");
	    	  }
	    	  else
	    	  {
	    		  System.out.println("The given two strings are not in anagram");
	    	  }
		      

	}

}
