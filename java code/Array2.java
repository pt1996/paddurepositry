// Assignment :65
package arrays;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		int a[]=new int[3];
		a[0]=15;
		a[1]=34;
		a[2]=24;
		int b[]=new int[3];
		for(int i=0;i<=2;i++) {
			b[i]=a[i];       //Coping one a array values into b array
			
		}
		System.out.println(Arrays.toString(b));
		

	}

}
