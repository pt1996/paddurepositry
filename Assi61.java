package newprograms;

public class Assi61 {

	public static void main(String[] args) {
		try
		{
		int c=1/0;
		}
        catch(ArithmeticException a1)
		{
        	System.out.println("catch block");
		}
	}

}
