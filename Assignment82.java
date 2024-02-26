//Assignment 82 : Reversing the String 

package newprograms;

public class Assignment82 {

	public static void main(String[] args) {
	     String v="puttaparthi";
	     System.out.println(v.length());
	     System.out.println("Original string is:"+ v);
	     System.out.println("After reversing the string is");
	     for (int i=0;i<=4;i++)
	     {
	    	
	    	
	    	 System.out.println(v.charAt(i));
	     }
	     System.out.println(" ");
         for(int i=v.length()-1;i>=5;i--)
         {
        	 System.out.println(v.charAt(i));
         }
	}

}
