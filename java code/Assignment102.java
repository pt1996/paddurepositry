package collprograms;

import java.util.Collections;
import java.util.TreeSet;

public class Assignment102 {

	public static void main(String[] args) {
		// Using TreeSet
		/*1 . TreeSet accepts only string values menas homogenous values .
		 *2.  It allow duplicate . if you will give same vale 3 times it gives one as output sometimes it gives two.
		 *3. It doesn't follow proper indexing.
		 *4. It is a dynamic in nature.
		 *5 . It sdoes not allow null values.
		 *6 . It does not allow sorting eventhough it has same datatype.
		 * 
		 */
		
		TreeSet t=new TreeSet();
		t.add("Morning");
		t.add("afternoon");
	    t.add("night");
		t.add("evening");
		t.add("morning");
	    t.add("afternoon");
		t.add("afternoon");
		t.add("Morning");
		t.add("afternoon");
	    t.add("night");
		t.add("evening");
		t.add("morning");
	    t.add("afternoon");
		t.add("afternoon");
		t.add("Morning");
		t.add("afternoon");
	    t.add("night");
		t.add("evening");
		t.add("morning");
	    t.add("afternoon");
		t.add("afternoon");
		t.add("Morning");
		t.add("afternoon");
	    t.add("night");
		t.add("evening");
		t.add("morning");
	    t.add("afternoon");
		t.add("afternoon");
		t.add("night");
		
		System.out.println(t);
		

	}

}
