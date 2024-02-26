package newprograms;
interface class5
{
	void message1();
	void message2();
}
interface class6
{
	void message3();
	void message4();
}
public class Assignment52 implements class6,class5{

	public static void main(String[] args) {
		Assignment52 a2=new Assignment52();
		a2.message1();
		a2.message2();
		a2.message3();
		a2.message4();
		
		

	}

	@Override
	public void message1() {
		   System.out.println("Print message 1");
		
	}

	@Override
	public void message2() {
		// TODO Auto-generated method stub
		System.out.println("Print message 2");
		
	}

	@Override
	public void message3() {
		// TODO Auto-generated method stub
		System.out.println("Print message 3");
		
	}

	@Override
	public void message4() {
		// TODO Auto-generated method stub
		System.out.println("Print message 4");
		
	}

}
