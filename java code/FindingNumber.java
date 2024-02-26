package stringclass;

import java.util.Arrays;

public class FindingNumber {

	public static void main(String[] args) {
		int g[]=new int[4];
		g[0]=35;
		g[1]=56;
		g[2]=45;
		g[3]=89;
		int num2=56;
		int temp=0;
		for(int i=0;i<=3;i++)
		{
			if(num2==g[i])
			{
				System.out.println("Number is found");
				
			}
			
		}
		if(temp==0)
		{
			System.out.println("Number not found");
		}
		
		
		
		

	}

}
