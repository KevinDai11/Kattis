import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class onechicken {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = f.nextInt();
		int m = f.nextInt();
		out.print(n>m? n-m==1 ? "Dr. Chaz needs 1 more piece of chicken!" :"Dr. Chaz needs " + (n-m)+ " more pieces of chicken!" : m-n==1 ?"Dr. Chaz will have 1 piece of chicken left over!" : "Dr. Chaz will have " + (m-n)+ " pieces of chicken left over!");
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new onechicken().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			 br = new BufferedReader(new InputStreamReader(System.in)); 
		//	br = new BufferedReader(new FileReader(new File("onechicken.dat")));
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