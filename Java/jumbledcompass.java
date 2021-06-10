import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class jumbledcompass {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int h= f.nextInt();
		int g = f.nextInt();
		int m=Integer.MAX_VALUE;
		if(h>g) {
			int cc=h-g;
			int c = 360-h+g;
			if(c<=cc) {
				m=c;
			}
			else {
				m=-cc;
			}
		}
		else {
			int cc = 360-g+h;
			int c =g-h;
			if(c<=cc) {
				m=c;
			}
			else {
				m=-cc;
			}
		}
		out.print(m);
		
		
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new jumbledcompass().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("jumbledcompass.dat")));
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