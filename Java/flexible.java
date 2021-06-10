import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class flexible {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int l= f.nextInt();
		int n = f.nextInt()+1;
		int[] p = new int[n];
		p[n-1]=l;
		for(int x=0;x<n-1;x++) {
			p[x]=f.nextInt();
		}
		TreeSet<Integer> list = new TreeSet<>();
		for(int x=0;x<n;x++) {
			list.add(p[x]);
			for(int y=x+1;y<n;y++) {
				list.add(p[y]-p[x]);
			}
		}
		for(int h : list) {
			out.print(h+" ");
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new flexible().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("flexible.dat")));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}