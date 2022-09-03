
import java.util.Scanner;
public class Dubstep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String arr [] = str.split("WUB");
		str = "";
		for (int i = 0 ; i  < arr.length ;i++) {
			if (arr[i].equals(""))
				continue;
			str += arr[i] + " ";
		}
		System.out.println(str);
	}

}
