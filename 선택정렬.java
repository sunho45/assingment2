
import java.util.Arrays;
import java.util.Scanner;
public class DEDEE {
	static int[] nums;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		
		
		
	int[] arr = new int[524288];
		for (int i = 0; i <524288; i++) {
			arr[i] = (int) (Math.random() * 524288);
		}
		double beforeTime = System.currentTimeMillis();
		for(int i = 0; i<arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) { // +1을 하는 이유는 자기와 비교할 필요가 없기 때문
				if(arr[i] > arr[j]) { // '>' 일 경우 오름차순 '<' 일 경우 내림차순
					int temp = arr[i]; // 값 변경해야 하기에 임시 저장
					arr[i] = arr[j]; // j를 i로 변경
					arr[j] = temp;  // i를 j로 변경
				}
			}
		}
		
		
		
		double aftertime = System.currentTimeMillis();
		double secDiffTime = (aftertime - beforeTime)/1000;
		 
System.out.println("시간소요(초):"+secDiffTime);
		
	}
}