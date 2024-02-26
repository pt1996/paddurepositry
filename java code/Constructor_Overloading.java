package newprograms;

public class Constructor_Overloading {
	             Constructor_Overloading()
	             {
	            	 System.out.println("Constructor 1");
	             }
	             Constructor_Overloading(int a)
	             {
	            	 System.out.println(a);
	             }
	             Constructor_Overloading(int a ,int b)
	             {
	            	 int d=a+b;
	            	 System.out.println(d);
	            	 
	             }        
	        
	public static void main(String[] args) {
		        new Constructor_Overloading();
		        new Constructor_Overloading(10);
		        new Constructor_Overloading(29,39);
		        
		        

	}

}
