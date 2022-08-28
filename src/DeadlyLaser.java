import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class DeadlyLaser {
	static PrintWriter pw = new PrintWriter(System.out);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int f = sc.nextInt();
		while (f-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int sx = sc.nextInt();
			int sy = sc.nextInt();
			int d = sc.nextInt();
			
			int ans = n + m -2;
			
			if (d >= distance(n,m,sx,sy)) {
				pw.println(-1);
				continue;
			}
			
			if (d < distance(sx,1,sx,sy) && d < distance(n,sy,sx,sy)) {
				pw.println(ans);
			}else if (d < distance(1,sy,sx,sy) && d < distance(sx,m,sx,sy))
				pw.println(ans);
			else 
				pw.println(-1);
			
		}

		pw.flush();
		pw.close();

	}
	
	public static int distance (int x1 , int y1 , int x2 , int y2) {
		return  Math.abs(x1 - x2) + Math.abs(y1 - y2);
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
