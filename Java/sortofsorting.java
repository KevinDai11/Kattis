import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class sortofsorting {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			int t = f.nextInt();
			if(t==0) {
				break;
			}
			TreeMap<String,ArrayList<String>> tm = new TreeMap<>();
			while(t-->0) {
				String s = f.nextLine();
				String m = s.substring(0,2);
				if(tm.get(m)==null) {
					tm.put(m, new ArrayList<String>());
				}
				tm.get(m).add(s);
			}
			for(String s : tm.keySet()) {
				for(int x=0;x<tm.get(s).size();x++) {
					out.println(tm.get(s).get(x));
				}
			}
			out.println();
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new sortofsorting().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in)); 
			//br = new BufferedReader(new FileReader(new File("sortofsorting.dat")));
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