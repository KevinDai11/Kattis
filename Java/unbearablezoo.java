import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class unbearablezoo {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int c=1;
		while(true) {
			int n = f.nextInt();
			if(n==0) {
				break;
			}
			TreeMap<String, Integer> m = new TreeMap<>();
			while(n-->0) {
				String[] s = f.nextLine().split(" ");
				String t = s[s.length-1].toLowerCase();
				if(m.get(t)==null) {
					m.put(t, 0);
				}
				m.put(t, m.get(t)+1);
			}
			out.println("List " + c++ + ":");
			for(String v : m.keySet()) {
				out.println(v+" | " + m.get(v));
			}
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new unbearablezoo().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("unbearablezoo.dat")));
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