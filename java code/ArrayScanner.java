package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner {

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
	}

}
