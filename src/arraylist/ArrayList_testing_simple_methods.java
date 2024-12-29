package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_testing_simple_methods {

	public ArrayList_testing_simple_methods() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
    
		ArrayList al = new ArrayList();
		List al1  = new ArrayList();
		ArrayList<String> alSt = new ArrayList <String>();
		ArrayList<Integer> alint = new ArrayList<Integer>();
		
		 al.add("ABC");
		 al.add(23567);
		 al.add(true);
		 al.add('A');

		 System.out.println(al);
		 al.remove(3);
		 System.out.println(al);
		 al1.addAll(al);
		 al.removeAll(al1);
		 System.out.println("This is added Array:"+al1);
		 System.out.println("This is Empty Array:"+al);
		 
		 alSt.add("124ew"); 
		 alSt.add("124 test");
		 alSt.add("tgdrehswjq");
		 alSt.add("test for win");
		 alSt.add("gfdhsajk");
		 
		 System.out.println(alSt);
		 System.out.println(alSt.contains("124 test"));
		 System.out.println(al.isEmpty());
		 
		 //For loop
		 
		 System.out.println("*************************use simple for loop***********************************");
		 for(int i=0;i<alSt.size();i++)
		 {
			 System.out.println("["+(i+1)+"]"+alSt.get(i));
		 }	 
		
		 //For Each Loop 
		 System.out.println("+++++++++++++++++++++++++Use For Each loop++++++++++++++++++++++++++++++++++++++++");
		 for (String vs : alSt) {
			System.out.println(vs);
		}
		 //Intrator method
		 System.out.println("----------Use Itrator interface that Parent interface of Collection interface------");
		 Iterator it = al1.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
			 
		 }
		 
	}

}
