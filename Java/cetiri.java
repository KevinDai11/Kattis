import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class cetiri {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		ArrayList<Integer> t = new ArrayList<>();
		t.add(f.nextInt());
		t.add(f.nextInt());
		t.add(f.nextInt());
		Collections.sort(t);
		int d1=t.get(1)-t.get(0);
		int d2 = t.get(2)-t.get(1);
		if(d1==d2) {
			out.print(t.get(2)+d1);
		}
		else {
			if(d2>d1) {
				out.print(t.get(2)-d1);
			}
			else {
				out.print(t.get(0)+d2);
			}
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new cetiri().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("cetiri.dat")));
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