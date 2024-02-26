// Assignment : 51  Create 1 child class having main method ,1 abstarct class having 1 abstract method and 1 concrete method and interface having abstarct method and create relation between child class->Abstract class->Interface

package newprograms;

import java.util.Scanner;

class ConcreteClass1
{
	static void add()
	{
		int a=80;
		int b=40;
		int c=a+b;
		System.out.println("Addition");
		System.out.println(c);
	}
	void sub()
	{
		int d=70;
		int e=50;
		int h=d-e;
		System.out.println("Substraction");
		System.out.println(h);
	}
}

abstract class  AbstractClass2 extends ConcreteClass1
{
	abstract void multiply();
	abstract void div();
}
	


public class ConcreteClass2 extends AbstractClass2 {
	static void condition()
	{
		System.out.println("condition statement");
	}
	void print()
	{
		System.out.println("Just print the message");
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a value");
	int a=sc.nextInt();
	System.out.println("enter b value");
	int b=sc.nextInt();
	 if (a>b)
	 {
		 System.out.println("print a value");
		 System.out.println(a);
	 }
	 else
	 {
		 System.out.println("print b value");
		 System.out.println(b);
	 }
	 condition();
	 ConcreteClass2 c=new ConcreteClass2();
	 c.print();
	 c.multiply();
	 c.div();
	 ConcreteClass1 c1=new ConcreteClass1();
	 c1.add(); 
	 c1.sub();
	}
	@Override
	  void multiply() {
		System.out.println("multiplication");
		
	}
	@Override
	void div() {
		System.out.println("division");
		
		
	}
	

}
