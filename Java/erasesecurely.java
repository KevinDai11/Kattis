import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class erasesecurely {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = f.nextInt();
		String s= f.nextLine();
		String d = f.nextLine();
		if(n%2==0) {
			out.print(s.equals(d) ? "Deletion succeeded" : "Deletion failed");
		}
		else {
			boolean b = true;
			for(int x=0;x<s.length();x++) {
				if(s.charAt(x)==d.charAt(x)) {
					b=false;
					break;
				}
			}
			out.print(b ? "Deletion succeeded" : "Deletion failed");
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new erasesecurely().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("erasesecurely.dat")));
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