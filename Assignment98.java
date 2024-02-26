package collprograms;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class Assignment98 {

	public static void main(String[] args) {
		/* Using LinkedList
		 * 1. LinkedList accepts hetrgenous values.
		 * 2. LinkedList accepts duplicate values.
		 * 3. LinkedList follow indexing .
		 * 4 .LinkedList accepts dynamic.
		 * 5 .LinkedList accepts null value.
		 * 6 .LinkedList accepts sorting for the same datatype
		 */
		LinkedList l=new LinkedList();
		l.add("rani");
		l.add(11);
		l.add("raju");
		l.add("kalki");
		l.add("yes");
		l.add("no");
		l.add("malli");
		l.add(true);
		l.add(true);
		l.add(20);
		l.add(11);
		l.add('k');
		l.add(true);
		l.add(11);
		l.add(11);
		l.add(null);
		System.out.println(l);
		// Sorting
		
		LinkedList e=new LinkedList();
		e.add("balu");
		e.add("car");
		e.add("raju");
		e.add("kalki");
		e.add("yes");
		e.add("no");
		e.add("malli");
		Collections.sort(e);
		System.out.println(e);

	}

}
