import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class kittenonatree {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int s = f.nextInt();
		TreeMap<Integer,ArrayList<Integer>> tm = new TreeMap<>();
		while(true) {
			String[] t = f.nextLine().split(" ");
			if(t[0].equals("-1")) {
				break;
			}
			int h = Integer.parseInt(t[0]);
			if(tm.get(h)==null) {
				tm.put(h,new ArrayList<>());
			}
			for(int x=1;x<t.length;x++) {
				int n = Integer.parseInt(t[x]);
				tm.get(h).add(n);
				if(tm.get(n)==null) {
					tm.put(n,new ArrayList<>());
				}
				tm.get(n).add(h);
			}
		}
		System.out.println(tm);
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new kittenonatree().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("kittenonatree.dat")));
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