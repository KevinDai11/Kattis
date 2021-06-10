import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class convexarea {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = f.nextInt();
		while(n-->0) {
			int c=f.nextInt();
			int[] x = new int[c+1];
			int[] y=  new int[c+1];
			for(int z=0;z<c;z++) {
				x[z]=f.nextInt();
				y[z]=f.nextInt();
				
			}
			x[c]=x[0];
			y[c]=y[0];
			int sx =0;
			int sy=0;
			for(int z=0;z<c;z++) {
				sx+=x[z]*y[z+1];
				
				sy+=y[z]*x[z+1];
				
			}
			
			out.println(.5 * (sx-sy));
	
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new convexarea().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("convexarea.dat")));
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