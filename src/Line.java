import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Line {
	static PrintWriter pw = new PrintWriter(System.out);
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)throws IOException {
		int n = sc.nextInt();
		while (n-- > 0) {
			int t = sc.nextInt();
			String str = sc.nextLine();
			int k = 0;
			int f = k;
			ArrayList<Long> ans = new ArrayList<>();
			
			char [] arr = str.toCharArray();
//			System.out.println(Arrays.toString(arr));
			
			while (t-- > 0) {
				if(f%2 == 1) {
					for (int i  = arr.length-1 ; i >= arr.length/2 ; i--) {
						if (arr[i] == 'L')
							continue;
						arr[i]='L';
						break;
					}
				}else {
					boolean flag = false;
					for (int i = 0 ; i  < arr.length/2 ; i++) {
						if (i  < arr.length/2) {
							if (arr[i] == 'R')
								continue;
							else {
								flag = true;
								arr[i] = 'R';
								break;
							}
						}
					}
					if (flag) {
						for (int i  = arr.length/2 ; i < arr.length ; i++) {
							if (arr[i] == 'L')
								continue;
							arr[i] = 'L';
							break;
						}
					}
				}
				f++;
				
//				System.out.println(k);
				ans.add(calc(arr));
				System.out.println(Arrays.toString(arr));
			}
			for (int i = 0 ; i  < ans.size() ;i++) {
				pw.print(ans.get(i) + " ");
			}
			pw.println();
		}
		pw.flush();
		pw.close();
	}
	
	public static long calc  (char [] arr) {
		long ans = 0;
		for (int i =  0  ; i  < arr.length ; i++) {
			if (arr[i] == 'R') {
				ans += Math.abs((arr.length-1)-i);
			}else {
				ans+= i;
			}
		}
		return ans;
	}
}

class Scanner {
	StringTokenizer st;
	BufferedReader br;

	public Scanner(InputStream s) {
		br = new BufferedReader(new InputStreamReader(s));
	}

	public String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	public String nextLine() throws IOException {
		return br.readLine();
	}

	public double nextDouble() throws IOException {
		String x = next();
		StringBuilder sb = new StringBuilder("0");
		double res = 0, f = 1;
		boolean dec = false, neg = false;
		int start = 0;
		if (x.charAt(0) == '-') {
			neg = true;
			start++;
		}
		for (int i = start; i < x.length(); i++)
			if (x.charAt(i) == '.') {
				res = Long.parseLong(sb.toString());
				sb = new StringBuilder("0");
				dec = true;
			} else {
				sb.append(x.charAt(i));
				if (dec)
					f *= 10;
			}
		res += Long.parseLong(sb.toString()) / f;
		return res * (neg ? -1 : 1);
	}

	public boolean ready() throws IOException {
		return br.ready();
	}

}

