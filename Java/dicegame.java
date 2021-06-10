import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class dicegame {
	public void run() throws Exception {
		
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int g =0;
		int e=0;
		
		int a =f.nextInt();
		int b = f.nextInt();
		int c = f.nextInt();
		int d= f.nextInt();
		
		g = a+c+a+d+b+d+b+c;
		
		 a =f.nextInt();
		 b = f.nextInt();
		 c = f.nextInt();
		 d= f.nextInt();
		 
		 e = a+c+a+d+b+d+b+c;
		 
		 out.print(g>e ? "Gunnar" : e>g ? "Emma" : "Tie");
		
		 out.flush();
	}

	public static void main(String[] args) throws Exception {
		new dicegame().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			 br = new BufferedReader(new InputStreamReader(System.in)); 
			//br = new BufferedReader(new FileReader(new File("dicegame.dat")));
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