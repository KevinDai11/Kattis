import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class bacaoneggs {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			int n = f.nextInt();
			if(n==0) {
				break;
			}
			TreeMap<String, TreeSet<String>> m = new TreeMap<>();
			while(n-->0) {
				
				String[] food = f.nextLine().split(" ");
				String name = food[0];
				for(int x=1;x<food.length;x++) {
					if(m.get(food[x])==null) {
						m.put(food[x], new TreeSet<>());
					}
					m.get(food[x]).add(name);
				}
			}
			
			for(String s : m.keySet()) {
				out.print(s);
				for(String k : m.get(s)) {
					out.print(" " + k);
				}
				out.println();
			}
			out.println();
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new bacaoneggs().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("bacaoneggs.dat")));
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