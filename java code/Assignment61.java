package newprograms;

import java.util.Scanner;

public class Assignment61 {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter a value");
	    int a =sc.nextInt();
	    System.out.println("enter b value");
	    int b =sc.nextInt();
	    try
	    {
	    	int data =a/b;
	    	System.out.println("try block");
	    }
	    catch(ArithmeticException e) {
	    	System.out.println("catch block");
	    }
	    catch(NullPointerException f)
	    {
	    	System.out.println("string catch block will execute");
	    }

	
	finally
	{
		System.out.println("finally block");
	}

}
}
