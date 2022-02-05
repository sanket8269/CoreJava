package Collections_Framework;

import java.util.ArrayList;
import java.util.List;

public class TestCollectionArrayList {
  public static void main(String[] args) {
	List l = new ArrayList();
	
	l.add(13);
	l.add("sanket");
	l.add(32.43);
	l.add(34);
	
	List K = new ArrayList();

	l.add(36);
	
	System.out.println(l);//by default new element the end of array
	
//	K.add(34);
//    K.add("sanket"); 
//	K.add(32.436);
//	K.add(43);	
//	System.out.println(l.retainAll(K));//same value r
//	System.out.println(l);
//	System.out.println(K);

//  for(Object O:l) {
//	  System.out.println(O);
//  }
}}
