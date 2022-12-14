import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;


public class BestPermutation {
	static PrintWriter pw = new PrintWriter(System.out);
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)throws IOException {
		int n  = sc.nextInt();
		while (n-- > 0) {
			int t = sc.nextInt();
			String str = "";
			if (t%2 == 0) {
				str = 1 + " "+ (t-1) + " " + t;
				String temp = "";
				for (int i = t-2 ; i  >= 2 ; i--) {
					temp += i + " ";
				}
				str  = temp + str;
			}else {
				str = 2 + " " + 3 + " " + 1 + " " + (t-1)+ " " + t;
				String temp = "";
				for (int i = t-2 ; i  >= 4 ; i--) {
					temp+= i + " ";
				}
				str = temp + str;
			}
			System.out.println(str);
		}	
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