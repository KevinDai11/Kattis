import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class jewelrybox {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = f.nextInt();
		while(n-->0) {
		int x= f.nextInt();
		int y= f.nextInt();
		double h1 = (y+x-Math.sqrt(y*y-x*y+x*x))/6.0;
		double h2 = (y+x+Math.sqrt(y*y-x*y+x*x))/6.0;
		if(h1<0) {
			out.printf("%.11f%n",2*(y-2*h2)*(x-2*h2));
		}
		else if(h2<0) {
			out.printf("%.11f%n",h1 * (y-2*h1)*(x-2*h1));
		}
		else {
			out.printf("%.11f%n",Math.max(h1*(y-2*h1)*(x-2*h1), 2*(y-2*h2)*(x-2*h2)));
					
		}}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new jewelrybox().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			  // br=new BufferedReader(new FileReader(new File("jewelrybox.dat")));
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