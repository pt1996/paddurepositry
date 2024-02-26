package stringclass;

public class StringReverse {

	public static void main(String[] args) {
		String g="komal";
		String output="";
		for(int i=g.length()-1;i>=0;i--)
		{
			char reverse=g.charAt(i);
			output=output+reverse;
			
			
		}
		System.out.println(output);

	}

}
