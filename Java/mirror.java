import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class mirror {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = f.nextInt();
		for(int asd = 1;asd<=n;asd++) {
			int r = f.nextInt();
			int c = f.nextInt();
			
			char[][] t = new char[r][c];
			for(int x=r-1;x>=0;x--) {
				String s = f.nextLine();
				int k =0;
				for(int y=c-1;y>=0;y--) {
					t[x][y]=s.charAt(k++);
				}
			}
		out.println("Test " + asd);
		for(char[] g : t) {
			for(char h :g ) {
				out.print(h);
			}
			out.println();
		}
		}
		
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new mirror().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			 br = new BufferedReader(new InputStreamReader(System.in)); 
			//br = new BufferedReader(new FileReader(new File("mirror.dat")));
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