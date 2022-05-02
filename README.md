

선택정렬
```
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static int[] nums;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double beforeTime = System.currentTimeMillis();
	int[] arr = new int[1048576];
		for (int i = 0; i < 1048576; i++) {
			arr[i] = (int) (Math.random() * 1048576);
		}
		for(int i = 0; i<arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) { // +1을 하는 이유는 자기와 비교할 필요가 없기 때문
				if(arr[i] > arr[j]) { // '>' 일 경우 오름차순 '<' 일 경우 내림차순
					int temp = arr[i]; // 값 변경해야 하기에 임시 저장
					arr[i] = arr[j]; // j를 i로 변경
					arr[j] = temp;  // i를 j로 변경
				}
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " "); // 정렬 후 결과 출력
		}
		
		double aftertime = System.currentTimeMillis();
		double secDiffTime = (aftertime - beforeTime)/1000;
		System.out.println("시간차이(s) : "+secDiffTime);



		
	}
}
```

![image](https://user-images.githubusercontent.com/100903674/166194462-bfb965df-6e07-4ba1-9efc-56531cd47716.png)



