import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class PalindromicIndices {
	static PrintWriter pw = new PrintWriter(System.out);
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException{
		int n = sc.nextInt();
		
		while (n-- > 0) {
			int t = sc.nextInt();
			String str = sc.nextLine();
			
			boolean f = false;
			for (int i =  0 ; i  <  str.length()-1 ; i++) {
				if (str.charAt(i) != str.charAt(i+1)) {
					f = true;
					break;
				}
			}
			if (!f)
				pw.println(str.length());
			else {
				int x = str.length()/2;
			
				String s2 ="";
				int ans = 1;
				if (t%2 == 0) {
					s2 = str.substring(x,str.length());
				}else {
					s2 = str.substring(x+1,str.length());
				}
				
//				System.out.println(s1);
//				System.out.println(s2);
				
				
				for (int i = 0 ; i  < s2.length()-1 ; i++) {
					if (s2.charAt(i) == s2.charAt(i+1))
						ans++;
					else 
						break;
				}
				
				
				if (t%2 ==0)
					pw.println(2*ans);
				else if (str.charAt(x) == str.charAt(x+1))
					pw.println(2*ans +1);
				else
					pw.println(1);
				
			}
			
			
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
