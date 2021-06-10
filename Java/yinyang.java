import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class yinyang {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		char[] s = f.nextLine().toCharArray();
		while(s.length!=2) {
			boolean a = true;
			for(int x=0;x<s.length;x++) {
				int b =0;
				int w =0;
				char t= s[x];
				while(x<s.length && s[x++]==t) {
					if(s[x]=='B') {
						b++;
					}
					else {
						w++;
					}
				}
				char o = s[x];
				while(x<s.length && s[x++]==o) {
					if(s[x]=='B') {
						b++;
					}
					else {
						w++;
					}
				}
				if(Math.abs(b-w)==1) {
					
				}
			}
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new yinyang().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("yinyang.dat")));
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