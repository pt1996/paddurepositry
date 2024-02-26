package newprograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) 
	{
	try
	{
		Scanner s1=new Scanner(System.in);
		boolean myanswerfordinner=	s1.nextBoolean();
	}
	catch(ArithmeticException a1)
	{
		System.out.println("int cannot store infinity, so please do not worry I have handled it");
	}
	catch(NullPointerException a2)
	{
		System.out.println("do not worry I have handled it");
	}
	catch(InputMismatchException a3)
	{
		System.out.println("Please do not worry I have handled it");
	}
	finally
	{
		System.out.println("NO matter what I am always there");
	}

		
		
		
		
	}

}
