import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class MinMaxArrayTransformation {
	static PrintWriter pw = new PrintWriter(System.out);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int n = sc.nextInt();
		while (n-- > 0) {
			int arr[] = new int[sc.nextInt()];
			int b[] = new int[arr.length];

			for (int i = 0; i < arr.length; i++)
				arr[i] = sc.nextInt();
			for (int i = 0; i < b.length; i++)
				b[i] = sc.nextInt();
			int dmax[] = new int[arr.length];
			int dmin[] = new int[arr.length];

			int acount = 0;
			int bcount = 0;
			int k = arr.length - 1;
			Queue<Integer> q  = new LinkedList<Integer>();
			
			for (int i = arr.length-1 ; i  >=0 ; i--)
				q.add(b[i]);
			
			int minVal = 0;
			int maxVal = 0;

			for (int i = arr.length - 1; i >= 0; i--) {
				maxVal = q.peek();
				System.out.println(maxVal);
				bcount = 0;
				k = next(b,arr[i]);
				minVal = b[k];

				int diff = arr.length-k;
				bcount = arr.length - (diff);
				acount = arr.length - i;
				if (acount == bcount) {
					acount = 0;
					bcount = 0;
					while (bcount-- > 0)
						q.remove();
				}
			

				dmax[i] = maxVal - arr[i];
				dmin[i] = minVal - arr[i];
			}

			for (int i = 0; i < dmin.length; i++)
				pw.print(dmin[i] + " ");
			pw.println();
			for (int i = 0; i < dmax.length; i++)
				pw.print(dmax[i] + " ");
			pw.println();

		}
		pw.flush();
		pw.close();
	}

	public static int next(int[] arr, int target) {
		int start = 0, end = arr.length - 1;

		int ans = -1;
		while (start <= end) {
			int mid = (start + end) / 2;

			// Move to right side if target is
			// greater.
			if (arr[mid] < target) {
				start = mid + 1;
			} else {
				ans = mid;
				end = mid - 1;
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