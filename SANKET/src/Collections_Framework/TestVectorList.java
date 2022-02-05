package Collections_Framework;

import java.util.List;
import java.util.Vector;

public class TestVectorList {
public static void main(String[] args) {
	
	Vector R= new Vector();
	R.add(32.22);
	R.add(23);
	R.add("SANKET");
	R.add(4343434);
	
	System.out.println(R.remove(2));
    System.out.println(R.contains(4));
    System.out.println(R.containsAll(R));
    System.out.println(R.removeAll(R));
    System.out.println(R.isEmpty());
    R.clear();
	System.out.println(R.size());
	//System.out.println(R.retainAll(R));
	

}
}
