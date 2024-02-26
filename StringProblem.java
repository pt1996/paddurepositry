package newprograms;

public class StringProblem {
public static void main(String[] args) {
	String name="Rahul321";
	char c1[]=		name.toCharArray();   //Convert String into char array
	
	for(int i=0;i<name.length();i++)
	{
			boolean answer=		Character.isDigit(c1[i]);
				if(answer==true)
				{
					System.out.println(i);
				}
					}
}
}
