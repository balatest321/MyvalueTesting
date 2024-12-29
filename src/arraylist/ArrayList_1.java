package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Z");
		al.add("B");
		al.add("C");
		al.add("X");
		al.add("Y");
		al.add("A");
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println("New Sorted list:---------"+al);
		Collections.sort(al.reversed());
		System.out.println("Reversed"+al);
		
		Collections.shuffle(al);
		System.out.println(al);
	}
}
