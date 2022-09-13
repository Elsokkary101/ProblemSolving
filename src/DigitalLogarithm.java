import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;



public class DigitalLogarithm {
	static PrintWriter pw = new PrintWriter(System.out);
	static Scanner sc = new Scanner(System.in);
	static int ans = 0;
	public static void main(String[] args) throws IOException {
		int  n = sc.nextInt();
		while (n-- > 0)  {
			int t = sc.nextInt();
			HashSet<Long> hs = new HashSet<Long> ();
			
			
			ArrayList<Long> arra = new ArrayList<Long>() ;
			ArrayList<Long> arrb = new ArrayList<Long>() ;
			for (int i = 0 ; i  < t ; i++) {
				long x = sc.nextInt();
				hs.add(x);
			}
			
			for (int i = 0  ; i  < t ; i++) {
				long x = sc.nextInt();
				if (hs.contains(x)) {
					hs.remove(x);
				}else
					arrb.add(x);
			}
			
			
			for (Long i : hs) {
				arra.add(i);
			}
			
			long arr [] = new long [arra.size()];
			for (int i = 0 ; i  < arra.size(); i++) {
				arr[i] = arra.get(i);
			}
			
			long temp [] = new long [arrb.size()];
			
			for (int i = 0 ; i  < arrb.size(); i++) {
				temp[i] = arrb.get(i);
			}
			
			Arrays.sort(arr);
			Arrays.sort(temp);
			
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(temp));
			
			
			for (int i = 0 ; i < arr.length ; i++) {
				while  (arr[i] != temp[i]) {
					if (arr[i] > temp[i])
						arr[i] = getloag(arr[i]+"");
					else if (arr[i] < temp[i])
						temp [i] = getloag(temp[i] + "");
					System.out.println(temp[i] + " " + arr[i]);
					ans++;
				}
			}
	
			
			System.out.println(ans);
			
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(temp));
			ans= 0;
			
		}
		
		
	}
	
	public static int getloag (String str) {	

		return str.length();
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
//		return Long.parseInt(next());
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