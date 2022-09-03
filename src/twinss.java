import java.util.Arrays;
import java.util.Scanner;

public class twinss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr [] = new int [n];
		
		int sum = 0;
		
		for (int i = 0 ; i  < arr.length ; i++) {	
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		int ans = 0;
		int subSum = 0;
		for (int i = arr.length - 1; i  >= 0 ; i--) {
			subSum += arr[i];
			ans++;
			sum-=arr[i];

			if (subSum > sum)
				break;
			
		}
		
		System.out.println(ans);
		
		
	}
}
