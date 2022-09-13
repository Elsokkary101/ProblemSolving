import java.util.Arrays;
import java.util.Scanner;

public class ArrivaloftheGeneral {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr []  = new int [n];
		
		int min = Integer.MAX_VALUE;
		int max = -1;
		int inMin = 0;
		int inMax = 0;
		int ans = 0;
		for (int i = 0  ; i  < arr.length ; i++) {
			arr[i] = sc.nextInt();
			if (max < arr[i]) {
				max = arr[i];
				inMax = i;
			}
		}
		
		for (int i = inMax ; i > 0 ;i--) {
			int temp = arr[i];
			arr[i] = arr[i-1];
			arr[i-1] = temp;
			ans++;
		}
		
		for (int i = 0  ; i  < arr.length ; i++) {
			if (min >= arr[i]) {
				min = arr[i];
				inMin = i;
			}
		}
		
		for (int i = inMin ; i  < arr.length-1 ; i++) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			ans++;
		}
		
		
		System.out.println(ans);
		
		
		
		
	}
}
