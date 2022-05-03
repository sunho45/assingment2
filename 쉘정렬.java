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
