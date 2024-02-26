// Assignment 53 
package newprograms;

import java.util.Scanner;

interface Class4
{
	void add();
	
}
interface Class5
{
	void sub();
	
}
interface Class3
{
	void mul();
}
interface Class6
{
	void div();
	
}
public class ConcreteAssi1 implements Class6, Class3 , Class5,Class4{

	public static void main(String[] args) {
		ConcreteAssi1 c1=new ConcreteAssi1();
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();

	}

	@Override
	public void add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		System.out.println("enter b value");
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c=a+b;
		System.out.println("Addition of a &b ");
		System.out.println(c);
	}

	@Override
	public void sub() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		System.out.println("enter b value");
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c=a-b;
		System.out.println("substarction of a &b ");
		System.out.println(c);
		
	}

	@Override
	public void mul() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		System.out.println("enter b value");
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c=a*b;
		System.out.println("multiplication of a &b ");
		System.out.println(c);
		
	}

	@Override
	public void div() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		System.out.println("enter b value");
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c=a/b;
		System.out.println("division of a &b ");
		System.out.println(c);
		
	}

}
