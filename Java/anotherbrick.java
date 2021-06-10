import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class anotherbrick {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int h =f.nextInt();
		int w= f.nextInt();
		int n = f.nextInt();
		int s=0;
		int d=0;
		boolean b = true;
		while(n-->0) {
			int t = f.nextInt();
			
			if(s+t>w) {
				b=false;
				break;
			}
			s+=t;
			if(s==w) {
				s=0;
				d++;
			}
			if(h==d) {
				break;
			}
		}
		out.println(b?"YES":"NO");
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new anotherbrick().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("anotherbrick.dat")));
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