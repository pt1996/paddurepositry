// Assignemnt : 95

package newprograms;
class Update
{
	private String varusername="abc@grotechmind.com";
	public String getUsername()           // getter method
	{
		return varusername;
	}
	public void setUsername(String varusername)    //setter method
	{
		this.varusername=varusername;     // this keyword
	}
	
}
public class Assignment95 {

	public static void main(String[] args) {
		Update u=new Update();
		u.setUsername("paddu@gmail.com");   // updating  the username
		System.out.println(u.getUsername());
	

	}

}
