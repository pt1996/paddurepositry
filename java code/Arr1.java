package arrays;

import java.util.Arrays;

public class Arr1 {

	public static void main(String[] args) {
		String name[]=new String[4];
		name[0]="lakshmi";
		name[1]="aruna";
		name[2]="devi";
		name[3]="paddu";
		String s="paddu";
		for( int i=4;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
		System.out.println(Arrays.toString(name));
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
        System.out.println(name.length);
        System.out.println(name[0].toLowerCase());
        System.out.println(name[2].toUpperCase());
        System.out.println(name[2].concat(name[1]));
	}

}
