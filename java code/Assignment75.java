package arrays;

public class Assignment75 {

	public static void main(String[] args) {
		int s[]= {10,20,41,34,26};
		int num=41;
		 int temp=0;
		 int search=41;
		 for(int i=0;i<=s.length-1;i++)
		 {
			 if(search==s[i])
			 {
				 System.out.println("Number is present at index:"+i);
			 }
		 }
		 if(temp==0)
		 {
			 System.out.println("Number not found");
		 }

	}

}
