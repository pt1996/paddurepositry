package newprograms;
interface Amazon
{
	void login();
	void logout();
}
public class Assignment49 implements Amazon{

	public static void main(String[] args) {
		Assignment49 a=new Assignment49();
		a.login();
		a.logout();

	}

	@Override
	public void login() {
		System.out.println("Login Page of Amazon");	
	}

	@Override
	public void logout() {
		System.out.println("Logout page of Amazon");
		
	}

}
