package arraylist;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedList_testing_1 {

	public static void main(String[] args) {
		
		
		LinkedList l = new LinkedList();
		LinkedList<String> ls = new LinkedList<String> ();
		LinkedList<Integer> ls1 = new LinkedList<Integer>();
		
		l.add("A");
		l.add('B');
		l.add(123456);
		l.add(true);
		l.add("Java test");
		l.add("worker");
		System.out.println(l);
		l.remove(3);
		System.out.println("After removing the object:"+l);
		
		l.add(3, "checking");
		System.out.println("After adding with index: "+l);
		l.set(3,true);
		System.out.println("Atfer replacing :"+l);
		
		//For Loop
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));	
		}
		System.out.println("*****************************ForEach Loop**********************");
		for(Object e:l) {
			System.out.println(e);
		}
		
	System.out.println("+++++++++++++++++++++++Iterator Methods++++++++++++++++++++++++++++++++");
	Iterator it =  l.iterator();
	while(it.hasNext())
	{
	   System.out.println(it.next());
	}
	
	System.out.println(l.contains("Java"));
	System.out.println(l.isEmpty());
	}
}
