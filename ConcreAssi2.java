/* Assignment :55   Create child class having relation with abstract class
at abstract class having relation with interface(1st) &
that interface(1st) having relation with another interface(2nd)  */

package newprograms;
interface  Inter1  // creating 1st infterface class
{
	void ATMFun();
	
}
interface Inter2 extends Inter1  // interface class2
{
	void PinGeneration();
}
abstract class Abs1 implements Inter2  // abstract class
{
	abstract void OtpGen();
}
public class ConcreAssi2 extends Abs1{

	public static void main(String[] args) {
		
		ConcreAssi2  c2=new ConcreAssi2();
		c2.PinGeneration();
		
	}

	@Override
	public void PinGeneration() {
		System.out.println("insert ATM card");
		System.out.println("enter mobile number" );   // ATM PIN Generation steps 
		System.out.println("enter account number");
		System.out.println("set pin");
		System.out.println("Remove card");
	}

	@Override
	public void ATMFun() {
		System.out.println("insert ATM Card");    // ATM Functionality
		System.out.println("type pin number" );
		System.out.println("draw cash");
		System.out.println("Remove card");
		
	}

	@Override
	void OtpGen() {
		
		
	}

}
