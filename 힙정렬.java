import java.util.PriorityQueue;
 
public class DEDEE {
	public static void main(String[] args) {
    
		int[] arr = new int[1048576];
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=(int)(Math.random()*1048576);
			
		}
		double beforeTime = System.currentTimeMillis();
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		
		// 배열을 힙으로 만든다.
		for(int i = 0; i < arr.length; i++) {
			heap.add(arr[i]);
		}
		
		// 힙에서 우선순위가 가장 높은 원소(root노드)를 하나씩 뽑는다.
		for(int i = 0; i < arr.length; i++) {
			arr[i] = heap.poll();
		}
		 double aftertime = System.currentTimeMillis();
			double secDiffTime = (aftertime - beforeTime)/1000;
			System.out.println("수행시간(s) : "+secDiffTime);

		
		System.out.print("\n 정렬 후 배열 : ");
		for(int val : arr) {
			System.out.print(val + " ");
		}
		
	}
}
