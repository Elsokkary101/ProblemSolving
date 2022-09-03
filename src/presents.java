import java.util.Scanner;

public class presents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr [] = new int [120];
		int n =sc.nextInt();
		int sarr [] = new int[n];
		for (int i = 0 ; i  < sarr.length; i++) {
			int x = sc.nextInt();
			arr[x-1] = i;
		}
		
		for (int i = 0 ; i  < sarr.length ; i++) {
			System.out.print((arr[i]+1) +  " ");
		}
	}
}
