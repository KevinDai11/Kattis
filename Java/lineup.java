import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class lineup {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = f.nextInt();
		ArrayList<String> in = new ArrayList<>();
		ArrayList<String> de = new ArrayList<>();
		ArrayList<String> is = new ArrayList<>();
		for(int x=0;x<n;x++) {
			is.add(f.nextLine());
		}
		de.addAll(is);
		in.addAll(is);
		Collections.sort(in);
		Collections.sort(de);
		Collections.reverse(de);

		out.println(is.equals(in)?"INCREASING" :is.equals(de) ? "DECREASING" :"NEITHER");
		
	
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new lineup().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			 br = new BufferedReader(new InputStreamReader(System.in)); 
			//br = new BufferedReader(new FileReader(new File("lineup.dat")));
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