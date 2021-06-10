import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class polymul1 {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = f.nextInt();
		while(n-->0) {
			int t = f.nextInt();
			int[] p1 = new int[t+1];
			for(int x=0;x<t+1;x++) {
				p1[x]=f.nextInt();
			}
			int o = f.nextInt();
			int[] p2 = new int[o+1];
			for(int x=0;x<o+1;x++) {
				p2[x]=f.nextInt();
			}
			
			int[] r= new int[o+t+1];
			for(int x=0;x<t+1;x++) {
				for(int y=0;y<o+1;y++) {
					r[x+y]+=p1[x]*p2[y];
				}
			}
			out.println(o+t);
			out.println(Arrays.toString(r).replaceAll("[\\[\\],]", ""));
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new polymul1().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("polymul1.dat")));
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