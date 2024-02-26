package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionArray {

	public static void main(String[] args) {
	   int i[]= {20,30,40};
	   System.out.println(i.length);
	   System.out.println(i[0]);
	   int sum=0;
	   for(int j=0;j<=2;j++)
	   {
		   sum=sum+i[j];
	   }
	   System.out.println("The addition of an array");
	   System.out.println(sum);  
	   System.out.println( Arrays.toString(i));
		
		
		
		
		
		
	   
	}

}
