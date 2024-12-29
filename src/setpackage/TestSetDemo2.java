package setpackage;

import java.util.HashSet;
import java.util.LinkedList;

public class TestSetDemo2 {

	public static void main(String[] args) {
    HashSet hs = new HashSet();
	hs.add(100);
	hs.add(true);
	hs.add("hello");
	hs.add(17.8659);
	hs.add('A');
	hs.add(false);
	hs.add(null);
	
	System.out.println(hs);
	
	HashSet hs1= new HashSet();
	hs1.add(17.8659);
	hs1.add('A');
	hs1.add(false);
	hs1.add(null);
	System.out.println(hs1);
	
	LinkedList ls= new LinkedList();
	}

}
