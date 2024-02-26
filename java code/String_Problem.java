package stringclass;

import java.util.Arrays;

public class String_Problem 
{
	public static void main(String[] args) 
	{
		String a1="sitaram";
		String a2="ramsita";
		
		if(a1.length()!=a2.lengtmh())
		{
			System.out.println("Not an Anagram");
		}
		else
		{
			char[] c1=	a1.toCharArray();
				Arrays.sort(c1);
			System.out.println(Arrays.toString(c1));
			char[] c2=	a2.toCharArray();
			Arrays.sort(c2);
		System.out.println(Arrays.toString(c2));
		if(	Arrays.equals(c1, c2)==true)
				{
				System.out.println("Anagram decoded");
				}
		}
		

	}

}
