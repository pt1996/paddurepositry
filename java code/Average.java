//Assignment : 66
package arrays;

import java.util.Arrays;

public class Average {

	public static void main(String[] args) {
		int c[]=new int[4];
		c[0]=23;
		c[1]=34;
		c[2]=45;
		c[3]=56;
		 double sum=0;
		for(int i=0;i<=3;i++)
		{
			sum=sum+c[i];     //finding average
		}
		
		double Average=sum/c.length;   //Average formula 
		System.out.println(Average);
		
		

	}

}
