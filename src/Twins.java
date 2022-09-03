import java.util.Arrays;
import java.util.Scanner;

public class Twins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		int arr [] = new int [sc.nextInt()];
		
		for (int i =  0 ; i  < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int min = Integer.MAX_VALUE;
		t = t-1;
		for (int i =  t ;i <  arr.length ; i++) {
//			System.out.println(arr[i] + " " + arr[i-t]);
			min = Math.min(min, arr[i] - arr[i-t]);
		}
		
		System.out.println(min);
		
	}

}
