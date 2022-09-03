import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class SpellCheck {
	static PrintWriter pw = new PrintWriter(System.out);
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException{
		int n = sc.nextInt();
		
		while (n-- > 0) {
			int t = sc.nextInt();
			int x = 3*t;
			int y = 3*t;
			int z = 3*t;
			
			
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			String str3 = sc.nextLine();
		
			
			
			String arr [] = str1.split(" ");
			for (int i =  0 ; i  < arr.length ; i++) {
				if (str2.contains(arr[i])) {
					if (str3.contains(arr[i])) {
						x-=3;
						y-=3;
						z-=3;
					}else {
						x-=2;
						y-=2;
					}
					
				}else if (str3.contains(arr[i])) {
					x-=2;
					z-=2;
				}
			}
			
			String arr2 [] = str2.split(" ");
			
			for (int i = 0 ; i  < arr2.length ; i++) {
				if (str3.contains(arr2[i])) {
					if (!str1.contains(arr2[i])) {
						y-=2;
						z-=2;	
					}
				}
			}
			
			
			
			
			
			
			pw.println (x + " " +  y +  " " + z);
			
			
			
		}
		pw.flush();
		pw.close();
	}
}

//class Scanner {
//	StringTokenizer st;
//	BufferedReader br;
//
//	public Scanner(InputStream s) {
//		br = new BufferedReader(new InputStreamReader(s));
//	}
//
//	public String next() throws IOException {
//		while (st == null || !st.hasMoreTokens())
//			st = new StringTokenizer(br.readLine());
//		return st.nextToken();
//	}
//
//	public int nextInt() throws IOException {
//		return Integer.parseInt(next());
//	}
//
//	public long nextLong() throws IOException {
//		return Long.parseLong(next());
//	}
//
//	public String nextLine() throws IOException {
//		return br.readLine();
//	}
//
//	public double nextDouble() throws IOException {
//		String x = next();
//		StringBuilder sb = new StringBuilder("0");
//		double res = 0, f = 1;
//		boolean dec = false, neg = false;
//		int start = 0;
//		if (x.charAt(0) == '-') {
//			neg = true;
//			start++;
//		}
//		for (int i = start; i < x.length(); i++)
//			if (x.charAt(i) == '.') {
//				res = Long.parseLong(sb.toString());
//				sb = new StringBuilder("0");
//				dec = true;
//			} else {
//				sb.append(x.charAt(i));
//				if (dec)
//					f *= 10;
//			}
//		res += Long.parseLong(sb.toString()) / f;
//		return res * (neg ? -1 : 1);
//	}
//
//	public boolean ready() throws IOException {
//		return br.ready();
//	}
//
//}