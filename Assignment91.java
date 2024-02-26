package newprograms;
class Ass92
{
	void message1()
	{
		System.out.println("Good Morning");
	}
	
}
class Assi92 extends Ass92
{
	void message2()
	{
		System.out.println("Good Afternoon");
	}
}

public class Assignment91 extends Assi92 {
           void message3()
           {
        	   
           }
	public static void main(String[] args) {
		       Assi92 r=new Assignment91();
		       r.message1();
		       r.message2();
		

	}

}
