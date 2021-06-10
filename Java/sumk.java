import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class sumk {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int times = f.nextInt();
		
		for(int asd=1;asd<=times;asd++) {
			int k =f.nextInt();
			int n =f.nextInt();
			int s= 0;
			for(int x=1;x<=n;x++) {
				s+=x;
			}
			out.println(k+" " + s+" " +(s*2-n)+" "+(s*2));
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new sumk().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			 br = new BufferedReader(new InputStreamReader(System.in)); 
			//br = new BufferedReader(new FileReader(new File("sumk.dat")));
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