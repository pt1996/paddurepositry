package arrays;

public class Example5 {

	public static void main(String[] args) {
		int numbers[]=new int[4];
		numbers[0]=70;
		numbers[1]=30;
		numbers[2]=20;
		numbers[3]=50;
		double sum=0;
		for ( int i=0;i<4;i++)
		{
			
			sum=sum+numbers[i];
			System.out.println(sum);
		}
		System.out.println("average is");
        System.out.println(sum/4);
	}

}
