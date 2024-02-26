// Assignment :64
package arrays;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		String r[]=new String[2];
		r[0]="madhu";
		r[1]="Abhi";
		System.out.println(r.length);  //Length of the array
		System.out.println(Arrays.toString(r));
		Arrays.sort(r);                        //Sort method
		System.out.println(Arrays.toString(r));// After sorting array 
		
		
		

	}

}
