
# 각 정렬의 성능분석

## 선택정렬
```
import java.util.Arrays;
import java.util.Scanner;
public class Main {
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
```

![image](https://user-images.githubusercontent.com/100903674/166396326-4c502afd-8fb8-492a-8c54-b8e5160d2939.png)



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
        int[] arr = new int[256];
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=(int)(Math.random()*arr.length);
			
		}
        double beforeTime = System.currentTimeMillis();
        quickSort(arr,0,arr.length-1);
        double aftertime = System.currentTimeMillis();
		double secDiffTime = (aftertime - beforeTime)/1000;
		System.out.println("수행시간(s) : "+secDiffTime);
 for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+",");
        }
        }
    }

```




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
![image](https://user-images.githubusercontent.com/100903674/166265585-4a3b7f9d-43f9-438e-8797-3192c99fe310.png)

## 힙 정렬

```
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
```

![image](https://user-images.githubusercontent.com/100903674/166452658-8d4c5c17-b88f-4835-b919-cbde7bcf1d2f.png)













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
![image](https://user-images.githubusercontent.com/100903674/166256518-aeb2e686-9729-4e51-b25f-79beee9f9535.png)

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
![image](https://user-images.githubusercontent.com/100903674/166246713-a8ab33ce-7f1b-4db3-95f6-c5532bee0720.png)



