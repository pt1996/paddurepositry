package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment63 {
	
	public static void main(String[] args) {
		int rollno[]=new int[5];
		for(int i=0;i<=4;i++)
				{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value of an array");
			rollno[i]=sc.nextInt();
			

			}
		     System.out.println(rollno[0]);
		     System.out.println(rollno[1]);
		     System.out.println(rollno[2]);
		     System.out.println(rollno[3]);
		     System.out.println(rollno[4]);
		     System.out.println("Array Values are ");
		     System.out.println(Arrays.toString(rollno));
		     
		     
		
		
		
		
		

	}

}
