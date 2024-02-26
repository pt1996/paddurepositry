package stringclass;

import java.util.Arrays;

public class Asisgnment81 {
	public static void main(String[] args)
	{
		String name3="padmini123";
		            char c[]=name3.toCharArray(); // Converting string into array
		   int i;
		   int count=0;
		   int digit=0;
		   for( i=0;i<=name3.length()-1;i++)
		   {
			       boolean ans   =Character.isAlphabetic(c[i]);   //using array function to find alpabetic
			       
			       if(ans==true)
			       {
			    	   count++;
			       }
			       else if(ans==false)
			       {
			    	   digit++;
			       }
		   }
		   System.out.println("Total number of characters in a string:"+count);
		   System.out.println("Total number of digits in a string:"+digit);
		   
	}
	            
	        }


	
	


