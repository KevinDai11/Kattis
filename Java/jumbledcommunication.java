import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class jumbledcommunication {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n =f.nextInt();
		while(n-->0) {
			int t = f.nextInt();
			int temp = t<<1;
			int r = Integer.parseInt(Integer.toBinaryString(t));
			int r2 =Integer.parseInt(Integer.toBinaryString(temp));
			
			System.out.println(r+ " " +r2);
			int ret = r^r2;
			System.out.println(ret);
			ret = Integer.parseInt(Integer.toString(ret,10));	
			out.print(ret+" ");
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new jumbledcommunication().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("jumbledcommunication.dat")));
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