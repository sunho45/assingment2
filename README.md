

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

## 힙 정렬

```
import java.util.Arrays;
import java.util.Random;

public class Main{

    

    public static void main(String[] args) {
         
double beforeTime = System.currentTimeMillis();
        int[] arr = new int[2];
        for (int i = 0; i < 2; i++) {
            arr[i] = (int)((Math.random())*2); 
        }

        
        heapSort(arr);
        double aftertime = System.currentTimeMillis();
		double secDiffTime = (aftertime - beforeTime)/1000;
		System.out.println("수행시간(s) : "+secDiffTime);


        System.out.println("정렬 후: " + Arrays.toString(arr));
        
    }

    private static void heapSort(int[] arr) {
        int n = arr.length;

        // maxHeap을 구성
        // n/2-1 : 부모노드의 인덱스를 기준으로 왼쪽(i*2+1) 오른쪽(i*2+2)
        // 즉 자식노드를 갖는 노트의 최대 개수부터
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i); // 일반 배열을 힙으로 구성
        }

        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0); // 요소를 제거한 뒤 다시 최대힙을 구성
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int p = i;
        int l = i * 2 + 1;
        int r = i * 2 + 2;

        // 왼쪽 자식노드
        if (l < n && arr[p] < arr[l])
            p = l;
        // 오른쪽 자식노드
        if (r < n && arr[p] < arr[r])
            p = r;

        // 부모노드 < 자식노드
        if (i != p) {
            swap(arr, p, i);
            heapify(arr, n, p);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
```

## 버블정렬

```
import java.util.Arrays;
import java.util.Scanner;
public class DEDEE {
	static int[] nums;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		nums = new int[1048576];
		double beforeTime = System.currentTimeMillis();
		
		for (int i = 0; i < 1048576; i++) {
			nums[i] = (int) (Math.random() * 1048576);
		}
		
		for(int i = 0; i < nums.length - 1; i++) {
			// 현재 탐색에서 가장 앞의 원소를 초기 값으로 설정해둔다.
			int MinIndex = i;
			// 탐색을 진행하며, 가장 작은 값을 찾는다.
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[MinIndex] > nums[j])
					MinIndex = j;
			}
			// 탐색이 완료되면 가장 작은 값을 가장 앞의 원소와 가장 작은 원소의 위치를 바꾸어준다.
			int temp = nums[MinIndex];
			nums[MinIndex] = nums[i];
			nums[i] = temp;
		}
		
		
		double aftertime = System.currentTimeMillis();
		double secDiffTime = (aftertime - beforeTime)/1000;
		System.out.println("수행시간(s) : "+secDiffTime);



		
	}
}
```
## 쉘정렬


```
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[2];
        int N = arr.length;
        double beforeTime = System.currentTimeMillis();
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*2);
            
            
        }
        for(int h = N / 2; h > 0; h /= 2) {          
            for(int i = h; i < N; i++) {            
                int j;
                int temp = arr[i];                    
                
                for(j = i - h; j >= 0 && arr[j] > temp; j -= h) {  
                    arr[j + h] = arr[j];                           
                }
                arr[j + h] = temp;                                   
            }
        }
        double aftertime = System.currentTimeMillis();
		double secDiffTime = (aftertime - beforeTime)/1000;
		System.out.println("수행시간(s) : "+secDiffTime);
        for(int a : arr) {
            System.out.print(a +" ");
        }
        
        
        
        
        
        
    }
 
}
```
