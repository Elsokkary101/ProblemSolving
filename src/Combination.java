import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Combination {
	static PrintWriter pw = new PrintWriter(System.out);
	static Scanner sc = new Scanner(System.in);
	static boolean vis [] ;
	static Stack<Integer> st =  new Stack<Integer>();
	static int c = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,2,30,25,90};
		vis = new boolean [arr.length];
		for  (int i  = 0 ; i  <  vis.length ; i++) vis [i] =false;
		comb(arr);
		pw.println(c);
		pw.flush();
		pw.close();
		
		
	}
	
	public static void comb (int arr []) {
		if (st.size() == 3) {
			c++;
			System.out.println(st.toString());
			return;
		}
		
		for (int i = 0 ; i <  arr.length ; i++) {
			if (!vis[i]) {
				vis[i] = true;
				st.add(arr[i]);
				comb(arr);
				st.pop();
				vis[i] = false;
			}
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