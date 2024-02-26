package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of an array");
	    int size=sc.nextInt();
	    int n[]=new int[size];
	    System.out.println("Enter the elements of an array");
	    int i=0;
	    int j=0;
	    int k=0;
	    for(i=0;i<=n.length-1;i++)
	    { 
	    	n[i]=sc.nextInt();
	    }
	    System.out.println(Arrays.toString(n));
	    for( j=0;j<=2;j++)
	    {
	    	for( k=0;k<=2;k++)
	    	{
	    		n[j]=n[k];
	    		
	    		
	    	}
	    	
	    	System.out.println(n[j]);
	    	 
	    }
	   
	    }
	    
	    
	    

	}


