import java.util.Scanner;

public class BeautifulMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] [] = new int [5][5];
		int x = 0;
		int y = 0;
		for (int i = 0 ; i  < arr.length ; i++)
			for (int j = 0 ; j  < arr[i].length ; j++) {
				arr[i][j] = sc.nextInt();
				if (arr[i][j] == 1) {
					y = i;
					x = j;
				}
			}
		
		System.out.println(Math.abs(x-2) + Math.abs(y-2));
		
	}
}
