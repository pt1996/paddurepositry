package newprograms;
class Amazon2
{
	private String username="contact@grotechminds.com";
	public String getUsername() //this is the getter method
	{
		return username; //fetching the value
	}
	public void setUsername(String username)// setter method
	{
		this.username=username;
		
	}
}

public class Enc {

	public static void main(String[] args) {
		
		Amazon2 a2=new Amazon2();
		a2.setUsername("padmini@gmail.com");
		System.out.println(a2.getUsername());

	}

}
