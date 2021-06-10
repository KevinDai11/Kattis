import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class eligibility {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = f.nextInt();
		while(n-->0) {
			String name = f.next();
			String[] post = f.next().split("/");
			String [] birth = f.next().split("/");
			int c = f.nextInt();
			if(post[0].compareTo("2010")>=0) {
				out.println(name+" eligible");
				continue;
			}
			if(birth[0].compareTo("1991")>=0) {
				out.println(name+" eligible");
				continue;
			}
			if(c>40) {
				out.println(name+" ineligible");
				continue;
			}
			out.println(name+" coach petitions");
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new eligibility().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("eligibility.dat")));
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