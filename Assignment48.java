// Assignment : 48 
package newprograms;
class Program
{
	static void add()
	{
		System.out.println("Addition");
		
	}
	void sub()
	{
		System.out.println("substraction");
	}
}
abstract class Assen extends Program
{
	abstract void mul();
	abstract void div();
}

public class Assignment48 extends Ass{
	  void add1()
	{
		int a=30;
		int b=40;
		int c=a+b;
		System.out.println(c);
	}
     void print()
     {
    	 System.out.println("just print the message");
     }
	public static void main(String[] args) {
		Assignment48 a7=new Assignment48();
		a7.div();
		
		

	}
	void mu() 
	{
		System.out.println("Multiplication");
		
	}
	@Override
	void div() {
		// TODO Auto-generated method stub
		System.out.println("division");
		
	}

}
