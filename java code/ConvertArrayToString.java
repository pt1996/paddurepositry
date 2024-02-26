package newprograms;

import java.util.Arrays;

public class ConvertArrayToString {

	public static void main(String[] args) {
	   String e[]=new String[2];
	   e[0]="yes";
	   e[1]="no";
	   System.out.println(Arrays.toString(e));
	   //converting Array to String
	   
	            String d  =e.toString();
	            System.out.println(Arrays.toString(e));
	}
}
