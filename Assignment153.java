package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment153 {

		static int j;

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of an array");
			int length=sc.nextInt();
			int n[]=new int[length];
			System.out.println("Enter elements of an array");
			for(int i=0;i<=length-1;i++)
			{
				n[i]=sc.nextInt();
			}
	        System.out.println(Arrays.toString(n));
			int pos=-1;
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter the element to find ");
			int b=sc.nextInt();
			   for(j=0;j<=n.length-1;j++)
			   {
				   if(n[j]==b)
				   {
					   System.out.println("The given number  b is present :"+n);
					   break;
				   }
				   else
				   {
					   pos=pos+1;
				   }
			   }

	}

}
