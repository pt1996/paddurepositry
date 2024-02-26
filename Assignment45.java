//WAP for multilevel inheritance in a single program and make all the methods are non static//

package newprograms;
class Ass1
{
	void inbox()
	{
		System.out.println("check your inbox");
	}
	
}
class Ass extends Ass1
{
	void message() {
		System.out.println("print the message");
	}

	void multiplication() {
		// TODO Auto-generated method stub
		
	}

	void div() {
		// TODO Auto-generated method stub
		
	}
}

public class Assignment45 extends Ass {

	public static void main(String[] args) {
		Assignment45 a=new Assignment45();
		a.message();
		a.inbox();
		
		

	}

}
