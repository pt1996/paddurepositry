package newprograms;

public class SIbcreation {
		SIbcreation()
		{
			System.out.println("Constructor");
		}
		static 
		{
			System.out.println("1st SIB");
		}
		static 
		{
			System.out.println("2nd SIB");
		}
		{
			System.out.println("1st IIB");
		}
		{
			System.out.println("2nd IIB");
		}

		public static void main(String[] args) {
			
			
           SIbcreation s=  new SIbcreation();
            System.out.println("main method ");
	}

}
