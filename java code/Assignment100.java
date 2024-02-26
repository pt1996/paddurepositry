package collprograms;

import java.util.Collections;
import java.util.Vector;

public class Assignment100 {

	public static void main(String[] args) {
		/* Using Vector
		 * 1. Vector accepts hetrgenous values.
		 * 2. Vector accepts duplicate values.
		 * 3. Vector follow indexing .
		 * 4 .Vector accepts dynamic.
		 * 5 . Vector accepts null value.
		 * 6 . Vector accepts sorting for the same datatype
		 */
		Vector v=new Vector();
		v.add("rani");
		v.add(11);
		v.add("raju");
		v.add("kalki");
		v.add("yes");
		v.add("no");
		v.add("malli");
		v.add(true);
		v.add(true);
		v.add(20);
		v.add(11);
		v.add('k');
		v.add(true);
		v.add(11);
		v.add(11);
		v.add(null);
		System.out.println(v);
		// Sorting
		
		Vector v1=new Vector();
		v1.add("raju");
		v1.add("kalki");
		v1.add("yes");
		v1.add("no");
		v1.add("malli");
		Collections.sort(v1);
		System.out.println(v1);
		
		
		

	}

}
