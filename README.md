

##선택정렬
```
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static int[] nums;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		
		double beforeTime = System.currentTimeMillis();
		
	int[] arr = new int[524288];
		for (int i = 0; i <524288; i++) {
			arr[i] = (int) (Math.random() * 524288);
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
		
		
		
		double aftertime = System.currentTimeMillis();
		double secDiffTime = (aftertime - beforeTime)/1000;
		 
System.out.println("시간소요(초):"+secDiffTime);
		
	}
}
```

![image](https://user-images.githubusercontent.com/100903674/166194462-bfb965df-6e07-4ba1-9efc-56531cd47716.png)


## 퀵 정렬

```
public class Main {
    private static void quickSort(int[] arr,int start, int end) {
        int part=partition(arr,start,end);
        if(start<part-1) quickSort(arr,start,part-1);
        if(end>part) quickSort(arr,part,end);
    }

    private static int partition(int[] arr,int start,int end) {
        int pivot=arr[(start+end)/2];
        while(start<=end) {
            while(arr[start]<pivot) start++;
            while(arr[end]>pivot) end--;
            if(start<=end) {
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        return start;
    }

    private static void swap(int[] arr,int start,int end) {
        int tmp=arr[start];
        arr[start]=arr[end];
        arr[end]=tmp;
        return;
    }


    public static void main(String[] args) {
        double beforeTime = System.currentTimeMillis();
        int[] arr = new int[1024];
        for (int i = 0; i <1024; i++) {
			arr[i] = (int) (Math.random() * 1024);
		}
        
        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+",");
        }
        
        
        
        double aftertime = System.currentTimeMillis();
		double secDiffTime = (aftertime - beforeTime)/1000;
		System.out.println("시간소요(초):"+secDiffTime);
    }

}
```

![image](https://user-images.githubusercontent.com/100903674/166199135-4667e14d-b393-4c12-bffc-e6ebeccdc158.png)


### 삽입정렬
```
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


```

