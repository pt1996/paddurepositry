package collprograms;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment99 {
	
	/* Using ArrayList
	 * 1 . ArrayList allow hetrogennous values .
	 * 2 . ArrayList accept duplicate values.
	 * 3 . ArrayList will follow indexing.
	 * 4 . ArrayList accept null value.
	 * 5 . ArrayList accept dynamic .
	 * 6 . ArrayList accept sorting in  the case of same datatype .
	 */
	

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("manish");
		a1.add("madhu");
		a1.add(34);
		a1.add(50);
		a1.add(90);
		a1.add('g');
		a1.add(null);
		a1.add(false);
		a1.add("madhu");
		a1.add(null);
		a1.add("madhu");
		a1.add(null);
		a1.add("madhu");
		a1.add("madhu");
		a1.add("madhu");
		a1.add("madhu");
		a1.add("madhu");
		System.out.println(a1);
		// sorting the ArrayList by using collections.sort
		   ArrayList a2=new ArrayList();
		   a2.add(70);
		   a2.add(23);
		   a2.add(45);
		   a2.add(15);
		   Collections.sort(a2);
		   System.out.println(a2);

	}

}
