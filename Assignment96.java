package newprograms;
class Encapsulation
{
	private int i=50;
	private char c='g';
	private boolean b=true;
	private String s="connect through whatsapp";
	private float f=34;
	private double d=45.78;
	// int type
	public int getI()
	{
		return i;
		
	}
	public void setI(int i)
	{
		this.i=i;
	}
	
	// char type
	
	public char getC()
	{
		return c;
	}
	public void setC(char c)
	{
		this.c=c;
	}
	
	// boolean type
	public boolean getB()
	{
		return b;
	}
	public void setB(boolean b)
	{
		this.b=b;
	}
	
	//  String type
	
	public String getS()
	{
		return s;
	}
	public void setS(String s)
	{
		this.s=s;
	}
	//  float type
	public float getF() {
		return f;
	}
	public void setF(float f) {
		this.f = f;
	}
	
	// double type
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	
	
	
	
}
public class Assignment96 {

	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.setI(80);
		e.setC('h');
		e.setB(false);
		e.setS("connect throught Linkedin");
		e.setF(34);
		e.setD(56.4);
		System.out.println(e.getI());
		System.out.println(e.getC());
		System.out.println(e.getB());
		System.out.println(e.getS());
		System.out.println(e.getF());
		System.out.println(e.getD());
		

	}

}
