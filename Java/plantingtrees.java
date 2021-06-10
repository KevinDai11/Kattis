import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class plantingtrees {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = f.nextInt();
		PriorityQueue<Integer> a = new PriorityQueue<>();
		for(int x=0;x<n;x++) {			
			a.offer(f.nextInt());
		}
		int d =2;
		out.print(a);
		int r = 0;
		while(a.size()>0) {
			r = Math.max(a.peek()+ d++, r);
			a.poll();
		}
		out.print(r);
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new plantingtrees().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("plantingtrees.dat")));
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