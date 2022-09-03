import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class watermelon {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		String str = sc.next();
		String s = "hello";
		HashSet<Character> hs = new HashSet<>();
		hs.add('h');
		hs.add('e');
		hs.add('l');
		hs.add('o');
		int j = 0;
		boolean f = true;
		int k = 0;
		for (int i = 0 ; i  <  str.length() ; i ++) {
			if (hs.contains(str.charAt(i))) {
				if (j < s.length() && s.charAt(j) == str.charAt(i)) {
					j++;
				}
			}
		}
		
		System.out.println(j == 5 ? "YES" :"NO");
		
		
	}
}
