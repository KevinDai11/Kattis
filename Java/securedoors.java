import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class securedoors {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		HashSet<String> hs = new HashSet<>();
		int n = f.nextInt();
		while(n-->0) {
			String[] s = f.nextLine().split(" ");
			if(s[0].equals("entry")) {
				out.print(s[1]+" entered");
				out.println(hs.add(s[1]) ?"":" (ANOMALY)");
			}
			else{
				out.print(s[1]+" exited");
				out.println(hs.remove(s[1])?"":" (ANOMALY)");
			}
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new securedoors().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("securedoors.dat")));
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