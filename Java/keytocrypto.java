import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class keytocrypto {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String cyper = f.nextLine();
		String k = f.nextLine();
		String r ="";
		for(int x=0;x<cyper.length();x++) {
			int c= a.indexOf(cyper.substring(x,x+1))-a.indexOf(k.substring(x,x+1));
			if(c<0) {
				c+=26;
			}
			k+=a.charAt(c);
			r+=a.charAt(c);
		}
		out.print(r);
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new keytocrypto().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("keytocrypto.dat")));
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