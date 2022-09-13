import java.util.Scanner;

public class GameWithSticks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		boolean f = false;
		int ans = Integer.MAX_VALUE;
		while (ans > 0) {
			ans = n*m - (n+m - 1);
			n--;
			m--;
			f = !f;
		}
		
		System.out.println(f? "Akshat" :"Malvika");

	}

}
