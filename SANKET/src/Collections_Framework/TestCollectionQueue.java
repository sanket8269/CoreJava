package Collections_Framework;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestCollectionQueue {
	public static void main(String[] args) {
		Queue q =  new PriorityQueue();//first datatypes same as another first datatypes 
		q.add(1212);
		q.add(2112);
		q.add(212);
		q.add(122);
		
	
	//q.offer(9);//insert element first
		System.out.println(q);
		//System.out.println(q.poll());
		//q.poll();
	for (Object object : q) {
		System.out.println(object);
//
	}
	}
	

}
