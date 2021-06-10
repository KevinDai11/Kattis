import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class secretmessage {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);

		int n = f.nextInt();
		while(n-->0) {
			String s= f.nextLine();
			int m = 0;
			for(int x=s.length();x<Integer.MAX_VALUE;x++) {
				double t = Math.sqrt(x);
				double c= Math.round(t);
				if(t-c==0) {
					m=x;break;
				}
			}
			for(int x = s.length();x<m;x++) {
				s+="*";
			}
			int p = (int)Math.sqrt(m);
			int c=0;
			String[][] k = new String[p][p];
			for(int x=p-1;x>=0;x--) {
				for(int y=0;y<p;y++) {
					k[y][x]=s.substring(c,c+1);
					c++;
				}
			}
			String r = "";
			for(int x=0;x<p;x++) {
				for(int y=0;y<p;y++) {
					if(!k[x][y].equals("*")) {
						r+=k[x][y];
					}
				}
			}
			out.println(r);
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new secretmessage().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("secretmessage.dat")));
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