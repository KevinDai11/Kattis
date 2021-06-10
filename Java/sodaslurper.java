import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class sodaslurper {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int s = f.nextInt();
		int e=f.nextInt();
		int c=f.nextInt();
		
		int sum=(s+e)/c;
		int bottles = (s+e)%c+sum;
		while(bottles>=c) {
			sum+=bottles/c;
			bottles=bottles/c+bottles%c;
		}
		out.print(sum);
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new sodaslurper().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			 br = new BufferedReader(new InputStreamReader(System.in)); 
			//br = new BufferedReader(new FileReader(new File("sodaslurper.dat")));
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