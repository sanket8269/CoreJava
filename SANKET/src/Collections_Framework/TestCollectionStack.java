package Collections_Framework;

import java.util.Stack;

public class TestCollectionStack {
	
public static void main(String[] args) {
	 Stack S1 = new Stack();
	 
	 for(char i = 'a'; i<= 'z'; i++)
	 {
	S1.push(i);
	 }
	System.out.println(S1);
	 
 Stack S2 = new Stack();
	 char value;
	 for(char i = 'a'; i<= 'z'; i++)
	 {
		 value = (char) S1.peek();
	S2.push(value);
	S1.pop();
	 }
	System.out.println(S2);
	
 Stack S3 = new Stack();
	 
	 for(char i = 'a'; i<= 'z'; i++) {
		 value = (char) S2.peek();
		S3.push(value);
		S2.pop();
		 }
		System.out.println(S3);


//	s.push(1);
//	s.push(2);
//	s.push(3);
//	s.push(4);	 
//  System.out.println(s.pop());//last in first out
//  
//  System.out.println(s.peek());
	

}
}
