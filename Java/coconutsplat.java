import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class coconutsplat {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int s=  f.nextInt();
		int p = f.nextInt();
		int[] l = new int[p];
		
		
		while(p>0) {
			int t = s;
			int spot = 0;
			while(t>0) {
				if(l[spot]>2) {
				spot++;}
				if(spot>=l.length) {
					spot=0;
				}
				spot++;
				if(spot>=l.length) {
					spot=0;
				}
				t--;
			}
			l[spot]++;
			if(l[spot]>2) {
				p--;
			}
		}
		System.out.println(Arrays.toString(l));
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new coconutsplat().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("coconutsplat.dat")));
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