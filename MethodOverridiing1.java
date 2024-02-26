package newprograms;

 class MethodOverriding2
{
	void logout()
	{
		System.out.println("Logout method implementation");
	}
	
}
 final public class MethodOverridiing1 extends MethodOverriding2 {
	void logout()
	{
		
		System.out.println("Logout method ");
		super.logout();
	}

	public static void main(String[] args) {
		MethodOverridiing1 m=new MethodOverridiing1();
		m.logout();

	}

}
