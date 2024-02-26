package arrays;
import java.util.Arrays;
public class Examp3 {

	public static void main(String[] args) {
		int num[]=new int[3];
		num[0]=20;
		num[1]=30;
		num[2]=56;
		int number[]=new int[3];
		for(int i=0;i<3;i++)
		{
			number[i]=num[i];
		}
		System.out.println(Arrays.toString(number));

	}

}
