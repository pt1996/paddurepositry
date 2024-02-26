/*    Assignment : 56  Create child class having relation with interface(1st)
1st interfac having relation with 2nd interfac
2nd interfac having relation with 3rd interfac */

package newprograms;
interface Interf1
{
	void SayJava();
}
interface Interf2 extends Interf1   // 2nd interface having relation with 3rd interface
{
	void SaySelenium();
	
}
interface Interf3 extends  Interf2   //1st interface having relation with 2nd interface
{
	void SayManual();
}
public class ConcreAssi4 implements Interf3 {      // child class having relation with interface

	public static void main(String[] args) {
		ConcreAssi4 c4=new ConcreAssi4();
		c4.SayManual();
		c4.SayJava();
		c4.SayManual();
		c4.SaySelenium();
    
	}

	@Override
	public void SayManual() {
		System.out.println("Manual world");
		
	}

	@Override
	public void SaySelenium() {
		System.out.println("Selenium world");
		
	}

	@Override
	public void SayJava() {
		System.out.println("java world");
		
	}

}
