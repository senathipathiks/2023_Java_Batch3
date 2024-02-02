package Day10;

import java.util.PriorityQueue;

public class PriorityQue {

	public static void main(String[] args) {
		PriorityQueue<Integer> que=new PriorityQueue<Integer>();
		que.add(10);
		que.add(30);
		//que.poll();
		System.out.println(que);
		que.clear();
		System.out.println(que);
		System.out.println(que.offer(0));
		
	}

}
