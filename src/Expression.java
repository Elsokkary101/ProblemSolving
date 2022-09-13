import java.util.Arrays;
import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];

		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();



		int max = 0;

		int x = arr[0] + arr[1] + arr[2];
		max = Math.max(max, x);
		x = (arr[0] + arr[1]) * arr[2];
		max = Math.max(max, x);
		x = arr[0] * (arr[1] + arr[2]);
		max = Math.max(max, x);
		x = arr[0] * arr[1] * arr[2];
		max = Math.max(max, x);
		System.out.println(max);
	}

}
