// Assignment : 50

package newprograms;
interface Class1
{
	void print();
	
}
abstract class Class2 implements Class1
{
	abstract void send();
	void compose()
	{
		System.out.println("compose mail");
	}
	
}
public class ConcreteClass extends Class2{

	public static void main(String[] args) {
		ConcreteClass c=new ConcreteClass();
		c.compose();
		c.send();
	}

	@Override
	void send() {
		System.out.println("send an email");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
