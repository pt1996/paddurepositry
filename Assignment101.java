package collprograms;


import java.util.PriorityQueue;

public class Assignment101 {

	public static void main(String[] args) {
		// Using PriorityQueue
		
		/* 1. PriorityQueue not accept hetregeous values.it accept only string values.It is a homogenenous.
		 * 2. It does not follow proper indexing .
		 * 3. It does not allow null values , boolean values, integer, float, character values .
		 * 4. It is not follw sorting because it only accept string vales it gives the output in a sorted manner.
		 * 5. If i give null values it gives the exception a NullPointerException.
		 * 6. If i give char, int , boolean values it gives the ClassCastException .
		 * 7. It is a dynamic in nature.
		 * 8. It allows the duplicate values but not in the order wise.
		 * 
		 */
		PriorityQueue p=new PriorityQueue();
		p.add("rani");
		p.add("raju");
		p.add("kalki");
		p.add("no");
		p.add("yes");
		p.add("no");
		p.add("malli");
		p.add("siri");
		p.add("siri");
		p.add("siri");
		p.add("siri");
		p.add("rani");
		p.add("rani");
		p.add("rani");
		
		System.out.println(p);
		

	}

}
