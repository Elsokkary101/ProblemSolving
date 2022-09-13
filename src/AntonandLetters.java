import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class AntonandLetters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		HashSet<Character> hs = new HashSet<>();
		
		String arr [] = str.split(",");
		
		for (int i = 0 ; i  < arr.length ; i ++) {
			for (int j = 0 ; j  < arr[i].length() ; j++) {
				if (arr[i].charAt(j) >= 'a' && arr[i].charAt(j) <= 'z') {
					if (!hs.contains(arr[i].charAt(j)))
						hs.add(arr[i].charAt(j));
				}
			}
		}
		
		System.out.println(hs.size());
	}
}
