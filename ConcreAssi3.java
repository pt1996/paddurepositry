/* Assignment : 54 
 * Create child class having relation with Abstract class and that abstract class is having relation with 2 different interfaces*/

package newprograms;
interface Inter3
{
	void interface1();
}
interface Inter4 extends Inter3
{
	void interface2();
}
abstract class Abst2 implements Inter4
{
	abstract void method();
	
}
public class ConcreAssi3 extends Abst2{

	public static void main(String[] args) {
		ConcreAssi3 c3=new ConcreAssi3();
		c3.method();
		c3.interface2();
		c3.interface1();

	}

	@Override
	void method() {
		System.out.println("This is a abstract method");
		
	}

	@Override
	public void interface2() {
		System.out.println("This is interface1");
		
	}

	@Override
	public void interface1() {
		System.out.println("This is ainterface2");
		
	}

}
