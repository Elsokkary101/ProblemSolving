import java.util.Scanner;
public class luckyDivision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = n+"";
		int arr  [] = {4,7,47,77,44,74,444,447,474,477,744,747,774,777};
	
		boolean f  = true;
		for (int i = 0 ; i  < str.length() ; i++) {
			if (str.charAt(i) == '4' || str.charAt(i) == '7')
				continue;
			else {
				f = false;
				break;
			}
		}
		
		if (f)
			System.out.println("YES");
		else {
			boolean flag = false;
			for (int i = 0 ; i  < arr.length ; i++) {
				if (n%arr[i] == 0) {
					System.out.println("YES");
					flag = true;
					break;
				}
			}
			if (flag == false)
				System.out.println("NO");

		}
		
	}
}
