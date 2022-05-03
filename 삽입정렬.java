import java.util.Arrays;

public class Main {
	static int[] nums;

	public static void main(String[] args) {
		nums = new int[2];
		double beforeTime = System.currentTimeMillis();
		for (int i = 0; i < 2; i++) {
			nums[i] = (int) (Math.random() * 2);
		}
	
		for(int i = 1; i < nums.length; i++) {
			// 현재 선택된 원소의 값을 임시 변수에 저장해준다.
			int temp = nums[i];
			// 현재 원소를 기준으로 이전 원소를 탐색하기 위한 index 변수.
			int prev = i - 1;
			// 현재 선택된 원소가 이전 원소보다 작은 경우까지만 반복. 단, 0번째 원소까지만 비교한다.
			while(prev >= 0 && nums[prev] > temp) {
			
				nums[prev + 1] = nums[prev];
				
				prev--;
			}
			
			nums[prev + 1] = temp;
		}
		double aftertime = System.currentTimeMillis();
		double secDiffTime = (aftertime - beforeTime)/1000;
		
		System.out.println("<정렬 후>");
		System.out.println(Arrays.toString(nums));
		System.out.println("수행시간(s) : "+secDiffTime);

	}
}


