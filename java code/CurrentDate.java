package newprograms;

import java.util.Date;

public class CurrentDate 
{
	
	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(	d1.getTime()); //epoch time , we need to convert
		Date d2=new Date(d1.getTime()+(1000*60*60*24*4));
		System.out.println(d2);
		String mydate=		d2.toString();
		System.out.println(mydate);
		System.out.println(mydate.length());
		System.out.print(mydate.substring(0,11));
		System.out.println(mydate.substring(24));
		System.out.println("Date:"+mydate.substring(8,10));
		System.out.println("Month:"+mydate.substring(4,7));
		System.out.println("Year:"+mydate.substring(24));
		
	    
	}   

}
