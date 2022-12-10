package in.co.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionEx {

	public static void main(String[] args) {
		
		 Collection c = new ArrayList();
		 
		 c.add ("Bura mat Dekho"); //index 0
		 c.add ("Bura mat Suno");  //Index 1
		 c.add ("Bura mat Bolo");  //Index 2
		 
		 System.out.println("Length of collection : " + c.size());
		 
		 //Print all elements of collection
		 for (Object ele : c) {
		 System.out.println(ele);
	}
		 
		 //Convert Collection to array
		Object [] arr = c.toArray();
		
		//Print all elements of array
		
		for (Object ele : arr) {
			
			String s = ele.toString();
			System.out.println(s);
		}
	}}	 
		 
		 
		 
			 
		 
	
		 
	


