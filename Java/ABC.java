import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class ABC {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		ArrayList<Integer> h = new ArrayList<>();
		h.add(f.nextInt());
		h.add(f.nextInt());
		h.add(f.nextInt());
		Collections.sort(h);
		int a = h.get(0);
		int b = h.get(1);
		int c = h.get(2);
		String s = f.nextLine();
		for(int t=0;t<3;t++) {
			if(s.charAt(t)=='A') {
				out.print(a+" ");
			}
			else if(s.charAt(t)=='B') {
				out.print(b+" ");
			}
			else {
				 out.print(c+" ");
			}
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new ABC().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			 br = new BufferedReader(new InputStreamReader(System.in)); 
			//br = new BufferedReader(new FileReader(new File("ABC.dat")));
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