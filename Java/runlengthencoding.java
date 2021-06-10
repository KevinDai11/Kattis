import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class runlengthencoding {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		String c = f.next();
		String s = f.next();
		String r ="";
		if(c.equals("E")) {
			for(int x=0;x<s.length();x+=0) {
				int n=1;
				char t = s.charAt(x++);
				while(x<s.length() && t==s.charAt(x)) {
					x++;
					n++;
				}
				r+=""+t+n;
			}
		}
		else {
			for(int x=0;x<s.length()-1;x++) {
				char t = s.charAt(x++);
				int n = Integer.parseInt(s.substring(x,x+1));
				while(n-->0) {
					r+=t;
				}
			}
		}
		out.print(r);
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new runlengthencoding().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("runlengthencoding.dat")));
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