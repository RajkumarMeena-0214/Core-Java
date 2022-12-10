package in.co.CollectionFramework;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a = new ArrayList();
		
		a.add("One");
		a.add("Two");
		a.add("Three");
		a.add("Four");
		
		System.out.println(a);
		
	int	size = a.size();
	System.out.println("size "+ size);
	
	for (int i = 0; i < a.size();i++) {
		System.out.println(i + ":"+ a.get(i));
	}
	for (Object obj : a) {
		System.out.println(obj);
	}
    Integer i = new Integer (3);
    a.add(i);
    System.out.println(a);
	
	ArrayList sublist = new ArrayList (a.subList (0,3)); 
	System.out.println(sublist);
	
	
	
	
	
	
	
	
	
	}

}
