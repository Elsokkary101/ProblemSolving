import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class IWannaBetheGuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Integer> hs = new HashSet<Integer>();
		int arr [] = new int [sc.nextInt()];
		for (int i = 0 ; i  < arr.length ; i++) {
			arr[i] = sc.nextInt();
			if (!hs.contains(arr[i]))
				hs.add(arr[i]);
		}
		Arrays.sort(arr);
		int temp [] = new int [sc.nextInt()];
		for (int i = 0 ; i  < temp.length ; i++) {
			temp[i] = sc.nextInt();
			if (!hs.contains(temp[i]))
				hs.add(temp[i]);
		}
		
		
		System.out.println(hs.size() >= n ? "I become the guy.":"Oh, my keyboard!" );
		
		
		
		
	}

}
