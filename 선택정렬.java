
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
			for(int j = i + 1; j < arr.length; j++) { // +1�� �ϴ� ������ �ڱ�� ���� �ʿ䰡 ���� ����
				if(arr[i] > arr[j]) { // '>' �� ��� �������� '<' �� ��� ��������
					int temp = arr[i]; // �� �����ؾ� �ϱ⿡ �ӽ� ����
					arr[i] = arr[j]; // j�� i�� ����
					arr[j] = temp;  // i�� j�� ����
				}
			}
		}
		
		
		
		double aftertime = System.currentTimeMillis();
		double secDiffTime = (aftertime - beforeTime)/1000;
		 
System.out.println("�ð��ҿ�(��):"+secDiffTime);
		
	}
}