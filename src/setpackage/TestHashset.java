package setpackage;

import java.util.HashSet;

public class TestHashset {

	public static void main(String[] args) {
		
		
		HashSet hs = new HashSet();
		HashSet hs1 = new HashSet(100);
		HashSet hs2 = new HashSet(200 , (float)0.95);
		
		hs.add(100);
		hs.add(true);
		hs.add("hello");
		hs.add(17.8659);
		hs.add('A');
		hs.add(false);
		hs.add(null);
		
		System.out.println(hs);
		//remove()
		
		hs.remove(17.8659);
		System.out.println(hs);
		
		//contains
		System.out.println(hs.contains(null));
		System.out.println(hs.contains("testing"));
		
		//Is Empty
		System.out.println(hs.isEmpty());
		
		System.out.println("&&&&&&&&&&&&&&&^^^^^^^^^^^^^^^^^^********************)))))))))))))(**(((((((((#########$$$$$$$$$$");
		//reading object from hs 
		
		for(Object f:hs) {
		System.out.println(f);

		
		}
		System.out.println("----------==========++++++++++++");
		for(Object f:hs) {
		System.out.print(f+" ");

		
		}
	}

}
